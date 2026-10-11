package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
public final class jt0 implements jm0 {
    public final zs0 f27752a;
    public final dw0 f27753b;

    public jt0(dw0 dw0Var, zs0 zs0Var) {
        this.f27753b = dw0Var;
        this.f27752a = zs0Var;
    }

    @Override
    public final boolean mo17c(float r18, float r19, int r20, android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jt0.mo17c(float, float, int, android.view.View):boolean");
    }

    @Override
    public final void h() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f27753b.f25735v1;
        if (m2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                m2Var.finishPreviewFragment();
            }
        }
    }

    @Override
    public final void q(float f7) {
        org.telegram.ui.ActionBar.m2 m2Var = this.f27753b.f25735v1;
        if (m2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                m2Var.movePreviewFragment(f7);
            }
        }
    }
}
