package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class io extends pt0 {
    public final ko f39299a;

    public io(ko koVar) {
        this.f39299a = koVar;
    }

    @Override
    public final org.telegram.ui.zt0 E(org.telegram.messenger.MessageObject r9, org.telegram.tgnet.TLRPC.FileLocation r10, int r11, boolean r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.io.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.zt0");
    }

    @Override
    public final void G() {
        this.f39299a.f39945e.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final boolean M() {
        ko koVar = this.f39299a;
        long j10 = koVar.f39972y0;
        if (j10 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = koVar.getMessagesController().getInputUser(j10);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.f22524id = new TLRPC.TL_inputPhotoEmpty();
        koVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new o(this, 2));
        return false;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f39299a.f39962s.q(str, str2, z10);
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
