package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class ct0 extends rt0 {
    public final ImageReceiver.BitmapHolder f37321a;
    public final zt0 f37322b;
    public final MessageObject f37323c;
    public final MediaController.PhotoEntry d;
    public final boolean f37324e;
    public final boolean f37325f;
    public final PhotoViewer f37326g;

    public ct0(PhotoViewer photoViewer, zt0 zt0Var, MessageObject messageObject, MediaController.PhotoEntry photoEntry, boolean z10, boolean z11) {
        this.f37326g = photoViewer;
        this.f37322b = zt0Var;
        this.f37323c = messageObject;
        this.d = photoEntry;
        this.f37324e = z10;
        this.f37325f = z11;
        this.f37321a = photoViewer.f35802y4.getBitmapSafe();
    }

    @Override
    public final bu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i9, boolean z10, boolean z11) {
        zt0 zt0Var = this.f37322b;
        if (zt0Var != null) {
            return zt0Var.E(this.f37323c, null, 0, z10, false);
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
        return this.f37323c;
    }

    public final void c0(VideoEditedInfo videoEditedInfo, boolean z10, int i9, boolean z11, boolean z12) {
        MessageObject messageObject;
        PhotoViewer photoViewer = this.f37326g;
        if (photoViewer.f35649h4 != null) {
            gn gnVar = null;
            MessageObject messageObject2 = this.f37323c;
            if (z11) {
                messageObject = messageObject2;
            } else {
                messageObject = null;
            }
            MediaController.PhotoEntry photoEntry = this.d;
            if (messageObject != null && !TextUtils.isEmpty(photoEntry.caption)) {
                messageObject.editingMessage = photoEntry.caption;
                messageObject.editingMessageEntities = photoEntry.entities;
            }
            if (z11 || messageObject2 == null) {
                qn qnVar = photoViewer.f35649h4;
                messageObject2 = qnVar.f41959j5;
                gnVar = qnVar.f41934h5;
            }
            gn gnVar2 = gnVar;
            MessageObject messageObject3 = messageObject2;
            if (photoEntry.isVideo) {
                if (videoEditedInfo != null) {
                    AccountInstance accountInstance = photoViewer.f35649h4.getAccountInstance();
                    String str = photoEntry.path;
                    long a2 = photoViewer.f35649h4.a();
                    qn qnVar2 = photoViewer.f35649h4;
                    SendMessagesHelper.prepareSendingVideo(accountInstance, str, videoEditedInfo, null, null, a2, messageObject3, qnVar2.T3, null, gnVar2, photoEntry.entities, photoEntry.ttl, messageObject, z10, i9, 0, z12, photoEntry.hasSpoiler, photoEntry.caption, qnVar2.C8(), 0L, 0L, photoViewer.f35649h4.N8(), photoViewer.f35649h4.f41870c5);
                    return;
                }
                MessageObject messageObject4 = messageObject;
                AccountInstance accountInstance2 = photoViewer.f35649h4.getAccountInstance();
                String str2 = photoEntry.path;
                long a3 = photoViewer.f35649h4.a();
                qn qnVar3 = photoViewer.f35649h4;
                SendMessagesHelper.prepareSendingVideo(accountInstance2, str2, null, null, null, a3, messageObject3, qnVar3.T3, null, gnVar2, photoEntry.entities, photoEntry.ttl, messageObject4, z10, i9, 0, z12, photoEntry.hasSpoiler, photoEntry.caption, qnVar3.C8(), 0L, 0L, photoViewer.f35649h4.N8(), photoViewer.f35649h4.f41870c5);
                return;
            }
            MessageObject messageObject5 = messageObject;
            if (photoEntry.imagePath != null) {
                AccountInstance accountInstance3 = photoViewer.f35649h4.getAccountInstance();
                String str3 = photoEntry.imagePath;
                String str4 = photoEntry.thumbPath;
                long a10 = photoViewer.f35649h4.a();
                qn qnVar4 = photoViewer.f35649h4;
                SendMessagesHelper.prepareSendingPhoto(accountInstance3, str3, str4, null, a10, messageObject3, qnVar4.T3, null, gnVar2, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, messageObject5, videoEditedInfo, z10, i9, 0, 0, z12, photoEntry.caption, qnVar4.C8(), 0L, 0L, photoViewer.f35649h4.N8(), photoViewer.f35649h4.f41870c5);
            } else if (photoEntry.path != null) {
                AccountInstance accountInstance4 = photoViewer.f35649h4.getAccountInstance();
                String str5 = photoEntry.path;
                String str6 = photoEntry.thumbPath;
                long a11 = photoViewer.f35649h4.a();
                qn qnVar5 = photoViewer.f35649h4;
                SendMessagesHelper.prepareSendingPhoto(accountInstance4, str5, str6, null, a11, messageObject3, qnVar5.T3, null, gnVar2, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, messageObject5, videoEditedInfo, z10, i9, 0, 0, z12, photoEntry.caption, qnVar5.C8(), 0L, 0L, photoViewer.f35649h4.N8(), photoViewer.f35649h4.f41870c5);
            }
        }
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i9) {
        return this.f37321a;
    }

    @Override
    public final void o(int i9, VideoEditedInfo videoEditedInfo, boolean z10, int i10, int i11, boolean z11) {
        c0(videoEditedInfo, z10, i10, false, z11);
    }

    @Override
    public final boolean p() {
        if (this.f37322b != null && this.f37324e) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean r() {
        if (this.f37322b != null && this.f37325f) {
            return true;
        }
        return false;
    }
}
