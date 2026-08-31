package org.telegram.ui.Cells;

import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.k90;
public final class h extends af.f {
    public k90 d;
    public final Layout f22862e;
    public final ClickableSpan f22863f;
    public final float f22864g;
    public final j h;

    public h(j jVar, Layout layout, ClickableSpan clickableSpan, float f10) {
        this.h = jVar;
        this.f22862e = layout;
        this.f22863f = clickableSpan;
        this.f22864g = f10;
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
        d90 d90Var = jVar.B;
        k90 k90Var = jVar.D;
        if (k90Var != null) {
            d90Var.l(k90Var, true);
        }
        k90 i10 = d90.i(this.f22862e, this.f22863f, this.f22864g);
        this.d = i10;
        jVar.D = i10;
        int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Ld, jVar.F);
        this.d.f(org.telegram.ui.ActionBar.k6.l1(0.8f, v02), org.telegram.ui.ActionBar.k6.l1(1.3f, v02), org.telegram.ui.ActionBar.k6.l1(1.0f, v02), org.telegram.ui.ActionBar.k6.l1(4.0f, v02));
        this.d.f28347w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
        d90Var.b(this.d, null);
    }
}
