package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
public final class ht0 implements hm0 {
    public final xs0 f27139a;
    public final bw0 f27140b;

    public ht0(bw0 bw0Var, xs0 xs0Var) {
        this.f27140b = bw0Var;
        this.f27139a = xs0Var;
    }

    @Override
    public final boolean mo17c(float r18, float r19, int r20, android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ht0.mo17c(float, float, int, android.view.View):boolean");
    }

    @Override
    public final void h() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f27140b.f25166v1;
        if (n2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                n2Var.finishPreviewFragment();
            }
        }
    }

    @Override
    public final void q(float f7) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f27140b.f25166v1;
        if (n2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                n2Var.movePreviewFragment(f7);
            }
        }
    }
}
