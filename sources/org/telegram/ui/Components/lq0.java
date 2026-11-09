package org.telegram.ui.Components;

import android.graphics.Point;
public final class lq0 implements fj0 {
    public final aq0 f35800a;
    public final zs0 f35801b;

    public lq0(zs0 zs0Var, aq0 aq0Var) {
        this.f35801b = zs0Var;
        this.f35800a = aq0Var;
    }

    @Override
    public final boolean mo19f(float r18, float r19, int r20, android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lq0.mo19f(float, float, int, android.view.View):boolean");
    }

    @Override
    public final void i() {
        org.telegram.ui.ActionBar.f2 f2Var = this.f35801b.f41127x1;
        if (f2Var != null) {
            Point point = org.telegram.messenger.g0.f22563q;
            if (point.x > point.y) {
                f2Var.finishPreviewFragment();
            }
        }
    }

    @Override
    public final void q(float f10) {
        org.telegram.ui.ActionBar.f2 f2Var = this.f35801b.f41127x1;
        if (f2Var != null) {
            Point point = org.telegram.messenger.g0.f22563q;
            if (point.x > point.y) {
                f2Var.movePreviewFragment(f10);
            }
        }
    }
}
