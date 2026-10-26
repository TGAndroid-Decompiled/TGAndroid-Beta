package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ko extends gu0 {
    public final mo f40993a;

    public ko(mo moVar) {
        this.f40993a = moVar;
    }

    @Override
    public final org.telegram.ui.qu0 E(org.telegram.messenger.MessageObject r8, org.telegram.tgnet.TLRPC.FileLocation r9, int r10, boolean r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ko.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.qu0");
    }

    @Override
    public final void G() {
        this.f40993a.e.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final boolean N() {
        mo moVar = this.f40993a;
        long j10 = moVar.B0;
        if (j10 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = moVar.getMessagesController().getInputUser(j10);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.f22161id = new TLRPC.TL_inputPhotoEmpty();
        moVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new l(this, 2));
        return false;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f40993a.f41620s.p(str, str2, z10);
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
