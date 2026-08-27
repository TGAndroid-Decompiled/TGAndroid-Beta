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

public final class yf extends org.telegram.ui.st0 {

    public boolean f34889a;

    public final MediaController.PhotoEntry f34890b;

    public final File f34891c;
    public final zf d;

    public yf(zf zfVar, MediaController.PhotoEntry photoEntry, File file) {
        this.d = zfVar;
        this.f34890b = photoEntry;
        this.f34891c = file;
    }

    @Override
    public final void G() {
        if (this.f34889a) {
            return;
        }
        try {
            this.f34891c.delete();
        } catch (Throwable unused) {
        }
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        String str;
        org.telegram.ui.rn rnVar;
        ChatActivityEnterView chatActivityEnterView = this.d.d;
        org.telegram.ui.hn hnVar = chatActivityEnterView.Q2;
        if (hnVar != null && (rnVar = chatActivityEnterView.K2) != null && hnVar.f38865f) {
            rnVar.Rb();
            return;
        }
        ArrayList arrayList = new ArrayList();
        SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
        MediaController.PhotoEntry photoEntry = this.f34890b;
        if (photoEntry.isVideo || (str = photoEntry.imagePath) == null) {
            String str2 = photoEntry.path;
            if (str2 != null) {
                sendingMediaInfo.path = str2;
            }
        } else {
            sendingMediaInfo.path = str;
        }
        sendingMediaInfo.thumbPath = photoEntry.thumbPath;
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
        sendingMediaInfo.videoEditedInfo = videoEditedInfo;
        sendingMediaInfo.canDeleteAfter = true;
        arrayList.add(sendingMediaInfo);
        photoEntry.reset();
        this.f34889a = true;
        boolean zCheckUpdateStickersOrder = SendMessagesHelper.checkUpdateStickersOrder(sendingMediaInfo.caption);
        AccountInstance accountInstance = chatActivityEnterView.N;
        MessageSuggestionParams messageSuggestionParams = null;
        long j10 = chatActivityEnterView.L2;
        MessageObject messageObject = chatActivityEnterView.O2;
        MessageObject threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.hn hnVar2 = chatActivityEnterView.Q2;
        MessageObject messageObject2 = chatActivityEnterView.U1;
        org.telegram.ui.rn rnVar2 = chatActivityEnterView.K2;
        int i13 = rnVar2 == null ? 0 : rnVar2.N3;
        SendMessageChatArguments sendMessageChatArgumentsC8 = rnVar2 != null ? rnVar2.C8() : null;
        long sendMonoForumPeerId = chatActivityEnterView.getSendMonoForumPeerId();
        org.telegram.ui.rn rnVar3 = chatActivityEnterView.K2;
        if (rnVar3 != null) {
            messageSuggestionParams = rnVar3.f42006c5;
        }
        SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j10, messageObject, threadMessage, null, hnVar2, false, false, messageObject2, z10, i11, i12, i13, zCheckUpdateStickersOrder, null, sendMessageChatArgumentsC8, 0L, false, 0L, sendMonoForumPeerId, messageSuggestionParams);
        ag agVar = chatActivityEnterView.U2;
        if (agVar != null) {
            agVar.w(null, true, i11, i12, 0L);
        }
    }
}
