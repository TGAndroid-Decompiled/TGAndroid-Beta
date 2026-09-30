package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
public final class ss0 implements ql0 {
    public final is0 f28342a;
    public final mv0 f28343b;

    public ss0(mv0 mv0Var, is0 is0Var) {
        this.f28343b = mv0Var;
        this.f28342a = is0Var;
    }

    @Override
    public final boolean mo18c(float r18, float r19, int r20, android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ss0.mo18c(float, float, int, android.view.View):boolean");
    }

    @Override
    public final void g() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f28343b.f26449v1;
        if (m2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                m2Var.finishPreviewFragment();
            }
        }
    }

    @Override
    public final void q(float f7) {
        org.telegram.ui.ActionBar.m2 m2Var = this.f28343b.f26449v1;
        if (m2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                m2Var.movePreviewFragment(f7);
            }
        }
    }
}
