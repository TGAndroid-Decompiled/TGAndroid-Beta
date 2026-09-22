package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class dm extends tu0 {
    public final MessageObject f33049a;
    public final MediaController.PhotoEntry f33050b;
    public final em f33051c;

    public dm(em emVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f33051c = emVar;
        this.f33049a = messageObject;
        this.f33050b = photoEntry;
    }

    @Override
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return this.f33051c.f33375a.Q.Fa.E(this.f33049a, fileLocation, i10, z10, false);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        nm nmVar = this.f33051c.f33375a;
        MessageObject messageObject = this.f33049a;
        messageObject.settingAvatar = true;
        MediaController.PhotoEntry photoEntry = this.f33050b;
        if (photoEntry.imagePath == null && !photoEntry.isVideo) {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_photos_updateProfilePhoto.f18241id = tL_inputPhoto;
            TLRPC.Photo photo = messageObject.messageOwner.action.photo;
            tL_inputPhoto.f18128id = photo.f18133id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            nmVar.Q.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new ai.v1(29, this, messageObject));
            return;
        }
        bo boVar = nmVar.Q;
        dj djVar = new dj(messageObject, 4);
        org.telegram.ui.ActionBar.d5 parentLayout = boVar.getParentLayout();
        int currentAccount = boVar.getCurrentAccount();
        org.telegram.ui.Components.u40 u40Var = new org.telegram.ui.Components.u40(0, true, true);
        u40Var.f28280a = boVar;
        u40Var.t(photoEntry);
        u40Var.f28281b = new da(currentAccount, djVar, parentLayout, u40Var);
    }
}
