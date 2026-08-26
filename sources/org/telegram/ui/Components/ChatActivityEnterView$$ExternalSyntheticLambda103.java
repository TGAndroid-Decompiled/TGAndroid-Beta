package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ChatActivity;

public final class ChatActivityEnterView$$ExternalSyntheticLambda103 implements Runnable {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final Object f$1;
    public final String f$2;
    public final Object f$3;
    public final boolean f$4;
    public final int f$5;
    public final int f$6;
    public final Object f$7;
    public final Long f$8;
    public final boolean f$9;

    public ChatActivityEnterView$$ExternalSyntheticLambda103(ChatActivityEnterView.AnonymousClass79 anonymousClass79, Object obj, MediaController.PhotoEntry photoEntry, boolean z, int i, int i2, boolean z2, Long l, String str, Object obj2) {
        this.f$0 = anonymousClass79;
        this.f$7 = obj;
        this.f$1 = photoEntry;
        this.f$4 = z;
        this.f$5 = i;
        this.f$6 = i2;
        this.f$9 = z2;
        this.f$8 = l;
        this.f$2 = str;
        this.f$3 = obj2;
    }

    @Override
    public final void run() {
        boolean z;
        int i;
        String str;
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivityEnterView) this.f$0).lambda$onStickerSelected$98((TLRPC.Document) this.f$1, this.f$2, (MessageObject.SendAnimationData) this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                boolean z2 = false;
                if (chatActivityEnterView.stickersExpanded) {
                    if (chatActivityEnterView.searchingType != 0) {
                        chatActivityEnterView.emojiView.hideSearchKeyboard();
                    }
                    chatActivityEnterView.setStickersExpanded(false, true, false, true);
                }
                ChatActivityEnterView.ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = chatActivityEnterView.delegate;
                TL_stories.StoryItem replyToStory = chatActivityEnterViewDelegate != null ? chatActivityEnterViewDelegate.getReplyToStory() : null;
                Object obj = this.f$7;
                boolean z3 = obj instanceof TLRPC.Document;
                boolean z4 = this.f$4;
                int i2 = this.f$5;
                int i3 = this.f$6;
                Long l = this.f$8;
                String str2 = this.f$2;
                Object obj2 = this.f$3;
                ChatActivity chatActivity = chatActivityEnterView.parentFragment;
                if (z3) {
                    TLRPC.Document document = (TLRPC.Document) obj;
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f$1;
                    VideoEditedInfo videoEditedInfo = photoEntry != null ? photoEntry.editedInfo : null;
                    if (videoEditedInfo != null && photoEntry != null) {
                        videoEditedInfo.roundVideo = true;
                        boolean zNeedConvert = videoEditedInfo.needConvert();
                        videoEditedInfo.roundVideo = false;
                        videoEditedInfo.muted = true;
                        z2 = zNeedConvert;
                    }
                    boolean z5 = this.f$9;
                    if (z2) {
                        ArrayList arrayList = new ArrayList();
                        SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                        if (photoEntry.isVideo || (str = photoEntry.imagePath) == null) {
                            String str3 = photoEntry.path;
                            if (str3 != null) {
                                sendingMediaInfo.path = str3;
                            }
                        } else {
                            sendingMediaInfo.path = str;
                            if (photoEntry.isHighQuality()) {
                                sendingMediaInfo.originalPhotoEntry = photoEntry.clone();
                            }
                        }
                        sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                        sendingMediaInfo.coverPath = photoEntry.coverPath;
                        sendingMediaInfo.coverPhoto = photoEntry.coverPhoto;
                        sendingMediaInfo.isLivePhoto = photoEntry.isLivePhoto();
                        sendingMediaInfo.isVideo = photoEntry.isVideo;
                        sendingMediaInfo.discardLivePhoto = photoEntry.isUnalivePhoto();
                        sendingMediaInfo.livePhotoVideoOffset = photoEntry.livePhotoVideoOffset;
                        sendingMediaInfo.livePhotoTimestampUs = photoEntry.livePhotoTimestampUs;
                        CharSequence charSequence = photoEntry.caption;
                        sendingMediaInfo.caption = charSequence != null ? charSequence.toString() : null;
                        sendingMediaInfo.entities = photoEntry.entities;
                        sendingMediaInfo.masks = photoEntry.stickers;
                        sendingMediaInfo.ttl = photoEntry.ttl;
                        sendingMediaInfo.videoEditedInfo = photoEntry.editedInfo;
                        sendingMediaInfo.canDeleteAfter = photoEntry.canDeleteAfter;
                        sendingMediaInfo.updateStickersOrder = SendMessagesHelper.checkUpdateStickersOrder(photoEntry.caption);
                        sendingMediaInfo.hasMediaSpoilers = photoEntry.hasSpoiler;
                        sendingMediaInfo.stars = photoEntry.starsAmount;
                        sendingMediaInfo.highQuality = photoEntry.isHighQuality();
                        arrayList.add(sendingMediaInfo);
                        photoEntry.reset();
                        SendMessagesHelper.prepareSendingMedia(AccountInstance.getInstance(chatActivityEnterView.currentAccount), arrayList, chatActivityEnterView.dialog_id, chatActivityEnterView.replyingMessageObject, chatActivityEnterView.getThreadMessage(), null, chatActivityEnterView.replyingQuote, false, false, chatActivityEnterView.editingMessageObject, z4, i2, i3, 0, false, null, chatActivity != null ? chatActivity.getMessageChatSendParams() : null, chatActivityEnterView.effectId, z5, l.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                        z = z4;
                        i = i2;
                    } else {
                        z = z4;
                        SendMessagesHelper.getInstance(chatActivityEnterView.currentAccount).sendSticker(document, str2, chatActivityEnterView.dialog_id, photoEntry != null ? photoEntry.caption : null, videoEditedInfo, chatActivityEnterView.replyingMessageObject, chatActivityEnterView.getThreadMessage(), replyToStory, chatActivityEnterView.replyingQuote, null, z, i2, i3, false, obj2, chatActivity != null ? chatActivity.getMessageChatSendParams() : null, l.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), z5);
                        i = i2;
                        MediaDataController.getInstance(chatActivityEnterView.currentAccount).addRecentGif(document, (int) (System.currentTimeMillis() / 1000), true);
                        if (DialogObject.isEncryptedDialog(chatActivityEnterView.dialog_id)) {
                            chatActivityEnterView.accountInstance.getMessagesController().saveGif(obj2, document);
                        }
                    }
                } else {
                    z = z4;
                    i = i2;
                    if (obj instanceof TLRPC.BotInlineResult) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj;
                        if (botInlineResult.document != null) {
                            MediaDataController.getInstance(chatActivityEnterView.currentAccount).addRecentGif(botInlineResult.document, (int) (System.currentTimeMillis() / 1000), false);
                            if (DialogObject.isEncryptedDialog(chatActivityEnterView.dialog_id)) {
                                chatActivityEnterView.accountInstance.getMessagesController().saveGif(obj2, botInlineResult.document);
                            }
                        }
                        HashMap map = new HashMap();
                        map.put("id", botInlineResult.id);
                        map.put("query_id", "" + botInlineResult.query_id);
                        map.put("force_gif", "1");
                        if (replyToStory == null) {
                            SendMessagesHelper.prepareSendingBotContextResult(chatActivityEnterView.parentFragment, chatActivityEnterView.accountInstance, botInlineResult, map, chatActivityEnterView.dialog_id, chatActivityEnterView.replyingMessageObject, chatActivityEnterView.getThreadMessage(), null, chatActivityEnterView.replyingQuote, z, i, 0, chatActivity != null ? chatActivity.getMessageChatSendParams() : null, l.longValue(), chatActivityEnterView.getSendMonoForumPeerId());
                            z = z;
                            i = i;
                        } else {
                            SendMessagesHelper.getInstance(chatActivityEnterView.currentAccount).sendSticker(botInlineResult.document, str2, chatActivityEnterView.dialog_id, chatActivityEnterView.replyingMessageObject, chatActivityEnterView.getThreadMessage(), replyToStory, chatActivityEnterView.replyingQuote, null, z, i, i3, false, obj2, chatActivity != null ? chatActivity.getMessageChatSendParams() : null, l.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                            z = z;
                        }
                        if (chatActivityEnterView.searchingType != 0) {
                            chatActivityEnterView.setSearchingTypeInternal(0, true);
                            chatActivityEnterView.emojiView.closeSearch(-1L, true);
                            chatActivityEnterView.emojiView.hideSearchKeyboard();
                        }
                    }
                }
                ChatActivityEnterView.ChatActivityEnterViewDelegate chatActivityEnterViewDelegate2 = chatActivityEnterView.delegate;
                if (chatActivityEnterViewDelegate2 != null) {
                    chatActivityEnterViewDelegate2.onMessageSend(null, z, i, 0, 0L);
                }
                break;
        }
    }

    public ChatActivityEnterView$$ExternalSyntheticLambda103(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z, int i, int i2, Object obj, Long l, boolean z2) {
        this.f$0 = chatActivityEnterView;
        this.f$1 = document;
        this.f$2 = str;
        this.f$3 = sendAnimationData;
        this.f$4 = z;
        this.f$5 = i;
        this.f$6 = i2;
        this.f$7 = obj;
        this.f$8 = l;
        this.f$9 = z2;
    }
}
