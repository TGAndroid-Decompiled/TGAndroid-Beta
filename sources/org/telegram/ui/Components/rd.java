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
    public final int f32222a = 0;
    public final Object f32223b;
    public final boolean f32224c;
    public final int d;
    public final int e;
    public final boolean f32225f;
    public final Long h;
    public final String f32226n;
    public final Object f32227r;
    public final Object f32228s;
    public final Object v;

    public rd(gg ggVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, Long l4, String str, Object obj2) {
        this.f32227r = ggVar;
        this.f32223b = obj;
        this.f32228s = photoEntry;
        this.f32224c = z10;
        this.d = i10;
        this.e = i11;
        this.f32225f = z11;
        this.h = l4;
        this.f32226n = str;
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
        switch (this.f32222a) {
            case 0:
                ChatActivityEnterView.e((ChatActivityEnterView) this.f32227r, (TLRPC.Document) this.f32228s, this.f32226n, (MessageObject.SendAnimationData) this.v, this.f32224c, this.d, this.e, this.f32223b, this.h, this.f32225f);
                return;
            default:
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f32228s;
                ChatActivityEnterView chatActivityEnterView = ((gg) this.f32227r).f28566a;
                boolean z11 = chatActivityEnterView.f25993z3;
                org.telegram.ui.un unVar = chatActivityEnterView.P2;
                boolean z12 = false;
                if (z11) {
                    if (chatActivityEnterView.R1 != 0) {
                        chatActivityEnterView.U0.B();
                    }
                    chatActivityEnterView.k1(false, true, false, true);
                }
                og ogVar = chatActivityEnterView.Z2;
                SendMessageChatArguments sendMessageChatArguments = null;
                if (ogVar != null) {
                    storyItem = ogVar.P0();
                } else {
                    storyItem = null;
                }
                Object obj = this.f32223b;
                boolean z13 = obj instanceof TLRPC.Document;
                boolean z14 = this.f32224c;
                int i10 = this.d;
                int i11 = this.e;
                Long l4 = this.h;
                int i12 = i10;
                String str3 = this.f32226n;
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
                    boolean z15 = this.f32225f;
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
                        org.telegram.ui.kn knVar = chatActivityEnterView.V2;
                        MessageObject messageObject2 = chatActivityEnterView.Z1;
                        if (unVar != null) {
                            sendMessageChatArguments = unVar.L8();
                        }
                        SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j10, messageObject, threadMessage4, null, knVar, false, false, messageObject2, z14, i12, i11, 0, false, null, sendMessageChatArguments, chatActivityEnterView.S4, z15, l4.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
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
                        org.telegram.ui.kn knVar2 = chatActivityEnterView.V2;
                        if (unVar != null) {
                            sendMessageChatArguments = unVar.L8();
                        }
                        sendMessagesHelper.sendSticker(document, str3, j11, charSequence, videoEditedInfo, messageObject3, threadMessage3, storyItem2, knVar2, null, z14, i12, i11, false, obj2, sendMessageChatArguments, l4.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), z15);
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
                        hashMap.put("id", botInlineResult.f22025id);
                        hashMap.put("query_id", "" + botInlineResult.query_id);
                        hashMap.put("force_gif", "1");
                        if (storyItem3 == null) {
                            org.telegram.ui.un unVar2 = chatActivityEnterView.P2;
                            AccountInstance accountInstance2 = chatActivityEnterView.R;
                            long j12 = chatActivityEnterView.Q2;
                            MessageObject messageObject4 = chatActivityEnterView.T2;
                            threadMessage2 = chatActivityEnterView.getThreadMessage();
                            org.telegram.ui.kn knVar3 = chatActivityEnterView.V2;
                            if (unVar != null) {
                                sendMessageChatArguments = unVar.L8();
                            }
                            SendMessagesHelper.prepareSendingBotContextResult(unVar2, accountInstance2, botInlineResult, hashMap, j12, messageObject4, threadMessage2, null, knVar3, z10, i12, 0, sendMessageChatArguments, l4.longValue(), chatActivityEnterView.getSendMonoForumPeerId());
                            z10 = z10;
                            i12 = i12;
                        } else {
                            SendMessagesHelper sendMessagesHelper2 = SendMessagesHelper.getInstance(chatActivityEnterView.Q);
                            TLRPC.Document document2 = botInlineResult.document;
                            long j13 = chatActivityEnterView.Q2;
                            MessageObject messageObject5 = chatActivityEnterView.T2;
                            threadMessage = chatActivityEnterView.getThreadMessage();
                            org.telegram.ui.kn knVar4 = chatActivityEnterView.V2;
                            if (unVar != null) {
                                sendMessageChatArguments = unVar.L8();
                            }
                            sendMessagesHelper2.sendSticker(document2, str3, j13, messageObject5, threadMessage, storyItem3, knVar4, null, z10, i12, i11, false, obj2, sendMessageChatArguments, l4.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                        }
                        if (chatActivityEnterView.R1 != 0) {
                            chatActivityEnterView.j1(0, true);
                            chatActivityEnterView.U0.t(true);
                            chatActivityEnterView.U0.B();
                        }
                    }
                }
                og ogVar2 = chatActivityEnterView.Z2;
                if (ogVar2 != null) {
                    ogVar2.A(null, z10, i12, 0, 0L);
                    return;
                }
                return;
        }
    }

    public rd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, Long l4, boolean z11) {
        this.f32227r = chatActivityEnterView;
        this.f32228s = document;
        this.f32226n = str;
        this.v = sendAnimationData;
        this.f32224c = z10;
        this.d = i10;
        this.e = i11;
        this.f32223b = obj;
        this.h = l4;
        this.f32225f = z11;
    }
}
