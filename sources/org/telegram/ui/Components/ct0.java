package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
public final class ct0 implements cm0 {
    public final ss0 f25469a;
    public final wv0 f25470b;

    public ct0(wv0 wv0Var, ss0 ss0Var) {
        this.f25470b = wv0Var;
        this.f25469a = ss0Var;
    }

    @Override
    public final boolean mo17c(float r18, float r19, int r20, android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ct0.mo17c(float, float, int, android.view.View):boolean");
    }

    @Override
    public final void h() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f25470b.f32410v1;
        if (o2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                o2Var.finishPreviewFragment();
            }
        }
    }

    @Override
    public final void o(float f7) {
        org.telegram.ui.ActionBar.o2 o2Var = this.f25470b.f32410v1;
        if (o2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                o2Var.movePreviewFragment(f7);
            }
        }
    }
}
