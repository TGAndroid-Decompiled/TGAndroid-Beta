package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class dl extends mq0 {
    public final org.telegram.messenger.gj f46419a;
    public final org.telegram.messenger.ff f46420b;
    public final el f46421c;

    public dl(el elVar, org.telegram.messenger.gj gjVar, org.telegram.messenger.ff ffVar) {
        this.f46421c = elVar;
        this.f46419a = gjVar;
        this.f46420b = ffVar;
    }

    @Override
    public final uq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        return this.f46421c.f46862a.R.f45158cb.E(this.f46419a, fileLocation, i7, z10, false);
    }

    @Override
    public final void o(int i7, org.telegram.messenger.g20 g20Var, boolean z10, int i10, int i11, boolean z11) {
        jl jlVar = this.f46421c.f46862a;
        org.telegram.messenger.gj gjVar = this.f46419a;
        gjVar.f23840q = true;
        org.telegram.messenger.ff ffVar = this.f46420b;
        if (ffVar.h == null && !ffVar.f27708b) {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_photos_updateProfilePhoto.f28185id = tL_inputPhoto;
            TLRPC.Photo photo = gjVar.f23817k.action.photo;
            tL_inputPhoto.f28070id = photo.f28075id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            jlVar.R.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new v7(7, this, gjVar));
            return;
        }
        an anVar = jlVar.R;
        bh bhVar = new bh(gjVar, 5);
        org.telegram.ui.ActionBar.o4 parentLayout = anVar.getParentLayout();
        int currentAccount = anVar.getCurrentAccount();
        org.telegram.ui.Components.m30 m30Var = new org.telegram.ui.Components.m30(0, true, true);
        m30Var.f37040a = anVar;
        m30Var.s(ffVar);
        m30Var.f37041b = new bg.f0(currentAccount, bhVar, parentLayout, m30Var);
    }
}
