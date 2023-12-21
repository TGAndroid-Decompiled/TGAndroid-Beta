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
import org.telegram.messenger.FileLog;
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
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$InputStickerSet;
import org.telegram.tgnet.TLRPC$TL_dataJSON;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_messages_getStickerSet;
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
    int threadMsgId;
    boolean inited = false;
    HashMap<String, ArrayList<TLRPC$Document>> emojiInteractionsStickersMap = new HashMap<>();
    HashMap<Long, Integer> lastAnimationIndex = new HashMap<>();
    Random random = new Random();
    int lastTappedMsgId = -1;
    long lastTappedTime = 0;
    ArrayList<Long> timeIntervals = new ArrayList<>();
    ArrayList<Integer> animationIndexes = new ArrayList<>();
    ArrayList<DrawingObject> drawingObjects = new ArrayList<>();

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

    public EmojiAnimationsOverlay(ChatActivity chatActivity, FrameLayout frameLayout, RecyclerListView recyclerListView, int i, long j, int i2) {
        this.chatActivity = chatActivity;
        this.contentLayout = frameLayout;
        this.listView = recyclerListView;
        this.currentAccount = i;
        this.dialogId = j;
        this.threadMsgId = i2;
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
            }
        } else if (i == NotificationCenter.onEmojiInteractionsReceived) {
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
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        } else if (i == NotificationCenter.updateInterfaces && (printingStringType = MessagesController.getInstance(this.currentAccount).getPrintingStringType(this.dialogId, this.threadMsgId)) != null && printingStringType.intValue() == 5) {
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
        int i = 0;
        while (i < this.drawingObjects.size()) {
            DrawingObject drawingObject = this.drawingObjects.get(i);
            if (this.chatActivity != null) {
                drawingObject.viewFound = false;
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
                        if (drawingObject.isPremiumSticker) {
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
                            drawingObject.lastX = imageX + f2;
                            drawingObject.lastY = imageY - imageReceiver.getImageWidth();
                        }
                        drawingObject.lastW = imageReceiver.getImageWidth();
                        drawingObject.lastH = imageReceiver.getImageHeight();
                    }
                }
                if (!drawingObject.viewFound || drawingObject.lastH + f < this.chatActivity.getChatListViewPadding() || f > this.listView.getMeasuredHeight() - this.chatActivity.blurredViewBottomOffset) {
                    drawingObject.removing = true;
                }
                if (drawingObject.isPremiumSticker) {
                    float f3 = drawingObject.lastH / 2.0f;
                    boolean z2 = ((float) this.listView.getMeasuredHeight()) - f <= f3;
                    boolean z3 = (f - this.chatActivity.getChatListViewPadding()) + f3 <= 0.0f;
                    if (z2 || z3) {
                        drawingObject.removing = true;
                    }
                }
                if (drawingObject.removing) {
                    float f4 = drawingObject.removeProgress;
                    if (f4 != 1.0f) {
                        float clamp = Utilities.clamp(f4 + 0.10666667f, 1.0f, 0.0f);
                        drawingObject.removeProgress = clamp;
                        drawingObject.imageReceiver.setAlpha(1.0f - clamp);
                        this.chatActivity.contentView.invalidate();
                    }
                }
            }
            boolean z4 = !drawingObject.wasPlayed && drawingObject.removing;
            if (!z4) {
                if (drawingObject.isPremiumSticker) {
                    float f5 = drawingObject.lastH;
                    float f6 = 1.49926f * f5;
                    float f7 = 0.0546875f * f6;
                    float f8 = ((drawingObject.lastY + (f5 / 2.0f)) - (f6 / 2.0f)) - (0.00279f * f6);
                    if (!drawingObject.isOut) {
                        drawingObject.imageReceiver.setImageCoords(drawingObject.lastX - f7, f8, f6, f6);
                    } else {
                        drawingObject.imageReceiver.setImageCoords(((drawingObject.lastX + drawingObject.lastW) - f6) + f7, f8, f6, f6);
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
                        float f9 = drawingObject.lastX + drawingObject.randomOffsetX;
                        float f10 = drawingObject.lastY + drawingObject.randomOffsetY;
                        float f11 = drawingObject.lastW * 3.0f;
                        animatedEmojiEffect.setBounds((int) f9, (int) f10, (int) (f9 + f11), (int) (f10 + f11));
                        drawingObject.genericEffect.draw(canvas);
                    } else {
                        ImageReceiver imageReceiver2 = drawingObject.imageReceiver;
                        float f12 = drawingObject.lastX + drawingObject.randomOffsetX;
                        float f13 = drawingObject.lastY + drawingObject.randomOffsetY;
                        float f14 = drawingObject.lastW;
                        imageReceiver2.setImageCoords(f12, f13, f14 * 3.0f, f14 * 3.0f);
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
            if (drawingObject.removeProgress == 1.0f || z || z4) {
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
        if (chatMessageCell.getMessageObject().isPremiumSticker() || chatActivity.currentUser != null) {
            boolean showAnimationForCell = showAnimationForCell(chatMessageCell, -1, z, false);
            if (z && showAnimationForCell && !EmojiData.hasEmojiSupportVibration(chatMessageCell.getMessageObject().getStickerEmoji()) && !chatMessageCell.getMessageObject().isPremiumSticker() && !chatMessageCell.getMessageObject().isAnimatedAnimatedEmoji()) {
                chatMessageCell.performHapticFeedback(3);
            }
            if (chatMessageCell.getMessageObject().isPremiumSticker() || (!z && chatMessageCell.getMessageObject().isAnimatedEmojiStickerSingle())) {
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
        return false;
    }

    public void cancelHintRunnable() {
        Runnable runnable = this.hintRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        this.hintRunnable = null;
    }

    public boolean showAnimationForActionCell(ChatActionCell chatActionCell, TLRPC$Document tLRPC$Document, TLRPC$VideoSize tLRPC$VideoSize) {
        if (this.drawingObjects.size() <= 12 && chatActionCell.getPhotoImage().hasNotThumb()) {
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
            DrawingObject drawingObject = new DrawingObject(this);
            drawingObject.isPremiumSticker = true;
            drawingObject.randomOffsetX = (imageWidth / 4.0f) * ((this.random.nextInt() % 101) / 100.0f);
            drawingObject.randomOffsetY = (imageHeight / 4.0f) * ((this.random.nextInt() % 101) / 100.0f);
            drawingObject.messageId = chatActionCell.getMessageObject().getId();
            drawingObject.isOut = true;
            drawingObject.imageReceiver.setAllowStartAnimation(true);
            int filterWidth = getFilterWidth();
            if (i2 > 0) {
                Integer num = this.lastAnimationIndex.get(Long.valueOf(tLRPC$Document.id));
                int intValue = num == null ? 0 : num.intValue();
                this.lastAnimationIndex.put(Long.valueOf(tLRPC$Document.id), Integer.valueOf((intValue + 1) % 4));
                ImageReceiver imageReceiver = drawingObject.imageReceiver;
                imageReceiver.setUniqKeyPrefix(intValue + "_" + drawingObject.messageId + "_");
            }
            drawingObject.document = tLRPC$Document;
            ImageReceiver imageReceiver2 = drawingObject.imageReceiver;
            ImageLocation forDocument = ImageLocation.getForDocument(tLRPC$VideoSize, tLRPC$Document);
            imageReceiver2.setImage(forDocument, filterWidth + "_" + filterWidth, null, "tgs", this.set, 1);
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
        return false;
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

    private boolean showAnimationForCell(ChatMessageCell chatMessageCell, int i, boolean z, boolean z2) {
        if (this.drawingObjects.size() <= 12 && chatMessageCell.getPhotoImage().hasNotThumb()) {
            MessageObject messageObject = chatMessageCell.getMessageObject();
            String stickerEmoji = messageObject.getStickerEmoji();
            if (stickerEmoji == null) {
                stickerEmoji = messageObject.messageOwner.message;
            }
            if (stickerEmoji == null) {
                return false;
            }
            float imageHeight = chatMessageCell.getPhotoImage().getImageHeight();
            float imageWidth = chatMessageCell.getPhotoImage().getImageWidth();
            if (imageHeight <= 0.0f || imageWidth <= 0.0f) {
                return false;
            }
            return createDrawingObject(unwrapEmoji(stickerEmoji), chatMessageCell.getMessageObject().getId(), chatMessageCell.getMessageObject().getDocument(), messageObject, i, z, z2, imageWidth, imageHeight, chatMessageCell.getMessageObject().isOutOwner());
        }
        return false;
    }

    private boolean createDrawingObject(String str, int i, TLRPC$Document tLRPC$Document, final MessageObject messageObject, int i2, final boolean z, boolean z2, float f, float f2, boolean z3) {
        ArrayList<TLRPC$Document> arrayList;
        TLRPC$Document tLRPC$Document2;
        TLRPC$VideoSize tLRPC$VideoSize;
        Runnable runnable;
        int i3 = i2;
        boolean z4 = false;
        boolean z5 = messageObject != null && messageObject.isPremiumSticker();
        if ((supportedEmoji.contains(str) || z5) && (!((arrayList = this.emojiInteractionsStickersMap.get(str)) == null || arrayList.isEmpty()) || z5)) {
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (i4 < this.drawingObjects.size()) {
                if (this.drawingObjects.get(i4).messageId == i) {
                    i5++;
                    if (this.drawingObjects.get(i4).imageReceiver.getLottieAnimation() == null || this.drawingObjects.get(i4).imageReceiver.getLottieAnimation().isGeneratingCache()) {
                        return z4;
                    }
                }
                if (this.drawingObjects.get(i4).document != null && tLRPC$Document != null && this.drawingObjects.get(i4).document.id == tLRPC$Document.id) {
                    i6++;
                }
                i4++;
                z4 = false;
            }
            if (z && z5 && i5 > 0) {
                if (Bulletin.getVisibleBulletin() == null || Bulletin.getVisibleBulletin().hash != messageObject.getId()) {
                    TLRPC$InputStickerSet inputStickerSet = messageObject.getInputStickerSet();
                    TLRPC$TL_messages_stickerSet stickerSetByName = inputStickerSet.short_name != null ? MediaDataController.getInstance(this.currentAccount).getStickerSetByName(inputStickerSet.short_name) : null;
                    if (stickerSetByName == null) {
                        stickerSetByName = MediaDataController.getInstance(this.currentAccount).getStickerSetById(inputStickerSet.id);
                    }
                    if (stickerSetByName == null) {
                        TLRPC$TL_messages_getStickerSet tLRPC$TL_messages_getStickerSet = new TLRPC$TL_messages_getStickerSet();
                        tLRPC$TL_messages_getStickerSet.stickerset = inputStickerSet;
                        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_getStickerSet, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                                EmojiAnimationsOverlay.this.lambda$createDrawingObject$1(messageObject, tLObject, tLRPC$TL_error);
                            }
                        });
                        return false;
                    }
                    lambda$createDrawingObject$0(stickerSetByName, messageObject);
                    return false;
                }
                return false;
            } else if (i5 >= 4) {
                return false;
            } else {
                if (z5) {
                    tLRPC$VideoSize = messageObject.getPremiumStickerAnimation();
                    tLRPC$Document2 = null;
                } else {
                    if (messageObject != null && messageObject.isAnimatedAnimatedEmoji()) {
                        if (i3 < 0 || i3 > arrayList.size() - 1) {
                            ArrayList arrayList2 = new ArrayList();
                            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                TLRPC$Document tLRPC$Document3 = arrayList.get(i7);
                                if (tLRPC$Document3 != null) {
                                    HashMap<Long, Boolean> hashMap = this.preloaded;
                                    Boolean bool = hashMap != null ? hashMap.get(Long.valueOf(tLRPC$Document3.id)) : null;
                                    if (bool != null && bool.booleanValue()) {
                                        arrayList2.add(Integer.valueOf(i7));
                                    }
                                }
                            }
                            if (arrayList2.isEmpty()) {
                                i3 = Math.abs(this.random.nextInt()) % arrayList.size();
                            } else {
                                i3 = ((Integer) arrayList2.get(Math.abs(this.random.nextInt()) % arrayList2.size())).intValue();
                            }
                        }
                        tLRPC$Document2 = arrayList.get(i3);
                    } else {
                        if (i3 < 0 || i3 > arrayList.size() - 1) {
                            i3 = Math.abs(this.random.nextInt()) % arrayList.size();
                        }
                        tLRPC$Document2 = arrayList.get(i3);
                    }
                    tLRPC$VideoSize = null;
                }
                if (tLRPC$Document2 == null && tLRPC$VideoSize == null) {
                    return false;
                }
                DrawingObject drawingObject = new DrawingObject(this);
                drawingObject.isPremiumSticker = messageObject == null ? false : messageObject.isPremiumSticker();
                drawingObject.randomOffsetX = (f / 4.0f) * ((this.random.nextInt() % 101) / 100.0f);
                drawingObject.randomOffsetY = (f2 / 4.0f) * ((this.random.nextInt() % 101) / 100.0f);
                drawingObject.messageId = i;
                drawingObject.document = tLRPC$Document2;
                drawingObject.isOut = z3;
                drawingObject.imageReceiver.setAllowStartAnimation(true);
                drawingObject.imageReceiver.setAllowLottieVibration(z);
                if (tLRPC$Document2 != null) {
                    int filterWidth = getFilterWidth();
                    Integer num = this.lastAnimationIndex.get(Long.valueOf(tLRPC$Document2.id));
                    int intValue = (num == null ? 0 : num.intValue()) + 1;
                    this.lastAnimationIndex.put(Long.valueOf(tLRPC$Document2.id), Integer.valueOf(intValue));
                    ImageLocation forDocument = ImageLocation.getForDocument(tLRPC$Document2);
                    ImageReceiver imageReceiver = drawingObject.imageReceiver;
                    imageReceiver.setUniqKeyPrefix(intValue + "_" + drawingObject.messageId + "_");
                    ImageReceiver imageReceiver2 = drawingObject.imageReceiver;
                    imageReceiver2.setImage(forDocument, filterWidth + "_" + filterWidth + "_pcache_compress", null, "tgs", this.set, 1);
                    drawingObject.imageReceiver.setDelegate(new ImageReceiver.ImageReceiverDelegate() {
                        @Override
                        public void didSetImage(ImageReceiver imageReceiver3, boolean z6, boolean z7, boolean z8) {
                        }

                        @Override
                        public void onAnimationReady(ImageReceiver imageReceiver3) {
                            if (!z || !messageObject.isAnimatedAnimatedEmoji() || imageReceiver3.getLottieAnimation() == null || imageReceiver3.getLottieAnimation().hasVibrationPattern()) {
                                return;
                            }
                            EmojiAnimationsOverlay.this.contentLayout.performHapticFeedback(3, 1);
                        }
                    });
                    if (drawingObject.imageReceiver.getLottieAnimation() != null) {
                        drawingObject.imageReceiver.getLottieAnimation().setCurrentFrame(0, false, true);
                    }
                } else {
                    int filterWidth2 = getFilterWidth();
                    if (i6 > 0) {
                        Integer num2 = this.lastAnimationIndex.get(Long.valueOf(messageObject.getDocument().id));
                        int intValue2 = num2 == null ? 0 : num2.intValue();
                        this.lastAnimationIndex.put(Long.valueOf(messageObject.getDocument().id), Integer.valueOf((intValue2 + 1) % 4));
                        ImageReceiver imageReceiver3 = drawingObject.imageReceiver;
                        imageReceiver3.setUniqKeyPrefix(intValue2 + "_" + drawingObject.messageId + "_");
                    }
                    drawingObject.document = messageObject.getDocument();
                    ImageReceiver imageReceiver4 = drawingObject.imageReceiver;
                    ImageLocation forDocument2 = ImageLocation.getForDocument(tLRPC$VideoSize, messageObject.getDocument());
                    imageReceiver4.setImage(forDocument2, filterWidth2 + "_" + filterWidth2, null, "tgs", this.set, 1);
                }
                drawingObject.imageReceiver.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
                drawingObject.imageReceiver.setAutoRepeat(0);
                if (drawingObject.imageReceiver.getLottieAnimation() != null) {
                    if (drawingObject.isPremiumSticker) {
                        drawingObject.imageReceiver.getLottieAnimation().setCurrentFrame(0, false, true);
                    }
                    drawingObject.imageReceiver.getLottieAnimation().start();
                }
                this.drawingObjects.add(drawingObject);
                drawingObject.imageReceiver.onAttachedToWindow();
                drawingObject.imageReceiver.setParentView(this.contentLayout);
                this.contentLayout.invalidate();
                if (z && !z5 && UserConfig.getInstance(this.currentAccount).clientUserId != this.dialogId) {
                    int i8 = this.lastTappedMsgId;
                    if (i8 != 0 && i8 != i && (runnable = this.sentInteractionsRunnable) != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable);
                        this.sentInteractionsRunnable.run();
                    }
                    this.lastTappedMsgId = i;
                    this.lastTappedEmoji = str;
                    if (this.lastTappedTime == 0) {
                        this.lastTappedTime = System.currentTimeMillis();
                        this.timeIntervals.clear();
                        this.animationIndexes.clear();
                        this.timeIntervals.add(0L);
                        this.animationIndexes.add(Integer.valueOf(i3));
                    } else {
                        this.timeIntervals.add(Long.valueOf(System.currentTimeMillis() - this.lastTappedTime));
                        this.animationIndexes.add(Integer.valueOf(i3));
                    }
                    Runnable runnable2 = this.sentInteractionsRunnable;
                    if (runnable2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable2);
                        this.sentInteractionsRunnable = null;
                    }
                    Runnable runnable3 = new Runnable() {
                        @Override
                        public final void run() {
                            EmojiAnimationsOverlay.this.lambda$createDrawingObject$2();
                        }
                    };
                    this.sentInteractionsRunnable = runnable3;
                    AndroidUtilities.runOnUIThread(runnable3, 500L);
                }
                if (z2) {
                    MessagesController.getInstance(this.currentAccount).sendTyping(this.dialogId, this.threadMsgId, 11, str, 0);
                }
                return true;
            }
        }
        return false;
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
        if (this.chatActivity == null || MessagesController.getInstance(this.currentAccount).premiumLocked || this.chatActivity.getParentActivity() == null) {
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
            int i2 = this.threadMsgId;
            if (i2 != 0) {
                tLRPC$TL_messages_setTyping.top_msg_id = i2;
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
        ReactionsLayoutInBubble.VisibleReaction fromTLReaction = ReactionsLayoutInBubble.VisibleReaction.fromTLReaction(storyReactionWidgetView.mediaArea.reaction);
        String str = fromTLReaction.emojicon;
        if (str == null) {
            str = MessageObject.findAnimatedEmojiEmoticon(AnimatedEmojiDrawable.findDocument(this.currentAccount, fromTLReaction.documentId));
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
        if (fromTLReaction.emojicon != null) {
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
        if (fromTLReaction.documentId == 0 || storyReactionWidgetView.getAnimatedEmojiDrawable() == null) {
            return false;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.drawingObjects.size(); i3++) {
            if (this.drawingObjects.get(i3).documentId == fromTLReaction.documentId) {
                i2++;
            }
        }
        if (i2 >= 4) {
            return false;
        }
        DrawingObject drawingObject2 = new DrawingObject(this);
        drawingObject2.genericEffect = AnimatedEmojiEffect.createFrom(storyReactionWidgetView.getAnimatedEmojiDrawable(), z2, z2);
        drawingObject2.randomOffsetX = (f3 / 4.0f) * ((this.random.nextInt() % 101) / 100.0f);
        drawingObject2.randomOffsetY = (f / 4.0f) * ((this.random.nextInt() % 101) / 100.0f);
        drawingObject2.messageId = i;
        drawingObject2.document = null;
        drawingObject2.documentId = fromTLReaction.documentId;
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

    public class DrawingObject {
        TLRPC$Document document;
        public long documentId;
        public AnimatedEmojiEffect genericEffect;
        ImageReceiver imageReceiver;
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

        DrawingObject(EmojiAnimationsOverlay emojiAnimationsOverlay) {
            ImageReceiver imageReceiver = new ImageReceiver();
            this.imageReceiver = imageReceiver;
            imageReceiver.setAllowLoadingOnAttachedOnly(true);
            this.imageReceiver.setAllowDrawWhileCacheGenerating(true);
        }
    }
}
