package org.telegram.ui.Cells;

import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.z80;
public final class h extends nf.e {
    public g90 d;
    public final Layout e;
    public final ClickableSpan f20146f;
    public final float f20147g;
    public final j h;

    public h(j jVar, Layout layout, ClickableSpan clickableSpan, float f7) {
        this.h = jVar;
        this.e = layout;
        this.f20146f = clickableSpan;
        this.f20147g = f7;
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
        z80 z80Var = jVar.E;
        g90 g90Var = jVar.G;
        if (g90Var != null) {
            z80Var.l(g90Var, true);
        }
        g90 i10 = z80.i(this.e, this.f20146f, this.f20147g);
        this.d = i10;
        jVar.G = i10;
        int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Ld, jVar.I);
        this.d.f(org.telegram.ui.ActionBar.i6.l1(0.8f, v02), org.telegram.ui.ActionBar.i6.l1(1.3f, v02), org.telegram.ui.ActionBar.i6.l1(1.0f, v02), org.telegram.ui.ActionBar.i6.l1(4.0f, v02));
        this.d.f24276w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
        z80Var.b(this.d, null);
    }
}
