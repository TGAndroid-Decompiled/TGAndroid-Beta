package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$InputStickerSet;
import org.telegram.tgnet.TLRPC$TL_dataJSON;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_messages_setTyping;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;
import org.telegram.tgnet.TLRPC$TL_sendMessageEmojiInteraction;
import org.telegram.tgnet.TLRPC$TL_stickerPack;
import org.telegram.tgnet.TLRPC$VideoSize;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.Reactions.AnimatedEmojiEffect;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.StickerSetBulletinLayout;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.Stories.StoryReactionWidgetView;

public class EmojiAnimationsOverlay implements NotificationCenter.NotificationCenterDelegate {
    private static final HashSet<String> excludeEmojiFromPack;
    private static final HashSet<String> supportedEmoji = new HashSet<>();
    private boolean attached;
    ChatActivity chatActivity;
    FrameLayout contentLayout;
    int currentAccount;
    long dialogId;
    Runnable hintRunnable;
    String lastTappedEmoji;
    RecyclerListView listView;
    private HashMap<Long, Boolean> preloaded;
    Runnable sentInteractionsRunnable;
    TLRPC$TL_messages_stickerSet set;
    long threadMsgId;
    boolean inited = false;
    HashMap<String, ArrayList<TLRPC$Document>> emojiInteractionsStickersMap = new HashMap<>();
    HashMap<Long, Integer> lastAnimationIndex = new HashMap<>();
    Random random = new Random();
    int lastTappedMsgId = -1;
    long lastTappedTime = 0;
    ArrayList<Long> timeIntervals = new ArrayList<>();
    ArrayList<Integer> animationIndexes = new ArrayList<>();
    final ArrayList<DrawingObject> drawingObjects = new ArrayList<>();

    protected void layoutObject(DrawingObject drawingObject) {
    }

    public void onAllEffectsEnd() {
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        excludeEmojiFromPack = hashSet;
        hashSet.add("0⃣");
        hashSet.add("1⃣");
        hashSet.add("2⃣");
        hashSet.add("3⃣");
        hashSet.add("4⃣");
        hashSet.add("5⃣");
        hashSet.add("6⃣");
        hashSet.add("7⃣");
        hashSet.add("8⃣");
        hashSet.add("9⃣");
    }

    public EmojiAnimationsOverlay(FrameLayout frameLayout, int i) {
        this.contentLayout = frameLayout;
        this.currentAccount = i;
    }

    public EmojiAnimationsOverlay(ChatActivity chatActivity, FrameLayout frameLayout, RecyclerListView recyclerListView, int i, long j, long j2) {
        this.chatActivity = chatActivity;
        this.contentLayout = frameLayout;
        this.listView = recyclerListView;
        this.currentAccount = i;
        this.dialogId = j;
        this.threadMsgId = j2;
    }

    public void onAttachedToWindow() {
        this.attached = true;
        checkStickerPack();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        for (int i = 0; i < this.drawingObjects.size(); i++) {
            this.drawingObjects.get(i).imageReceiver.onAttachedToWindow();
            if (this.drawingObjects.get(i).genericEffect != null) {
                this.drawingObjects.get(i).genericEffect.setView(this.contentLayout);
            }
        }
    }

    public void onDetachedFromWindow() {
        this.attached = false;
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        for (int i = 0; i < this.drawingObjects.size(); i++) {
            this.drawingObjects.get(i).imageReceiver.onDetachedFromWindow();
            if (this.drawingObjects.get(i).genericEffect != null) {
                this.drawingObjects.get(i).genericEffect.removeView(this.contentLayout);
            }
        }
        this.drawingObjects.clear();
    }

    public void clear() {
        for (int i = 0; i < this.drawingObjects.size(); i++) {
            this.drawingObjects.get(i).imageReceiver.onDetachedFromWindow();
            if (this.drawingObjects.get(i).genericEffect != null) {
                this.drawingObjects.get(i).genericEffect.removeView(this.contentLayout);
            }
        }
        this.drawingObjects.clear();
    }

