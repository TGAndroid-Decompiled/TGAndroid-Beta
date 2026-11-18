package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class el extends oq0 {
    public final org.telegram.messenger.fj f47251a;
    public final org.telegram.messenger.ef f47252b;
    public final fl f47253c;

    public el(fl flVar, org.telegram.messenger.fj fjVar, org.telegram.messenger.ef efVar) {
        this.f47253c = flVar;
        this.f47251a = fjVar;
        this.f47252b = efVar;
    }

    @Override
    public final wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        return this.f47253c.f47687a.R.f45976db.E(this.f47251a, fileLocation, i7, z10, false);
    }

    @Override
    public final void o(int i7, org.telegram.messenger.e20 e20Var, boolean z10, int i10, int i11, boolean z11) {
        kl klVar = this.f47253c.f47687a;
        org.telegram.messenger.fj fjVar = this.f47251a;
        fjVar.f23988q = true;
        org.telegram.messenger.ef efVar = this.f47252b;
        if (efVar.h == null && !efVar.f27847b) {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_photos_updateProfilePhoto.f28537id = tL_inputPhoto;
            TLRPC.Photo photo = fjVar.f23965k.action.photo;
            tL_inputPhoto.f28422id = photo.f28427id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            klVar.R.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new u7(7, this, fjVar));
            return;
        }
        bn bnVar = klVar.R;
        bh bhVar = new bh(fjVar, 5);
        org.telegram.ui.ActionBar.s4 parentLayout = bnVar.getParentLayout();
        int currentAccount = bnVar.getCurrentAccount();
        org.telegram.ui.Components.u30 u30Var = new org.telegram.ui.Components.u30(0, true, true);
        u30Var.f40195a = bnVar;
        u30Var.s(efVar);
        u30Var.f40196b = new bg.g0(currentAccount, bhVar, parentLayout, u30Var);
    }
}
