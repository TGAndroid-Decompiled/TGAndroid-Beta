package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
public final class vr0 implements cl0 {
    public final lr0 f34173a;
    public final qu0 f34174b;

    public vr0(qu0 qu0Var, lr0 lr0Var) {
        this.f34174b = qu0Var;
        this.f34173a = lr0Var;
    }

    @Override
    public final boolean mo17b(float r18, float r19, int r20, android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vr0.mo17b(float, float, int, android.view.View):boolean");
    }

    @Override
    public final void h() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f34174b.f32093r1;
        if (o2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                o2Var.finishPreviewFragment();
            }
        }
    }

    @Override
    public final void r(float f9) {
        org.telegram.ui.ActionBar.o2 o2Var = this.f34174b.f32093r1;
        if (o2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                o2Var.movePreviewFragment(f9);
            }
        }
    }
}
