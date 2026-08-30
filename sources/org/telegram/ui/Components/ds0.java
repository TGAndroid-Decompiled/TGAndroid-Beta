package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
public final class ds0 implements ll0 {
    public final tr0 f24362a;
    public final yu0 f24363b;

    public ds0(yu0 yu0Var, tr0 tr0Var) {
        this.f24363b = yu0Var;
        this.f24362a = tr0Var;
    }

    @Override
    public final boolean mo18c(float r18, float r19, int r20, android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ds0.mo18c(float, float, int, android.view.View):boolean");
    }

    @Override
    public final void h() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f24363b.f31144s1;
        if (p2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                p2Var.finishPreviewFragment();
            }
        }
    }

    @Override
    public final void p(float f10) {
        org.telegram.ui.ActionBar.p2 p2Var = this.f24363b.f31144s1;
        if (p2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                p2Var.movePreviewFragment(f10);
            }
        }
    }
}
