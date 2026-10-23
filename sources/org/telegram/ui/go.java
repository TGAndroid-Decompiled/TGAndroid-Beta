package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class go extends zt0 {
    public final io f37379a;

    public go(io ioVar) {
        this.f37379a = ioVar;
    }

    @Override
    public final org.telegram.ui.ju0 E(org.telegram.messenger.MessageObject r8, org.telegram.tgnet.TLRPC.FileLocation r9, int r10, boolean r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.go.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.ju0");
    }

    @Override
    public final void G() {
        this.f37379a.e.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final boolean N() {
        io ioVar = this.f37379a;
        long j10 = ioVar.C0;
        if (j10 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = ioVar.getMessagesController().getInputUser(j10);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.f20412id = new TLRPC.TL_inputPhotoEmpty();
        ioVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new m(this, 2));
        return false;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f37379a.f38060s.p(str, str2, z10);
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
