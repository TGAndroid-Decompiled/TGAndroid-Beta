package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class el extends pq0 {
    public final org.telegram.messenger.gj f47293a;
    public final org.telegram.messenger.ff f47294b;
    public final fl f47295c;

    public el(fl flVar, org.telegram.messenger.gj gjVar, org.telegram.messenger.ff ffVar) {
        this.f47295c = flVar;
        this.f47293a = gjVar;
        this.f47294b = ffVar;
    }

    @Override
    public final xq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        return this.f47295c.f47726a.R.f45956db.E(this.f47293a, fileLocation, i7, z10, false);
    }

    @Override
    public final void o(int i7, org.telegram.messenger.f20 f20Var, boolean z10, int i10, int i11, boolean z11) {
        kl klVar = this.f47295c.f47726a;
        org.telegram.messenger.gj gjVar = this.f47293a;
        gjVar.f24200q = true;
        org.telegram.messenger.ff ffVar = this.f47294b;
        if (ffVar.h == null && !ffVar.f28023b) {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_photos_updateProfilePhoto.f28532id = tL_inputPhoto;
            TLRPC.Photo photo = gjVar.f24177k.action.photo;
            tL_inputPhoto.f28417id = photo.f28422id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            klVar.R.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new u7(7, this, gjVar));
            return;
        }
        bn bnVar = klVar.R;
        bh bhVar = new bh(gjVar, 5);
        org.telegram.ui.ActionBar.r4 parentLayout = bnVar.getParentLayout();
        int currentAccount = bnVar.getCurrentAccount();
        org.telegram.ui.Components.x30 x30Var = new org.telegram.ui.Components.x30(0, true, true);
        x30Var.f41915a = bnVar;
        x30Var.s(ffVar);
        x30Var.f41916b = new bg.g0(currentAccount, bhVar, parentLayout, x30Var);
    }
}