    public void checkStickerPack() {
        if (this.inited) {
            return;
        }
        TLRPC$TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(this.currentAccount).getStickerSetByName("EmojiAnimations");
        this.set = stickerSetByName;
        if (stickerSetByName == null) {
            this.set = MediaDataController.getInstance(this.currentAccount).getStickerSetByEmojiOrName("EmojiAnimations");
        }
        if (this.set == null) {
            MediaDataController.getInstance(this.currentAccount).loadStickersByEmojiOrName("EmojiAnimations", false, true);
        }
        if (this.set != null) {
            HashMap hashMap = new HashMap();
            for (int i = 0; i < this.set.documents.size(); i++) {
                hashMap.put(Long.valueOf(this.set.documents.get(i).id), this.set.documents.get(i));
            }
            for (int i2 = 0; i2 < this.set.packs.size(); i2++) {
                TLRPC$TL_stickerPack tLRPC$TL_stickerPack = this.set.packs.get(i2);
                if (!excludeEmojiFromPack.contains(tLRPC$TL_stickerPack.emoticon) && tLRPC$TL_stickerPack.documents.size() > 0) {
                    supportedEmoji.add(tLRPC$TL_stickerPack.emoticon);
                    ArrayList<TLRPC$Document> arrayList = new ArrayList<>();
                    this.emojiInteractionsStickersMap.put(tLRPC$TL_stickerPack.emoticon, arrayList);
                    for (int i3 = 0; i3 < tLRPC$TL_stickerPack.documents.size(); i3++) {
                        arrayList.add((TLRPC$Document) hashMap.get(tLRPC$TL_stickerPack.documents.get(i3)));
                    }
                    if (tLRPC$TL_stickerPack.emoticon.equals("❤")) {
                        String[] strArr = {"🧡", "💛", "💚", "💙", "💜", "🖤", "🤍", "🤎"};
                        for (int i4 = 0; i4 < 8; i4++) {
                            String str = strArr[i4];
                            supportedEmoji.add(str);
                            this.emojiInteractionsStickersMap.put(str, arrayList);
                        }
                    }
                }
            }
            this.inited = true;
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        Integer printingStringType;
        if (i == NotificationCenter.diceStickersDidLoad) {
            if ("EmojiAnimations".equals((String) objArr[0])) {
                checkStickerPack();
                return;
            }
            return;
        }
        if (i == NotificationCenter.onEmojiInteractionsReceived) {
            if (this.chatActivity == null) {
                return;
            }
            long longValue = ((Long) objArr[0]).longValue();
            TLRPC$TL_sendMessageEmojiInteraction tLRPC$TL_sendMessageEmojiInteraction = (TLRPC$TL_sendMessageEmojiInteraction) objArr[1];
            if (longValue == this.dialogId && supportedEmoji.contains(tLRPC$TL_sendMessageEmojiInteraction.emoticon)) {
                final int i3 = tLRPC$TL_sendMessageEmojiInteraction.msg_id;
                if (tLRPC$TL_sendMessageEmojiInteraction.interaction.data != null) {
                    try {
                        JSONArray jSONArray = new JSONObject(tLRPC$TL_sendMessageEmojiInteraction.interaction.data).getJSONArray("a");
                        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i4);
                            final int optInt = jSONObject.optInt("i", 1) - 1;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public void run() {
                                    EmojiAnimationsOverlay.this.findViewAndShowAnimation(i3, optInt);
                                }
                            }, (long) (jSONObject.optDouble("t", 0.0d) * 1000.0d));
                        }
                        return;
                    } catch (JSONException e) {
                        e.printStackTrace();
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.updateInterfaces && (printingStringType = MessagesController.getInstance(this.currentAccount).getPrintingStringType(this.dialogId, this.threadMsgId)) != null && printingStringType.intValue() == 5) {
            cancelHintRunnable();
        }
    }

    public boolean supports(String str) {
        return this.emojiInteractionsStickersMap.containsKey(unwrapEmoji(str));
    }

    public void findViewAndShowAnimation(int i, int i2) {
        ChatActivity chatActivity;
        if (this.attached) {
            ChatMessageCell chatMessageCell = null;
            int i3 = 0;
            while (true) {
                if (i3 >= this.listView.getChildCount()) {
                    break;
                }
                View childAt = this.listView.getChildAt(i3);
                if (childAt instanceof ChatMessageCell) {
                    ChatMessageCell chatMessageCell2 = (ChatMessageCell) childAt;
                    String stickerEmoji = chatMessageCell2.getMessageObject().getStickerEmoji();
                    if (stickerEmoji == null) {
                        stickerEmoji = chatMessageCell2.getMessageObject().messageOwner.message;
                    }
                    if (chatMessageCell2.getPhotoImage().hasNotThumb() && stickerEmoji != null && chatMessageCell2.getMessageObject().getId() == i) {
                        chatMessageCell = chatMessageCell2;
                        break;
                    }
                }
                i3++;
            }
            if (chatMessageCell == null || (chatActivity = this.chatActivity) == null) {
                return;
            }
            chatActivity.restartSticker(chatMessageCell);
            if (!EmojiData.hasEmojiSupportVibration(chatMessageCell.getMessageObject().getStickerEmoji()) && !chatMessageCell.getMessageObject().isPremiumSticker() && !chatMessageCell.getMessageObject().isAnimatedAnimatedEmoji()) {
                chatMessageCell.performHapticFeedback(3);
            }
            showAnimationForCell(chatMessageCell, i2, false, true);
        }
    }

