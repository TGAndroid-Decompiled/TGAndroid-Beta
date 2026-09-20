package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class bm extends tu0 {
    public final MessageObject f32493a;
    public final MediaController.PhotoEntry f32494b;
    public final cm f32495c;

    public bm(cm cmVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f32495c = cmVar;
        this.f32493a = messageObject;
        this.f32494b = photoEntry;
    }

    @Override
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return this.f32495c.f32788a.Q.Fa.E(this.f32493a, fileLocation, i10, z10, false);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        lm lmVar = this.f32495c.f32788a;
        MessageObject messageObject = this.f32493a;
        messageObject.settingAvatar = true;
        MediaController.PhotoEntry photoEntry = this.f32494b;
        if (photoEntry.imagePath == null && !photoEntry.isVideo) {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_photos_updateProfilePhoto.f18460id = tL_inputPhoto;
            TLRPC.Photo photo = messageObject.messageOwner.action.photo;
            tL_inputPhoto.f18347id = photo.f18352id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            lmVar.Q.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new ai.v1(29, this, messageObject));
            return;
        }
        zn znVar = lmVar.Q;
        cj cjVar = new cj(messageObject, 4);
        org.telegram.ui.ActionBar.d5 parentLayout = znVar.getParentLayout();
        int currentAccount = znVar.getCurrentAccount();
        org.telegram.ui.Components.u40 u40Var = new org.telegram.ui.Components.u40(0, true, true);
        u40Var.f28531a = znVar;
        u40Var.t(photoEntry);
        u40Var.f28532b = new ea(currentAccount, cjVar, parentLayout, u40Var);
    }
}
