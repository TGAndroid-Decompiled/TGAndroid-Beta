package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class rd implements Runnable {
    public final int f27602a = 0;
    public final Object f27603b;
    public final boolean f27604c;
    public final int d;
    public final int e;
    public final boolean f27605f;
    public final Long h;
    public final String f27606n;
    public final Object f27607r;
    public final Object f27608s;
    public final Object v;

    public rd(gg ggVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, Long l4, String str, Object obj2) {
        this.f27607r = ggVar;
        this.f27603b = obj;
        this.f27608s = photoEntry;
        this.f27604c = z10;
        this.d = i10;
        this.e = i11;
        this.f27605f = z11;
        this.h = l4;
        this.f27606n = str;
        this.v = obj2;
    }

    @Override
    public final void run() {
        TL_stories.StoryItem storyItem;
        boolean z10;
        MessageObject threadMessage;
        MessageObject threadMessage2;
        VideoEditedInfo videoEditedInfo;
        CharSequence charSequence;
        MessageObject threadMessage3;
        String str;
        MessageObject threadMessage4;
        String str2;
        switch (this.f27602a) {
            case 0:
                ChatActivityEnterView.g((ChatActivityEnterView) this.f27607r, (TLRPC.Document) this.f27608s, this.f27606n, (MessageObject.SendAnimationData) this.v, this.f27604c, this.d, this.e, this.f27603b, this.h, this.f27605f);
                return;
            default:
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f27608s;
                ChatActivityEnterView chatActivityEnterView = ((gg) this.f27607r).f24280a;
                boolean z11 = chatActivityEnterView.y3;
                org.telegram.ui.xn xnVar = chatActivityEnterView.O2;
                boolean z12 = false;
                if (z11) {
                    if (chatActivityEnterView.Q1 != 0) {
                        chatActivityEnterView.U0.A();
                    }
                    chatActivityEnterView.o1(false, true, false, true);
                }
                ng ngVar = chatActivityEnterView.Y2;
                SendMessageChatArguments sendMessageChatArguments = null;
                if (ngVar != null) {
                    storyItem = ngVar.d1();
                } else {
                    storyItem = null;
                }
                Object obj = this.f27603b;
                boolean z13 = obj instanceof TLRPC.Document;
                boolean z14 = this.f27604c;
                int i10 = this.d;
                int i11 = this.e;
                Long l4 = this.h;
                int i12 = i10;
                String str3 = this.f27606n;
                Object obj2 = this.v;
                if (z13) {
                    TLRPC.Document document = (TLRPC.Document) obj;
                    if (photoEntry != null) {
                        videoEditedInfo = photoEntry.editedInfo;
                    } else {
                        videoEditedInfo = null;
                    }
                    if (videoEditedInfo != null && photoEntry != null) {
                        videoEditedInfo.roundVideo = true;
                        boolean needConvert = videoEditedInfo.needConvert();
                        videoEditedInfo.roundVideo = false;
                        videoEditedInfo.muted = true;
                        z12 = needConvert;
                    }
                    boolean z15 = this.f27605f;
                    if (z12) {
                        ArrayList arrayList = new ArrayList();
                        SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                        if (!photoEntry.isVideo && (str2 = photoEntry.imagePath) != null) {
                            sendingMediaInfo.path = str2;
                            if (photoEntry.isHighQuality()) {
                                sendingMediaInfo.originalPhotoEntry = photoEntry.clone();
                            }
                        } else {
                            String str4 = photoEntry.path;
                            if (str4 != null) {
                                sendingMediaInfo.path = str4;
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
                        CharSequence charSequence2 = photoEntry.caption;
                        if (charSequence2 != null) {
                            str = charSequence2.toString();
                        } else {
                            str = null;
                        }
                        sendingMediaInfo.caption = str;
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
                        AccountInstance accountInstance = AccountInstance.getInstance(chatActivityEnterView.Q);
                        long j3 = chatActivityEnterView.P2;
                        MessageObject messageObject = chatActivityEnterView.S2;
                        threadMessage4 = chatActivityEnterView.getThreadMessage();
                        org.telegram.ui.nn nnVar = chatActivityEnterView.U2;
                        MessageObject messageObject2 = chatActivityEnterView.Y1;
                        if (xnVar != null) {
                            sendMessageChatArguments = xnVar.C8();
                        }
                        SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j3, messageObject, threadMessage4, null, nnVar, false, false, messageObject2, z14, i12, i11, 0, false, null, sendMessageChatArguments, chatActivityEnterView.S4, z15, l4.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                        z10 = z14;
                        i12 = i12;
                    } else {
                        SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(chatActivityEnterView.Q);
                        long j10 = chatActivityEnterView.P2;
                        if (photoEntry != null) {
                            charSequence = photoEntry.caption;
                        } else {
                            charSequence = null;
                        }
                        TL_stories.StoryItem storyItem2 = storyItem;
                        MessageObject messageObject3 = chatActivityEnterView.S2;
                        threadMessage3 = chatActivityEnterView.getThreadMessage();
                        org.telegram.ui.nn nnVar2 = chatActivityEnterView.U2;
                        if (xnVar != null) {
                            sendMessageChatArguments = xnVar.C8();
                        }
                        sendMessagesHelper.sendSticker(document, str3, j10, charSequence, videoEditedInfo, messageObject3, threadMessage3, storyItem2, nnVar2, null, z14, i12, i11, false, obj2, sendMessageChatArguments, l4.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), z15);
                        z10 = z14;
                        i12 = i12;
                        MediaDataController.getInstance(chatActivityEnterView.Q).addRecentGif(document, (int) (System.currentTimeMillis() / 1000), true);
                        if (DialogObject.isEncryptedDialog(chatActivityEnterView.P2)) {
                            chatActivityEnterView.R.getMessagesController().saveGif(obj2, document);
                        }
                    }
                } else {
                    z10 = z14;
                    TL_stories.StoryItem storyItem3 = storyItem;
                    if (obj instanceof TLRPC.BotInlineResult) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj;
                        if (botInlineResult.document != null) {
                            MediaDataController.getInstance(chatActivityEnterView.Q).addRecentGif(botInlineResult.document, (int) (System.currentTimeMillis() / 1000), false);
                            if (DialogObject.isEncryptedDialog(chatActivityEnterView.P2)) {
                                chatActivityEnterView.R.getMessagesController().saveGif(obj2, botInlineResult.document);
                            }
                        }
                        TLRPC.User user = (TLRPC.User) obj2;
                        HashMap hashMap = new HashMap();
                        hashMap.put("id", botInlineResult.f18081id);
                        hashMap.put("query_id", "" + botInlineResult.query_id);
                        hashMap.put("force_gif", "1");
                        if (storyItem3 == null) {
                            org.telegram.ui.xn xnVar2 = chatActivityEnterView.O2;
                            AccountInstance accountInstance2 = chatActivityEnterView.R;
                            long j11 = chatActivityEnterView.P2;
                            MessageObject messageObject4 = chatActivityEnterView.S2;
                            threadMessage2 = chatActivityEnterView.getThreadMessage();
                            org.telegram.ui.nn nnVar3 = chatActivityEnterView.U2;
                            if (xnVar != null) {
                                sendMessageChatArguments = xnVar.C8();
                            }
                            SendMessagesHelper.prepareSendingBotContextResult(xnVar2, accountInstance2, botInlineResult, hashMap, j11, messageObject4, threadMessage2, null, nnVar3, z10, i12, 0, sendMessageChatArguments, l4.longValue(), chatActivityEnterView.getSendMonoForumPeerId());
                            z10 = z10;
                            i12 = i12;
                        } else {
                            SendMessagesHelper sendMessagesHelper2 = SendMessagesHelper.getInstance(chatActivityEnterView.Q);
                            TLRPC.Document document2 = botInlineResult.document;
                            long j12 = chatActivityEnterView.P2;
                            MessageObject messageObject5 = chatActivityEnterView.S2;
                            threadMessage = chatActivityEnterView.getThreadMessage();
                            org.telegram.ui.nn nnVar4 = chatActivityEnterView.U2;
                            if (xnVar != null) {
                                sendMessageChatArguments = xnVar.C8();
                            }
                            sendMessagesHelper2.sendSticker(document2, str3, j12, messageObject5, threadMessage, storyItem3, nnVar4, null, z10, i12, i11, false, obj2, sendMessageChatArguments, l4.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                        }
                        if (chatActivityEnterView.Q1 != 0) {
                            chatActivityEnterView.n1(0, true);
                            chatActivityEnterView.U0.t(true);
                            chatActivityEnterView.U0.A();
                        }
                    }
                }
                ng ngVar2 = chatActivityEnterView.Y2;
                if (ngVar2 != null) {
                    ngVar2.H(null, z10, i12, 0, 0L);
                    return;
                }
                return;
        }
    }

    public rd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, Long l4, boolean z11) {
        this.f27607r = chatActivityEnterView;
        this.f27608s = document;
        this.f27606n = str;
        this.v = sendAnimationData;
        this.f27604c = z10;
        this.d = i10;
        this.e = i11;
        this.f27603b = obj;
        this.h = l4;
        this.f27605f = z11;
    }
}
