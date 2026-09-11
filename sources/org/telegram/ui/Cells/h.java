package org.telegram.ui.Cells;

import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.a90;
import org.telegram.ui.Components.h90;
public final class h extends of.e {
    public h90 d;
    public final Layout f21999e;
    public final ClickableSpan f22000f;
    public final float f22001g;
    public final j h;

    public h(j jVar, Layout layout, ClickableSpan clickableSpan, float f7) {
        this.h = jVar;
        this.f21999e = layout;
        this.f22000f = clickableSpan;
        this.f22001g = f7;
    }

    @Override
    public final void c(boolean z10) {
        long j3;
        g gVar = new g(this, 0);
        if (z10) {
            j3 = 0;
        } else {
            j3 = 350;
        }
        AndroidUtilities.runOnUIThread(gVar, j3);
    }

    @Override
    public final void d() {
        j jVar = this.h;
        a90 a90Var = jVar.E;
        h90 h90Var = jVar.G;
        if (h90Var != null) {
            a90Var.l(h90Var, true);
        }
        h90 i10 = a90.i(this.f21999e, this.f22000f, this.f22001g);
        this.d = i10;
        jVar.G = i10;
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ld, jVar.I);
        this.d.f(org.telegram.ui.ActionBar.j6.l1(0.8f, v02), org.telegram.ui.ActionBar.j6.l1(1.3f, v02), org.telegram.ui.ActionBar.j6.l1(1.0f, v02), org.telegram.ui.ActionBar.j6.l1(4.0f, v02));
        this.d.f26690w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
        a90Var.b(this.d, null);
    }
}
