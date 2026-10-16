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
public final class sd implements Runnable {
    public final int f28820a = 0;
    public final Object f28821b;
    public final boolean f28822c;
    public final int d;
    public final int e;
    public final boolean f28823f;
    public final Long h;
    public final String f28824n;
    public final Object f28825r;
    public final Object f28826s;
    public final Object v;

    public sd(ig igVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, Long l4, String str, Object obj2) {
        this.f28825r = igVar;
        this.f28821b = obj;
        this.f28826s = photoEntry;
        this.f28822c = z10;
        this.d = i10;
        this.e = i11;
        this.f28823f = z11;
        this.h = l4;
        this.f28824n = str;
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
        switch (this.f28820a) {
            case 0:
                ChatActivityEnterView.f((ChatActivityEnterView) this.f28825r, (TLRPC.Document) this.f28826s, this.f28824n, (MessageObject.SendAnimationData) this.v, this.f28822c, this.d, this.e, this.f28821b, this.h, this.f28823f);
                return;
            default:
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f28826s;
                ChatActivityEnterView chatActivityEnterView = ((ig) this.f28825r).f25637a;
                boolean z11 = chatActivityEnterView.f22696z3;
                org.telegram.ui.fo foVar = chatActivityEnterView.P2;
                boolean z12 = false;
                if (z11) {
                    if (chatActivityEnterView.R1 != 0) {
                        chatActivityEnterView.U0.C();
                    }
                    chatActivityEnterView.k1(false, true, false, true);
                }
                pg pgVar = chatActivityEnterView.Z2;
                SendMessageChatArguments sendMessageChatArguments = null;
                if (pgVar != null) {
                    storyItem = pgVar.b1();
                } else {
                    storyItem = null;
                }
                Object obj = this.f28821b;
                boolean z13 = obj instanceof TLRPC.Document;
                boolean z14 = this.f28822c;
                int i10 = this.d;
                int i11 = this.e;
                Long l4 = this.h;
                int i12 = i10;
                String str3 = this.f28824n;
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
                    boolean z15 = this.f28823f;
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
                        long j10 = chatActivityEnterView.Q2;
                        MessageObject messageObject = chatActivityEnterView.T2;
                        threadMessage4 = chatActivityEnterView.getThreadMessage();
                        org.telegram.ui.un unVar = chatActivityEnterView.V2;
                        MessageObject messageObject2 = chatActivityEnterView.Z1;
                        if (foVar != null) {
                            sendMessageChatArguments = foVar.H8();
                        }
                        SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j10, messageObject, threadMessage4, null, unVar, false, false, messageObject2, z14, i12, i11, 0, false, null, sendMessageChatArguments, chatActivityEnterView.S4, z15, l4.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                        z10 = z14;
                        i12 = i12;
                    } else {
                        SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(chatActivityEnterView.Q);
                        long j11 = chatActivityEnterView.Q2;
                        if (photoEntry != null) {
                            charSequence = photoEntry.caption;
                        } else {
                            charSequence = null;
                        }
                        TL_stories.StoryItem storyItem2 = storyItem;
                        MessageObject messageObject3 = chatActivityEnterView.T2;
                        threadMessage3 = chatActivityEnterView.getThreadMessage();
                        org.telegram.ui.un unVar2 = chatActivityEnterView.V2;
                        if (foVar != null) {
                            sendMessageChatArguments = foVar.H8();
                        }
                        sendMessagesHelper.sendSticker(document, str3, j11, charSequence, videoEditedInfo, messageObject3, threadMessage3, storyItem2, unVar2, null, z14, i12, i11, false, obj2, sendMessageChatArguments, l4.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), z15);
                        z10 = z14;
                        i12 = i12;
                        MediaDataController.getInstance(chatActivityEnterView.Q).addRecentGif(document, (int) (System.currentTimeMillis() / 1000), true);
                        if (DialogObject.isEncryptedDialog(chatActivityEnterView.Q2)) {
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
                            if (DialogObject.isEncryptedDialog(chatActivityEnterView.Q2)) {
                                chatActivityEnterView.R.getMessagesController().saveGif(obj2, botInlineResult.document);
                            }
                        }
                        TLRPC.User user = (TLRPC.User) obj2;
                        HashMap hashMap = new HashMap();
                        hashMap.put("id", botInlineResult.f18914id);
                        hashMap.put("query_id", "" + botInlineResult.query_id);
                        hashMap.put("force_gif", "1");
                        if (storyItem3 == null) {
                            org.telegram.ui.fo foVar2 = chatActivityEnterView.P2;
                            AccountInstance accountInstance2 = chatActivityEnterView.R;
                            long j12 = chatActivityEnterView.Q2;
                            MessageObject messageObject4 = chatActivityEnterView.T2;
                            threadMessage2 = chatActivityEnterView.getThreadMessage();
                            org.telegram.ui.un unVar3 = chatActivityEnterView.V2;
                            if (foVar != null) {
                                sendMessageChatArguments = foVar.H8();
                            }
                            SendMessagesHelper.prepareSendingBotContextResult(foVar2, accountInstance2, botInlineResult, hashMap, j12, messageObject4, threadMessage2, null, unVar3, z10, i12, 0, sendMessageChatArguments, l4.longValue(), chatActivityEnterView.getSendMonoForumPeerId());
                            z10 = z10;
                            i12 = i12;
                        } else {
                            SendMessagesHelper sendMessagesHelper2 = SendMessagesHelper.getInstance(chatActivityEnterView.Q);
                            TLRPC.Document document2 = botInlineResult.document;
                            long j13 = chatActivityEnterView.Q2;
                            MessageObject messageObject5 = chatActivityEnterView.T2;
                            threadMessage = chatActivityEnterView.getThreadMessage();
                            org.telegram.ui.un unVar4 = chatActivityEnterView.V2;
                            if (foVar != null) {
                                sendMessageChatArguments = foVar.H8();
                            }
                            sendMessagesHelper2.sendSticker(document2, str3, j13, messageObject5, threadMessage, storyItem3, unVar4, null, z10, i12, i11, false, obj2, sendMessageChatArguments, l4.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                        }
                        if (chatActivityEnterView.R1 != 0) {
                            chatActivityEnterView.j1(0, true);
                            chatActivityEnterView.U0.u(true);
                            chatActivityEnterView.U0.C();
                        }
                    }
                }
                pg pgVar2 = chatActivityEnterView.Z2;
                if (pgVar2 != null) {
                    pgVar2.J(null, z10, i12, 0, 0L);
                    return;
                }
                return;
        }
    }

    public sd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, Long l4, boolean z11) {
        this.f28825r = chatActivityEnterView;
        this.f28826s = document;
        this.f28824n = str;
        this.v = sendAnimationData;
        this.f28822c = z10;
        this.d = i10;
        this.e = i11;
        this.f28821b = obj;
        this.h = l4;
        this.f28823f = z11;
    }
}
