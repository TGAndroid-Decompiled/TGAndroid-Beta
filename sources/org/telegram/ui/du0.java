package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class du0 extends tu0 {
    public final ImageReceiver.BitmapHolder f31977a;
    public final cv0 f31978b;
    public final MessageObject f31979c;
    public final MediaController.PhotoEntry d;
    public final boolean e;
    public final boolean f31980f;
    public final PhotoViewer f31981g;

    public du0(PhotoViewer photoViewer, cv0 cv0Var, MessageObject messageObject, MediaController.PhotoEntry photoEntry, boolean z10, boolean z11) {
        this.f31981g = photoViewer;
        this.f31978b = cv0Var;
        this.f31979c = messageObject;
        this.d = photoEntry;
        this.e = z10;
        this.f31980f = z11;
        this.f31977a = photoViewer.C4.getBitmapSafe();
    }

    @Override
    public final ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        cv0 cv0Var = this.f31978b;
        if (cv0Var != null) {
            return cv0Var.E(this.f31979c, null, 0, z10, false);
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
        return this.f31979c;
    }

    public final void c0(VideoEditedInfo videoEditedInfo, boolean z10, int i10, boolean z11, boolean z12) {
        MessageObject messageObject;
        PhotoViewer photoViewer = this.f31981g;
        if (photoViewer.l4 != null) {
            tn tnVar = null;
            MessageObject messageObject2 = this.f31979c;
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
                eo eoVar = photoViewer.l4;
                messageObject2 = eoVar.f32421n5;
                tnVar = eoVar.f32395l5;
            }
            tn tnVar2 = tnVar;
            MessageObject messageObject3 = messageObject2;
            if (photoEntry.isVideo) {
                if (videoEditedInfo != null) {
                    AccountInstance accountInstance = photoViewer.l4.getAccountInstance();
                    String str = photoEntry.path;
                    long a2 = photoViewer.l4.a();
                    eo eoVar2 = photoViewer.l4;
                    SendMessagesHelper.prepareSendingVideo(accountInstance, str, videoEditedInfo, null, null, a2, messageObject3, eoVar2.X3, null, tnVar2, photoEntry.entities, photoEntry.ttl, messageObject, z10, i10, 0, z12, photoEntry.hasSpoiler, photoEntry.caption, eoVar2.C8(), 0L, 0L, photoViewer.l4.N8(), photoViewer.l4.f32336g5);
                    return;
                }
                MessageObject messageObject4 = messageObject;
                AccountInstance accountInstance2 = photoViewer.l4.getAccountInstance();
                String str2 = photoEntry.path;
                long a10 = photoViewer.l4.a();
                eo eoVar3 = photoViewer.l4;
                SendMessagesHelper.prepareSendingVideo(accountInstance2, str2, null, null, null, a10, messageObject3, eoVar3.X3, null, tnVar2, photoEntry.entities, photoEntry.ttl, messageObject4, z10, i10, 0, z12, photoEntry.hasSpoiler, photoEntry.caption, eoVar3.C8(), 0L, 0L, photoViewer.l4.N8(), photoViewer.l4.f32336g5);
                return;
            }
            MessageObject messageObject5 = messageObject;
            if (photoEntry.imagePath != null) {
                AccountInstance accountInstance3 = photoViewer.l4.getAccountInstance();
                String str3 = photoEntry.imagePath;
                String str4 = photoEntry.thumbPath;
                long a11 = photoViewer.l4.a();
                eo eoVar4 = photoViewer.l4;
                SendMessagesHelper.prepareSendingPhoto(accountInstance3, str3, str4, null, a11, messageObject3, eoVar4.X3, null, tnVar2, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, messageObject5, videoEditedInfo, z10, i10, 0, 0, z12, photoEntry.caption, eoVar4.C8(), 0L, 0L, photoViewer.l4.N8(), photoViewer.l4.f32336g5);
            } else if (photoEntry.path != null) {
                AccountInstance accountInstance4 = photoViewer.l4.getAccountInstance();
                String str5 = photoEntry.path;
                String str6 = photoEntry.thumbPath;
                long a12 = photoViewer.l4.a();
                eo eoVar5 = photoViewer.l4;
                SendMessagesHelper.prepareSendingPhoto(accountInstance4, str5, str6, null, a12, messageObject3, eoVar5.X3, null, tnVar2, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, messageObject5, videoEditedInfo, z10, i10, 0, 0, z12, photoEntry.caption, eoVar5.C8(), 0L, 0L, photoViewer.l4.N8(), photoViewer.l4.f32336g5);
            }
        }
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return this.f31977a;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        c0(videoEditedInfo, z10, i11, false, z11);
    }

    @Override
    public final boolean p() {
        if (this.f31978b != null && this.e) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean r() {
        if (this.f31978b != null && this.f31980f) {
            return true;
        }
        return false;
    }
}
