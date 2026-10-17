package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class io extends bu0 {
    public final ko f37938a;

    public io(ko koVar) {
        this.f37938a = koVar;
    }

    @Override
    public final org.telegram.ui.lu0 E(org.telegram.messenger.MessageObject r8, org.telegram.tgnet.TLRPC.FileLocation r9, int r10, boolean r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.io.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.lu0");
    }

    @Override
    public final void G() {
        this.f37938a.e.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final boolean N() {
        ko koVar = this.f37938a;
        long j10 = koVar.C0;
        if (j10 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = koVar.getMessagesController().getInputUser(j10);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.f20404id = new TLRPC.TL_inputPhotoEmpty();
        koVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new m(this, 2));
        return false;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f37938a.f38606s.p(str, str2, z10);
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
