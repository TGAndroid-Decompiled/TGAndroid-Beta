package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class cs0 implements org.telegram.ui.Cells.n7 {
    public final au0 f25234a;

    public cs0(au0 au0Var) {
        this.f25234a = au0Var;
    }

    @Override
    public final void a(String str, boolean z10) {
        au0 au0Var = this.f25234a;
        org.telegram.ui.ActionBar.k2 k2Var = au0Var.f24568x1;
        if (z10) {
            org.telegram.ui.ActionBar.z2 h = org.telegram.messenger.a30.h(k2Var.getParentActivity(), false, 1, null);
            h.O = str;
            h.P = false;
            CharSequence[] charSequenceArr = {org.telegram.messenger.dd.L0(2131747833, "Open"), org.telegram.messenger.dd.L0(2131751767, "Copy")};
            eg.j jVar = new eg.j(7, this, str);
            h.L = charSequenceArr;
            h.K = jVar;
            k2Var.showDialog(h);
            return;
        }
        au0Var.Z0(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, org.telegram.messenger.kj kjVar) {
        au0 au0Var = this.f25234a;
        hu.K0(au0Var.f24568x1, kjVar, au0Var.f24558t1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean c() {
        return !this.f25234a.E1;
    }
}
