package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class dl extends nq0 {
    public final org.telegram.messenger.ij f45088a;
    public final org.telegram.messenger.gf f45089b;
    public final el f45090c;

    public dl(el elVar, org.telegram.messenger.ij ijVar, org.telegram.messenger.gf gfVar) {
        this.f45090c = elVar;
        this.f45088a = ijVar;
        this.f45089b = gfVar;
    }

    @Override
    public final wq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        return this.f45090c.f45372a.Q.Za.E(this.f45088a, fileLocation, i7, z9, false);
    }

    @Override
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        jl jlVar = this.f45090c.f45372a;
        org.telegram.messenger.ij ijVar = this.f45088a;
        ijVar.f23265q = true;
        org.telegram.messenger.gf gfVar = this.f45089b;
        if (gfVar.h == null && !gfVar.f26824b) {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_photos_updateProfilePhoto.f27087id = tL_inputPhoto;
            TLRPC.Photo photo = ijVar.f23244k.action.photo;
            tL_inputPhoto.f26972id = photo.f26977id;
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
        j30Var.f34858a = anVar;
        j30Var.s(gfVar);
        j30Var.f34859b = new bg.f0(currentAccount, bhVar, parentLayout, j30Var);
    }
}
