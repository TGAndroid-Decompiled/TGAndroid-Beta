package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class am extends yt0 {
    public final MessageObject f32667a;
    public final MediaController.PhotoEntry f32668b;
    public final bm f32669c;

    public am(bm bmVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f32669c = bmVar;
        this.f32667a = messageObject;
        this.f32668b = photoEntry;
    }

    @Override
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        return this.f32669c.f32984a.N.Ca.E(this.f32667a, fileLocation, i10, z4, false);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        jm jmVar = this.f32669c.f32984a;
        MessageObject messageObject = this.f32667a;
        messageObject.settingAvatar = true;
        MediaController.PhotoEntry photoEntry = this.f32668b;
        if (photoEntry.imagePath == null && !photoEntry.isVideo) {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_photos_updateProfilePhoto.f19316id = tL_inputPhoto;
            TLRPC.Photo photo = messageObject.messageOwner.action.photo;
            tL_inputPhoto.f19203id = photo.f19208id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            jmVar.N.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new dg.d3(29, this, messageObject));
            return;
        }
        xn xnVar = jmVar.N;
        zi ziVar = new zi(messageObject, 4);
        org.telegram.ui.ActionBar.e5 parentLayout = xnVar.getParentLayout();
        int currentAccount = xnVar.getCurrentAccount();
        org.telegram.ui.Components.w40 w40Var = new org.telegram.ui.Components.w40(0, true, true);
        w40Var.f30190a = xnVar;
        w40Var.t(photoEntry);
        w40Var.f30191b = new gg.a0(currentAccount, ziVar, parentLayout, w40Var);
    }
}
