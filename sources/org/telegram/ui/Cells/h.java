package org.telegram.ui.Cells;

import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.v90;
public final class h extends pf.c {
    public ca0 d;
    public final Layout e;
    public final ClickableSpan f22444f;
    public final float f22445g;
    public final j h;

    public h(j jVar, Layout layout, ClickableSpan clickableSpan, float f7) {
        this.h = jVar;
        this.e = layout;
        this.f22444f = clickableSpan;
        this.f22445g = f7;
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
        v90 v90Var = jVar.E;
        ca0 ca0Var = jVar.G;
        if (ca0Var != null) {
            v90Var.l(ca0Var, true);
        }
        ca0 i10 = v90.i(this.e, this.f22444f, this.f22445g);
        this.d = i10;
        jVar.G = i10;
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ld, jVar.I);
        this.d.g(org.telegram.ui.ActionBar.k6.o1(0.8f, w02), org.telegram.ui.ActionBar.k6.o1(1.3f, w02), org.telegram.ui.ActionBar.k6.o1(1.0f, w02), org.telegram.ui.ActionBar.k6.o1(4.0f, w02));
        this.d.f25297x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
        v90Var.b(this.d, null);
    }
}
