package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class lo extends xr0 {
    public final oo f39340a;

    public lo(oo ooVar) {
        this.f39340a = ooVar;
    }

    @Override
    public final org.telegram.ui.fs0 E(org.telegram.messenger.kj r8, org.telegram.tgnet.TLRPC.FileLocation r9, int r10, boolean r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lo.E(org.telegram.messenger.kj, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.fs0");
    }

    @Override
    public final void G() {
        this.f39340a.e.getImageReceiver().O0(true, true);
    }

    @Override
    public final boolean N() {
        oo ooVar = this.f39340a;
        long j10 = ooVar.B0;
        if (j10 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = ooVar.getMessagesController().n1(j10);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.f19928id = new TLRPC.TL_inputPhotoEmpty();
        ooVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new k(this, 2));
        return false;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f39340a.f40226s.p(str, str2, z10);
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
