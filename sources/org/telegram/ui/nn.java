package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class nn extends nq0 {
    public final pn f48091a;

    public nn(pn pnVar) {
        this.f48091a = pnVar;
    }

    @Override
    public final org.telegram.ui.wq0 E(org.telegram.messenger.ij r8, org.telegram.tgnet.TLRPC.FileLocation r9, int r10, boolean r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nn.E(org.telegram.messenger.ij, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.wq0");
    }

    @Override
    public final void G() {
        this.f48091a.f48866e.getImageReceiver().O0(true, true);
    }

    @Override
    public final boolean N() {
        pn pnVar = this.f48091a;
        long j3 = pnVar.B0;
        if (j3 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = pnVar.getMessagesController().o1(j3);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.f27090id = new TLRPC.TL_inputPhotoEmpty();
        pnVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new l(this, 2));
        return false;
    }

    @Override
    public final void f(String str, String str2, boolean z9) {
        this.f48091a.f48883s.p(str, str2, z9);
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
