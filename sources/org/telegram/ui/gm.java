package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class gm extends wu0 {
    public final MessageObject f38094a;
    public final MediaController.PhotoEntry f38095b;
    public final hm f38096c;

    public gm(hm hmVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f38096c = hmVar;
        this.f38094a = messageObject;
        this.f38095b = photoEntry;
    }

    @Override
    public final gv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return this.f38096c.f38467a.Q.Ga.E(this.f38094a, fileLocation, i10, z10, false);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        qm qmVar = this.f38096c.f38467a;
        MessageObject messageObject = this.f38094a;
        messageObject.settingAvatar = true;
        MediaController.PhotoEntry photoEntry = this.f38095b;
        if (photoEntry.imagePath == null && !photoEntry.isVideo) {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_photos_updateProfilePhoto.f19934id = tL_inputPhoto;
            TLRPC.Photo photo = messageObject.messageOwner.action.photo;
            tL_inputPhoto.f19821id = photo.f19826id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            qmVar.Q.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new ai.v1(29, this, messageObject));
            return;
        }
        eo eoVar = qmVar.Q;
        gj gjVar = new gj(messageObject, 5);
        org.telegram.ui.ActionBar.b5 parentLayout = eoVar.getParentLayout();
        int currentAccount = eoVar.getCurrentAccount();
        org.telegram.ui.Components.p50 p50Var = new org.telegram.ui.Components.p50(0, true, true);
        p50Var.f29378a = eoVar;
        p50Var.s(photoEntry);
        p50Var.f29379b = new ha(currentAccount, gjVar, parentLayout, p50Var);
    }
}
