package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class fm extends tu0 {
    public final MessageObject f32863a;
    public final MediaController.PhotoEntry f32864b;
    public final gm f32865c;

    public fm(gm gmVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f32865c = gmVar;
        this.f32863a = messageObject;
        this.f32864b = photoEntry;
    }

    @Override
    public final ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return this.f32865c.f33136a.Q.Fa.E(this.f32863a, fileLocation, i10, z10, false);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        pm pmVar = this.f32865c.f33136a;
        MessageObject messageObject = this.f32863a;
        messageObject.settingAvatar = true;
        MediaController.PhotoEntry photoEntry = this.f32864b;
        if (photoEntry.imagePath == null && !photoEntry.isVideo) {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_photos_updateProfilePhoto.f17327id = tL_inputPhoto;
            TLRPC.Photo photo = messageObject.messageOwner.action.photo;
            tL_inputPhoto.f17214id = photo.f17219id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            pmVar.Q.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new bi.o2(24, this, messageObject));
            return;
        }
        eo eoVar = pmVar.Q;
        fj fjVar = new fj(messageObject, 4);
        org.telegram.ui.ActionBar.f5 parentLayout = eoVar.getParentLayout();
        int currentAccount = eoVar.getCurrentAccount();
        org.telegram.ui.Components.e50 e50Var = new org.telegram.ui.Components.e50(0, true, true);
        e50Var.f22552a = eoVar;
        e50Var.t(photoEntry);
        e50Var.f22553b = new ea(currentAccount, fjVar, parentLayout, e50Var);
    }
}
