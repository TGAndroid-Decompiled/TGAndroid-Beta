package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class fl extends pq0 {
    public final org.telegram.messenger.ij f45737a;
    public final org.telegram.messenger.gf f45738b;
    public final gl f45739c;

    public fl(gl glVar, org.telegram.messenger.ij ijVar, org.telegram.messenger.gf gfVar) {
        this.f45739c = glVar;
        this.f45737a = ijVar;
        this.f45738b = gfVar;
    }

    @Override
    public final yq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        return this.f45739c.f46031a.Q.f44403bb.E(this.f45737a, fileLocation, i7, z9, false);
    }

    @Override
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        ll llVar = this.f45739c.f46031a;
        org.telegram.messenger.ij ijVar = this.f45737a;
        ijVar.f23283q = true;
        org.telegram.messenger.gf gfVar = this.f45738b;
        if (gfVar.h == null && !gfVar.f26845b) {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_photos_updateProfilePhoto.f27090id = tL_inputPhoto;
            TLRPC.Photo photo = ijVar.f23262k.action.photo;
            tL_inputPhoto.f26975id = photo.f26980id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            llVar.Q.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new ld(5, this, ijVar));
            return;
        }
        cn cnVar = llVar.Q;
        dh dhVar = new dh(ijVar, 5);
        org.telegram.ui.ActionBar.q4 parentLayout = cnVar.getParentLayout();
        int currentAccount = cnVar.getCurrentAccount();
        org.telegram.ui.Components.k30 k30Var = new org.telegram.ui.Components.k30(0, true, true);
        k30Var.f35218a = cnVar;
        k30Var.s(gfVar);
        k30Var.f35219b = new bg.f0(currentAccount, dhVar, parentLayout, k30Var);
    }
}
