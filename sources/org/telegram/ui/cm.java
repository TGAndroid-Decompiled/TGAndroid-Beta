package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class cm extends uu0 {
    public final MessageObject f36702a;
    public final MediaController.PhotoEntry f36703b;
    public final dm f36704c;

    public cm(dm dmVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f36704c = dmVar;
        this.f36702a = messageObject;
        this.f36703b = photoEntry;
    }

    @Override
    public final ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return this.f36704c.f37048a.Q.Ga.E(this.f36702a, fileLocation, i10, z10, false);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        mm mmVar = this.f36704c.f37048a;
        MessageObject messageObject = this.f36702a;
        messageObject.settingAvatar = true;
        MediaController.PhotoEntry photoEntry = this.f36703b;
        if (photoEntry.imagePath == null && !photoEntry.isVideo) {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_photos_updateProfilePhoto.f20170id = tL_inputPhoto;
            TLRPC.Photo photo = messageObject.messageOwner.action.photo;
            tL_inputPhoto.f20057id = photo.f20062id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            mmVar.Q.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new ai.v1(29, this, messageObject));
            return;
        }
        zn znVar = mmVar.Q;
        cj cjVar = new cj(messageObject, 5);
        org.telegram.ui.ActionBar.d5 parentLayout = znVar.getParentLayout();
        int currentAccount = znVar.getCurrentAccount();
        org.telegram.ui.Components.m50 m50Var = new org.telegram.ui.Components.m50(0, true, true);
        m50Var.f28682a = znVar;
        m50Var.s(photoEntry);
        m50Var.f28683b = new ea(currentAccount, cjVar, parentLayout, m50Var);
    }
}
