package org.telegram.ui.Cells;

import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.q90;
public final class h extends nf.e {
    public q90 d;
    public final Layout e;
    public final ClickableSpan f19236f;
    public final float f19237g;
    public final j h;

    public h(j jVar, Layout layout, ClickableSpan clickableSpan, float f7) {
        this.h = jVar;
        this.e = layout;
        this.f19236f = clickableSpan;
        this.f19237g = f7;
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
        j90 j90Var = jVar.E;
        q90 q90Var = jVar.G;
        if (q90Var != null) {
            j90Var.l(q90Var, true);
        }
        q90 i10 = j90.i(this.e, this.f19236f, this.f19237g);
        this.d = i10;
        jVar.G = i10;
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ld, jVar.I);
        this.d.f(org.telegram.ui.ActionBar.j6.l1(0.8f, v02), org.telegram.ui.ActionBar.j6.l1(1.3f, v02), org.telegram.ui.ActionBar.j6.l1(1.0f, v02), org.telegram.ui.ActionBar.j6.l1(4.0f, v02));
        this.d.f26363w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
        j90Var.b(this.d, null);
    }
}
