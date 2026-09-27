package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class am extends ou0 {
    public final MessageObject f32100a;
    public final MediaController.PhotoEntry f32101b;
    public final bm f32102c;

    public am(bm bmVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f32102c = bmVar;
        this.f32100a = messageObject;
        this.f32101b = photoEntry;
    }

    @Override
    public final yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return this.f32102c.f32390a.Q.Fa.E(this.f32100a, fileLocation, i10, z10, false);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        km kmVar = this.f32102c.f32390a;
        MessageObject messageObject = this.f32100a;
        messageObject.settingAvatar = true;
        MediaController.PhotoEntry photoEntry = this.f32101b;
        if (photoEntry.imagePath == null && !photoEntry.isVideo) {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_photos_updateProfilePhoto.f18461id = tL_inputPhoto;
            TLRPC.Photo photo = messageObject.messageOwner.action.photo;
            tL_inputPhoto.f18348id = photo.f18353id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            kmVar.Q.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new ai.v1(29, this, messageObject));
            return;
        }
        xn xnVar = kmVar.Q;
        cj cjVar = new cj(messageObject, 4);
        org.telegram.ui.ActionBar.d5 parentLayout = xnVar.getParentLayout();
        int currentAccount = xnVar.getCurrentAccount();
        org.telegram.ui.Components.x40 x40Var = new org.telegram.ui.Components.x40(0, true, true);
        x40Var.f30246a = xnVar;
        x40Var.t(photoEntry);
        x40Var.f30247b = new ga(currentAccount, cjVar, parentLayout, x40Var);
    }
}
