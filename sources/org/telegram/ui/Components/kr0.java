package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
public final class kr0 implements pk0 {
    public final ar0 f30233a;
    public final eu0 f30234b;

    public kr0(eu0 eu0Var, ar0 ar0Var) {
        this.f30234b = eu0Var;
        this.f30233a = ar0Var;
    }

    @Override
    public final boolean mo5c(float r18, float r19, int r20, android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kr0.mo5c(float, float, int, android.view.View):boolean");
    }

    @Override
    public final void j() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f30234b.f28160r1;
        if (o2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                o2Var.finishPreviewFragment();
            }
        }
    }

    @Override
    public final void u(float f10) {
        org.telegram.ui.ActionBar.o2 o2Var = this.f30234b.f28160r1;
        if (o2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                o2Var.movePreviewFragment(f10);
            }
        }
    }
}
