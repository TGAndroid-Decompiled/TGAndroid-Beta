package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class am extends au0 {
    public final MessageObject f35208a;
    public final MediaController.PhotoEntry f35209b;
    public final bm f35210c;

    public am(bm bmVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f35210c = bmVar;
        this.f35208a = messageObject;
        this.f35209b = photoEntry;
    }

    @Override
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        return this.f35210c.f35554a.N.Ca.E(this.f35208a, fileLocation, i10, z4, false);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        jm jmVar = this.f35210c.f35554a;
        MessageObject messageObject = this.f35208a;
        messageObject.settingAvatar = true;
        MediaController.PhotoEntry photoEntry = this.f35209b;
        if (photoEntry.imagePath == null && !photoEntry.isVideo) {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_photos_updateProfilePhoto.f20975id = tL_inputPhoto;
            TLRPC.Photo photo = messageObject.messageOwner.action.photo;
            tL_inputPhoto.f20862id = photo.f20867id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            jmVar.N.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new eg.b3(29, this, messageObject));
            return;
        }
        xn xnVar = jmVar.N;
        zi ziVar = new zi(messageObject, 4);
        org.telegram.ui.ActionBar.f5 parentLayout = xnVar.getParentLayout();
        int currentAccount = xnVar.getCurrentAccount();
        org.telegram.ui.Components.y40 y40Var = new org.telegram.ui.Components.y40(0, true, true);
        y40Var.f33294a = xnVar;
        y40Var.t(photoEntry);
        y40Var.f33295b = new hg.a0(currentAccount, ziVar, parentLayout, y40Var);
    }
}
