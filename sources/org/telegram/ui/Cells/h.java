package org.telegram.ui.Cells;

import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.ha0;
public final class h extends pf.c {
    public ha0 d;
    public final Layout e;
    public final ClickableSpan f21252f;
    public final float f21253g;
    public final j h;

    public h(j jVar, Layout layout, ClickableSpan clickableSpan, float f7) {
        this.h = jVar;
        this.e = layout;
        this.f21252f = clickableSpan;
        this.f21253g = f7;
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
        aa0 aa0Var = jVar.E;
        ha0 ha0Var = jVar.G;
        if (ha0Var != null) {
            aa0Var.l(ha0Var, true);
        }
        ha0 i10 = aa0.i(this.e, this.f21252f, this.f21253g);
        this.d = i10;
        jVar.G = i10;
        int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Ld, jVar.I);
        this.d.g(org.telegram.ui.ActionBar.g6.m1(0.8f, w02), org.telegram.ui.ActionBar.g6.m1(1.3f, w02), org.telegram.ui.ActionBar.g6.m1(1.0f, w02), org.telegram.ui.ActionBar.g6.m1(4.0f, w02));
        this.d.f25624x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
        aa0Var.b(this.d, null);
    }
}
