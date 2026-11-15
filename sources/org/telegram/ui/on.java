package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class on extends mq0 {
    public final qn f50028a;

    public on(qn qnVar) {
        this.f50028a = qnVar;
    }

    @Override
    public final org.telegram.ui.uq0 E(org.telegram.messenger.gj r8, org.telegram.tgnet.TLRPC.FileLocation r9, int r10, boolean r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.on.E(org.telegram.messenger.gj, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.uq0");
    }

    @Override
    public final void G() {
        this.f50028a.f50668e.getImageReceiver().O0(true, true);
    }

    @Override
    public final boolean N() {
        qn qnVar = this.f50028a;
        long j3 = qnVar.C0;
        if (j3 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = qnVar.getMessagesController().o1(j3);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.f28185id = new TLRPC.TL_inputPhotoEmpty();
        qnVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new l(this, 2));
        return false;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f50028a.f50685s.p(str, str2, z10);
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
