package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class oo extends mu0 {
    public final so f35915a;

    public oo(so soVar) {
        this.f35915a = soVar;
    }

    @Override
    public final org.telegram.ui.wu0 E(org.telegram.messenger.MessageObject r9, org.telegram.tgnet.TLRPC.FileLocation r10, int r11, boolean r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oo.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.wu0");
    }

    @Override
    public final void G() {
        this.f35915a.e.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final boolean M() {
        so soVar = this.f35915a;
        long j3 = soVar.C0;
        if (j3 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = soVar.getMessagesController().getInputUser(j3);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.f18215id = new TLRPC.TL_inputPhotoEmpty();
        soVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new m(this, 2));
        return false;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f35915a.f37366s.q(str, str2, z10);
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
