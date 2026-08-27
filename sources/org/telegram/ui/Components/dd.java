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

public final class dd implements Runnable {

    public final int f27709a = 0;

    public final Object f27710b;

    public final boolean f27711c;
    public final int d;

    public final int f27712e;

    public final boolean f27713f;
    public final Long h;

    public final String f27714n;

    public final Object f27715r;

    public final Object f27716s;
    public final Object v;

    public dd(tf tfVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, Long l10, String str, Object obj2) {
        this.f27715r = tfVar;
        this.f27710b = obj;
        this.f27716s = photoEntry;
        this.f27711c = z10;
        this.d = i10;
        this.f27712e = i11;
        this.f27713f = z11;
        this.h = l10;
        this.f27714n = str;
        this.v = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        String str;
        switch (this.f27709a) {
            case 0:
                ChatActivityEnterView.g((ChatActivityEnterView) this.f27715r, (TLRPC.Document) this.f27716s, this.f27714n, (MessageObject.SendAnimationData) this.v, this.f27711c, this.d, this.f27712e, this.f27710b, this.h, this.f27713f);
                break;
            default:
                tf tfVar = (tf) this.f27715r;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f27716s;
                ChatActivityEnterView chatActivityEnterView = tfVar.f32761a;
                boolean z11 = chatActivityEnterView.f26186u3;
                org.telegram.ui.rn rnVar = chatActivityEnterView.K2;
                boolean z12 = false;
                if (z11) {
                    if (chatActivityEnterView.M1 != 0) {
                        chatActivityEnterView.Q0.C();
                    }
                    chatActivityEnterView.m1(false, true, false, true);
                }
                ag agVar = chatActivityEnterView.U2;
                TL_stories.StoryItem storyItemT0 = agVar != null ? agVar.T0() : null;
                Object obj = this.f27710b;
                boolean z13 = obj instanceof TLRPC.Document;
                boolean z14 = this.f27711c;
                int i10 = this.d;
                int i11 = this.f27712e;
                Long l10 = this.h;
                int i12 = i10;
                String str2 = this.f27714n;
                Object obj2 = this.v;
                if (z13) {
                    TLRPC.Document document = (TLRPC.Document) obj;
                    VideoEditedInfo videoEditedInfo = photoEntry != null ? photoEntry.editedInfo : null;
                    if (videoEditedInfo != null && photoEntry != null) {
                        videoEditedInfo.roundVideo = true;
                        boolean zNeedConvert = videoEditedInfo.needConvert();
                        videoEditedInfo.roundVideo = false;
                        videoEditedInfo.muted = true;
                        z12 = zNeedConvert;
                    }
                    boolean z15 = this.f27713f;
                    if (z12) {
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
                        SendMessagesHelper.prepareSendingMedia(AccountInstance.getInstance(chatActivityEnterView.M), arrayList, chatActivityEnterView.L2, chatActivityEnterView.O2, chatActivityEnterView.getThreadMessage(), null, chatActivityEnterView.Q2, false, false, chatActivityEnterView.U1, z14, i12, i11, 0, false, null, rnVar != null ? rnVar.C8() : null, chatActivityEnterView.N4, z15, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                        z10 = z14;
                        i12 = i12;
                    } else {
                        SendMessagesHelper.getInstance(chatActivityEnterView.M).sendSticker(document, str2, chatActivityEnterView.L2, photoEntry != null ? photoEntry.caption : null, videoEditedInfo, chatActivityEnterView.O2, chatActivityEnterView.getThreadMessage(), storyItemT0, chatActivityEnterView.Q2, null, z14, i12, i11, false, obj2, rnVar != null ? rnVar.C8() : null, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), z15);
                        z10 = z14;
                        i12 = i12;
                        MediaDataController.getInstance(chatActivityEnterView.M).addRecentGif(document, (int) (System.currentTimeMillis() / 1000), true);
                        if (DialogObject.isEncryptedDialog(chatActivityEnterView.L2)) {
                            chatActivityEnterView.N.getMessagesController().saveGif(obj2, document);
                        }
                    }
                } else {
                    z10 = z14;
                    TL_stories.StoryItem storyItem = storyItemT0;
                    if (obj instanceof TLRPC.BotInlineResult) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj;
                        if (botInlineResult.document != null) {
                            MediaDataController.getInstance(chatActivityEnterView.M).addRecentGif(botInlineResult.document, (int) (System.currentTimeMillis() / 1000), false);
                            if (DialogObject.isEncryptedDialog(chatActivityEnterView.L2)) {
                                chatActivityEnterView.N.getMessagesController().saveGif(obj2, botInlineResult.document);
                            }
                        }
                        HashMap map = new HashMap();
                        map.put("id", botInlineResult.f22378id);
                        map.put("query_id", "" + botInlineResult.query_id);
                        map.put("force_gif", "1");
                        if (storyItem == null) {
                            SendMessagesHelper.prepareSendingBotContextResult(chatActivityEnterView.K2, chatActivityEnterView.N, botInlineResult, map, chatActivityEnterView.L2, chatActivityEnterView.O2, chatActivityEnterView.getThreadMessage(), null, chatActivityEnterView.Q2, z10, i12, 0, rnVar != null ? rnVar.C8() : null, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId());
                            z10 = z10;
                            i12 = i12;
                        } else {
                            SendMessagesHelper.getInstance(chatActivityEnterView.M).sendSticker(botInlineResult.document, str2, chatActivityEnterView.L2, chatActivityEnterView.O2, chatActivityEnterView.getThreadMessage(), storyItem, chatActivityEnterView.Q2, null, z10, i12, i11, false, obj2, rnVar != null ? rnVar.C8() : null, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                        }
                        if (chatActivityEnterView.M1 != 0) {
                            chatActivityEnterView.l1(0, true);
                            chatActivityEnterView.Q0.u(true);
                            chatActivityEnterView.Q0.C();
                        }
                    }
                }
                ag agVar2 = chatActivityEnterView.U2;
                if (agVar2 != null) {
                    agVar2.w(null, z10, i12, 0, 0L);
                }
                break;
        }
    }

    public dd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, Long l10, boolean z11) {
        this.f27715r = chatActivityEnterView;
        this.f27716s = document;
        this.f27714n = str;
        this.v = sendAnimationData;
        this.f27711c = z10;
        this.d = i10;
        this.f27712e = i11;
        this.f27710b = obj;
        this.h = l10;
        this.f27713f = z11;
    }
}
