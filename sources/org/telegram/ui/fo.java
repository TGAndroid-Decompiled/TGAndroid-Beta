package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class fo extends rt0 {
    public final ho f38325a;

    public fo(ho hoVar) {
        this.f38325a = hoVar;
    }

    @Override
    public final org.telegram.ui.bu0 E(org.telegram.messenger.MessageObject r9, org.telegram.tgnet.TLRPC.FileLocation r10, int r11, boolean r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fo.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.bu0");
    }

    @Override
    public final void G() {
        this.f38325a.f38842e.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final boolean M() {
        ho hoVar = this.f38325a;
        long j10 = hoVar.f38869y0;
        if (j10 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = hoVar.getMessagesController().getInputUser(j10);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.f22512id = new TLRPC.TL_inputPhotoEmpty();
        hoVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new m(this, 2));
        return false;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f38325a.f38859s.q(str, str2, z10);
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
