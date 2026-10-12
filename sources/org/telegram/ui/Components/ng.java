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
public final class ng extends org.telegram.ui.av0 {
    public boolean f27662a;
    public final MediaController.PhotoEntry f27663b;
    public final File f27664c;
    public final og d;

    public ng(og ogVar, MediaController.PhotoEntry photoEntry, File file) {
        this.d = ogVar;
        this.f27663b = photoEntry;
        this.f27664c = file;
    }

    @Override
    public final void G() {
        if (!this.f27662a) {
            try {
                this.f27664c.delete();
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
        org.telegram.ui.fo foVar;
        ChatActivityEnterView chatActivityEnterView = this.d.d;
        org.telegram.ui.un unVar = chatActivityEnterView.V2;
        if (unVar != null && (foVar = chatActivityEnterView.P2) != null && unVar.f40713f) {
            foVar.Vb();
            return;
        }
        ArrayList arrayList = new ArrayList();
        SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
        MediaController.PhotoEntry photoEntry = this.f27663b;
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
        this.f27662a = true;
        boolean checkUpdateStickersOrder = SendMessagesHelper.checkUpdateStickersOrder(sendingMediaInfo.caption);
        AccountInstance accountInstance = chatActivityEnterView.R;
        MessageSuggestionParams messageSuggestionParams = null;
        long j10 = chatActivityEnterView.Q2;
        MessageObject messageObject = chatActivityEnterView.T2;
        threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.un unVar2 = chatActivityEnterView.V2;
        MessageObject messageObject2 = chatActivityEnterView.Z1;
        org.telegram.ui.fo foVar2 = chatActivityEnterView.P2;
        if (foVar2 == null) {
            i13 = 0;
        } else {
            i13 = foVar2.R3;
        }
        int i14 = i13;
        if (foVar2 != null) {
            sendMessageChatArguments = foVar2.H8();
        } else {
            sendMessageChatArguments = null;
        }
        long sendMonoForumPeerId = chatActivityEnterView.getSendMonoForumPeerId();
        org.telegram.ui.fo foVar3 = chatActivityEnterView.P2;
        if (foVar3 != null) {
            messageSuggestionParams = foVar3.f35952g5;
        }
        SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j10, messageObject, threadMessage, null, unVar2, false, false, messageObject2, z10, i11, i12, i14, checkUpdateStickersOrder, null, sendMessageChatArguments, 0L, false, 0L, sendMonoForumPeerId, messageSuggestionParams);
        pg pgVar = chatActivityEnterView.Z2;
        if (pgVar != null) {
            pgVar.J(null, true, i11, i12, 0L);
        }
    }
}
