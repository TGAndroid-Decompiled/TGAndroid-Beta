package org.telegram.ui.Cells;

import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.ia0;
public final class h extends of.e {
    public ia0 d;
    public final Layout f22175e;
    public final ClickableSpan f22176f;
    public final float f22177g;
    public final j h;

    public h(j jVar, Layout layout, ClickableSpan clickableSpan, float f7) {
        this.h = jVar;
        this.f22175e = layout;
        this.f22176f = clickableSpan;
        this.f22177g = f7;
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
        ba0 ba0Var = jVar.E;
        ia0 ia0Var = jVar.G;
        if (ia0Var != null) {
            ba0Var.l(ia0Var, true);
        }
        ia0 i10 = ba0.i(this.f22175e, this.f22176f, this.f22177g);
        this.d = i10;
        jVar.G = i10;
        int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Ld, jVar.I);
        this.d.g(org.telegram.ui.ActionBar.i6.m1(0.8f, w02), org.telegram.ui.ActionBar.i6.m1(1.3f, w02), org.telegram.ui.ActionBar.i6.m1(1.0f, w02), org.telegram.ui.ActionBar.i6.m1(4.0f, w02));
        this.d.f27340x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
        ba0Var.b(this.d, null);
    }
}
