package org.telegram.ui.Cells;

import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.v80;
public final class h extends ye.c {
    public c90 d;
    public final Layout f24421e;
    public final ClickableSpan f24422f;
    public final float f24423g;
    public final j h;

    public h(j jVar, Layout layout, ClickableSpan clickableSpan, float f9) {
        this.h = jVar;
        this.f24421e = layout;
        this.f24422f = clickableSpan;
        this.f24423g = f9;
    }

    @Override
    public final void c(boolean z10) {
        long j10;
        g gVar = new g(this, 0);
        if (z10) {
            j10 = 0;
        } else {
            j10 = 350;
        }
        AndroidUtilities.runOnUIThread(gVar, j10);
    }

    @Override
    public final void d() {
        j jVar = this.h;
        v80 v80Var = jVar.A;
        c90 c90Var = jVar.C;
        if (c90Var != null) {
            v80Var.l(c90Var, true);
        }
        c90 i10 = v80.i(this.f24421e, this.f24422f, this.f24423g);
        this.d = i10;
        jVar.C = i10;
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ld, jVar.E);
        this.d.f(org.telegram.ui.ActionBar.g6.l1(0.8f, v02), org.telegram.ui.ActionBar.g6.l1(1.3f, v02), org.telegram.ui.ActionBar.g6.l1(1.0f, v02), org.telegram.ui.ActionBar.g6.l1(4.0f, v02));
        this.d.f27399w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
        v80Var.b(this.d, null);
    }
}
