package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
public final class kt0 implements cm0 {
    public final at0 f29981a;
    public final aw0 f29982b;

    public kt0(aw0 aw0Var, at0 at0Var) {
        this.f29982b = aw0Var;
        this.f29981a = at0Var;
    }

    @Override
    public final boolean mo17e(float r18, float r19, int r20, android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kt0.mo17e(float, float, int, android.view.View):boolean");
    }

    @Override
    public final void g() {
        org.telegram.ui.ActionBar.r2 r2Var = this.f29982b.f26704x1;
        if (r2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                r2Var.finishPreviewFragment();
            }
        }
    }

    @Override
    public final void o(float f7) {
        org.telegram.ui.ActionBar.r2 r2Var = this.f29982b.f26704x1;
        if (r2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                r2Var.movePreviewFragment(f7);
            }
        }
    }
}
