package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.ui.Components.a80;
import org.telegram.ui.ProfileActivity;
public final class g extends vf.b {
    public a80 d;
    public final Layout f29136e;
    public final ClickableSpan f29137f;
    public final float f29138g;
    public final j h;

    public g(j jVar, Layout layout, ClickableSpan clickableSpan, float f10) {
        this.h = jVar;
        this.f29136e = layout;
        this.f29137f = clickableSpan;
        this.f29138g = f10;
    }

    @Override
    public final void c(boolean z9) {
        long j3;
        f fVar = new f(this, 0);
        if (z9) {
            j3 = 0;
        } else {
            j3 = 350;
        }
        org.telegram.messenger.g0.i3(fVar, j3);
    }

    @Override
    public final void d() {
        j jVar = this.h;
        n2.n0 n0Var = jVar.E;
        a80 a80Var = jVar.G;
        if (a80Var != null) {
            n0Var.n(a80Var, true);
        }
        a80 k10 = n2.n0.k(this.f29136e, this.f29137f, this.f29138g);
        this.d = k10;
        jVar.G = k10;
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28269ze, jVar.I);
        RectF rectF = ProfileActivity.S6;
        this.d.g(org.telegram.ui.ActionBar.k6.r1(0.8f, w02), org.telegram.ui.ActionBar.k6.r1(1.3f, w02), org.telegram.ui.ActionBar.k6.r1(1.0f, w02), org.telegram.ui.ActionBar.k6.r1(4.0f, w02));
        this.d.f31751x.setStrokeWidth(org.telegram.messenger.g0.N(1.25f));
        n0Var.c(this.d, null);
    }
}
