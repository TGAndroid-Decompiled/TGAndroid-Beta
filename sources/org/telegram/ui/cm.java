package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class cm extends tu0 {
    public final MessageObject f36782a;
    public final MediaController.PhotoEntry f36783b;
    public final dm f36784c;

    public cm(dm dmVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f36784c = dmVar;
        this.f36782a = messageObject;
        this.f36783b = photoEntry;
    }

    @Override
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return this.f36784c.f37050a.Q.Ga.E(this.f36782a, fileLocation, i10, z10, false);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        mm mmVar = this.f36784c.f37050a;
        MessageObject messageObject = this.f36782a;
        messageObject.settingAvatar = true;
        MediaController.PhotoEntry photoEntry = this.f36783b;
        if (photoEntry.imagePath == null && !photoEntry.isVideo) {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_photos_updateProfilePhoto.f20164id = tL_inputPhoto;
            TLRPC.Photo photo = messageObject.messageOwner.action.photo;
            tL_inputPhoto.f20051id = photo.f20056id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            mmVar.Q.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new ai.v1(29, this, messageObject));
            return;
        }
        zn znVar = mmVar.Q;
        cj cjVar = new cj(messageObject, 5);
        org.telegram.ui.ActionBar.b5 parentLayout = znVar.getParentLayout();
        int currentAccount = znVar.getCurrentAccount();
        org.telegram.ui.Components.n50 n50Var = new org.telegram.ui.Components.n50(0, true, true);
        n50Var.f28948a = znVar;
        n50Var.s(photoEntry);
        n50Var.f28949b = new da(currentAccount, cjVar, parentLayout, n50Var);
    }
}
