package org.telegram.ui.Components;

import android.graphics.Point;
public final class tq0 implements rj0 {
    public final iq0 f40085a;
    public final gt0 f40086b;

    public tq0(gt0 gt0Var, iq0 iq0Var) {
        this.f40086b = gt0Var;
        this.f40085a = iq0Var;
    }

    @Override
    public final boolean mo23f(float r18, float r19, int r20, android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tq0.mo23f(float, float, int, android.view.View):boolean");
    }

    @Override
    public final void j() {
        org.telegram.ui.ActionBar.h2 h2Var = this.f40086b.f35642y1;
        if (h2Var != null) {
            Point point = org.telegram.messenger.g0.f24121q;
            if (point.x > point.y) {
                h2Var.finishPreviewFragment();
            }
        }
    }

    @Override
    public final void r(float f10) {
        org.telegram.ui.ActionBar.h2 h2Var = this.f40086b.f35642y1;
        if (h2Var != null) {
            Point point = org.telegram.messenger.g0.f24121q;
            if (point.x > point.y) {
                h2Var.movePreviewFragment(f10);
            }
        }
    }
}
