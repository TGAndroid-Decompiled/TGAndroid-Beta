package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class jn extends eq0 {
    public final ln f46653a;

    public jn(ln lnVar) {
        this.f46653a = lnVar;
    }

    @Override
    public final org.telegram.ui.mq0 E(org.telegram.messenger.zi r8, org.telegram.tgnet.TLRPC.FileLocation r9, int r10, boolean r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jn.E(org.telegram.messenger.zi, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.mq0");
    }

    @Override
    public final void G() {
        this.f46653a.f47371e.getImageReceiver().O0(true, true);
    }

    @Override
    public final boolean N() {
        ln lnVar = this.f46653a;
        long j10 = lnVar.C0;
        if (j10 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = lnVar.getMessagesController().o1(j10);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.f27135id = new TLRPC.TL_inputPhotoEmpty();
        lnVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new l(this, 2));
        return false;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f46653a.f47388s.p(str, str2, z10);
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
