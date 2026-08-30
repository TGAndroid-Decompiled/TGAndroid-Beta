package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class jt0 extends yt0 {
    public final ImageReceiver.BitmapHolder f35488a;
    public final hu0 f35489b;
    public final MessageObject f35490c;
    public final MediaController.PhotoEntry d;
    public final boolean e;
    public final boolean f35491f;
    public final PhotoViewer f35492g;

    public jt0(PhotoViewer photoViewer, hu0 hu0Var, MessageObject messageObject, MediaController.PhotoEntry photoEntry, boolean z4, boolean z10) {
        this.f35492g = photoViewer;
        this.f35489b = hu0Var;
        this.f35490c = messageObject;
        this.d = photoEntry;
        this.e = z4;
        this.f35491f = z10;
        this.f35488a = photoViewer.z4.getBitmapSafe();
    }

    @Override
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        hu0 hu0Var = this.f35489b;
        if (hu0Var != null) {
            return hu0Var.E(this.f35490c, null, 0, z4, false);
        }
        return null;
    }

    @Override
    public final void L(VideoEditedInfo videoEditedInfo) {
        MediaController.PhotoEntry photoEntry = this.d;
        if (!photoEntry.isCropped && !photoEntry.isPainted && !photoEntry.isFiltered && videoEditedInfo == null && TextUtils.isEmpty(photoEntry.caption)) {
            return;
        }
        c0(videoEditedInfo, false, 0, true, false);
    }

    @Override
    public final MessageObject U() {
        return this.f35490c;
    }

    public final void c0(VideoEditedInfo videoEditedInfo, boolean z4, int i10, boolean z10, boolean z11) {
        MessageObject messageObject;
        PhotoViewer photoViewer = this.f35492g;
        if (photoViewer.f31772i4 != null) {
            nn nnVar = null;
            MessageObject messageObject2 = this.f35490c;
            if (z10) {
                messageObject = messageObject2;
            } else {
                messageObject = null;
            }
            MediaController.PhotoEntry photoEntry = this.d;
            if (messageObject != null && !TextUtils.isEmpty(photoEntry.caption)) {
                messageObject.editingMessage = photoEntry.caption;
                messageObject.editingMessageEntities = photoEntry.entities;
            }
            if (z10 || messageObject2 == null) {
                xn xnVar = photoViewer.f31772i4;
                messageObject2 = xnVar.f40076k5;
                nnVar = xnVar.f40052i5;
            }
            nn nnVar2 = nnVar;
            MessageObject messageObject3 = messageObject2;
            if (photoEntry.isVideo) {
                if (videoEditedInfo != null) {
                    AccountInstance accountInstance = photoViewer.f31772i4.getAccountInstance();
                    String str = photoEntry.path;
                    long a2 = photoViewer.f31772i4.a();
                    xn xnVar2 = photoViewer.f31772i4;
                    SendMessagesHelper.prepareSendingVideo(accountInstance, str, videoEditedInfo, null, null, a2, messageObject3, xnVar2.U3, null, nnVar2, photoEntry.entities, photoEntry.ttl, messageObject, z4, i10, 0, z11, photoEntry.hasSpoiler, photoEntry.caption, xnVar2.C8(), 0L, 0L, photoViewer.f31772i4.N8(), photoViewer.f31772i4.f39989d5);
                    return;
                }
                MessageObject messageObject4 = messageObject;
                AccountInstance accountInstance2 = photoViewer.f31772i4.getAccountInstance();
                String str2 = photoEntry.path;
                long a10 = photoViewer.f31772i4.a();
                xn xnVar3 = photoViewer.f31772i4;
                SendMessagesHelper.prepareSendingVideo(accountInstance2, str2, null, null, null, a10, messageObject3, xnVar3.U3, null, nnVar2, photoEntry.entities, photoEntry.ttl, messageObject4, z4, i10, 0, z11, photoEntry.hasSpoiler, photoEntry.caption, xnVar3.C8(), 0L, 0L, photoViewer.f31772i4.N8(), photoViewer.f31772i4.f39989d5);
                return;
            }
            MessageObject messageObject5 = messageObject;
            if (photoEntry.imagePath != null) {
                AccountInstance accountInstance3 = photoViewer.f31772i4.getAccountInstance();
                String str3 = photoEntry.imagePath;
                String str4 = photoEntry.thumbPath;
                long a11 = photoViewer.f31772i4.a();
                xn xnVar4 = photoViewer.f31772i4;
                SendMessagesHelper.prepareSendingPhoto(accountInstance3, str3, str4, null, a11, messageObject3, xnVar4.U3, null, nnVar2, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, messageObject5, videoEditedInfo, z4, i10, 0, 0, z11, photoEntry.caption, xnVar4.C8(), 0L, 0L, photoViewer.f31772i4.N8(), photoViewer.f31772i4.f39989d5);
            } else if (photoEntry.path != null) {
                AccountInstance accountInstance4 = photoViewer.f31772i4.getAccountInstance();
                String str5 = photoEntry.path;
                String str6 = photoEntry.thumbPath;
                long a12 = photoViewer.f31772i4.a();
                xn xnVar5 = photoViewer.f31772i4;
                SendMessagesHelper.prepareSendingPhoto(accountInstance4, str5, str6, null, a12, messageObject3, xnVar5.U3, null, nnVar2, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, messageObject5, videoEditedInfo, z4, i10, 0, 0, z11, photoEntry.caption, xnVar5.C8(), 0L, 0L, photoViewer.f31772i4.N8(), photoViewer.f31772i4.f39989d5);
            }
        }
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return this.f35488a;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        c0(videoEditedInfo, z4, i11, false, z10);
    }

    @Override
    public final boolean p() {
        if (this.f35489b != null && this.e) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean r() {
        if (this.f35489b != null && this.f35491f) {
            return true;
        }
        return false;
    }
}
