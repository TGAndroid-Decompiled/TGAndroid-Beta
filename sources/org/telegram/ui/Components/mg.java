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
public final class mg extends org.telegram.ui.gu0 {
    public boolean f30569a;
    public final MediaController.PhotoEntry f30570b;
    public final File f30571c;
    public final ng d;

    public mg(ng ngVar, MediaController.PhotoEntry photoEntry, File file) {
        this.d = ngVar;
        this.f30570b = photoEntry;
        this.f30571c = file;
    }

    @Override
    public final void G() {
        if (!this.f30569a) {
            try {
                this.f30571c.delete();
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
        org.telegram.ui.un unVar;
        ChatActivityEnterView chatActivityEnterView = this.d.d;
        org.telegram.ui.kn knVar = chatActivityEnterView.V2;
        if (knVar != null && (unVar = chatActivityEnterView.P2) != null && knVar.f40979f) {
            unVar.dc();
            return;
        }
        ArrayList arrayList = new ArrayList();
        SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
        MediaController.PhotoEntry photoEntry = this.f30570b;
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
        this.f30569a = true;
        boolean checkUpdateStickersOrder = SendMessagesHelper.checkUpdateStickersOrder(sendingMediaInfo.caption);
        AccountInstance accountInstance = chatActivityEnterView.R;
        MessageSuggestionParams messageSuggestionParams = null;
        long j10 = chatActivityEnterView.Q2;
        MessageObject messageObject = chatActivityEnterView.T2;
        threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.kn knVar2 = chatActivityEnterView.V2;
        MessageObject messageObject2 = chatActivityEnterView.Z1;
        org.telegram.ui.un unVar2 = chatActivityEnterView.P2;
        if (unVar2 == null) {
            i13 = 0;
        } else {
            i13 = unVar2.f44221d4;
        }
        int i14 = i13;
        if (unVar2 != null) {
            sendMessageChatArguments = unVar2.L8();
        } else {
            sendMessageChatArguments = null;
        }
        long sendMonoForumPeerId = chatActivityEnterView.getSendMonoForumPeerId();
        org.telegram.ui.un unVar3 = chatActivityEnterView.P2;
        if (unVar3 != null) {
            messageSuggestionParams = unVar3.f44407s5;
        }
        SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j10, messageObject, threadMessage, null, knVar2, false, false, messageObject2, z10, i11, i12, i14, checkUpdateStickersOrder, null, sendMessageChatArguments, 0L, false, 0L, sendMonoForumPeerId, messageSuggestionParams);
        og ogVar = chatActivityEnterView.Z2;
        if (ogVar != null) {
            ogVar.A(null, true, i11, i12, 0L);
        }
    }
}
