package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class po extends ou0 {
    public final to f39520a;

    public po(to toVar) {
        this.f39520a = toVar;
    }

    @Override
    public final org.telegram.ui.yu0 E(org.telegram.messenger.MessageObject r9, org.telegram.tgnet.TLRPC.FileLocation r10, int r11, boolean r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.po.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.yu0");
    }

    @Override
    public final void G() {
        this.f39520a.f40888e.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final boolean M() {
        to toVar = this.f39520a;
        long j3 = toVar.C0;
        if (j3 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = toVar.getMessagesController().getInputUser(j3);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.f20169id = new TLRPC.TL_inputPhotoEmpty();
        toVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new m(this, 2));
        return false;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f39520a.f40905s.q(str, str2, z10);
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
