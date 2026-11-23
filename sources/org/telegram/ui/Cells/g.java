package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.ui.Components.n80;
import org.telegram.ui.ProfileActivity;
public final class g extends vf.b {
    public n80 d;
    public final Layout f30715e;
    public final ClickableSpan f30716f;
    public final float f30717g;
    public final j h;

    public g(j jVar, Layout layout, ClickableSpan clickableSpan, float f10) {
        this.h = jVar;
        this.f30715e = layout;
        this.f30716f = clickableSpan;
        this.f30717g = f10;
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
        n2.p0 p0Var = jVar.F;
        n80 n80Var = jVar.H;
        if (n80Var != null) {
            p0Var.n(n80Var, true);
        }
        n80 k10 = n2.p0.k(this.f30715e, this.f30716f, this.f30717g);
        this.d = k10;
        jVar.H = k10;
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Ce, jVar.J);
        RectF rectF = ProfileActivity.Z6;
        this.d.g(org.telegram.ui.ActionBar.n6.r1(0.8f, w02), org.telegram.ui.ActionBar.n6.r1(1.3f, w02), org.telegram.ui.ActionBar.n6.r1(1.0f, w02), org.telegram.ui.ActionBar.n6.r1(4.0f, w02));
        this.d.f37729x.setStrokeWidth(org.telegram.messenger.g0.N(1.25f));
        p0Var.c(this.d, null);
    }
}
