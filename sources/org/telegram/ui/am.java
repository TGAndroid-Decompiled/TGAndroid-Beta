package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class am extends mu0 {
    public final MessageObject f31829a;
    public final MediaController.PhotoEntry f31830b;
    public final bm f31831c;

    public am(bm bmVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f31831c = bmVar;
        this.f31829a = messageObject;
        this.f31830b = photoEntry;
    }

    @Override
    public final wu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return this.f31831c.f32143a.Q.Fa.E(this.f31829a, fileLocation, i10, z10, false);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        km kmVar = this.f31831c.f32143a;
        MessageObject messageObject = this.f31829a;
        messageObject.settingAvatar = true;
        MediaController.PhotoEntry photoEntry = this.f31830b;
        if (photoEntry.imagePath == null && !photoEntry.isVideo) {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_photos_updateProfilePhoto.f18215id = tL_inputPhoto;
            TLRPC.Photo photo = messageObject.messageOwner.action.photo;
            tL_inputPhoto.f18102id = photo.f18107id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            kmVar.Q.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new ai.v1(29, this, messageObject));
            return;
        }
        xn xnVar = kmVar.Q;
        aj ajVar = new aj(messageObject, 4);
        org.telegram.ui.ActionBar.c5 parentLayout = xnVar.getParentLayout();
        int currentAccount = xnVar.getCurrentAccount();
        org.telegram.ui.Components.v40 v40Var = new org.telegram.ui.Components.v40(0, true, true);
        v40Var.f28645a = xnVar;
        v40Var.t(photoEntry);
        v40Var.f28646b = new da(currentAccount, ajVar, parentLayout, v40Var);
    }
}
