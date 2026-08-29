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
public final class kd implements Runnable {
    public final int f30011a = 0;
    public final Object f30012b;
    public final boolean f30013c;
    public final int d;
    public final int f30014e;
    public final boolean f30015f;
    public final Long h;
    public final String f30016n;
    public final Object f30017r;
    public final Object f30018s;
    public final Object v;

    public kd(ag agVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, Long l10, String str, Object obj2) {
        this.f30017r = agVar;
        this.f30012b = obj;
        this.f30018s = photoEntry;
        this.f30013c = z10;
        this.d = i10;
        this.f30014e = i11;
        this.f30015f = z11;
        this.h = l10;
        this.f30016n = str;
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
        switch (this.f30011a) {
            case 0:
                ChatActivityEnterView.g((ChatActivityEnterView) this.f30017r, (TLRPC.Document) this.f30018s, this.f30016n, (MessageObject.SendAnimationData) this.v, this.f30013c, this.d, this.f30014e, this.f30012b, this.h, this.f30015f);
                return;
            default:
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f30018s;
                ChatActivityEnterView chatActivityEnterView = ((ag) this.f30017r).f26766a;
                boolean z11 = chatActivityEnterView.f26201u3;
                org.telegram.ui.tn tnVar = chatActivityEnterView.K2;
                boolean z12 = false;
                if (z11) {
                    if (chatActivityEnterView.M1 != 0) {
                        chatActivityEnterView.Q0.B();
                    }
                    chatActivityEnterView.n1(false, true, false, true);
                }
                hg hgVar = chatActivityEnterView.U2;
                SendMessageChatArguments sendMessageChatArguments = null;
                if (hgVar != null) {
                    storyItem = hgVar.d1();
                } else {
                    storyItem = null;
                }
                Object obj = this.f30012b;
                boolean z13 = obj instanceof TLRPC.Document;
                boolean z14 = this.f30013c;
                int i10 = this.d;
                int i11 = this.f30014e;
                Long l10 = this.h;
                int i12 = i10;
                String str3 = this.f30016n;
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
                    boolean z15 = this.f30015f;
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
                        AccountInstance accountInstance = AccountInstance.getInstance(chatActivityEnterView.M);
                        long j10 = chatActivityEnterView.L2;
                        MessageObject messageObject = chatActivityEnterView.O2;
                        threadMessage4 = chatActivityEnterView.getThreadMessage();
                        org.telegram.ui.jn jnVar = chatActivityEnterView.Q2;
                        MessageObject messageObject2 = chatActivityEnterView.U1;
                        if (tnVar != null) {
                            sendMessageChatArguments = tnVar.C8();
                        }
                        SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j10, messageObject, threadMessage4, null, jnVar, false, false, messageObject2, z14, i12, i11, 0, false, null, sendMessageChatArguments, chatActivityEnterView.N4, z15, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                        z10 = z14;
                        i12 = i12;
                    } else {
                        SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(chatActivityEnterView.M);
                        long j11 = chatActivityEnterView.L2;
                        if (photoEntry != null) {
                            charSequence = photoEntry.caption;
                        } else {
                            charSequence = null;
                        }
                        TL_stories.StoryItem storyItem2 = storyItem;
                        MessageObject messageObject3 = chatActivityEnterView.O2;
                        threadMessage3 = chatActivityEnterView.getThreadMessage();
                        org.telegram.ui.jn jnVar2 = chatActivityEnterView.Q2;
                        if (tnVar != null) {
                            sendMessageChatArguments = tnVar.C8();
                        }
                        sendMessagesHelper.sendSticker(document, str3, j11, charSequence, videoEditedInfo, messageObject3, threadMessage3, storyItem2, jnVar2, null, z14, i12, i11, false, obj2, sendMessageChatArguments, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), z15);
                        z10 = z14;
                        i12 = i12;
                        MediaDataController.getInstance(chatActivityEnterView.M).addRecentGif(document, (int) (System.currentTimeMillis() / 1000), true);
                        if (DialogObject.isEncryptedDialog(chatActivityEnterView.L2)) {
                            chatActivityEnterView.N.getMessagesController().saveGif(obj2, document);
                        }
                    }
                } else {
                    z10 = z14;
                    TL_stories.StoryItem storyItem3 = storyItem;
                    if (obj instanceof TLRPC.BotInlineResult) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj;
                        if (botInlineResult.document != null) {
                            MediaDataController.getInstance(chatActivityEnterView.M).addRecentGif(botInlineResult.document, (int) (System.currentTimeMillis() / 1000), false);
                            if (DialogObject.isEncryptedDialog(chatActivityEnterView.L2)) {
                                chatActivityEnterView.N.getMessagesController().saveGif(obj2, botInlineResult.document);
                            }
                        }
                        TLRPC.User user = (TLRPC.User) obj2;
                        HashMap hashMap = new HashMap();
                        hashMap.put("id", botInlineResult.f22390id);
                        hashMap.put("query_id", "" + botInlineResult.query_id);
                        hashMap.put("force_gif", "1");
                        if (storyItem3 == null) {
                            org.telegram.ui.tn tnVar2 = chatActivityEnterView.K2;
                            AccountInstance accountInstance2 = chatActivityEnterView.N;
                            long j12 = chatActivityEnterView.L2;
                            MessageObject messageObject4 = chatActivityEnterView.O2;
                            threadMessage2 = chatActivityEnterView.getThreadMessage();
                            org.telegram.ui.jn jnVar3 = chatActivityEnterView.Q2;
                            if (tnVar != null) {
                                sendMessageChatArguments = tnVar.C8();
                            }
                            SendMessagesHelper.prepareSendingBotContextResult(tnVar2, accountInstance2, botInlineResult, hashMap, j12, messageObject4, threadMessage2, null, jnVar3, z10, i12, 0, sendMessageChatArguments, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId());
                            z10 = z10;
                            i12 = i12;
                        } else {
                            SendMessagesHelper sendMessagesHelper2 = SendMessagesHelper.getInstance(chatActivityEnterView.M);
                            TLRPC.Document document2 = botInlineResult.document;
                            long j13 = chatActivityEnterView.L2;
                            MessageObject messageObject5 = chatActivityEnterView.O2;
                            threadMessage = chatActivityEnterView.getThreadMessage();
                            org.telegram.ui.jn jnVar4 = chatActivityEnterView.Q2;
                            if (tnVar != null) {
                                sendMessageChatArguments = tnVar.C8();
                            }
                            sendMessagesHelper2.sendSticker(document2, str3, j13, messageObject5, threadMessage, storyItem3, jnVar4, null, z10, i12, i11, false, obj2, sendMessageChatArguments, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                        }
                        if (chatActivityEnterView.M1 != 0) {
                            chatActivityEnterView.m1(0, true);
                            chatActivityEnterView.Q0.t(true);
                            chatActivityEnterView.Q0.B();
                        }
                    }
                }
                hg hgVar2 = chatActivityEnterView.U2;
                if (hgVar2 != null) {
                    hgVar2.D(null, z10, i12, 0, 0L);
                    return;
                }
                return;
        }
    }

    public kd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, Long l10, boolean z11) {
        this.f30017r = chatActivityEnterView;
        this.f30018s = document;
        this.f30016n = str;
        this.v = sendAnimationData;
        this.f30013c = z10;
        this.d = i10;
        this.f30014e = i11;
        this.f30012b = obj;
        this.h = l10;
        this.f30015f = z11;
    }
}
