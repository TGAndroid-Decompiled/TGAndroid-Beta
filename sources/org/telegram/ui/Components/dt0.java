package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
public final class dt0 implements dm0 {
    public final ts0 f24184a;
    public final xv0 f24185b;

    public dt0(xv0 xv0Var, ts0 ts0Var) {
        this.f24185b = xv0Var;
        this.f24184a = ts0Var;
    }

    @Override
    public final boolean mo17d(float r18, float r19, int r20, android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dt0.mo17d(float, float, int, android.view.View):boolean");
    }

    @Override
    public final void h() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f24185b.f31069v1;
        if (m2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                m2Var.finishPreviewFragment();
            }
        }
    }

    @Override
    public final void q(float f7) {
        org.telegram.ui.ActionBar.m2 m2Var = this.f24185b.f31069v1;
        if (m2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                m2Var.movePreviewFragment(f7);
            }
        }
    }
}
