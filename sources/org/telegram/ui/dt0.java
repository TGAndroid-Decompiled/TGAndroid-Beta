package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

public final class dt0 extends st0 {

    public final ImageReceiver.BitmapHolder f37545a;

    public final au0 f37546b;

    public final MessageObject f37547c;
    public final MediaController.PhotoEntry d;

    public final boolean f37548e;

    public final boolean f37549f;

    public final PhotoViewer f37550g;

    public dt0(PhotoViewer photoViewer, au0 au0Var, MessageObject messageObject, MediaController.PhotoEntry photoEntry, boolean z10, boolean z11) {
        this.f37550g = photoViewer;
        this.f37546b = au0Var;
        this.f37547c = messageObject;
        this.d = photoEntry;
        this.f37548e = z10;
        this.f37549f = z11;
        this.f37545a = photoViewer.f35805y4.getBitmapSafe();
    }

    @Override
    public final cu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        au0 au0Var = this.f37546b;
        if (au0Var != null) {
            return au0Var.E(this.f37547c, null, 0, z10, false);
        }
        return null;
    }

    @Override
    public final void L(VideoEditedInfo videoEditedInfo) {
        MediaController.PhotoEntry photoEntry = this.d;
        if (photoEntry.isCropped || photoEntry.isPainted || photoEntry.isFiltered || videoEditedInfo != null || !TextUtils.isEmpty(photoEntry.caption)) {
            c0(videoEditedInfo, false, 0, true, false);
        }
    }

    @Override
    public final MessageObject U() {
        return this.f37547c;
    }

    public final void c0(VideoEditedInfo videoEditedInfo, boolean z10, int i10, boolean z11, boolean z12) {
        PhotoViewer photoViewer = this.f37550g;
        if (photoViewer.f35652h4 != null) {
            hn hnVar = null;
            MessageObject messageObject = this.f37547c;
            MessageObject messageObject2 = z11 ? messageObject : null;
            MediaController.PhotoEntry photoEntry = this.d;
            if (messageObject2 != null && !TextUtils.isEmpty(photoEntry.caption)) {
                messageObject2.editingMessage = photoEntry.caption;
                messageObject2.editingMessageEntities = photoEntry.entities;
            }
            if (z11 || messageObject == null) {
                rn rnVar = photoViewer.f35652h4;
                messageObject = rnVar.f42095j5;
                hnVar = rnVar.f42069h5;
            }
            hn hnVar2 = hnVar;
            MessageObject messageObject3 = messageObject;
            if (photoEntry.isVideo) {
                if (videoEditedInfo != null) {
                    AccountInstance accountInstance = photoViewer.f35652h4.getAccountInstance();
                    String str = photoEntry.path;
                    long jA = photoViewer.f35652h4.a();
                    rn rnVar2 = photoViewer.f35652h4;
                    SendMessagesHelper.prepareSendingVideo(accountInstance, str, videoEditedInfo, null, null, jA, messageObject3, rnVar2.T3, null, hnVar2, photoEntry.entities, photoEntry.ttl, messageObject2, z10, i10, 0, z12, photoEntry.hasSpoiler, photoEntry.caption, rnVar2.C8(), 0L, 0L, photoViewer.f35652h4.N8(), photoViewer.f35652h4.f42006c5);
                    return;
                }
                MessageObject messageObject4 = messageObject2;
                AccountInstance accountInstance2 = photoViewer.f35652h4.getAccountInstance();
                String str2 = photoEntry.path;
                long jA2 = photoViewer.f35652h4.a();
                rn rnVar3 = photoViewer.f35652h4;
                SendMessagesHelper.prepareSendingVideo(accountInstance2, str2, null, null, null, jA2, messageObject3, rnVar3.T3, null, hnVar2, photoEntry.entities, photoEntry.ttl, messageObject4, z10, i10, 0, z12, photoEntry.hasSpoiler, photoEntry.caption, rnVar3.C8(), 0L, 0L, photoViewer.f35652h4.N8(), photoViewer.f35652h4.f42006c5);
                return;
            }
            MessageObject messageObject5 = messageObject2;
            if (photoEntry.imagePath != null) {
                AccountInstance accountInstance3 = photoViewer.f35652h4.getAccountInstance();
                String str3 = photoEntry.imagePath;
                String str4 = photoEntry.thumbPath;
                long jA3 = photoViewer.f35652h4.a();
                rn rnVar4 = photoViewer.f35652h4;
                SendMessagesHelper.prepareSendingPhoto(accountInstance3, str3, str4, null, jA3, messageObject3, rnVar4.T3, null, hnVar2, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, messageObject5, videoEditedInfo, z10, i10, 0, 0, z12, photoEntry.caption, rnVar4.C8(), 0L, 0L, photoViewer.f35652h4.N8(), photoViewer.f35652h4.f42006c5);
                return;
            }
            if (photoEntry.path != null) {
                AccountInstance accountInstance4 = photoViewer.f35652h4.getAccountInstance();
                String str5 = photoEntry.path;
                String str6 = photoEntry.thumbPath;
                long jA4 = photoViewer.f35652h4.a();
                rn rnVar5 = photoViewer.f35652h4;
                SendMessagesHelper.prepareSendingPhoto(accountInstance4, str5, str6, null, jA4, messageObject3, rnVar5.T3, null, hnVar2, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, messageObject5, videoEditedInfo, z10, i10, 0, 0, z12, photoEntry.caption, rnVar5.C8(), 0L, 0L, photoViewer.f35652h4.N8(), photoViewer.f35652h4.f42006c5);
            }
        }
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return this.f37545a;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        c0(videoEditedInfo, z10, i11, false, z11);
    }

    @Override
    public final boolean p() {
        return this.f37546b != null && this.f37548e;
    }

    @Override
    public final boolean r() {
        return this.f37546b != null && this.f37549f;
    }
}
