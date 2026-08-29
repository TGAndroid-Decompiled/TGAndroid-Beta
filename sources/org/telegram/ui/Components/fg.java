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
public final class fg extends org.telegram.ui.pt0 {
    public boolean f28397a;
    public final MediaController.PhotoEntry f28398b;
    public final File f28399c;
    public final gg d;

    public fg(gg ggVar, MediaController.PhotoEntry photoEntry, File file) {
        this.d = ggVar;
        this.f28398b = photoEntry;
        this.f28399c = file;
    }

    @Override
    public final void G() {
        if (!this.f28397a) {
            try {
                this.f28399c.delete();
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
        org.telegram.ui.tn tnVar;
        ChatActivityEnterView chatActivityEnterView = this.d.d;
        org.telegram.ui.jn jnVar = chatActivityEnterView.Q2;
        if (jnVar != null && (tnVar = chatActivityEnterView.K2) != null && jnVar.f39594f) {
            tnVar.Rb();
            return;
        }
        ArrayList arrayList = new ArrayList();
        SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
        MediaController.PhotoEntry photoEntry = this.f28398b;
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
        this.f28397a = true;
        boolean checkUpdateStickersOrder = SendMessagesHelper.checkUpdateStickersOrder(sendingMediaInfo.caption);
        AccountInstance accountInstance = chatActivityEnterView.N;
        MessageSuggestionParams messageSuggestionParams = null;
        long j10 = chatActivityEnterView.L2;
        MessageObject messageObject = chatActivityEnterView.O2;
        threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.jn jnVar2 = chatActivityEnterView.Q2;
        MessageObject messageObject2 = chatActivityEnterView.U1;
        org.telegram.ui.tn tnVar2 = chatActivityEnterView.K2;
        if (tnVar2 == null) {
            i13 = 0;
        } else {
            i13 = tnVar2.N3;
        }
        if (tnVar2 != null) {
            sendMessageChatArguments = tnVar2.C8();
        } else {
            sendMessageChatArguments = null;
        }
        long sendMonoForumPeerId = chatActivityEnterView.getSendMonoForumPeerId();
        org.telegram.ui.tn tnVar3 = chatActivityEnterView.K2;
        if (tnVar3 != null) {
            messageSuggestionParams = tnVar3.f42768c5;
        }
        SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j10, messageObject, threadMessage, null, jnVar2, false, false, messageObject2, z10, i11, i12, i13, checkUpdateStickersOrder, null, sendMessageChatArguments, 0L, false, 0L, sendMonoForumPeerId, messageSuggestionParams);
        hg hgVar = chatActivityEnterView.U2;
        if (hgVar != null) {
            hgVar.D(null, true, i11, i12, 0L);
        }
    }
}
