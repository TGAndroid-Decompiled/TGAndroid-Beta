package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.ui.Components.w70;
import org.telegram.ui.ProfileActivity;
public final class g extends sf.b {
    public w70 d;
    public final Layout f29250e;
    public final ClickableSpan f29251f;
    public final float f29252g;
    public final j h;

    public g(j jVar, Layout layout, ClickableSpan clickableSpan, float f10) {
        this.h = jVar;
        this.f29250e = layout;
        this.f29251f = clickableSpan;
        this.f29252g = f10;
    }

    @Override
    public final void c(boolean z10) {
        long j10;
        f fVar = new f(this, 0);
        if (z10) {
            j10 = 0;
        } else {
            j10 = 350;
        }
        org.telegram.messenger.g0.i3(fVar, j10);
    }

    @Override
    public final void d() {
        j jVar = this.h;
        m2.p0 p0Var = jVar.F;
        w70 w70Var = jVar.H;
        if (w70Var != null) {
            p0Var.n(w70Var, true);
        }
        w70 k10 = m2.p0.k(this.f29250e, this.f29251f, this.f29252g);
        this.d = k10;
        jVar.H = k10;
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28298ze, jVar.J);
        RectF rectF = ProfileActivity.T6;
        this.d.g(org.telegram.ui.ActionBar.k6.r1(0.8f, w02), org.telegram.ui.ActionBar.k6.r1(1.3f, w02), org.telegram.ui.ActionBar.k6.r1(1.0f, w02), org.telegram.ui.ActionBar.k6.r1(4.0f, w02));
        this.d.f39944x.setStrokeWidth(org.telegram.messenger.g0.N(1.25f));
        p0Var.c(this.d, null);
    }
}
