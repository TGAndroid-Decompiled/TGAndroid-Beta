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
public final class og extends org.telegram.ui.tu0 {
    public boolean f25776a;
    public final MediaController.PhotoEntry f25777b;
    public final File f25778c;
    public final pg d;

    public og(pg pgVar, MediaController.PhotoEntry photoEntry, File file) {
        this.d = pgVar;
        this.f25777b = photoEntry;
        this.f25778c = file;
    }

    @Override
    public final void G() {
        if (!this.f25776a) {
            try {
                this.f25778c.delete();
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
        org.telegram.ui.eo eoVar;
        ChatActivityEnterView chatActivityEnterView = this.d.d;
        org.telegram.ui.tn tnVar = chatActivityEnterView.U2;
        if (tnVar != null && (eoVar = chatActivityEnterView.O2) != null && tnVar.f36970f) {
            eoVar.Rb();
            return;
        }
        ArrayList arrayList = new ArrayList();
        SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
        MediaController.PhotoEntry photoEntry = this.f25777b;
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
        this.f25776a = true;
        boolean checkUpdateStickersOrder = SendMessagesHelper.checkUpdateStickersOrder(sendingMediaInfo.caption);
        AccountInstance accountInstance = chatActivityEnterView.R;
        MessageSuggestionParams messageSuggestionParams = null;
        long j3 = chatActivityEnterView.P2;
        MessageObject messageObject = chatActivityEnterView.S2;
        threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.tn tnVar2 = chatActivityEnterView.U2;
        MessageObject messageObject2 = chatActivityEnterView.Y1;
        org.telegram.ui.eo eoVar2 = chatActivityEnterView.O2;
        if (eoVar2 == null) {
            i13 = 0;
        } else {
            i13 = eoVar2.R3;
        }
        if (eoVar2 != null) {
            sendMessageChatArguments = eoVar2.C8();
        } else {
            sendMessageChatArguments = null;
        }
        long sendMonoForumPeerId = chatActivityEnterView.getSendMonoForumPeerId();
        org.telegram.ui.eo eoVar3 = chatActivityEnterView.O2;
        if (eoVar3 != null) {
            messageSuggestionParams = eoVar3.f32336g5;
        }
        SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j3, messageObject, threadMessage, null, tnVar2, false, false, messageObject2, z10, i11, i12, i13, checkUpdateStickersOrder, null, sendMessageChatArguments, 0L, false, 0L, sendMonoForumPeerId, messageSuggestionParams);
        qg qgVar = chatActivityEnterView.Y2;
        if (qgVar != null) {
            qgVar.I(null, true, i11, i12, 0L);
        }
    }
}
