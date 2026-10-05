package org.telegram.ui.Cells;

import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.u90;
public final class h extends nf.e {
    public u90 d;
    public final Layout f22187e;
    public final ClickableSpan f22188f;
    public final float f22189g;
    public final j h;

    public h(j jVar, Layout layout, ClickableSpan clickableSpan, float f7) {
        this.h = jVar;
        this.f22187e = layout;
        this.f22188f = clickableSpan;
        this.f22189g = f7;
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
        n90 n90Var = jVar.E;
        u90 u90Var = jVar.G;
        if (u90Var != null) {
            n90Var.l(u90Var, true);
        }
        u90 i10 = n90.i(this.f22187e, this.f22188f, this.f22189g);
        this.d = i10;
        jVar.G = i10;
        int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Ld, jVar.I);
        this.d.f(org.telegram.ui.ActionBar.i6.l1(0.8f, v02), org.telegram.ui.ActionBar.i6.l1(1.3f, v02), org.telegram.ui.ActionBar.i6.l1(1.0f, v02), org.telegram.ui.ActionBar.i6.l1(4.0f, v02));
        this.d.f31405w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
        n90Var.b(this.d, null);
    }
}
