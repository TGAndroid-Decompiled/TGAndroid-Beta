package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class pn extends qq0 {
    public final rn f48804a;

    public pn(rn rnVar) {
        this.f48804a = rnVar;
    }

    @Override
    public final org.telegram.ui.zq0 E(org.telegram.messenger.ij r8, org.telegram.tgnet.TLRPC.FileLocation r9, int r10, boolean r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pn.E(org.telegram.messenger.ij, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.zq0");
    }

    @Override
    public final void G() {
        this.f48804a.f49454e.getImageReceiver().O0(true, true);
    }

    @Override
    public final boolean N() {
        rn rnVar = this.f48804a;
        long j3 = rnVar.B0;
        if (j3 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = rnVar.getMessagesController().o1(j3);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.f27094id = new TLRPC.TL_inputPhotoEmpty();
        rnVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new l(this, 2));
        return false;
    }

    @Override
    public final void f(String str, String str2, boolean z9) {
        this.f48804a.f49471s.p(str, str2, z9);
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
