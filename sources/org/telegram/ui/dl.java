package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class dl extends nq0 {
    public final org.telegram.messenger.ij f45083a;
    public final org.telegram.messenger.gf f45084b;
    public final el f45085c;

    public dl(el elVar, org.telegram.messenger.ij ijVar, org.telegram.messenger.gf gfVar) {
        this.f45085c = elVar;
        this.f45083a = ijVar;
        this.f45084b = gfVar;
    }

    @Override
    public final wq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        return this.f45085c.f45331a.Q.Za.E(this.f45083a, fileLocation, i7, z9, false);
    }

    @Override
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        jl jlVar = this.f45085c.f45331a;
        org.telegram.messenger.ij ijVar = this.f45083a;
        ijVar.f23283q = true;
        org.telegram.messenger.gf gfVar = this.f45084b;
        if (gfVar.h == null && !gfVar.f26845b) {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_photos_updateProfilePhoto.f27090id = tL_inputPhoto;
            TLRPC.Photo photo = ijVar.f23262k.action.photo;
            tL_inputPhoto.f26975id = photo.f26980id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            jlVar.Q.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new ld(5, this, ijVar));
            return;
        }
        an anVar = jlVar.Q;
        bh bhVar = new bh(ijVar, 5);
        org.telegram.ui.ActionBar.q4 parentLayout = anVar.getParentLayout();
        int currentAccount = anVar.getCurrentAccount();
        org.telegram.ui.Components.j30 j30Var = new org.telegram.ui.Components.j30(0, true, true);
        j30Var.f34879a = anVar;
        j30Var.s(gfVar);
        j30Var.f34880b = new bg.f0(currentAccount, bhVar, parentLayout, j30Var);
    }
}
