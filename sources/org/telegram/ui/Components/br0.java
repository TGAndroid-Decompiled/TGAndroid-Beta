package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class br0 implements org.telegram.ui.Cells.j7 {
    public final ys0 f32346a;

    public br0(ys0 ys0Var) {
        this.f32346a = ys0Var;
    }

    @Override
    public final void a(String str, boolean z9) {
        ys0 ys0Var = this.f32346a;
        org.telegram.ui.ActionBar.f2 f2Var = ys0Var.f40719x1;
        if (z9) {
            org.telegram.ui.ActionBar.w2 h = org.telegram.messenger.camera.q.h(f2Var.getParentActivity(), false, 1, null);
            h.O = str;
            h.P = false;
            CharSequence[] charSequenceArr = {org.telegram.messenger.id.M0(2131747817, "Open"), org.telegram.messenger.id.M0(2131751767, "Copy")};
            og.j jVar = new og.j(6, this, str);
            h.L = charSequenceArr;
            h.K = jVar;
            f2Var.showDialog(h);
            return;
        }
        ys0Var.d1(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, org.telegram.messenger.ij ijVar) {
        ys0 ys0Var = this.f32346a;
        vt.N0(ys0Var.f40719x1, ijVar, ys0Var.f40709t1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean d() {
        return !this.f32346a.E1;
    }
}