    public void draw(Canvas canvas) {
        boolean z;
        float f;
        ImageReceiver imageReceiver;
        float f2;
        if (this.drawingObjects.isEmpty()) {
            return;
        }
        boolean z2 = false;
        int i = 0;
        while (i < this.drawingObjects.size()) {
            DrawingObject drawingObject = this.drawingObjects.get(i);
            if (this.chatActivity != null) {
                drawingObject.viewFound = z2;
                int i2 = 0;
                while (true) {
                    if (i2 >= this.listView.getChildCount()) {
                        f = 0.0f;
                        break;
                    }
                    View childAt = this.listView.getChildAt(i2);
                    MessageObject messageObject = null;
                    if (childAt instanceof ChatMessageCell) {
                        ChatMessageCell chatMessageCell = (ChatMessageCell) childAt;
                        messageObject = chatMessageCell.getMessageObject();
                        imageReceiver = chatMessageCell.getPhotoImage();
                    } else if (childAt instanceof ChatActionCell) {
                        ChatActionCell chatActionCell = (ChatActionCell) childAt;
                        messageObject = chatActionCell.getMessageObject();
                        imageReceiver = chatActionCell.getPhotoImage();
                    } else {
                        imageReceiver = null;
                    }
                    if (messageObject == null || messageObject.getId() != drawingObject.messageId) {
                        i2++;
                    } else {
                        drawingObject.viewFound = true;
                        float x = this.listView.getX() + childAt.getX();
                        float y = this.listView.getY() + childAt.getY();
                        f = childAt.getY();
                        drawingObject.lastW = imageReceiver.getImageWidth();
                        drawingObject.lastH = imageReceiver.getImageHeight();
                        if (drawingObject.isMessageEffect && (childAt instanceof ChatMessageCell)) {
                            ChatMessageCell chatMessageCell2 = (ChatMessageCell) childAt;
                            float filterWidth = (getFilterWidth() * AndroidUtilities.density) / 1.3f;
                            float f3 = filterWidth / 3.0f;
                            drawingObject.lastW = f3;
                            drawingObject.lastH = f3;
                            float f4 = filterWidth / 2.0f;
                            drawingObject.lastX = Utilities.clamp((x + chatMessageCell2.getTimeX()) - f4, AndroidUtilities.displaySize.x - filterWidth, 0.0f);
                            drawingObject.lastY = (y + chatMessageCell2.getTimeY()) - f4;
                        } else if (drawingObject.isPremiumSticker) {
                            drawingObject.lastX = x + imageReceiver.getImageX();
                            drawingObject.lastY = y + imageReceiver.getImageY();
                        } else {
                            float imageX = x + imageReceiver.getImageX();
                            float imageY = y + imageReceiver.getImageY();
                            if (drawingObject.isOut) {
                                f2 = ((-imageReceiver.getImageWidth()) * 2.0f) + AndroidUtilities.dp(24.0f);
                            } else {
                                f2 = -AndroidUtilities.dp(24.0f);
                            }
                            float imageWidth = imageY - imageReceiver.getImageWidth();
                            drawingObject.lastX = imageX + f2;
                            drawingObject.lastY = imageWidth;
                        }
                    }
                }
                if (!drawingObject.viewFound || drawingObject.lastH + f < this.chatActivity.getChatListViewPadding() || f > this.listView.getMeasuredHeight() - this.chatActivity.blurredViewBottomOffset) {
                    drawingObject.removing = true;
                }
                if (drawingObject.isPremiumSticker) {
                    float f5 = drawingObject.lastH / 2.0f;
                    boolean z3 = ((float) this.listView.getMeasuredHeight()) - f <= f5;
                    boolean z4 = (f - this.chatActivity.getChatListViewPadding()) + f5 <= 0.0f;
                    if (z3 || z4) {
                        drawingObject.removing = true;
                    }
                }
                if (drawingObject.removing) {
                    float f6 = drawingObject.removeProgress;
                    if (f6 != 1.0f) {
                        float clamp = Utilities.clamp(f6 + 0.10666667f, 1.0f, 0.0f);
                        drawingObject.removeProgress = clamp;
                        drawingObject.imageReceiver.setAlpha(1.0f - clamp);
                        this.chatActivity.contentView.invalidate();
                    }
                }
            } else {
                layoutObject(drawingObject);
            }
            boolean z5 = !drawingObject.wasPlayed && drawingObject.removing;
            if (!z5) {
                if (drawingObject.isPremiumSticker && !drawingObject.isMessageEffect) {
                    float f7 = drawingObject.lastH;
                    float f8 = 1.49926f * f7;
                    float f9 = 0.0546875f * f8;
                    float f10 = ((drawingObject.lastY + (f7 / 2.0f)) - (f8 / 2.0f)) - (0.00279f * f8);
                    if (!drawingObject.isOut) {
                        drawingObject.imageReceiver.setImageCoords(drawingObject.lastX - f9, f10, f8, f8);
                    } else {
                        drawingObject.imageReceiver.setImageCoords(((drawingObject.lastX + drawingObject.lastW) - f8) + f9, f10, f8, f8);
                    }
                    if (!drawingObject.isOut) {
                        canvas.save();
                        canvas.scale(-1.0f, 1.0f, drawingObject.imageReceiver.getCenterX(), drawingObject.imageReceiver.getCenterY());
                        drawingObject.imageReceiver.draw(canvas);
                        canvas.restore();
                    } else {
                        drawingObject.imageReceiver.draw(canvas);
                    }
                } else {
                    AnimatedEmojiEffect animatedEmojiEffect = drawingObject.genericEffect;
                    if (animatedEmojiEffect != null) {
                        float f11 = drawingObject.lastX + drawingObject.randomOffsetX;
                        float f12 = drawingObject.lastY + drawingObject.randomOffsetY;
                        float f13 = drawingObject.lastW * 3.0f;
                        animatedEmojiEffect.setBounds((int) f11, (int) f12, (int) (f11 + f13), (int) (f12 + f13));
                        drawingObject.genericEffect.draw(canvas);
                    } else {
                        ImageReceiver imageReceiver2 = drawingObject.imageReceiver;
                        float f14 = drawingObject.lastX + drawingObject.randomOffsetX;
                        float f15 = drawingObject.lastY + drawingObject.randomOffsetY;
                        float f16 = drawingObject.lastW;
                        imageReceiver2.setImageCoords(f14, f15, f16 * 3.0f, f16 * 3.0f);
                        if (!drawingObject.isOut) {
                            canvas.save();
                            canvas.scale(-1.0f, 1.0f, drawingObject.imageReceiver.getCenterX(), drawingObject.imageReceiver.getCenterY());
                            drawingObject.imageReceiver.draw(canvas);
                            canvas.restore();
                        } else {
                            drawingObject.imageReceiver.draw(canvas);
                        }
                    }
                }
            }
            AnimatedEmojiEffect animatedEmojiEffect2 = drawingObject.genericEffect;
            if (animatedEmojiEffect2 != null) {
                z = animatedEmojiEffect2.isDone();
            } else {
                z = drawingObject.wasPlayed && drawingObject.imageReceiver.getLottieAnimation() != null && drawingObject.imageReceiver.getLottieAnimation().getCurrentFrame() >= drawingObject.imageReceiver.getLottieAnimation().getFramesCount() + (-2);
            }
            if (drawingObject.removeProgress == 1.0f || z || z5) {
                DrawingObject remove = this.drawingObjects.remove(i);
                if (drawingObject.isPremiumSticker && drawingObject.imageReceiver.getLottieAnimation() != null) {
                    remove.imageReceiver.getLottieAnimation().setCurrentFrame(0, true, true);
                }
                remove.imageReceiver.onDetachedFromWindow();
                AnimatedEmojiEffect animatedEmojiEffect3 = remove.genericEffect;
                if (animatedEmojiEffect3 != null) {
                    animatedEmojiEffect3.removeView(this.contentLayout);
                }
                i--;
            } else if (drawingObject.imageReceiver.getLottieAnimation() != null && drawingObject.imageReceiver.getLottieAnimation().isRunning()) {
                drawingObject.wasPlayed = true;
            } else if (drawingObject.imageReceiver.getLottieAnimation() != null && !drawingObject.imageReceiver.getLottieAnimation().isRunning()) {
                drawingObject.imageReceiver.getLottieAnimation().setCurrentFrame(0, true);
                drawingObject.imageReceiver.getLottieAnimation().start();
            }
            i++;
            z2 = false;
        }
        if (this.drawingObjects.isEmpty()) {
            onAllEffectsEnd();
        }
        this.contentLayout.invalidate();
    }

