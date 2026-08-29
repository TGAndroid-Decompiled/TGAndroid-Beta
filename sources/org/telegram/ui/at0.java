package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class at0 extends pt0 {
    public final ImageReceiver.BitmapHolder f36596a;
    public final xt0 f36597b;
    public final MessageObject f36598c;
    public final MediaController.PhotoEntry d;
    public final boolean f36599e;
    public final boolean f36600f;
    public final PhotoViewer f36601g;

    public at0(PhotoViewer photoViewer, xt0 xt0Var, MessageObject messageObject, MediaController.PhotoEntry photoEntry, boolean z10, boolean z11) {
        this.f36601g = photoViewer;
        this.f36597b = xt0Var;
        this.f36598c = messageObject;
        this.d = photoEntry;
        this.f36599e = z10;
        this.f36600f = z11;
        this.f36596a = photoViewer.f35869y4.getBitmapSafe();
    }

    @Override
    public final zt0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        xt0 xt0Var = this.f36597b;
        if (xt0Var != null) {
            return xt0Var.E(this.f36598c, null, 0, z10, false);
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
        return this.f36598c;
    }

    public final void c0(VideoEditedInfo videoEditedInfo, boolean z10, int i10, boolean z11, boolean z12) {
        MessageObject messageObject;
        PhotoViewer photoViewer = this.f36601g;
        if (photoViewer.f35715h4 != null) {
            jn jnVar = null;
            MessageObject messageObject2 = this.f36598c;
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
                tn tnVar = photoViewer.f35715h4;
                messageObject2 = tnVar.f42856j5;
                jnVar = tnVar.f42831h5;
            }
            jn jnVar2 = jnVar;
            MessageObject messageObject3 = messageObject2;
            if (photoEntry.isVideo) {
                if (videoEditedInfo != null) {
                    AccountInstance accountInstance = photoViewer.f35715h4.getAccountInstance();
                    String str = photoEntry.path;
                    long a2 = photoViewer.f35715h4.a();
                    tn tnVar2 = photoViewer.f35715h4;
                    SendMessagesHelper.prepareSendingVideo(accountInstance, str, videoEditedInfo, null, null, a2, messageObject3, tnVar2.T3, null, jnVar2, photoEntry.entities, photoEntry.ttl, messageObject, z10, i10, 0, z12, photoEntry.hasSpoiler, photoEntry.caption, tnVar2.C8(), 0L, 0L, photoViewer.f35715h4.N8(), photoViewer.f35715h4.f42768c5);
                    return;
                }
                MessageObject messageObject4 = messageObject;
                AccountInstance accountInstance2 = photoViewer.f35715h4.getAccountInstance();
                String str2 = photoEntry.path;
                long a10 = photoViewer.f35715h4.a();
                tn tnVar3 = photoViewer.f35715h4;
                SendMessagesHelper.prepareSendingVideo(accountInstance2, str2, null, null, null, a10, messageObject3, tnVar3.T3, null, jnVar2, photoEntry.entities, photoEntry.ttl, messageObject4, z10, i10, 0, z12, photoEntry.hasSpoiler, photoEntry.caption, tnVar3.C8(), 0L, 0L, photoViewer.f35715h4.N8(), photoViewer.f35715h4.f42768c5);
                return;
            }
            MessageObject messageObject5 = messageObject;
            if (photoEntry.imagePath != null) {
                AccountInstance accountInstance3 = photoViewer.f35715h4.getAccountInstance();
                String str3 = photoEntry.imagePath;
                String str4 = photoEntry.thumbPath;
                long a11 = photoViewer.f35715h4.a();
                tn tnVar4 = photoViewer.f35715h4;
                SendMessagesHelper.prepareSendingPhoto(accountInstance3, str3, str4, null, a11, messageObject3, tnVar4.T3, null, jnVar2, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, messageObject5, videoEditedInfo, z10, i10, 0, 0, z12, photoEntry.caption, tnVar4.C8(), 0L, 0L, photoViewer.f35715h4.N8(), photoViewer.f35715h4.f42768c5);
            } else if (photoEntry.path != null) {
                AccountInstance accountInstance4 = photoViewer.f35715h4.getAccountInstance();
                String str5 = photoEntry.path;
                String str6 = photoEntry.thumbPath;
                long a12 = photoViewer.f35715h4.a();
                tn tnVar5 = photoViewer.f35715h4;
                SendMessagesHelper.prepareSendingPhoto(accountInstance4, str5, str6, null, a12, messageObject3, tnVar5.T3, null, jnVar2, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, messageObject5, videoEditedInfo, z10, i10, 0, 0, z12, photoEntry.caption, tnVar5.C8(), 0L, 0L, photoViewer.f35715h4.N8(), photoViewer.f35715h4.f42768c5);
            }
        }
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return this.f36596a;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        c0(videoEditedInfo, z10, i11, false, z11);
    }

    @Override
    public final boolean p() {
        if (this.f36597b != null && this.f36599e) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean r() {
        if (this.f36597b != null && this.f36600f) {
            return true;
        }
        return false;
    }
}
