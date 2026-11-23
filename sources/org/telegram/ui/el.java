package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class el extends oq0 {
    public final org.telegram.messenger.fj f47570a;
    public final org.telegram.messenger.ef f47571b;
    public final fl f47572c;

    public el(fl flVar, org.telegram.messenger.fj fjVar, org.telegram.messenger.ef efVar) {
        this.f47572c = flVar;
        this.f47570a = fjVar;
        this.f47571b = efVar;
    }

    @Override
    public final wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        return this.f47572c.f47911a.R.f46171db.E(this.f47570a, fileLocation, i7, z10, false);
    }

    @Override
    public final void o(int i7, org.telegram.messenger.d20 d20Var, boolean z10, int i10, int i11, boolean z11) {
        kl klVar = this.f47572c.f47911a;
        org.telegram.messenger.fj fjVar = this.f47570a;
        fjVar.f24096q = true;
        org.telegram.messenger.ef efVar = this.f47571b;
        if (efVar.h == null && !efVar.f27963b) {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_photos_updateProfilePhoto.f28626id = tL_inputPhoto;
            TLRPC.Photo photo = fjVar.f24073k.action.photo;
            tL_inputPhoto.f28511id = photo.f28516id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            klVar.R.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new v7(7, this, fjVar));
            return;
        }
        bn bnVar = klVar.R;
        ch chVar = new ch(fjVar, 5);
        org.telegram.ui.ActionBar.r4 parentLayout = bnVar.getParentLayout();
        int currentAccount = bnVar.getCurrentAccount();
        org.telegram.ui.Components.u30 u30Var = new org.telegram.ui.Components.u30(0, true, true);
        u30Var.f40250a = bnVar;
        u30Var.s(efVar);
        u30Var.f40251b = new bg.g0(currentAccount, chVar, parentLayout, u30Var);
    }
}
