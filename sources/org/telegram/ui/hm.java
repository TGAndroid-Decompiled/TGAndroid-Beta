package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class hm extends av0 {
    public final MessageObject f36882a;
    public final MediaController.PhotoEntry f36883b;
    public final im f36884c;

    public hm(im imVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f36884c = imVar;
        this.f36882a = messageObject;
        this.f36883b = photoEntry;
    }

    @Override
    public final kv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return this.f36884c.f37170a.Q.Ga.E(this.f36882a, fileLocation, i10, z10, false);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        rm rmVar = this.f36884c.f37170a;
        MessageObject messageObject = this.f36882a;
        messageObject.settingAvatar = true;
        MediaController.PhotoEntry photoEntry = this.f36883b;
        if (photoEntry.imagePath == null && !photoEntry.isVideo) {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_photos_updateProfilePhoto.f19348id = tL_inputPhoto;
            TLRPC.Photo photo = messageObject.messageOwner.action.photo;
            tL_inputPhoto.f19235id = photo.f19240id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            rmVar.Q.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new bi.m1(29, this, messageObject));
            return;
        }
        fo foVar = rmVar.Q;
        gj gjVar = new gj(messageObject, 5);
        org.telegram.ui.ActionBar.b5 parentLayout = foVar.getParentLayout();
        int currentAccount = foVar.getCurrentAccount();
        org.telegram.ui.Components.i50 i50Var = new org.telegram.ui.Components.i50(0, true, true);
        i50Var.f25829a = foVar;
        i50Var.s(photoEntry);
        i50Var.f25830b = new ia(currentAccount, gjVar, parentLayout, i50Var);
    }
}
