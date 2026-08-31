package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
public final class es0 implements ml0 {
    public final ur0 f26638a;
    public final zu0 f26639b;

    public es0(zu0 zu0Var, ur0 ur0Var) {
        this.f26639b = zu0Var;
        this.f26638a = ur0Var;
    }

    @Override
    public final boolean mo17c(float r18, float r19, int r20, android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.es0.mo17c(float, float, int, android.view.View):boolean");
    }

    @Override
    public final void h() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f26639b.f34004s1;
        if (p2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                p2Var.finishPreviewFragment();
            }
        }
    }

    @Override
    public final void p(float f10) {
        org.telegram.ui.ActionBar.p2 p2Var = this.f26639b.f34004s1;
        if (p2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                p2Var.movePreviewFragment(f10);
            }
        }
    }
}
