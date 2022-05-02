package org.telegram.p009ui;

import android.graphics.Canvas;
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
import org.telegram.messenger.C0952R;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.p009ui.Cells.ChatMessageCell;
import org.telegram.p009ui.Components.Bulletin;
import org.telegram.p009ui.Components.RecyclerListView;
import org.telegram.p009ui.Components.StickerSetBulletinLayout;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$TL_dataJSON;
import org.telegram.tgnet.TLRPC$TL_messages_setTyping;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;
import org.telegram.tgnet.TLRPC$TL_sendMessageEmojiInteraction;
import org.telegram.tgnet.TLRPC$TL_stickerPack;
import org.telegram.tgnet.TLRPC$VideoSize;

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
    }

    public void onDetachedFromWindow() {
        this.attached = false;
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
    }

    public void checkStickerPack() {
        if (!this.inited) {
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
                    hashMap.put(Long.valueOf(this.set.documents.get(i).f861id), this.set.documents.get(i));
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
                            String[] strArr = {"🧡", "💛", "💚", "💙", "💜", "🖤", "\u1f90d", "\u1f90e"};
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
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        Integer printingStringType;
        if (i == NotificationCenter.diceStickersDidLoad) {
            if ("EmojiAnimations".equals((String) objArr[0])) {
                checkStickerPack();
            }
        } else if (i == NotificationCenter.onEmojiInteractionsReceived) {
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

    public void findViewAndShowAnimation(int i, int i2) {
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
                    if (chatMessageCell2.getPhotoImage().hasNotThumb() && chatMessageCell2.getMessageObject().getStickerEmoji() != null && chatMessageCell2.getMessageObject().getId() == i) {
                        chatMessageCell = chatMessageCell2;
                        break;
                    }
                }
                i3++;
            }
            if (chatMessageCell != null) {
                this.chatActivity.restartSticker(chatMessageCell);
                if (!EmojiData.hasEmojiSupportVibration(chatMessageCell.getMessageObject().getStickerEmoji())) {
                    chatMessageCell.performHapticFeedback(3);
                }
                showAnimationForCell(chatMessageCell, i2, false, true);
            }
        }
    }

    public void draw(Canvas canvas) {
        float f;
        if (!this.drawingObjects.isEmpty()) {
            int i = 0;
            while (i < this.drawingObjects.size()) {
                DrawingObject drawingObject = this.drawingObjects.get(i);
                drawingObject.viewFound = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= this.listView.getChildCount()) {
                        break;
                    }
                    View childAt = this.listView.getChildAt(i2);
                    if (childAt instanceof ChatMessageCell) {
                        ChatMessageCell chatMessageCell = (ChatMessageCell) childAt;
                        if (chatMessageCell.getMessageObject().getId() == drawingObject.messageId) {
                            drawingObject.viewFound = true;
                            float x = this.listView.getX() + childAt.getX();
                            float y = this.listView.getY() + childAt.getY();
                            if (drawingObject.isPremiumSticker) {
                                drawingObject.lastX = x + chatMessageCell.getPhotoImage().getImageX();
                                drawingObject.lastY = y + chatMessageCell.getPhotoImage().getCenterY();
                            } else {
                                float imageX = x + chatMessageCell.getPhotoImage().getImageX();
                                float imageY = y + chatMessageCell.getPhotoImage().getImageY();
                                if (drawingObject.isOut) {
                                    f = ((-chatMessageCell.getPhotoImage().getImageWidth()) * 2.0f) + AndroidUtilities.m34dp(24.0f);
                                } else {
                                    f = -AndroidUtilities.m34dp(24.0f);
                                }
                                drawingObject.lastX = imageX + f;
                                drawingObject.lastY = imageY - chatMessageCell.getPhotoImage().getImageWidth();
                            }
                            drawingObject.lastW = chatMessageCell.getPhotoImage().getImageWidth();
                        }
                    }
                    i2++;
                }
                if (drawingObject.isPremiumSticker) {
                    if (!drawingObject.isOut) {
                        ImageReceiver imageReceiver = drawingObject.imageReceiver;
                        float f2 = drawingObject.lastX;
                        float f3 = drawingObject.lastY;
                        float f4 = drawingObject.lastW;
                        imageReceiver.setImageCoords(f2, f3 - f4, f4 * 2.0f, f4 * 2.0f);
                    } else {
                        ImageReceiver imageReceiver2 = drawingObject.imageReceiver;
                        float f5 = drawingObject.lastX;
                        float f6 = drawingObject.lastW;
                        imageReceiver2.setImageCoords((f5 + f6) - (f6 * 2.0f), drawingObject.lastY - f6, f6 * 2.0f, f6 * 2.0f);
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
                    ImageReceiver imageReceiver3 = drawingObject.imageReceiver;
                    float f7 = drawingObject.lastX + drawingObject.randomOffsetX;
                    float f8 = drawingObject.lastY + drawingObject.randomOffsetY;
                    float f9 = drawingObject.lastW;
                    imageReceiver3.setImageCoords(f7, f8, f9 * 3.0f, f9 * 3.0f);
                    if (!drawingObject.isOut) {
                        canvas.save();
                        canvas.scale(-1.0f, 1.0f, drawingObject.imageReceiver.getCenterX(), drawingObject.imageReceiver.getCenterY());
                        drawingObject.imageReceiver.draw(canvas);
                        canvas.restore();
                    } else {
                        drawingObject.imageReceiver.draw(canvas);
                    }
                }
                if (drawingObject.wasPlayed && drawingObject.imageReceiver.getLottieAnimation() != null && drawingObject.imageReceiver.getLottieAnimation().getCurrentFrame() == drawingObject.imageReceiver.getLottieAnimation().getFramesCount() - 2) {
                    this.drawingObjects.remove(i);
                    i--;
                } else if (drawingObject.imageReceiver.getLottieAnimation() != null && drawingObject.imageReceiver.getLottieAnimation().isRunning()) {
                    drawingObject.wasPlayed = true;
                } else if (drawingObject.imageReceiver.getLottieAnimation() != null && !drawingObject.imageReceiver.getLottieAnimation().isRunning()) {
                    drawingObject.imageReceiver.getLottieAnimation().setCurrentFrame(0, true);
                    drawingObject.imageReceiver.getLottieAnimation().start();
                }
                i++;
            }
            this.contentLayout.invalidate();
        }
    }

    public void onTapItem(ChatMessageCell chatMessageCell, ChatActivity chatActivity) {
        if (chatActivity.currentUser != null && !chatActivity.isSecretChat() && chatMessageCell.getMessageObject() != null && chatMessageCell.getMessageObject().getId() >= 0) {
            boolean showAnimationForCell = showAnimationForCell(chatMessageCell, -1, true, false);
            if (showAnimationForCell && !EmojiData.hasEmojiSupportVibration(chatMessageCell.getMessageObject().getStickerEmoji())) {
                chatMessageCell.performHapticFeedback(3);
            }
            if (!chatMessageCell.getMessageObject().isPremiumSticker()) {
                Integer printingStringType = MessagesController.getInstance(this.currentAccount).getPrintingStringType(this.dialogId, this.threadMsgId);
                if ((printingStringType == null || printingStringType.intValue() != 5) && this.hintRunnable == null && showAnimationForCell) {
                    if ((Bulletin.getVisibleBulletin() == null || !Bulletin.getVisibleBulletin().isShowing()) && SharedConfig.emojiInteractionsHintCount > 0 && UserConfig.getInstance(this.currentAccount).getClientUserId() != chatActivity.currentUser.f985id) {
                        SharedConfig.updateEmojiInteractionsHintCount(SharedConfig.emojiInteractionsHintCount - 1);
                        StickerSetBulletinLayout stickerSetBulletinLayout = new StickerSetBulletinLayout(chatActivity.getParentActivity(), null, -1, MediaDataController.getInstance(this.currentAccount).getEmojiAnimatedSticker(chatMessageCell.getMessageObject().getStickerEmoji()), chatActivity.getResourceProvider());
                        stickerSetBulletinLayout.subtitleTextView.setVisibility(8);
                        stickerSetBulletinLayout.titleTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("EmojiInteractionTapHint", C0952R.string.EmojiInteractionTapHint, chatActivity.currentUser.first_name)));
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
                }
            }
        }
    }

    public void cancelHintRunnable() {
        Runnable runnable = this.hintRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        this.hintRunnable = null;
    }

    private boolean showAnimationForCell(ChatMessageCell chatMessageCell, int i, boolean z, boolean z2) {
        MessageObject messageObject;
        String stickerEmoji;
        ArrayList<TLRPC$Document> arrayList;
        TLRPC$VideoSize tLRPC$VideoSize;
        TLRPC$Document tLRPC$Document;
        DrawingObject drawingObject;
        Runnable runnable;
        int i2 = i;
        if (this.drawingObjects.size() > 12 || !chatMessageCell.getPhotoImage().hasNotThumb() || (stickerEmoji = (messageObject = chatMessageCell.getMessageObject()).getStickerEmoji()) == null) {
            return false;
        }
        float imageHeight = chatMessageCell.getPhotoImage().getImageHeight();
        float imageWidth = chatMessageCell.getPhotoImage().getImageWidth();
        if (imageHeight > 0.0f && imageWidth > 0.0f) {
            String unwrapEmoji = unwrapEmoji(stickerEmoji);
            if ((supportedEmoji.contains(unwrapEmoji) || messageObject.isPremiumSticker()) && (((arrayList = this.emojiInteractionsStickersMap.get(unwrapEmoji)) != null && !arrayList.isEmpty()) || messageObject.isPremiumSticker())) {
                int i3 = 0;
                for (int i4 = 0; i4 < this.drawingObjects.size(); i4++) {
                    if (this.drawingObjects.get(i4).messageId == chatMessageCell.getMessageObject().getId()) {
                        i3++;
                        if (this.drawingObjects.get(i4).imageReceiver.getLottieAnimation() == null || this.drawingObjects.get(i4).imageReceiver.getLottieAnimation().isGeneratingCache()) {
                            return false;
                        }
                    }
                }
                if (i3 >= 4) {
                    return false;
                }
                if (messageObject.isPremiumSticker()) {
                    tLRPC$VideoSize = messageObject.getPremiumStickerAnimation();
                    tLRPC$Document = null;
                } else {
                    if (i2 < 0 || i2 > arrayList.size() - 1) {
                        i2 = Math.abs(this.random.nextInt()) % arrayList.size();
                    }
                    tLRPC$Document = arrayList.get(i2);
                    tLRPC$VideoSize = null;
                }
                if (tLRPC$Document == null && tLRPC$VideoSize == null) {
                    return false;
                }
                DrawingObject drawingObject2 = new DrawingObject();
                drawingObject2.isPremiumSticker = messageObject.isPremiumSticker();
                drawingObject2.randomOffsetX = (imageWidth / 4.0f) * ((this.random.nextInt() % FileLoader.MEDIA_DIR_VIDEO_PUBLIC) / 100.0f);
                drawingObject2.randomOffsetY = (imageHeight / 4.0f) * ((this.random.nextInt() % FileLoader.MEDIA_DIR_VIDEO_PUBLIC) / 100.0f);
                drawingObject2.messageId = chatMessageCell.getMessageObject().getId();
                drawingObject2.isOut = chatMessageCell.getMessageObject().isOutOwner();
                int i5 = (int) ((imageWidth * 2.0f) / AndroidUtilities.density);
                if (tLRPC$Document != null) {
                    Integer num = this.lastAnimationIndex.get(Long.valueOf(tLRPC$Document.f861id));
                    int intValue = num == null ? 0 : num.intValue();
                    this.lastAnimationIndex.put(Long.valueOf(tLRPC$Document.f861id), Integer.valueOf((intValue + 1) % 4));
                    ImageLocation forDocument = ImageLocation.getForDocument(tLRPC$Document);
                    drawingObject = drawingObject2;
                    drawingObject.imageReceiver.setUniqKeyPrefix(intValue + "_" + drawingObject.messageId + "_");
                    drawingObject.imageReceiver.setImage(forDocument, i5 + "_" + i5 + "_pcache", null, "tgs", this.set, 1);
                } else {
                    drawingObject = drawingObject2;
                    drawingObject.imageReceiver.setImage(ImageLocation.getForDocument(tLRPC$VideoSize, messageObject.getDocument()), i5 + "_" + i5 + "_pcache", null, "tgs", this.set, 1);
                }
                drawingObject.imageReceiver.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
                drawingObject.imageReceiver.setAllowStartAnimation(true);
                drawingObject.imageReceiver.setAutoRepeat(0);
                if (drawingObject.imageReceiver.getLottieAnimation() != null) {
                    drawingObject.imageReceiver.getLottieAnimation().start();
                }
                this.drawingObjects.add(drawingObject);
                drawingObject.imageReceiver.onAttachedToWindow();
                drawingObject.imageReceiver.setParentView(this.contentLayout);
                this.contentLayout.invalidate();
                if (z) {
                    int i6 = this.lastTappedMsgId;
                    if (!(i6 == 0 || i6 == chatMessageCell.getMessageObject().getId() || (runnable = this.sentInteractionsRunnable) == null)) {
                        AndroidUtilities.cancelRunOnUIThread(runnable);
                        this.sentInteractionsRunnable.run();
                    }
                    this.lastTappedMsgId = chatMessageCell.getMessageObject().getId();
                    this.lastTappedEmoji = unwrapEmoji;
                    if (this.lastTappedTime == 0) {
                        this.lastTappedTime = System.currentTimeMillis();
                        this.timeIntervals.clear();
                        this.animationIndexes.clear();
                        this.timeIntervals.add(0L);
                        this.animationIndexes.add(Integer.valueOf(i2));
                    } else {
                        this.timeIntervals.add(Long.valueOf(System.currentTimeMillis() - this.lastTappedTime));
                        this.animationIndexes.add(Integer.valueOf(i2));
                    }
                    Runnable runnable2 = this.sentInteractionsRunnable;
                    if (runnable2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable2);
                        this.sentInteractionsRunnable = null;
                    }
                    Runnable emojiAnimationsOverlay$$ExternalSyntheticLambda0 = new Runnable() {
                        @Override
                        public final void run() {
                            EmojiAnimationsOverlay.this.lambda$showAnimationForCell$0();
                        }
                    };
                    this.sentInteractionsRunnable = emojiAnimationsOverlay$$ExternalSyntheticLambda0;
                    AndroidUtilities.runOnUIThread(emojiAnimationsOverlay$$ExternalSyntheticLambda0, 500L);
                }
                if (z2) {
                    MessagesController.getInstance(this.currentAccount).sendTyping(this.dialogId, this.threadMsgId, 11, unwrapEmoji, 0);
                }
                return true;
            }
        }
        return false;
    }

    public void lambda$showAnimationForCell$0() {
        sendCurrentTaps();
        this.sentInteractionsRunnable = null;
    }

    private java.lang.String unwrapEmoji(java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.EmojiAnimationsOverlay.unwrapEmoji(java.lang.String):java.lang.String");
    }

    private void sendCurrentTaps() {
        if (this.lastTappedMsgId != 0) {
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
                FileLog.m30e(e);
            }
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

    public class DrawingObject {
        ImageReceiver imageReceiver;
        boolean isOut;
        public boolean isPremiumSticker;
        public float lastW;
        public float lastX;
        public float lastY;
        int messageId;
        public float randomOffsetX;
        public float randomOffsetY;
        public boolean viewFound;
        boolean wasPlayed;

        private DrawingObject(EmojiAnimationsOverlay emojiAnimationsOverlay) {
            this.imageReceiver = new ImageReceiver();
        }
    }
}
