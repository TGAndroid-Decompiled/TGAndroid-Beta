package org.telegram.ui.Cells;

import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.t80;

public final class h extends we.d {
    public t80 d;

    public final Layout f24408e;

    public final ClickableSpan f24409f;

    public final float f24410g;
    public final j h;

    public h(j jVar, Layout layout, ClickableSpan clickableSpan, float f10) {
        this.h = jVar;
        this.f24408e = layout;
        this.f24409f = clickableSpan;
        this.f24410g = f10;
    }

    @Override
    public final void c(boolean z10) {
        AndroidUtilities.runOnUIThread(new g(this, 0), z10 ? 0L : 350L);
    }

    @Override
    public final void d() {
        j jVar = this.h;
        m80 m80Var = jVar.A;
        t80 t80Var = jVar.C;
        if (t80Var != null) {
            m80Var.l(t80Var, true);
        }
        t80 t80VarI = m80.i(this.f24408e, this.f24409f, this.f24410g);
        this.d = t80VarI;
        jVar.C = t80VarI;
        int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ld, jVar.E);
        this.d.f(org.telegram.ui.ActionBar.g6.l1(0.8f, iV0), org.telegram.ui.ActionBar.g6.l1(1.3f, iV0), org.telegram.ui.ActionBar.g6.l1(1.0f, iV0), org.telegram.ui.ActionBar.g6.l1(4.0f, iV0));
        this.d.f32710w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
        m80Var.b(this.d, null);
    }
}
