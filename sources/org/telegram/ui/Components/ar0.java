package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class ar0 implements org.telegram.ui.Cells.j7 {
    public final xs0 f31880a;

    public ar0(xs0 xs0Var) {
        this.f31880a = xs0Var;
    }

    @Override
    public final void a(String str, boolean z9) {
        xs0 xs0Var = this.f31880a;
        org.telegram.ui.ActionBar.f2 f2Var = xs0Var.f40405x1;
        if (z9) {
            org.telegram.ui.ActionBar.v2 h = org.telegram.messenger.camera.q.h(f2Var.getParentActivity(), false, 1, null);
            h.O = str;
            h.P = false;
            CharSequence[] charSequenceArr = {org.telegram.messenger.hd.M0(2131747816, "Open"), org.telegram.messenger.hd.M0(2131751767, "Copy")};
            og.j jVar = new og.j(6, this, str);
            h.L = charSequenceArr;
            h.K = jVar;
            f2Var.showDialog(h);
            return;
        }
        xs0Var.b1(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, org.telegram.messenger.ij ijVar) {
        xs0 xs0Var = this.f31880a;
        vt.N0(xs0Var.f40405x1, ijVar, xs0Var.f40395t1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean d() {
        return !this.f31880a.E1;
    }
}
