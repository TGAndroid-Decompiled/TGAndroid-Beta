package org.telegram.ui.Cells;

import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.r90;
public final class h extends nf.e {
    public r90 d;
    public final Layout e;
    public final ClickableSpan f20374f;
    public final float f20375g;
    public final j h;

    public h(j jVar, Layout layout, ClickableSpan clickableSpan, float f7) {
        this.h = jVar;
        this.e = layout;
        this.f20374f = clickableSpan;
        this.f20375g = f7;
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
        k90 k90Var = jVar.E;
        r90 r90Var = jVar.G;
        if (r90Var != null) {
            k90Var.l(r90Var, true);
        }
        r90 i10 = k90.i(this.e, this.f20374f, this.f20375g);
        this.d = i10;
        jVar.G = i10;
        int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Ld, jVar.I);
        this.d.f(org.telegram.ui.ActionBar.h6.l1(0.8f, v02), org.telegram.ui.ActionBar.h6.l1(1.3f, v02), org.telegram.ui.ActionBar.h6.l1(1.0f, v02), org.telegram.ui.ActionBar.h6.l1(4.0f, v02));
        this.d.f27930w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
        k90Var.b(this.d, null);
    }
}
