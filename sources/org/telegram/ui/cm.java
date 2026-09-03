package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class cm extends fu0 {
    public final MessageObject f33189a;
    public final MediaController.PhotoEntry f33190b;
    public final dm f33191c;

    public cm(dm dmVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f33191c = dmVar;
        this.f33189a = messageObject;
        this.f33190b = photoEntry;
    }

    @Override
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        return this.f33191c.f33499a.N.Ca.E(this.f33189a, fileLocation, i10, z4, false);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        lm lmVar = this.f33191c.f33499a;
        MessageObject messageObject = this.f33189a;
        messageObject.settingAvatar = true;
        MediaController.PhotoEntry photoEntry = this.f33190b;
        if (photoEntry.imagePath == null && !photoEntry.isVideo) {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_photos_updateProfilePhoto.f19291id = tL_inputPhoto;
            TLRPC.Photo photo = messageObject.messageOwner.action.photo;
            tL_inputPhoto.f19178id = photo.f19183id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            lmVar.N.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new dg.d3(29, this, messageObject));
            return;
        }
        zn znVar = lmVar.N;
        bj bjVar = new bj(messageObject, 4);
        org.telegram.ui.ActionBar.e5 parentLayout = znVar.getParentLayout();
        int currentAccount = znVar.getCurrentAccount();
        org.telegram.ui.Components.x40 x40Var = new org.telegram.ui.Components.x40(0, true, true);
        x40Var.f30466a = znVar;
        x40Var.t(photoEntry);
        x40Var.f30467b = new gg.a0(currentAccount, bjVar, parentLayout, x40Var);
    }
}
