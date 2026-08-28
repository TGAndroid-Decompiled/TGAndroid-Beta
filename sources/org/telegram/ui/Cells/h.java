package org.telegram.ui.Cells;

import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.p80;
public final class h extends ve.d {
    public p80 d;
    public final Layout f24410e;
    public final ClickableSpan f24411f;
    public final float f24412g;
    public final j h;

    public h(j jVar, Layout layout, ClickableSpan clickableSpan, float f10) {
        this.h = jVar;
        this.f24410e = layout;
        this.f24411f = clickableSpan;
        this.f24412g = f10;
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
        i80 i80Var = jVar.A;
        p80 p80Var = jVar.C;
        if (p80Var != null) {
            i80Var.l(p80Var, true);
        }
        p80 i9 = i80.i(this.f24410e, this.f24411f, this.f24412g);
        this.d = i9;
        jVar.C = i9;
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Ld, jVar.E);
        this.d.f(org.telegram.ui.ActionBar.f6.l1(0.8f, v02), org.telegram.ui.ActionBar.f6.l1(1.3f, v02), org.telegram.ui.ActionBar.f6.l1(1.0f, v02), org.telegram.ui.ActionBar.f6.l1(4.0f, v02));
        this.d.f31590w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
        i80Var.b(this.d, null);
    }
}
