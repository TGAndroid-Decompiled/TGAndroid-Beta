package org.telegram.ui.Components;

import android.graphics.Point;
public final class lr0 implements kk0 {
    public final br0 f28253a;
    public final au0 f28254b;

    public lr0(au0 au0Var, br0 br0Var) {
        this.f28254b = au0Var;
        this.f28253a = br0Var;
    }

    @Override
    public final boolean mo16b(float r18, float r19, int r20, android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lr0.mo16b(float, float, int, android.view.View):boolean");
    }

    @Override
    public final void g() {
        org.telegram.ui.ActionBar.k2 k2Var = this.f28254b.f24568x1;
        if (k2Var != null) {
            Point point = org.telegram.messenger.i0.f16172q;
            if (point.x > point.y) {
                k2Var.finishPreviewFragment();
            }
        }
    }

    @Override
    public final void p(float f7) {
        org.telegram.ui.ActionBar.k2 k2Var = this.f28254b.f24568x1;
        if (k2Var != null) {
            Point point = org.telegram.messenger.i0.f16172q;
            if (point.x > point.y) {
                k2Var.movePreviewFragment(f7);
            }
        }
    }
}
