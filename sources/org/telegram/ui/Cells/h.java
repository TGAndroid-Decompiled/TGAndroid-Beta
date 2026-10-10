package org.telegram.ui.Cells;

import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.ja0;
public final class h extends of.e {
    public ja0 d;
    public final Layout f22179e;
    public final ClickableSpan f22180f;
    public final float f22181g;
    public final j h;

    public h(j jVar, Layout layout, ClickableSpan clickableSpan, float f7) {
        this.h = jVar;
        this.f22179e = layout;
        this.f22180f = clickableSpan;
        this.f22181g = f7;
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
        ca0 ca0Var = jVar.E;
        ja0 ja0Var = jVar.G;
        if (ja0Var != null) {
            ca0Var.l(ja0Var, true);
        }
        ja0 i10 = ca0.i(this.f22179e, this.f22180f, this.f22181g);
        this.d = i10;
        jVar.G = i10;
        int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Ld, jVar.I);
        this.d.g(org.telegram.ui.ActionBar.i6.m1(0.8f, w02), org.telegram.ui.ActionBar.i6.m1(1.3f, w02), org.telegram.ui.ActionBar.i6.m1(1.0f, w02), org.telegram.ui.ActionBar.i6.m1(4.0f, w02));
        this.d.f27651x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
        ca0Var.b(this.d, null);
    }
}
