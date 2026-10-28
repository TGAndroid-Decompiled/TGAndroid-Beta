package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class mo extends iu0 {
    public final oo f41491a;

    public mo(oo ooVar) {
        this.f41491a = ooVar;
    }

    @Override
    public final org.telegram.ui.su0 E(org.telegram.messenger.MessageObject r8, org.telegram.tgnet.TLRPC.FileLocation r9, int r10, boolean r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mo.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.su0");
    }

    @Override
    public final void G() {
        this.f41491a.e.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final boolean N() {
        oo ooVar = this.f41491a;
        long j10 = ooVar.B0;
        if (j10 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = ooVar.getMessagesController().getInputUser(j10);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.f22162id = new TLRPC.TL_inputPhotoEmpty();
        ooVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new l(this, 2));
        return false;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f41491a.f42152s.p(str, str2, z10);
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
