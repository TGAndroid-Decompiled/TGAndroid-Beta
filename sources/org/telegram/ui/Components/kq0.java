package org.telegram.ui.Components;

import android.graphics.Point;
public final class kq0 implements ej0 {
    public final zp0 f35392a;
    public final ys0 f35393b;

    public kq0(ys0 ys0Var, zp0 zp0Var) {
        this.f35393b = ys0Var;
        this.f35392a = zp0Var;
    }

    @Override
    public final boolean mo19f(float r18, float r19, int r20, android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kq0.mo19f(float, float, int, android.view.View):boolean");
    }

    @Override
    public final void i() {
        org.telegram.ui.ActionBar.f2 f2Var = this.f35393b.f40719x1;
        if (f2Var != null) {
            Point point = org.telegram.messenger.g0.f22567q;
            if (point.x > point.y) {
                f2Var.finishPreviewFragment();
            }
        }
    }

    @Override
    public final void q(float f10) {
        org.telegram.ui.ActionBar.f2 f2Var = this.f35393b.f40719x1;
        if (f2Var != null) {
            Point point = org.telegram.messenger.g0.f22567q;
            if (point.x > point.y) {
                f2Var.movePreviewFragment(f10);
            }
        }
    }
}
