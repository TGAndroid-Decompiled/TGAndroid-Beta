package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.ui.Components.o80;
import org.telegram.ui.ProfileActivity;
public final class g extends vf.b {
    public o80 d;
    public final Layout f30628e;
    public final ClickableSpan f30629f;
    public final float f30630g;
    public final j h;

    public g(j jVar, Layout layout, ClickableSpan clickableSpan, float f10) {
        this.h = jVar;
        this.f30628e = layout;
        this.f30629f = clickableSpan;
        this.f30630g = f10;
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
        org.telegram.messenger.g0.h3(fVar, j3);
    }

    @Override
    public final void d() {
        j jVar = this.h;
        n2.o0 o0Var = jVar.F;
        o80 o80Var = jVar.H;
        if (o80Var != null) {
            o0Var.n(o80Var, true);
        }
        o80 k10 = n2.o0.k(this.f30628e, this.f30629f, this.f30630g);
        this.d = k10;
        jVar.H = k10;
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Ce, jVar.J);
        RectF rectF = ProfileActivity.Z6;
        this.d.g(org.telegram.ui.ActionBar.n6.r1(0.8f, w02), org.telegram.ui.ActionBar.n6.r1(1.3f, w02), org.telegram.ui.ActionBar.n6.r1(1.0f, w02), org.telegram.ui.ActionBar.n6.r1(4.0f, w02));
        this.d.f38032x.setStrokeWidth(org.telegram.messenger.g0.N(1.25f));
        o0Var.c(this.d, null);
    }
}
