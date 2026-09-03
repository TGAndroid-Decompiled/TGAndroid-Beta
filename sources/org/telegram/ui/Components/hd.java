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
public final class hd implements Runnable {
    public final int f27470a = 0;
    public final Object f27471b;
    public final boolean f27472c;
    public final int d;
    public final int f27473e;
    public final boolean f27474f;
    public final Long h;
    public final String f27475n;
    public final Object f27476r;
    public final Object f27477s;
    public final Object v;

    public hd(xf xfVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z4, int i10, int i11, boolean z10, Long l10, String str, Object obj2) {
        this.f27476r = xfVar;
        this.f27471b = obj;
        this.f27477s = photoEntry;
        this.f27472c = z4;
        this.d = i10;
        this.f27473e = i11;
        this.f27474f = z10;
        this.h = l10;
        this.f27475n = str;
        this.v = obj2;
    }

    @Override
    public final void run() {
        TL_stories.StoryItem storyItem;
        boolean z4;
        MessageObject threadMessage;
        MessageObject threadMessage2;
        VideoEditedInfo videoEditedInfo;
        CharSequence charSequence;
        MessageObject threadMessage3;
        String str;
        MessageObject threadMessage4;
        String str2;
        switch (this.f27470a) {
            case 0:
                ChatActivityEnterView.g((ChatActivityEnterView) this.f27476r, (TLRPC.Document) this.f27477s, this.f27475n, (MessageObject.SendAnimationData) this.v, this.f27472c, this.d, this.f27473e, this.f27471b, this.h, this.f27474f);
                return;
            default:
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f27477s;
                ChatActivityEnterView chatActivityEnterView = ((xf) this.f27476r).f33052a;
                boolean z10 = chatActivityEnterView.f24692v3;
                org.telegram.ui.xn xnVar = chatActivityEnterView.L2;
                boolean z11 = false;
                if (z10) {
                    if (chatActivityEnterView.N1 != 0) {
                        chatActivityEnterView.R0.B();
                    }
                    chatActivityEnterView.n1(false, true, false, true);
                }
                eg egVar = chatActivityEnterView.V2;
                SendMessageChatArguments sendMessageChatArguments = null;
                if (egVar != null) {
                    storyItem = egVar.h1();
                } else {
                    storyItem = null;
                }
                Object obj = this.f27471b;
                boolean z12 = obj instanceof TLRPC.Document;
                boolean z13 = this.f27472c;
                int i10 = this.d;
                int i11 = this.f27473e;
                Long l10 = this.h;
                int i12 = i10;
                String str3 = this.f27475n;
                Object obj2 = this.v;
                if (z12) {
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
                        z11 = needConvert;
                    }
                    boolean z14 = this.f27474f;
                    if (z11) {
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
                        AccountInstance accountInstance = AccountInstance.getInstance(chatActivityEnterView.N);
                        long j10 = chatActivityEnterView.M2;
                        MessageObject messageObject = chatActivityEnterView.P2;
                        threadMessage4 = chatActivityEnterView.getThreadMessage();
                        org.telegram.ui.nn nnVar = chatActivityEnterView.R2;
                        MessageObject messageObject2 = chatActivityEnterView.V1;
                        if (xnVar != null) {
                            sendMessageChatArguments = xnVar.C8();
                        }
                        SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j10, messageObject, threadMessage4, null, nnVar, false, false, messageObject2, z13, i12, i11, 0, false, null, sendMessageChatArguments, chatActivityEnterView.O4, z14, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                        z4 = z13;
                        i12 = i12;
                    } else {
                        SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(chatActivityEnterView.N);
                        long j11 = chatActivityEnterView.M2;
                        if (photoEntry != null) {
                            charSequence = photoEntry.caption;
                        } else {
                            charSequence = null;
                        }
                        TL_stories.StoryItem storyItem2 = storyItem;
                        MessageObject messageObject3 = chatActivityEnterView.P2;
                        threadMessage3 = chatActivityEnterView.getThreadMessage();
                        org.telegram.ui.nn nnVar2 = chatActivityEnterView.R2;
                        if (xnVar != null) {
                            sendMessageChatArguments = xnVar.C8();
                        }
                        sendMessagesHelper.sendSticker(document, str3, j11, charSequence, videoEditedInfo, messageObject3, threadMessage3, storyItem2, nnVar2, null, z13, i12, i11, false, obj2, sendMessageChatArguments, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), z14);
                        z4 = z13;
                        i12 = i12;
                        MediaDataController.getInstance(chatActivityEnterView.N).addRecentGif(document, (int) (System.currentTimeMillis() / 1000), true);
                        if (DialogObject.isEncryptedDialog(chatActivityEnterView.M2)) {
                            chatActivityEnterView.O.getMessagesController().saveGif(obj2, document);
                        }
                    }
                } else {
                    z4 = z13;
                    TL_stories.StoryItem storyItem3 = storyItem;
                    if (obj instanceof TLRPC.BotInlineResult) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj;
                        if (botInlineResult.document != null) {
                            MediaDataController.getInstance(chatActivityEnterView.N).addRecentGif(botInlineResult.document, (int) (System.currentTimeMillis() / 1000), false);
                            if (DialogObject.isEncryptedDialog(chatActivityEnterView.M2)) {
                                chatActivityEnterView.O.getMessagesController().saveGif(obj2, botInlineResult.document);
                            }
                        }
                        TLRPC.User user = (TLRPC.User) obj2;
                        HashMap hashMap = new HashMap();
                        hashMap.put("id", botInlineResult.f20843id);
                        hashMap.put("query_id", "" + botInlineResult.query_id);
                        hashMap.put("force_gif", "1");
                        if (storyItem3 == null) {
                            org.telegram.ui.xn xnVar2 = chatActivityEnterView.L2;
                            AccountInstance accountInstance2 = chatActivityEnterView.O;
                            long j12 = chatActivityEnterView.M2;
                            MessageObject messageObject4 = chatActivityEnterView.P2;
                            threadMessage2 = chatActivityEnterView.getThreadMessage();
                            org.telegram.ui.nn nnVar3 = chatActivityEnterView.R2;
                            if (xnVar != null) {
                                sendMessageChatArguments = xnVar.C8();
                            }
                            SendMessagesHelper.prepareSendingBotContextResult(xnVar2, accountInstance2, botInlineResult, hashMap, j12, messageObject4, threadMessage2, null, nnVar3, z4, i12, 0, sendMessageChatArguments, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId());
                            z4 = z4;
                            i12 = i12;
                        } else {
                            SendMessagesHelper sendMessagesHelper2 = SendMessagesHelper.getInstance(chatActivityEnterView.N);
                            TLRPC.Document document2 = botInlineResult.document;
                            long j13 = chatActivityEnterView.M2;
                            MessageObject messageObject5 = chatActivityEnterView.P2;
                            threadMessage = chatActivityEnterView.getThreadMessage();
                            org.telegram.ui.nn nnVar4 = chatActivityEnterView.R2;
                            if (xnVar != null) {
                                sendMessageChatArguments = xnVar.C8();
                            }
                            sendMessagesHelper2.sendSticker(document2, str3, j13, messageObject5, threadMessage, storyItem3, nnVar4, null, z4, i12, i11, false, obj2, sendMessageChatArguments, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                        }
                        if (chatActivityEnterView.N1 != 0) {
                            chatActivityEnterView.m1(0, true);
                            chatActivityEnterView.R0.t(true);
                            chatActivityEnterView.R0.B();
                        }
                    }
                }
                eg egVar2 = chatActivityEnterView.V2;
                if (egVar2 != null) {
                    egVar2.C(null, z4, i12, 0, 0L);
                    return;
                }
                return;
        }
    }

    public hd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z4, int i10, int i11, Object obj, Long l10, boolean z10) {
        this.f27476r = chatActivityEnterView;
        this.f27477s = document;
        this.f27475n = str;
        this.v = sendAnimationData;
        this.f27472c = z4;
        this.d = i10;
        this.f27473e = i11;
        this.f27471b = obj;
        this.h = l10;
        this.f27474f = z10;
    }
}
