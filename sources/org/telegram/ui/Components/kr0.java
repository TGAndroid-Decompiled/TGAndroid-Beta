package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class kr0 implements org.telegram.ui.Cells.j7 {
    public final gt0 f36866a;

    public kr0(gt0 gt0Var) {
        this.f36866a = gt0Var;
    }

    @Override
    public final void a(String str, boolean z10) {
        gt0 gt0Var = this.f36866a;
        org.telegram.ui.ActionBar.h2 h2Var = gt0Var.f35642y1;
        if (z10) {
            org.telegram.ui.ActionBar.x2 j3 = org.telegram.messenger.n10.j(h2Var.getParentActivity(), false, 1, null);
            j3.P = str;
            j3.Q = false;
            CharSequence[] charSequenceArr = {org.telegram.messenger.gd.M0(2131747624, "Open"), org.telegram.messenger.gd.M0(2131751756, "Copy")};
            og.j jVar = new og.j(6, this, str);
            j3.M = charSequenceArr;
            j3.L = jVar;
            h2Var.showDialog(j3);
            return;
        }
        gt0Var.d1(str);
    }

    @Override
    public final boolean b() {
        return !this.f36866a.F1;
    }

    @Override
    public final void c(TLRPC.WebPage webPage, org.telegram.messenger.fj fjVar) {
        gt0 gt0Var = this.f36866a;
        gu.O0(gt0Var.f35642y1, fjVar, gt0Var.f35631u1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }
}
