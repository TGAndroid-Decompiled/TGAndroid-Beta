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
public final class mg extends org.telegram.ui.ou0 {
    public boolean f26440a;
    public final MediaController.PhotoEntry f26441b;
    public final File f26442c;
    public final ng d;

    public mg(ng ngVar, MediaController.PhotoEntry photoEntry, File file) {
        this.d = ngVar;
        this.f26441b = photoEntry;
        this.f26442c = file;
    }

    @Override
    public final void G() {
        if (!this.f26440a) {
            try {
                this.f26442c.delete();
            } catch (Throwable unused) {
            }
        }
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        String str;
        MessageObject threadMessage;
        int i13;
        SendMessageChatArguments sendMessageChatArguments;
        String str2;
        org.telegram.ui.xn xnVar;
        ChatActivityEnterView chatActivityEnterView = this.d.d;
        org.telegram.ui.nn nnVar = chatActivityEnterView.V2;
        if (nnVar != null && (xnVar = chatActivityEnterView.P2) != null && nnVar.f36054f) {
            xnVar.Rb();
            return;
        }
        ArrayList arrayList = new ArrayList();
        SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
        MediaController.PhotoEntry photoEntry = this.f26441b;
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
        this.f26440a = true;
        boolean checkUpdateStickersOrder = SendMessagesHelper.checkUpdateStickersOrder(sendingMediaInfo.caption);
        AccountInstance accountInstance = chatActivityEnterView.R;
        MessageSuggestionParams messageSuggestionParams = null;
        long j3 = chatActivityEnterView.Q2;
        MessageObject messageObject = chatActivityEnterView.T2;
        threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.nn nnVar2 = chatActivityEnterView.V2;
        MessageObject messageObject2 = chatActivityEnterView.Z1;
        org.telegram.ui.xn xnVar2 = chatActivityEnterView.P2;
        if (xnVar2 == null) {
            i13 = 0;
        } else {
            i13 = xnVar2.R3;
        }
        if (xnVar2 != null) {
            sendMessageChatArguments = xnVar2.C8();
        } else {
            sendMessageChatArguments = null;
        }
        long sendMonoForumPeerId = chatActivityEnterView.getSendMonoForumPeerId();
        org.telegram.ui.xn xnVar3 = chatActivityEnterView.P2;
        if (xnVar3 != null) {
            messageSuggestionParams = xnVar3.f39770g5;
        }
        SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j3, messageObject, threadMessage, null, nnVar2, false, false, messageObject2, z10, i11, i12, i13, checkUpdateStickersOrder, null, sendMessageChatArguments, 0L, false, 0L, sendMonoForumPeerId, messageSuggestionParams);
        og ogVar = chatActivityEnterView.Z2;
        if (ogVar != null) {
            ogVar.H(null, true, i11, i12, 0L);
        }
    }
}
