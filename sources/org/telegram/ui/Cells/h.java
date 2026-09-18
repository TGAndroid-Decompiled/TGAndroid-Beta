package org.telegram.ui.Cells;

import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.p90;
public final class h extends nf.e {
    public p90 d;
    public final Layout e;
    public final ClickableSpan f20337f;
    public final float f20338g;
    public final j h;

    public h(j jVar, Layout layout, ClickableSpan clickableSpan, float f7) {
        this.h = jVar;
        this.e = layout;
        this.f20337f = clickableSpan;
        this.f20338g = f7;
    }

    @Override
    public final void c(boolean z10) {
        long j3;
        g gVar = new g(this, 0);
        if (z10) {
            j3 = 0;
        } else {
            j3 = 350;
        }
        AndroidUtilities.runOnUIThread(gVar, j3);
    }

    @Override
    public final void d() {
        j jVar = this.h;
        i90 i90Var = jVar.E;
        p90 p90Var = jVar.G;
        if (p90Var != null) {
            i90Var.l(p90Var, true);
        }
        p90 i10 = i90.i(this.e, this.f20337f, this.f20338g);
        this.d = i10;
        jVar.G = i10;
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ld, jVar.I);
        this.d.f(org.telegram.ui.ActionBar.j6.l1(0.8f, v02), org.telegram.ui.ActionBar.j6.l1(1.3f, v02), org.telegram.ui.ActionBar.j6.l1(1.0f, v02), org.telegram.ui.ActionBar.j6.l1(4.0f, v02));
        this.d.f27157w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
        i90Var.b(this.d, null);
    }
}
