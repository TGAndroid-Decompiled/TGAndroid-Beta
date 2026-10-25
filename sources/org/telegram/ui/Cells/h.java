package org.telegram.ui.Cells;

import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.w90;
import org.telegram.ui.ProfileActivity;
public final class h extends qf.c {
    public da0 d;
    public final Layout e;
    public final ClickableSpan f24185f;
    public final float f24186g;
    public final j h;

    public h(j jVar, Layout layout, ClickableSpan clickableSpan, float f7) {
        this.h = jVar;
        this.e = layout;
        this.f24185f = clickableSpan;
        this.f24186g = f7;
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
        w90 w90Var = jVar.E;
        da0 da0Var = jVar.G;
        if (da0Var != null) {
            w90Var.l(da0Var, true);
        }
        da0 i10 = w90.i(this.e, this.f24185f, this.f24186g);
        this.d = i10;
        jVar.G = i10;
        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Ld, jVar.I);
        int i11 = ProfileActivity.R6;
        this.d.g(org.telegram.ui.ActionBar.y6.o1(0.8f, w02), org.telegram.ui.ActionBar.y6.o1(1.3f, w02), org.telegram.ui.ActionBar.y6.o1(1.0f, w02), org.telegram.ui.ActionBar.y6.o1(4.0f, w02));
        this.d.f27478x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
        w90Var.b(this.d, null);
    }
}
