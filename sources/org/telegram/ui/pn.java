package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class pn extends oq0 {
    public final rn f51082a;

    public pn(rn rnVar) {
        this.f51082a = rnVar;
    }

    @Override
    public final org.telegram.ui.wq0 E(org.telegram.messenger.fj r8, org.telegram.tgnet.TLRPC.FileLocation r9, int r10, boolean r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pn.E(org.telegram.messenger.fj, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.wq0");
    }

    @Override
    public final void G() {
        this.f51082a.f51771e.getImageReceiver().P0(true, true);
    }

    @Override
    public final boolean N() {
        rn rnVar = this.f51082a;
        long j3 = rnVar.C0;
        if (j3 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = rnVar.getMessagesController().q1(j3);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.f28626id = new TLRPC.TL_inputPhotoEmpty();
        rnVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new l(this, 2));
        return false;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f51082a.f51788s.p(str, str2, z10);
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
