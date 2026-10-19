package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
public final class zs0 implements zl0 {
    public final ps0 f33037a;
    public final tv0 f33038b;

    public zs0(tv0 tv0Var, ps0 ps0Var) {
        this.f33038b = tv0Var;
        this.f33037a = ps0Var;
    }

    @Override
    public final boolean mo17d(float r18, float r19, int r20, android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zs0.mo17d(float, float, int, android.view.View):boolean");
    }

    @Override
    public final void h() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f33038b.f30734v1;
        if (n2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                n2Var.finishPreviewFragment();
            }
        }
    }

    @Override
    public final void o(float f7) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f33038b.f30734v1;
        if (n2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                n2Var.movePreviewFragment(f7);
            }
        }
    }
}
