package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
public final class ps0 implements ml0 {
    public final fs0 f27440a;
    public final jv0 f27441b;

    public ps0(jv0 jv0Var, fs0 fs0Var) {
        this.f27441b = jv0Var;
        this.f27440a = fs0Var;
    }

    @Override
    public final boolean mo18c(float r18, float r19, int r20, android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ps0.mo18c(float, float, int, android.view.View):boolean");
    }

    @Override
    public final void g() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f27441b.f25528v1;
        if (n2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                n2Var.finishPreviewFragment();
            }
        }
    }

    @Override
    public final void q(float f7) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f27441b.f25528v1;
        if (n2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                n2Var.movePreviewFragment(f7);
            }
        }
    }
}
