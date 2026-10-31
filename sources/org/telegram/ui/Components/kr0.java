package org.telegram.ui.Components;

import android.graphics.Point;
public final class kr0 implements jk0 {
    public final ar0 f27895a;
    public final zt0 f27896b;

    public kr0(zt0 zt0Var, ar0 ar0Var) {
        this.f27896b = zt0Var;
        this.f27895a = ar0Var;
    }

    @Override
    public final boolean mo16b(float r18, float r19, int r20, android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kr0.mo16b(float, float, int, android.view.View):boolean");
    }

    @Override
    public final void g() {
        org.telegram.ui.ActionBar.k2 k2Var = this.f27896b.f33240x1;
        if (k2Var != null) {
            Point point = org.telegram.messenger.i0.f16026q;
            if (point.x > point.y) {
                k2Var.finishPreviewFragment();
            }
        }
    }

    @Override
    public final void p(float f7) {
        org.telegram.ui.ActionBar.k2 k2Var = this.f27896b.f33240x1;
        if (k2Var != null) {
            Point point = org.telegram.messenger.i0.f16026q;
            if (point.x > point.y) {
                k2Var.movePreviewFragment(f7);
            }
        }
    }
}
