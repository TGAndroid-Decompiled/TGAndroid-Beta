package org.telegram.ui.Components;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.VideoEditedInfo;
public final class cg extends org.telegram.ui.rt0 {
    public boolean f27476a;
    public final MediaController.PhotoEntry f27477b;
    public final File f27478c;
    public final dg d;

    public cg(dg dgVar, MediaController.PhotoEntry photoEntry, File file) {
        this.d = dgVar;
        this.f27477b = photoEntry;
        this.f27478c = file;
    }

    @Override
    public final void G() {
        if (!this.f27476a) {
            try {
                this.f27478c.delete();
            } catch (Throwable unused) {
            }
        }
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i9, VideoEditedInfo videoEditedInfo, boolean z10, int i10, int i11, boolean z11) {
        String str;
        MessageObject threadMessage;
        int i12;
        SendMessageChatArguments sendMessageChatArguments;
        String str2;
        org.telegram.ui.qn qnVar;
        ChatActivityEnterView chatActivityEnterView = this.d.d;
        org.telegram.ui.gn gnVar = chatActivityEnterView.Q2;
        if (gnVar != null && (qnVar = chatActivityEnterView.K2) != null && gnVar.f38576f) {
            qnVar.Rb();
            return;
        }
        ArrayList arrayList = new ArrayList();
        SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
        MediaController.PhotoEntry photoEntry = this.f27477b;
        if (!photoEntry.isVideo && (str2 = photoEntry.imagePath) != null) {
            sendingMediaInfo.path = str2;
        } else {
            String str3 = photoEntry.path;
            if (str3 != null) {
                sendingMediaInfo.path = str3;
            }
        }
        sendingMediaInfo.thumbPath = photoEntry.thumbPath;
        sendingMediaInfo.isLivePhoto = photoEntry.isLivePhoto();
        sendingMediaInfo.isVideo = photoEntry.isVideo;
        sendingMediaInfo.discardLivePhoto = photoEntry.isUnalivePhoto();
        sendingMediaInfo.livePhotoVideoOffset = photoEntry.livePhotoVideoOffset;
        sendingMediaInfo.livePhotoTimestampUs = photoEntry.livePhotoTimestampUs;
        CharSequence charSequence = photoEntry.caption;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        sendingMediaInfo.caption = str;
        sendingMediaInfo.entities = photoEntry.entities;
        sendingMediaInfo.masks = photoEntry.stickers;
        sendingMediaInfo.ttl = photoEntry.ttl;
        sendingMediaInfo.videoEditedInfo = videoEditedInfo;
        sendingMediaInfo.canDeleteAfter = true;
        arrayList.add(sendingMediaInfo);
        photoEntry.reset();
        this.f27476a = true;
        boolean checkUpdateStickersOrder = SendMessagesHelper.checkUpdateStickersOrder(sendingMediaInfo.caption);
        AccountInstance accountInstance = chatActivityEnterView.N;
        MessageSuggestionParams messageSuggestionParams = null;
        long j10 = chatActivityEnterView.L2;
        MessageObject messageObject = chatActivityEnterView.O2;
        threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.gn gnVar2 = chatActivityEnterView.Q2;
        MessageObject messageObject2 = chatActivityEnterView.U1;
        org.telegram.ui.qn qnVar2 = chatActivityEnterView.K2;
        if (qnVar2 == null) {
            i12 = 0;
        } else {
            i12 = qnVar2.N3;
        }
        if (qnVar2 != null) {
            sendMessageChatArguments = qnVar2.C8();
        } else {
            sendMessageChatArguments = null;
        }
        long sendMonoForumPeerId = chatActivityEnterView.getSendMonoForumPeerId();
        org.telegram.ui.qn qnVar3 = chatActivityEnterView.K2;
        if (qnVar3 != null) {
            messageSuggestionParams = qnVar3.f41870c5;
        }
        SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j10, messageObject, threadMessage, null, gnVar2, false, false, messageObject2, z10, i10, i11, i12, checkUpdateStickersOrder, null, sendMessageChatArguments, 0L, false, 0L, sendMonoForumPeerId, messageSuggestionParams);
        eg egVar = chatActivityEnterView.U2;
        if (egVar != null) {
            egVar.y(null, true, i10, i11, 0L);
        }
    }
}
