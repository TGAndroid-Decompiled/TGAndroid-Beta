package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class no extends yt0 {
    public final po f36703a;

    public no(po poVar) {
        this.f36703a = poVar;
    }

    @Override
    public final org.telegram.ui.ju0 E(org.telegram.messenger.MessageObject r9, org.telegram.tgnet.TLRPC.FileLocation r10, int r11, boolean r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.no.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.ju0");
    }

    @Override
    public final void G() {
        this.f36703a.e.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final boolean M() {
        po poVar = this.f36703a;
        long j10 = poVar.f37414z0;
        if (j10 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = poVar.getMessagesController().getInputUser(j10);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.f19316id = new TLRPC.TL_inputPhotoEmpty();
        poVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new o(this, 2));
        return false;
    }

    @Override
    public final void f(String str, String str2, boolean z4) {
        this.f36703a.f37403s.q(str, str2, z4);
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
