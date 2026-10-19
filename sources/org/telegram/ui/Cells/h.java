package org.telegram.ui.Cells;

import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.u90;
public final class h extends pf.c {
    public ba0 d;
    public final Layout e;
    public final ClickableSpan f22308f;
    public final float f22309g;
    public final j h;

    public h(j jVar, Layout layout, ClickableSpan clickableSpan, float f7) {
        this.h = jVar;
        this.e = layout;
        this.f22308f = clickableSpan;
        this.f22309g = f7;
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
        u90 u90Var = jVar.E;
        ba0 ba0Var = jVar.G;
        if (ba0Var != null) {
            u90Var.l(ba0Var, true);
        }
        ba0 i10 = u90.i(this.e, this.f22308f, this.f22309g);
        this.d = i10;
        jVar.G = i10;
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Ld, jVar.I);
        this.d.g(org.telegram.ui.ActionBar.h6.m1(0.8f, w02), org.telegram.ui.ActionBar.h6.m1(1.3f, w02), org.telegram.ui.ActionBar.h6.m1(1.0f, w02), org.telegram.ui.ActionBar.h6.m1(4.0f, w02));
        this.d.f24891x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
        u90Var.b(this.d, null);
    }
}
