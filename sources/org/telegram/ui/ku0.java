package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class ku0 extends zu0 {
    public final ImageReceiver.BitmapHolder f37522a;
    public final hv0 f37523b;
    public final MessageObject f37524c;
    public final MediaController.PhotoEntry d;
    public final boolean e;
    public final boolean f37525f;
    public final PhotoViewer f37526g;

    public ku0(PhotoViewer photoViewer, hv0 hv0Var, MessageObject messageObject, MediaController.PhotoEntry photoEntry, boolean z10, boolean z11) {
        this.f37526g = photoViewer;
        this.f37523b = hv0Var;
        this.f37524c = messageObject;
        this.d = photoEntry;
        this.e = z10;
        this.f37525f = z11;
        this.f37522a = photoViewer.C4.getBitmapSafe();
    }

    @Override
    public final jv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        hv0 hv0Var = this.f37523b;
        if (hv0Var != null) {
            return hv0Var.E(this.f37524c, null, 0, z10, false);
        }
        return null;
    }

    @Override
    public final void M(VideoEditedInfo videoEditedInfo) {
        MediaController.PhotoEntry photoEntry = this.d;
        if (!photoEntry.isCropped && !photoEntry.isPainted && !photoEntry.isFiltered && videoEditedInfo == null && TextUtils.isEmpty(photoEntry.caption)) {
            return;
        }
        d0(videoEditedInfo, false, 0, true, false);
    }

    @Override
    public final MessageObject V() {
        return this.f37524c;
    }

    public final void d0(VideoEditedInfo videoEditedInfo, boolean z10, int i10, boolean z11, boolean z12) {
        MessageObject messageObject;
        PhotoViewer photoViewer = this.f37526g;
        if (photoViewer.l4 != null) {
            un unVar = null;
            MessageObject messageObject2 = this.f37524c;
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
                fo foVar = photoViewer.l4;
                messageObject2 = foVar.f35739n5;
                unVar = foVar.f35713l5;
            }
            un unVar2 = unVar;
            MessageObject messageObject3 = messageObject2;
            if (photoEntry.isVideo) {
                if (videoEditedInfo != null) {
                    AccountInstance accountInstance = photoViewer.l4.getAccountInstance();
                    String str = photoEntry.path;
                    long a2 = photoViewer.l4.a();
                    fo foVar2 = photoViewer.l4;
                    SendMessagesHelper.prepareSendingVideo(accountInstance, str, videoEditedInfo, null, null, a2, messageObject3, foVar2.X3, null, unVar2, photoEntry.entities, photoEntry.ttl, messageObject, z10, i10, 0, z12, photoEntry.hasSpoiler, photoEntry.caption, foVar2.H8(), 0L, 0L, photoViewer.l4.S8(), photoViewer.l4.f35653g5);
                    return;
                }
                MessageObject messageObject4 = messageObject;
                AccountInstance accountInstance2 = photoViewer.l4.getAccountInstance();
                String str2 = photoEntry.path;
                long a10 = photoViewer.l4.a();
                fo foVar3 = photoViewer.l4;
                SendMessagesHelper.prepareSendingVideo(accountInstance2, str2, null, null, null, a10, messageObject3, foVar3.X3, null, unVar2, photoEntry.entities, photoEntry.ttl, messageObject4, z10, i10, 0, z12, photoEntry.hasSpoiler, photoEntry.caption, foVar3.H8(), 0L, 0L, photoViewer.l4.S8(), photoViewer.l4.f35653g5);
                return;
            }
            MessageObject messageObject5 = messageObject;
            if (photoEntry.imagePath != null) {
                AccountInstance accountInstance3 = photoViewer.l4.getAccountInstance();
                String str3 = photoEntry.imagePath;
                String str4 = photoEntry.thumbPath;
                long a11 = photoViewer.l4.a();
                fo foVar4 = photoViewer.l4;
                SendMessagesHelper.prepareSendingPhoto(accountInstance3, str3, str4, null, a11, messageObject3, foVar4.X3, null, unVar2, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, messageObject5, videoEditedInfo, z10, i10, 0, 0, z12, photoEntry.caption, foVar4.H8(), 0L, 0L, photoViewer.l4.S8(), photoViewer.l4.f35653g5);
            } else if (photoEntry.path != null) {
                AccountInstance accountInstance4 = photoViewer.l4.getAccountInstance();
                String str5 = photoEntry.path;
                String str6 = photoEntry.thumbPath;
                long a12 = photoViewer.l4.a();
                fo foVar5 = photoViewer.l4;
                SendMessagesHelper.prepareSendingPhoto(accountInstance4, str5, str6, null, a12, messageObject3, foVar5.X3, null, unVar2, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, messageObject5, videoEditedInfo, z10, i10, 0, 0, z12, photoEntry.caption, foVar5.H8(), 0L, 0L, photoViewer.l4.S8(), photoViewer.l4.f35653g5);
            }
        }
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return this.f37522a;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        d0(videoEditedInfo, z10, i11, false, z11);
    }

    @Override
    public final boolean p() {
        if (this.f37523b != null && this.e) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean r() {
        if (this.f37523b != null && this.f37525f) {
            return true;
        }
        return false;
    }
}