    public boolean onTapItem(ChatMessageCell chatMessageCell, ChatActivity chatActivity, boolean z) {
        TLRPC$Document emojiAnimatedSticker;
        if (chatActivity.isSecretChat() || chatMessageCell.getMessageObject() == null || chatMessageCell.getMessageObject().getId() < 0) {
            return false;
        }
        if (!chatMessageCell.getMessageObject().isPremiumSticker() && chatActivity.currentUser == null) {
            return false;
        }
        boolean showAnimationForCell = showAnimationForCell(chatMessageCell, -1, z, false);
        if (z && showAnimationForCell && !EmojiData.hasEmojiSupportVibration(chatMessageCell.getMessageObject().getStickerEmoji()) && !chatMessageCell.getMessageObject().isPremiumSticker() && !chatMessageCell.getMessageObject().isAnimatedAnimatedEmoji()) {
            chatMessageCell.performHapticFeedback(3);
        }
        if (chatMessageCell.getMessageObject().isPremiumSticker() || chatMessageCell.getEffect() != null || (!z && chatMessageCell.getMessageObject().isAnimatedEmojiStickerSingle())) {
            chatMessageCell.getMessageObject().forcePlayEffect = false;
            chatMessageCell.getMessageObject().messageOwner.premiumEffectWasPlayed = true;
            chatActivity.getMessagesStorage().updateMessageCustomParams(this.dialogId, chatMessageCell.getMessageObject().messageOwner);
            return showAnimationForCell;
        }
        Integer printingStringType = MessagesController.getInstance(this.currentAccount).getPrintingStringType(this.dialogId, this.threadMsgId);
        if ((printingStringType == null || printingStringType.intValue() != 5) && this.hintRunnable == null && showAnimationForCell && ((Bulletin.getVisibleBulletin() == null || !Bulletin.getVisibleBulletin().isShowing()) && SharedConfig.emojiInteractionsHintCount > 0 && UserConfig.getInstance(this.currentAccount).getClientUserId() != chatActivity.currentUser.id)) {
            SharedConfig.updateEmojiInteractionsHintCount(SharedConfig.emojiInteractionsHintCount - 1);
            if (chatMessageCell.getMessageObject().isAnimatedAnimatedEmoji()) {
                emojiAnimatedSticker = chatMessageCell.getMessageObject().getDocument();
            } else {
                emojiAnimatedSticker = MediaDataController.getInstance(this.currentAccount).getEmojiAnimatedSticker(chatMessageCell.getMessageObject().getStickerEmoji());
            }
            StickerSetBulletinLayout stickerSetBulletinLayout = new StickerSetBulletinLayout(chatActivity.getParentActivity(), null, -1, emojiAnimatedSticker, chatActivity.getResourceProvider());
            stickerSetBulletinLayout.subtitleTextView.setVisibility(8);
            stickerSetBulletinLayout.titleTextView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString("EmojiInteractionTapHint", R.string.EmojiInteractionTapHint, chatActivity.currentUser.first_name)), stickerSetBulletinLayout.titleTextView.getPaint().getFontMetricsInt(), false));
            stickerSetBulletinLayout.titleTextView.setTypeface(null);
            stickerSetBulletinLayout.titleTextView.setMaxLines(3);
            stickerSetBulletinLayout.titleTextView.setSingleLine(false);
            final Bulletin make = Bulletin.make(chatActivity, stickerSetBulletinLayout, 2750);
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    make.show();
                    EmojiAnimationsOverlay.this.hintRunnable = null;
                }
            };
            this.hintRunnable = runnable;
            AndroidUtilities.runOnUIThread(runnable, 1500L);
        }
        return showAnimationForCell;
    }

    public void cancelHintRunnable() {
        Runnable runnable = this.hintRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        this.hintRunnable = null;
    }

    public boolean showAnimationForActionCell(ChatActionCell chatActionCell, TLRPC$Document tLRPC$Document, TLRPC$VideoSize tLRPC$VideoSize) {
        if (this.drawingObjects.size() > 12 || !chatActionCell.getPhotoImage().hasNotThumb()) {
            return false;
        }
        float imageHeight = chatActionCell.getPhotoImage().getImageHeight();
        float imageWidth = chatActionCell.getPhotoImage().getImageWidth();
        if (imageHeight <= 0.0f || imageWidth <= 0.0f) {
            return false;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.drawingObjects.size(); i3++) {
            if (this.drawingObjects.get(i3).messageId == chatActionCell.getMessageObject().getId()) {
                i++;
                if (this.drawingObjects.get(i3).imageReceiver.getLottieAnimation() == null || this.drawingObjects.get(i3).imageReceiver.getLottieAnimation().isGeneratingCache()) {
                    return false;
                }
            }
            if (this.drawingObjects.get(i3).document != null && tLRPC$Document != null && this.drawingObjects.get(i3).document.id == tLRPC$Document.id) {
                i2++;
            }
        }
        if (i >= 4) {
            return false;
        }
        DrawingObject drawingObject = new DrawingObject();
        drawingObject.isPremiumSticker = true;
        if (!drawingObject.isMessageEffect) {
            drawingObject.randomOffsetX = (imageWidth / 4.0f) * ((this.random.nextInt() % 101) / 100.0f);
            drawingObject.randomOffsetY = (imageHeight / 4.0f) * ((this.random.nextInt() % 101) / 100.0f);
        }
        drawingObject.messageId = chatActionCell.getMessageObject().getId();
        drawingObject.isOut = true;
        drawingObject.imageReceiver.setAllowStartAnimation(true);
        int filterWidth = getFilterWidth();
        if (i2 > 0) {
            Integer num = this.lastAnimationIndex.get(Long.valueOf(tLRPC$Document.id));
            int intValue = num == null ? 0 : num.intValue();
            this.lastAnimationIndex.put(Long.valueOf(tLRPC$Document.id), Integer.valueOf((intValue + 1) % 4));
            drawingObject.imageReceiver.setUniqKeyPrefix(intValue + "_" + drawingObject.messageId + "_");
        }
        drawingObject.document = tLRPC$Document;
        drawingObject.imageReceiver.setImage(ImageLocation.getForDocument(tLRPC$VideoSize, tLRPC$Document), filterWidth + "_" + filterWidth, null, "tgs", this.set, 1);
        drawingObject.imageReceiver.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        drawingObject.imageReceiver.setAutoRepeat(0);
        if (drawingObject.imageReceiver.getLottieAnimation() != null) {
            if (drawingObject.isPremiumSticker) {
                drawingObject.imageReceiver.getLottieAnimation().setCurrentFrame(0, false, true);
            }
            drawingObject.imageReceiver.getLottieAnimation().start();
        }
        this.drawingObjects.add(drawingObject);
        if (this.attached) {
            drawingObject.imageReceiver.onAttachedToWindow();
            drawingObject.imageReceiver.setParentView(this.contentLayout);
        }
        this.contentLayout.invalidate();
        return true;
    }

    public void preloadAnimation(ChatMessageCell chatMessageCell) {
        ArrayList<TLRPC$Document> arrayList;
        MessageObject messageObject = chatMessageCell.getMessageObject();
        if (messageObject.isPremiumSticker()) {
            return;
        }
        String stickerEmoji = messageObject.getStickerEmoji();
        if (stickerEmoji == null) {
            stickerEmoji = messageObject.messageOwner.message;
        }
        String unwrapEmoji = unwrapEmoji(stickerEmoji);
        if (!supportedEmoji.contains(unwrapEmoji) || (arrayList = this.emojiInteractionsStickersMap.get(unwrapEmoji)) == null || arrayList.isEmpty()) {
            return;
        }
        int min = Math.min(1, arrayList.size());
        for (int i = 0; i < min; i++) {
            preloadAnimation(arrayList.get(i));
        }
    }

    private void preloadAnimation(TLRPC$Document tLRPC$Document) {
        if (tLRPC$Document == null) {
            return;
        }
        HashMap<Long, Boolean> hashMap = this.preloaded;
        if (hashMap == null || !hashMap.containsKey(Long.valueOf(tLRPC$Document.id))) {
            if (this.preloaded == null) {
                this.preloaded = new HashMap<>();
            }
            this.preloaded.put(Long.valueOf(tLRPC$Document.id), Boolean.TRUE);
            MediaDataController.getInstance(this.currentAccount).preloadImage(ImageLocation.getForDocument(tLRPC$Document), 2);
        }
    }

    public boolean showAnimationForCell(ChatMessageCell chatMessageCell, int i, boolean z, boolean z2) {
        if (chatMessageCell == null || this.drawingObjects.size() > 12) {
            return false;
        }
        MessageObject messageObject = chatMessageCell.getMessageObject();
        if (chatMessageCell.getEffect() == null && !chatMessageCell.getPhotoImage().hasNotThumb()) {
            return false;
        }
        String stickerEmoji = messageObject.getStickerEmoji();
        if (stickerEmoji == null) {
            stickerEmoji = messageObject.messageOwner.message;
        }
        if (chatMessageCell.getEffect() == null && stickerEmoji == null) {
            return false;
        }
        float imageHeight = chatMessageCell.getPhotoImage().getImageHeight();
        float imageWidth = chatMessageCell.getPhotoImage().getImageWidth();
        if (chatMessageCell.getEffect() != null || (imageHeight > 0.0f && imageWidth > 0.0f)) {
            return createDrawingObject(unwrapEmoji(stickerEmoji), chatMessageCell.getMessageObject().getId(), chatMessageCell.getMessageObject().getDocument(), messageObject, i, z, z2, imageWidth, imageHeight, chatMessageCell.getMessageObject().isOutOwner());
        }
        return false;
    }

    public boolean createDrawingObject(java.lang.String r24, int r25, org.telegram.tgnet.TLRPC$Document r26, final org.telegram.messenger.MessageObject r27, int r28, final boolean r29, boolean r30, float r31, float r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.EmojiAnimationsOverlay.createDrawingObject(java.lang.String, int, org.telegram.tgnet.TLRPC$Document, org.telegram.messenger.MessageObject, int, boolean, boolean, float, float, boolean):boolean");
    }

    public void lambda$createDrawingObject$1(final MessageObject messageObject, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                EmojiAnimationsOverlay.this.lambda$createDrawingObject$0(tLObject, messageObject);
            }
        });
    }

    public void lambda$createDrawingObject$2() {
        sendCurrentTaps();
        this.sentInteractionsRunnable = null;
    }

    public static int getFilterWidth() {
        float min;
        float f;
        if (AndroidUtilities.isTablet()) {
            min = AndroidUtilities.getMinTabletSide();
            f = 0.4f;
        } else {
            Point point = AndroidUtilities.displaySize;
            min = Math.min(point.x, point.y);
            f = 0.5f;
        }
        return (int) ((((int) (min * f)) * 2.0f) / AndroidUtilities.density);
    }

    public void lambda$createDrawingObject$0(TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet, final MessageObject messageObject) {
        if (this.chatActivity == null || MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || this.chatActivity.getParentActivity() == null) {
            return;
        }
        StickerSetBulletinLayout stickerSetBulletinLayout = new StickerSetBulletinLayout(this.contentLayout.getContext(), null, -1, messageObject.getDocument(), this.chatActivity.getResourceProvider());
        stickerSetBulletinLayout.titleTextView.setText(tLRPC$TL_messages_stickerSet.set.title);
        stickerSetBulletinLayout.subtitleTextView.setText(LocaleController.getString("PremiumStickerTooltip", R.string.PremiumStickerTooltip));
        Bulletin.UndoButton undoButton = new Bulletin.UndoButton(this.chatActivity.getParentActivity(), true, this.chatActivity.getResourceProvider());
        stickerSetBulletinLayout.setButton(undoButton);
        undoButton.setUndoAction(new Runnable() {
            @Override
            public final void run() {
                EmojiAnimationsOverlay.this.lambda$showStickerSetBulletin$3(messageObject);
            }
        });
        undoButton.setText(LocaleController.getString("ViewAction", R.string.ViewAction));
        Bulletin make = Bulletin.make(this.chatActivity, stickerSetBulletinLayout, 2750);
        make.hash = messageObject.getId();
        make.show();
    }

    public void lambda$showStickerSetBulletin$3(MessageObject messageObject) {
        Activity parentActivity = this.chatActivity.getParentActivity();
        ChatActivity chatActivity = this.chatActivity;
        TLRPC$InputStickerSet inputStickerSet = messageObject.getInputStickerSet();
        ChatActivity chatActivity2 = this.chatActivity;
        StickersAlert stickersAlert = new StickersAlert(parentActivity, chatActivity, inputStickerSet, null, chatActivity2.chatActivityEnterView, chatActivity2.getResourceProvider());
        stickersAlert.setCalcMandatoryInsets(this.chatActivity.isKeyboardVisible());
        this.chatActivity.showDialog(stickersAlert);
    }

    public static java.lang.String unwrapEmoji(java.lang.String r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.EmojiAnimationsOverlay.unwrapEmoji(java.lang.String):java.lang.String");
    }

    private void sendCurrentTaps() {
        if (this.lastTappedMsgId == 0) {
            return;
        }
        TLRPC$TL_sendMessageEmojiInteraction tLRPC$TL_sendMessageEmojiInteraction = new TLRPC$TL_sendMessageEmojiInteraction();
        tLRPC$TL_sendMessageEmojiInteraction.msg_id = this.lastTappedMsgId;
        tLRPC$TL_sendMessageEmojiInteraction.emoticon = this.lastTappedEmoji;
        tLRPC$TL_sendMessageEmojiInteraction.interaction = new TLRPC$TL_dataJSON();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("v", 1);
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < this.timeIntervals.size(); i++) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("i", this.animationIndexes.get(i).intValue() + 1);
                jSONObject2.put("t", ((float) this.timeIntervals.get(i).longValue()) / 1000.0f);
                jSONArray.put(i, jSONObject2);
            }
            jSONObject.put("a", jSONArray);
            tLRPC$TL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
            TLRPC$TL_messages_setTyping tLRPC$TL_messages_setTyping = new TLRPC$TL_messages_setTyping();
            long j = this.threadMsgId;
            if (j != 0) {
                tLRPC$TL_messages_setTyping.top_msg_id = (int) j;
                tLRPC$TL_messages_setTyping.flags |= 1;
            }
            tLRPC$TL_messages_setTyping.action = tLRPC$TL_sendMessageEmojiInteraction;
            tLRPC$TL_messages_setTyping.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_setTyping, null);
            clearSendingInfo();
        } catch (JSONException e) {
            clearSendingInfo();
            FileLog.e(e);
        }
    }

    private void clearSendingInfo() {
        this.lastTappedMsgId = 0;
        this.lastTappedEmoji = null;
        this.lastTappedTime = 0L;
        this.timeIntervals.clear();
        this.animationIndexes.clear();
    }

    public void onScrolled(int i) {
        for (int i2 = 0; i2 < this.drawingObjects.size(); i2++) {
            if (!this.drawingObjects.get(i2).viewFound) {
                this.drawingObjects.get(i2).lastY -= i;
            }
        }
    }

    public boolean isIdle() {
        return this.drawingObjects.isEmpty();
    }

    public boolean checkPosition(ChatMessageCell chatMessageCell, float f, int i) {
        float y = chatMessageCell.getY() + chatMessageCell.getPhotoImage().getCenterY();
        return y > f && y < ((float) i);
    }

    public void cancelAllAnimations() {
        for (int i = 0; i < this.drawingObjects.size(); i++) {
            this.drawingObjects.get(i).removing = true;
        }
    }

    public boolean showAnimationForWidget(StoryReactionWidgetView storyReactionWidgetView) {
        float f;
        float f2;
        boolean z;
        int i;
        float f3;
        boolean z2;
        if (this.drawingObjects.size() > 12) {
            return false;
        }
        ReactionsLayoutInBubble.VisibleReaction fromTL = ReactionsLayoutInBubble.VisibleReaction.fromTL(storyReactionWidgetView.mediaArea.reaction);
        String str = fromTL.emojicon;
        if (str == null) {
            str = MessageObject.findAnimatedEmojiEmoticon(AnimatedEmojiDrawable.findDocument(this.currentAccount, fromTL.documentId));
        }
        float measuredHeight = storyReactionWidgetView.getMeasuredHeight();
        float measuredWidth = storyReactionWidgetView.getMeasuredWidth();
        View view = (View) storyReactionWidgetView.getParent();
        if (measuredWidth > view.getWidth() * 0.5f) {
            f2 = view.getWidth() * 0.4f;
            f = f2;
        } else {
            f = measuredHeight;
            f2 = measuredWidth;
        }
        String unwrapEmoji = unwrapEmoji(str);
        int hashCode = storyReactionWidgetView.hashCode();
        boolean z3 = storyReactionWidgetView.getTranslationX() > ((float) this.contentLayout.getMeasuredWidth()) / 2.0f;
        if (fromTL.emojicon != null) {
            z = z3;
            z2 = true;
            i = hashCode;
            float f4 = f2;
            if (createDrawingObject(unwrapEmoji, hashCode, null, null, -1, false, false, f2, f, z)) {
                if (!this.drawingObjects.isEmpty()) {
                    ArrayList<DrawingObject> arrayList = this.drawingObjects;
                    DrawingObject drawingObject = arrayList.get(arrayList.size() - 1);
                    drawingObject.isReaction = true;
                    drawingObject.lastH = f;
                    drawingObject.lastW = f4;
                    drawingObject.lastX = storyReactionWidgetView.getTranslationX() - (drawingObject.lastW / 2.0f);
                    float translationY = storyReactionWidgetView.getTranslationY();
                    float f5 = drawingObject.lastW;
                    drawingObject.lastY = translationY - (1.5f * f5);
                    if (drawingObject.isOut) {
                        drawingObject.lastX += (-f5) * 1.8f;
                    } else {
                        drawingObject.lastX += (-f5) * 0.2f;
                    }
                }
                return true;
            }
            f3 = f4;
        } else {
            z = z3;
            i = hashCode;
            f3 = f2;
            z2 = true;
        }
        if (fromTL.documentId == 0 || storyReactionWidgetView.getAnimatedEmojiDrawable() == null) {
            return false;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.drawingObjects.size(); i3++) {
            if (this.drawingObjects.get(i3).documentId == fromTL.documentId) {
                i2++;
            }
        }
        if (i2 >= 4) {
            return false;
        }
        DrawingObject drawingObject2 = new DrawingObject();
        drawingObject2.genericEffect = AnimatedEmojiEffect.createFrom(storyReactionWidgetView.getAnimatedEmojiDrawable(), z2, z2);
        if (!drawingObject2.isMessageEffect) {
            drawingObject2.randomOffsetX = (f3 / 4.0f) * ((this.random.nextInt() % 101) / 100.0f);
            drawingObject2.randomOffsetY = (f / 4.0f) * ((this.random.nextInt() % 101) / 100.0f);
        }
        drawingObject2.messageId = i;
        drawingObject2.document = null;
        drawingObject2.documentId = fromTL.documentId;
        drawingObject2.isOut = z;
        drawingObject2.lastH = f;
        drawingObject2.lastW = f3;
        drawingObject2.lastX = storyReactionWidgetView.getTranslationX() - (drawingObject2.lastW / 2.0f);
        float translationY2 = storyReactionWidgetView.getTranslationY();
        float f6 = drawingObject2.lastW;
        drawingObject2.lastY = translationY2 - (1.5f * f6);
        drawingObject2.lastX += (-f6) * 1.8f;
        if (this.attached) {
            drawingObject2.genericEffect.setView(this.contentLayout);
        }
        this.drawingObjects.add(drawingObject2);
        return z2;
    }

    public void setAccount(int i) {
        this.currentAccount = i;
    }

    public void preload(ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        ArrayList<TLRPC$Document> arrayList;
        String str = visibleReaction.emojicon;
        if (str == null) {
            str = MessageObject.findAnimatedEmojiEmoticon(AnimatedEmojiDrawable.findDocument(this.currentAccount, visibleReaction.documentId));
        }
        if (str == null || (arrayList = this.emojiInteractionsStickersMap.get(str)) == null || arrayList.isEmpty()) {
            return;
        }
        int min = Math.min(1, arrayList.size());
        for (int i = 0; i < min; i++) {
            preloadAnimation(arrayList.get(i));
        }
    }

    public static class DrawingObject {
        TLRPC$Document document;
        public long documentId;
        private String fileName;
        public AnimatedEmojiEffect genericEffect;
        ImageReceiver imageReceiver;
        public boolean isMessageEffect;
        boolean isOut;
        public boolean isPremiumSticker;
        public boolean isReaction;
        public float lastH;
        public float lastW;
        public float lastX;
        public float lastY;
        int messageId;
        public float randomOffsetX;
        public float randomOffsetY;
        float removeProgress;
        boolean removing;
        public boolean viewFound;
        boolean wasPlayed;

        DrawingObject() {
            ImageReceiver imageReceiver = new ImageReceiver();
            this.imageReceiver = imageReceiver;
            imageReceiver.setAllowLoadingOnAttachedOnly(true);
            this.imageReceiver.setAllowDrawWhileCacheGenerating(true);
        }

        public float getProgress() {
            ImageLocation mediaLocation = this.imageReceiver.getMediaLocation();
            if (mediaLocation == null) {
                mediaLocation = this.imageReceiver.getImageLocation();
            }
            if (mediaLocation == null) {
                mediaLocation = this.imageReceiver.getThumbLocation();
            }
            if (mediaLocation == null) {
                return -1.0f;
            }
            if (this.fileName == null) {
                TLRPC$Document tLRPC$Document = mediaLocation.document;
                if (tLRPC$Document != null) {
                    this.fileName = FileLoader.getAttachFileName(tLRPC$Document, "tgs");
                } else {
                    this.fileName = FileLoader.getAttachFileName(mediaLocation.location, "tgs");
                }
            }
            if (this.fileName == null) {
                return -1.0f;
            }
            Float fileProgress = ImageLoader.getInstance().getFileProgress(this.fileName);
            if (fileProgress == null) {
                fileProgress = Float.valueOf(1.0f);
            }
            return (fileProgress.floatValue() * 0.55f) + 0.15f + (0.3f * fileProgress.floatValue());
        }
    }

    public float getProgress() {
        if (this.drawingObjects.isEmpty()) {
            return -1.0f;
        }
        return this.drawingObjects.get(r0.size() - 1).getProgress();
    }
}
