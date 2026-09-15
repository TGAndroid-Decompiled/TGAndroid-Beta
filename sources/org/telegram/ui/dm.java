package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class dm extends tu0 {
    public final MessageObject f33088a;
    public final MediaController.PhotoEntry f33089b;
    public final em f33090c;

    public dm(em emVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f33090c = emVar;
        this.f33088a = messageObject;
        this.f33089b = photoEntry;
    }

    @Override
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return this.f33090c.f33371a.Q.Fa.E(this.f33088a, fileLocation, i10, z10, false);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        nm nmVar = this.f33090c.f33371a;
        MessageObject messageObject = this.f33088a;
        messageObject.settingAvatar = true;
        MediaController.PhotoEntry photoEntry = this.f33089b;
        if (photoEntry.imagePath == null && !photoEntry.isVideo) {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_photos_updateProfilePhoto.f18244id = tL_inputPhoto;
            TLRPC.Photo photo = messageObject.messageOwner.action.photo;
            tL_inputPhoto.f18131id = photo.f18136id;
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
        u40Var.f28283a = boVar;
        u40Var.t(photoEntry);
        u40Var.f28284b = new da(currentAccount, djVar, parentLayout, u40Var);
    }
}
