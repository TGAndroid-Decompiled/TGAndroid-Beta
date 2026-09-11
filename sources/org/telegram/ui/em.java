package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class em extends su0 {
    public final MessageObject f36128a;
    public final MediaController.PhotoEntry f36129b;
    public final fm f36130c;

    public em(fm fmVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f36130c = fmVar;
        this.f36128a = messageObject;
        this.f36129b = photoEntry;
    }

    @Override
    public final cv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return this.f36130c.f36432a.Q.Fa.E(this.f36128a, fileLocation, i10, z10, false);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        om omVar = this.f36130c.f36432a;
        MessageObject messageObject = this.f36128a;
        messageObject.settingAvatar = true;
        MediaController.PhotoEntry photoEntry = this.f36129b;
        if (photoEntry.imagePath == null && !photoEntry.isVideo) {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_photos_updateProfilePhoto.f20001id = tL_inputPhoto;
            TLRPC.Photo photo = messageObject.messageOwner.action.photo;
            tL_inputPhoto.f19888id = photo.f19893id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            omVar.Q.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new bi.m1(29, this, messageObject));
            return;
        }
        co coVar = omVar.Q;
        dj djVar = new dj(messageObject, 4);
        org.telegram.ui.ActionBar.d5 parentLayout = coVar.getParentLayout();
        int currentAccount = coVar.getCurrentAccount();
        org.telegram.ui.Components.u40 u40Var = new org.telegram.ui.Components.u40(0, true, true);
        u40Var.f30799a = coVar;
        u40Var.t(photoEntry);
        u40Var.f30800b = new da(currentAccount, djVar, parentLayout, u40Var);
    }
}
