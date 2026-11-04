package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class ar0 implements org.telegram.ui.Cells.i7 {
    public final ws0 f31982a;

    public ar0(ws0 ws0Var) {
        this.f31982a = ws0Var;
    }

    @Override
    public final void a(String str, boolean z10) {
        ws0 ws0Var = this.f31982a;
        org.telegram.ui.ActionBar.d2 d2Var = ws0Var.f40142y1;
        if (z10) {
            org.telegram.ui.ActionBar.t2 h = org.telegram.messenger.camera.q.h(d2Var.getParentActivity(), false, 1, null);
            h.P = str;
            h.Q = false;
            CharSequence[] charSequenceArr = {org.telegram.messenger.bd.M0(2131747825, "Open"), org.telegram.messenger.bd.M0(2131751767, "Copy")};
            org.telegram.ui.u uVar = new org.telegram.ui.u(5, this, str);
            h.M = charSequenceArr;
            h.L = uVar;
            d2Var.showDialog(h);
            return;
        }
        ws0Var.b1(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, org.telegram.messenger.zi ziVar) {
        ws0 ws0Var = this.f31982a;
        ut.K0(ws0Var.f40142y1, ziVar, ws0Var.f40131u1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean c() {
        return !this.f31982a.F1;
    }
}
