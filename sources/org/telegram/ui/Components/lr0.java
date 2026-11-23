package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class lr0 implements org.telegram.ui.Cells.j7 {
    public final it0 f37209a;

    public lr0(it0 it0Var) {
        this.f37209a = it0Var;
    }

    @Override
    public final void a(String str, boolean z10) {
        it0 it0Var = this.f37209a;
        org.telegram.ui.ActionBar.g2 g2Var = it0Var.f36166y1;
        if (z10) {
            org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.m10.j(g2Var.getParentActivity(), false, 1, null);
            j3.P = str;
            j3.Q = false;
            CharSequence[] charSequenceArr = {org.telegram.messenger.gd.N0(2131747623, "Open"), org.telegram.messenger.gd.N0(2131751755, "Copy")};
            og.j jVar = new og.j(6, this, str);
            j3.M = charSequenceArr;
            j3.L = jVar;
            g2Var.showDialog(j3);
            return;
        }
        it0Var.d1(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, org.telegram.messenger.fj fjVar) {
        it0 it0Var = this.f37209a;
        gu.O0(it0Var.f36166y1, fjVar, it0Var.f36155u1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean d() {
        return !this.f37209a.F1;
    }
}
