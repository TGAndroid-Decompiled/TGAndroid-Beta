package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class no extends au0 {
    public final po f39496a;

    public no(po poVar) {
        this.f39496a = poVar;
    }

    @Override
    public final org.telegram.ui.lu0 E(org.telegram.messenger.MessageObject r9, org.telegram.tgnet.TLRPC.FileLocation r10, int r11, boolean r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.no.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.lu0");
    }

    @Override
    public final void G() {
        this.f39496a.f40101e.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final boolean M() {
        po poVar = this.f39496a;
        long j10 = poVar.f40129z0;
        if (j10 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = poVar.getMessagesController().getInputUser(j10);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.f20975id = new TLRPC.TL_inputPhotoEmpty();
        poVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new o(this, 2));
        return false;
    }

    @Override
    public final void f(String str, String str2, boolean z4) {
        this.f39496a.f40118s.q(str, str2, z4);
    }

    @Override
    public final boolean t() {
        return false;
    }

    @Override
    public final int y() {
        return 1;
    }
}
