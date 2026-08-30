package org.telegram.ui.Cells;

import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.i90;
public final class h extends af.f {
    public i90 d;
    public final Layout e;
    public final ClickableSpan f21111f;
    public final float f21112g;
    public final j h;

    public h(j jVar, Layout layout, ClickableSpan clickableSpan, float f10) {
        this.h = jVar;
        this.e = layout;
        this.f21111f = clickableSpan;
        this.f21112g = f10;
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
        b90 b90Var = jVar.B;
        i90 i90Var = jVar.D;
        if (i90Var != null) {
            b90Var.l(i90Var, true);
        }
        i90 i10 = b90.i(this.e, this.f21111f, this.f21112g);
        this.d = i10;
        jVar.D = i10;
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ld, jVar.F);
        this.d.f(org.telegram.ui.ActionBar.j6.l1(0.8f, v02), org.telegram.ui.ActionBar.j6.l1(1.3f, v02), org.telegram.ui.ActionBar.j6.l1(1.0f, v02), org.telegram.ui.ActionBar.j6.l1(4.0f, v02));
        this.d.f25650w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
        b90Var.b(this.d, null);
    }
}
