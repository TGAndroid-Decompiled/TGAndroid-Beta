package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class lo extends yr0 {
    public final oo f39326a;

    public lo(oo ooVar) {
        this.f39326a = ooVar;
    }

    @Override
    public final org.telegram.ui.gs0 E(org.telegram.messenger.jj r8, org.telegram.tgnet.TLRPC.FileLocation r9, int r10, boolean r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lo.E(org.telegram.messenger.jj, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.gs0");
    }

    @Override
    public final void G() {
        this.f39326a.e.getImageReceiver().O0(true, true);
    }

    @Override
    public final boolean N() {
        oo ooVar = this.f39326a;
        long j10 = ooVar.B0;
        if (j10 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = ooVar.getMessagesController().n1(j10);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.f19927id = new TLRPC.TL_inputPhotoEmpty();
        ooVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new k(this, 2));
        return false;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f39326a.f40337s.p(str, str2, z10);
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
