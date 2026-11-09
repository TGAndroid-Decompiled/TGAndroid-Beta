package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class cr0 implements org.telegram.ui.Cells.j7 {
    public final zs0 f32746a;

    public cr0(zs0 zs0Var) {
        this.f32746a = zs0Var;
    }

    @Override
    public final void a(String str, boolean z9) {
        zs0 zs0Var = this.f32746a;
        org.telegram.ui.ActionBar.f2 f2Var = zs0Var.f41127x1;
        if (z9) {
            org.telegram.ui.ActionBar.v2 h = org.telegram.messenger.camera.q.h(f2Var.getParentActivity(), false, 1, null);
            h.O = str;
            h.P = false;
            CharSequence[] charSequenceArr = {org.telegram.messenger.id.M0(2131747817, "Open"), org.telegram.messenger.id.M0(2131751767, "Copy")};
            og.j jVar = new og.j(6, this, str);
            h.L = charSequenceArr;
            h.K = jVar;
            f2Var.showDialog(h);
            return;
        }
        zs0Var.d1(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, org.telegram.messenger.ij ijVar) {
        zs0 zs0Var = this.f32746a;
        wt.N0(zs0Var.f41127x1, ijVar, zs0Var.f41117t1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean d() {
        return !this.f32746a.E1;
    }
}
