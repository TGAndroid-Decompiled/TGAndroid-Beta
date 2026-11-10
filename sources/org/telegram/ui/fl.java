package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class fl extends qq0 {
    public final org.telegram.messenger.ij f45790a;
    public final org.telegram.messenger.gf f45791b;
    public final gl f45792c;

    public fl(gl glVar, org.telegram.messenger.ij ijVar, org.telegram.messenger.gf gfVar) {
        this.f45792c = glVar;
        this.f45790a = ijVar;
        this.f45791b = gfVar;
    }

    @Override
    public final zq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        return this.f45792c.f46111a.Q.f44444bb.E(this.f45790a, fileLocation, i7, z9, false);
    }

    @Override
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        ll llVar = this.f45792c.f46111a;
        org.telegram.messenger.ij ijVar = this.f45790a;
        ijVar.f23287q = true;
        org.telegram.messenger.gf gfVar = this.f45791b;
        if (gfVar.h == null && !gfVar.f26849b) {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_photos_updateProfilePhoto.f27094id = tL_inputPhoto;
            TLRPC.Photo photo = ijVar.f23266k.action.photo;
            tL_inputPhoto.f26979id = photo.f26984id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            llVar.Q.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new ld(5, this, ijVar));
            return;
        }
        cn cnVar = llVar.Q;
        dh dhVar = new dh(ijVar, 5);
        org.telegram.ui.ActionBar.r4 parentLayout = cnVar.getParentLayout();
        int currentAccount = cnVar.getCurrentAccount();
        org.telegram.ui.Components.j30 j30Var = new org.telegram.ui.Components.j30(0, true, true);
        j30Var.f34825a = cnVar;
        j30Var.s(gfVar);
        j30Var.f34826b = new bg.f0(currentAccount, dhVar, parentLayout, j30Var);
    }
}
