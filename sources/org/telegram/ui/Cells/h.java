package org.telegram.ui.Cells;

import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.ma0;
public final class h extends of.e {
    public ma0 d;
    public final Layout f21942e;
    public final ClickableSpan f21943f;
    public final float f21944g;
    public final j h;

    public h(j jVar, Layout layout, ClickableSpan clickableSpan, float f7) {
        this.h = jVar;
        this.f21942e = layout;
        this.f21943f = clickableSpan;
        this.f21944g = f7;
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
        fa0 fa0Var = jVar.E;
        ma0 ma0Var = jVar.G;
        if (ma0Var != null) {
            fa0Var.l(ma0Var, true);
        }
        ma0 i10 = fa0.i(this.f21942e, this.f21943f, this.f21944g);
        this.d = i10;
        jVar.G = i10;
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Ld, jVar.I);
        this.d.g(org.telegram.ui.ActionBar.h6.m1(0.8f, w02), org.telegram.ui.ActionBar.h6.m1(1.3f, w02), org.telegram.ui.ActionBar.h6.m1(1.0f, w02), org.telegram.ui.ActionBar.h6.m1(4.0f, w02));
        this.d.f28481x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
        fa0Var.b(this.d, null);
    }
}
