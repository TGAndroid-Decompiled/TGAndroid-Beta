package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
public final class ds0 implements cl0 {
    public final tr0 f25464a;
    public final xu0 f25465b;

    public ds0(xu0 xu0Var, tr0 tr0Var) {
        this.f25465b = xu0Var;
        this.f25464a = tr0Var;
    }

    @Override
    public final boolean mo18d(float r18, float r19, int r20, android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ds0.mo18d(float, float, int, android.view.View):boolean");
    }

    @Override
    public final void h() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f25465b.f32726v1;
        if (n2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                n2Var.finishPreviewFragment();
            }
        }
    }

    @Override
    public final void q(float f7) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f25465b.f32726v1;
        if (n2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                n2Var.movePreviewFragment(f7);
            }
        }
    }
}
