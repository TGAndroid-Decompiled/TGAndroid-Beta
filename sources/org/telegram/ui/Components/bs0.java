package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class bs0 implements org.telegram.ui.Cells.n7 {
    public final zt0 f24874a;

    public bs0(zt0 zt0Var) {
        this.f24874a = zt0Var;
    }

    @Override
    public final void a(String str, boolean z10) {
        zt0 zt0Var = this.f24874a;
        org.telegram.ui.ActionBar.k2 k2Var = zt0Var.f33240x1;
        if (z10) {
            org.telegram.ui.ActionBar.z2 h = org.telegram.messenger.z20.h(k2Var.getParentActivity(), false, 1, null);
            h.O = str;
            h.P = false;
            CharSequence[] charSequenceArr = {org.telegram.messenger.cd.L0(2131747833, "Open"), org.telegram.messenger.cd.L0(2131751767, "Copy")};
            eg.j jVar = new eg.j(7, this, str);
            h.L = charSequenceArr;
            h.K = jVar;
            k2Var.showDialog(h);
            return;
        }
        zt0Var.Y0(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, org.telegram.messenger.jj jjVar) {
        zt0 zt0Var = this.f24874a;
        hu.K0(zt0Var.f33240x1, jjVar, zt0Var.f33230t1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean c() {
        return !this.f24874a.E1;
    }
}
