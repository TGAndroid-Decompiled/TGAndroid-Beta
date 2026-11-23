package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class mr0 implements org.telegram.ui.Cells.k7 {
    public final jt0 f37620a;

    public mr0(jt0 jt0Var) {
        this.f37620a = jt0Var;
    }

    @Override
    public final void a(String str, boolean z10) {
        jt0 jt0Var = this.f37620a;
        org.telegram.ui.ActionBar.g2 g2Var = jt0Var.f36683y1;
        if (z10) {
            org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.o10.j(g2Var.getParentActivity(), false, 1, null);
            j3.P = str;
            j3.Q = false;
            CharSequence[] charSequenceArr = {org.telegram.messenger.hd.N0(2131747623, "Open"), org.telegram.messenger.hd.N0(2131751755, "Copy")};
            og.j jVar = new og.j(6, this, str);
            j3.M = charSequenceArr;
            j3.L = jVar;
            g2Var.showDialog(j3);
            return;
        }
        jt0Var.d1(str);
    }

    @Override
    public final boolean b() {
        return !this.f37620a.F1;
    }

    @Override
    public final void c(TLRPC.WebPage webPage, org.telegram.messenger.gj gjVar) {
        jt0 jt0Var = this.f37620a;
        iu.O0(jt0Var.f36683y1, gjVar, jt0Var.f36672u1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }
}
