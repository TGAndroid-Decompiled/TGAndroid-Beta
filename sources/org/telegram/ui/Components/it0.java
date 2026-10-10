package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
public final class it0 implements im0 {
    public final ys0 f27456a;
    public final cw0 f27457b;

    public it0(cw0 cw0Var, ys0 ys0Var) {
        this.f27457b = cw0Var;
        this.f27456a = ys0Var;
    }

    @Override
    public final boolean mo17c(float r18, float r19, int r20, android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.it0.mo17c(float, float, int, android.view.View):boolean");
    }

    @Override
    public final void h() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f27457b.f25474v1;
        if (n2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                n2Var.finishPreviewFragment();
            }
        }
    }

    @Override
    public final void q(float f7) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f27457b.f25474v1;
        if (n2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                n2Var.movePreviewFragment(f7);
            }
        }
    }
}
