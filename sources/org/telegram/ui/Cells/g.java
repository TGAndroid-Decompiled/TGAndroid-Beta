package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.ui.Components.t80;
import org.telegram.ui.ProfileActivity;
public final class g extends gf.e {
    public t80 d;
    public final Layout e;
    public final ClickableSpan f21907f;
    public final float f21908g;
    public final i h;

    public g(i iVar, Layout layout, ClickableSpan clickableSpan, float f7) {
        this.h = iVar;
        this.e = layout;
        this.f21907f = clickableSpan;
        this.f21908g = f7;
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
        org.telegram.messenger.i0.h3(fVar, j10);
    }

    @Override
    public final void d() {
        i iVar = this.h;
        ji.a aVar = iVar.E;
        t80 t80Var = iVar.G;
        if (t80Var != null) {
            aVar.n(t80Var, true);
        }
        t80 k10 = ji.a.k(this.e, this.f21907f, this.f21908g);
        this.d = k10;
        iVar.G = k10;
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21337ze, iVar.I);
        RectF rectF = ProfileActivity.S6;
        this.d.g(org.telegram.ui.ActionBar.t6.r1(0.8f, w02), org.telegram.ui.ActionBar.t6.r1(1.3f, w02), org.telegram.ui.ActionBar.t6.r1(1.0f, w02), org.telegram.ui.ActionBar.t6.r1(4.0f, w02));
        this.d.f30592x.setStrokeWidth(org.telegram.messenger.i0.N(1.25f));
        aVar.c(this.d, null);
    }
}
