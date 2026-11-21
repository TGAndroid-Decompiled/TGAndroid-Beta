package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class el extends oq0 {
    public final org.telegram.messenger.fj f47320a;
    public final org.telegram.messenger.ef f47321b;
    public final fl f47322c;

    public el(fl flVar, org.telegram.messenger.fj fjVar, org.telegram.messenger.ef efVar) {
        this.f47322c = flVar;
        this.f47320a = fjVar;
        this.f47321b = efVar;
    }

    @Override
    public final wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        return this.f47322c.f47754a.R.f45999db.E(this.f47320a, fileLocation, i7, z10, false);
    }

    @Override
    public final void o(int i7, org.telegram.messenger.e20 e20Var, boolean z10, int i10, int i11, boolean z11) {
        kl klVar = this.f47322c.f47754a;
        org.telegram.messenger.fj fjVar = this.f47320a;
        fjVar.f24016q = true;
        org.telegram.messenger.ef efVar = this.f47321b;
        if (efVar.h == null && !efVar.f27875b) {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_photos_updateProfilePhoto.f28565id = tL_inputPhoto;
            TLRPC.Photo photo = fjVar.f23993k.action.photo;
            tL_inputPhoto.f28450id = photo.f28455id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            klVar.R.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new u7(7, this, fjVar));
            return;
        }
        bn bnVar = klVar.R;
        bh bhVar = new bh(fjVar, 5);
        org.telegram.ui.ActionBar.r4 parentLayout = bnVar.getParentLayout();
        int currentAccount = bnVar.getCurrentAccount();
        org.telegram.ui.Components.x30 x30Var = new org.telegram.ui.Components.x30(0, true, true);
        x30Var.f41966a = bnVar;
        x30Var.s(efVar);
        x30Var.f41967b = new bg.g0(currentAccount, bhVar, parentLayout, x30Var);
    }
}
