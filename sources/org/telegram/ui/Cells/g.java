package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.ui.Components.d80;
import org.telegram.ui.ProfileActivity;
public final class g extends vf.b {
    public d80 d;
    public final Layout f30309e;
    public final ClickableSpan f30310f;
    public final float f30311g;
    public final j h;

    public g(j jVar, Layout layout, ClickableSpan clickableSpan, float f10) {
        this.h = jVar;
        this.f30309e = layout;
        this.f30310f = clickableSpan;
        this.f30311g = f10;
    }

    @Override
    public final void c(boolean z10) {
        long j3;
        f fVar = new f(this, 0);
        if (z10) {
            j3 = 0;
        } else {
            j3 = 350;
        }
        org.telegram.messenger.g0.i3(fVar, j3);
    }

    @Override
    public final void d() {
        j jVar = this.h;
        n2.o0 o0Var = jVar.F;
        d80 d80Var = jVar.H;
        if (d80Var != null) {
            o0Var.o(d80Var, true);
        }
        d80 k10 = n2.o0.k(this.f30309e, this.f30310f, this.f30311g);
        this.d = k10;
        jVar.H = k10;
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Ce, jVar.J);
        RectF rectF = ProfileActivity.X6;
        this.d.g(org.telegram.ui.ActionBar.j6.r1(0.8f, w02), org.telegram.ui.ActionBar.j6.r1(1.3f, w02), org.telegram.ui.ActionBar.j6.r1(1.0f, w02), org.telegram.ui.ActionBar.j6.r1(4.0f, w02));
        this.d.f33886x.setStrokeWidth(org.telegram.messenger.g0.N(1.25f));
        o0Var.c(this.d, null);
    }
}
