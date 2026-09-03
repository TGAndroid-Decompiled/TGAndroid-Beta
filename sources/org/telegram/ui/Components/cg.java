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
public final class cg extends org.telegram.ui.fu0 {
    public boolean f23938a;
    public final MediaController.PhotoEntry f23939b;
    public final File f23940c;
    public final dg d;

    public cg(dg dgVar, MediaController.PhotoEntry photoEntry, File file) {
        this.d = dgVar;
        this.f23939b = photoEntry;
        this.f23940c = file;
    }

    @Override
    public final void G() {
        if (!this.f23938a) {
            try {
                this.f23940c.delete();
            } catch (Throwable unused) {
            }
        }
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        String str;
        MessageObject threadMessage;
        int i13;
        SendMessageChatArguments sendMessageChatArguments;
        String str2;
        org.telegram.ui.zn znVar;
        ChatActivityEnterView chatActivityEnterView = this.d.d;
        org.telegram.ui.pn pnVar = chatActivityEnterView.R2;
        if (pnVar != null && (znVar = chatActivityEnterView.L2) != null && pnVar.f37192f) {
            znVar.Rb();
            return;
        }
        ArrayList arrayList = new ArrayList();
        SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
        MediaController.PhotoEntry photoEntry = this.f23939b;
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
        this.f23938a = true;
        boolean checkUpdateStickersOrder = SendMessagesHelper.checkUpdateStickersOrder(sendingMediaInfo.caption);
        AccountInstance accountInstance = chatActivityEnterView.O;
        MessageSuggestionParams messageSuggestionParams = null;
        long j10 = chatActivityEnterView.M2;
        MessageObject messageObject = chatActivityEnterView.P2;
        threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.pn pnVar2 = chatActivityEnterView.R2;
        MessageObject messageObject2 = chatActivityEnterView.V1;
        org.telegram.ui.zn znVar2 = chatActivityEnterView.L2;
        if (znVar2 == null) {
            i13 = 0;
        } else {
            i13 = znVar2.O3;
        }
        if (znVar2 != null) {
            sendMessageChatArguments = znVar2.C8();
        } else {
            sendMessageChatArguments = null;
        }
        long sendMonoForumPeerId = chatActivityEnterView.getSendMonoForumPeerId();
        org.telegram.ui.zn znVar3 = chatActivityEnterView.L2;
        if (znVar3 != null) {
            messageSuggestionParams = znVar3.f40555d5;
        }
        SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j10, messageObject, threadMessage, null, pnVar2, false, false, messageObject2, z4, i11, i12, i13, checkUpdateStickersOrder, null, sendMessageChatArguments, 0L, false, 0L, sendMonoForumPeerId, messageSuggestionParams);
        eg egVar = chatActivityEnterView.V2;
        if (egVar != null) {
            egVar.G(null, true, i11, i12, 0L);
        }
    }
}
