package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
public final class ws0 implements pl0 {
    public final ms0 f32704a;
    public final qv0 f32705b;

    public ws0(qv0 qv0Var, ms0 ms0Var) {
        this.f32705b = qv0Var;
        this.f32704a = ms0Var;
    }

    @Override
    public final boolean mo18c(float r18, float r19, int r20, android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ws0.mo18c(float, float, int, android.view.View):boolean");
    }

    @Override
    public final void i() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f32705b.f30263v1;
        if (n2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                n2Var.finishPreviewFragment();
            }
        }
    }

    @Override
    public final void q(float f7) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f32705b.f30263v1;
        if (n2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                n2Var.movePreviewFragment(f7);
            }
        }
    }
}
