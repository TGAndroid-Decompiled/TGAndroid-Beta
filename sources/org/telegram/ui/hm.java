package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class hm extends zu0 {
    public final MessageObject f36611a;
    public final MediaController.PhotoEntry f36612b;
    public final im f36613c;

    public hm(im imVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f36613c = imVar;
        this.f36611a = messageObject;
        this.f36612b = photoEntry;
    }

    @Override
    public final jv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return this.f36613c.f36836a.Q.Ga.E(this.f36611a, fileLocation, i10, z10, false);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        rm rmVar = this.f36613c.f36836a;
        MessageObject messageObject = this.f36611a;
        messageObject.settingAvatar = true;
        MediaController.PhotoEntry photoEntry = this.f36612b;
        if (photoEntry.imagePath == null && !photoEntry.isVideo) {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_photos_updateProfilePhoto.f19048id = tL_inputPhoto;
            TLRPC.Photo photo = messageObject.messageOwner.action.photo;
            tL_inputPhoto.f18935id = photo.f18940id;
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
        i50Var.f25498a = foVar;
        i50Var.s(photoEntry);
        i50Var.f25499b = new ia(currentAccount, gjVar, parentLayout, i50Var);
    }
}
