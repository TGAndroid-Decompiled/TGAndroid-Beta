package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
public final class ns0 implements ml0 {
    public final ds0 f25582a;
    public final iv0 f25583b;

    public ns0(iv0 iv0Var, ds0 ds0Var) {
        this.f25583b = iv0Var;
        this.f25582a = ds0Var;
    }

    @Override
    public final boolean mo18c(float r18, float r19, int r20, android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ns0.mo18c(float, float, int, android.view.View):boolean");
    }

    @Override
    public final void h() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f25583b.f24131v1;
        if (p2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                p2Var.finishPreviewFragment();
            }
        }
    }

    @Override
    public final void p(float f7) {
        org.telegram.ui.ActionBar.p2 p2Var = this.f25583b.f24131v1;
        if (p2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                p2Var.movePreviewFragment(f7);
            }
        }
    }
}
