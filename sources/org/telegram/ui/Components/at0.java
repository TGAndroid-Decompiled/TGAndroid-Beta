package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
public final class at0 implements am0 {
    public final qs0 f24719a;
    public final uv0 f24720b;

    public at0(uv0 uv0Var, qs0 qs0Var) {
        this.f24720b = uv0Var;
        this.f24719a = qs0Var;
    }

    @Override
    public final boolean mo17d(float r18, float r19, int r20, android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.at0.mo17d(float, float, int, android.view.View):boolean");
    }

    @Override
    public final void h() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f24720b.f31071v1;
        if (n2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                n2Var.finishPreviewFragment();
            }
        }
    }

    @Override
    public final void o(float f7) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f24720b.f31071v1;
        if (n2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                n2Var.movePreviewFragment(f7);
            }
        }
    }
}
