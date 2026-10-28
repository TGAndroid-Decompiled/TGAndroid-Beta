package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
public final class lt0 implements dm0 {
    public final bt0 f30304a;
    public final bw0 f30305b;

    public lt0(bw0 bw0Var, bt0 bt0Var) {
        this.f30305b = bw0Var;
        this.f30304a = bt0Var;
    }

    @Override
    public final boolean mo17e(float r18, float r19, int r20, android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lt0.mo17e(float, float, int, android.view.View):boolean");
    }

    @Override
    public final void g() {
        org.telegram.ui.ActionBar.r2 r2Var = this.f30305b.f26992x1;
        if (r2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                r2Var.finishPreviewFragment();
            }
        }
    }

    @Override
    public final void o(float f7) {
        org.telegram.ui.ActionBar.r2 r2Var = this.f30305b.f26992x1;
        if (r2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                r2Var.movePreviewFragment(f7);
            }
        }
    }
}
