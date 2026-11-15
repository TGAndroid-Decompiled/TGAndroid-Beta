package org.telegram.ui.Components;

import android.graphics.Point;
public final class lq0 implements jj0 {
    public final aq0 f36888a;
    public final ys0 f36889b;

    public lq0(ys0 ys0Var, aq0 aq0Var) {
        this.f36889b = ys0Var;
        this.f36888a = aq0Var;
    }

    @Override
    public final boolean mo0f(float r18, float r19, int r20, android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lq0.mo0f(float, float, int, android.view.View):boolean");
    }

    @Override
    public final void i() {
        org.telegram.ui.ActionBar.e2 e2Var = this.f36889b.f42150y1;
        if (e2Var != null) {
            Point point = org.telegram.messenger.g0.f23609q;
            if (point.x > point.y) {
                e2Var.finishPreviewFragment();
            }
        }
    }

    @Override
    public final void q(float f10) {
        org.telegram.ui.ActionBar.e2 e2Var = this.f36889b.f42150y1;
        if (e2Var != null) {
            Point point = org.telegram.messenger.g0.f23609q;
            if (point.x > point.y) {
                e2Var.movePreviewFragment(f10);
            }
        }
    }
}
