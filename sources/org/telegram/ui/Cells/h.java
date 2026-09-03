package org.telegram.ui.Cells;

import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.j90;
public final class h extends ze.c {
    public j90 d;
    public final Layout e;
    public final ClickableSpan f21117f;
    public final float f21118g;
    public final j h;

    public h(j jVar, Layout layout, ClickableSpan clickableSpan, float f10) {
        this.h = jVar;
        this.e = layout;
        this.f21117f = clickableSpan;
        this.f21118g = f10;
    }

    @Override
    public final void c(boolean z4) {
        long j10;
        g gVar = new g(this, 0);
        if (z4) {
            j10 = 0;
        } else {
            j10 = 350;
        }
        AndroidUtilities.runOnUIThread(gVar, j10);
    }

    @Override
    public final void d() {
        j jVar = this.h;
        c90 c90Var = jVar.B;
        j90 j90Var = jVar.D;
        if (j90Var != null) {
            c90Var.l(j90Var, true);
        }
        j90 i10 = c90.i(this.e, this.f21117f, this.f21118g);
        this.d = i10;
        jVar.D = i10;
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ld, jVar.F);
        this.d.f(org.telegram.ui.ActionBar.j6.l1(0.8f, v02), org.telegram.ui.ActionBar.j6.l1(1.3f, v02), org.telegram.ui.ActionBar.j6.l1(1.0f, v02), org.telegram.ui.ActionBar.j6.l1(4.0f, v02));
        this.d.f25922w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
        c90Var.b(this.d, null);
    }
}
