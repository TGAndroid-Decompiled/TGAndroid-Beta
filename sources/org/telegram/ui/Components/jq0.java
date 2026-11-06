package org.telegram.ui.Components;

import android.graphics.Point;
public final class jq0 implements ej0 {
    public final zp0 f35045a;
    public final xs0 f35046b;

    public jq0(xs0 xs0Var, zp0 zp0Var) {
        this.f35046b = xs0Var;
        this.f35045a = zp0Var;
    }

    @Override
    public final boolean mo19f(float r18, float r19, int r20, android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jq0.mo19f(float, float, int, android.view.View):boolean");
    }

    @Override
    public final void i() {
        org.telegram.ui.ActionBar.f2 f2Var = this.f35046b.f40440x1;
        if (f2Var != null) {
            Point point = org.telegram.messenger.g0.f22544q;
            if (point.x > point.y) {
                f2Var.finishPreviewFragment();
            }
        }
    }

    @Override
    public final void q(float f10) {
        org.telegram.ui.ActionBar.f2 f2Var = this.f35046b.f40440x1;
        if (f2Var != null) {
            Point point = org.telegram.messenger.g0.f22544q;
            if (point.x > point.y) {
                f2Var.movePreviewFragment(f10);
            }
        }
    }
}
