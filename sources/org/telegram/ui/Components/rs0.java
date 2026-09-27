package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
public final class rs0 implements pl0 {
    public final hs0 f28085a;
    public final lv0 f28086b;

    public rs0(lv0 lv0Var, hs0 hs0Var) {
        this.f28086b = lv0Var;
        this.f28085a = hs0Var;
    }

    @Override
    public final boolean mo18c(float r18, float r19, int r20, android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rs0.mo18c(float, float, int, android.view.View):boolean");
    }

    @Override
    public final void g() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f28086b.f26212v1;
        if (o2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                o2Var.finishPreviewFragment();
            }
        }
    }

    @Override
    public final void q(float f7) {
        org.telegram.ui.ActionBar.o2 o2Var = this.f28086b.f26212v1;
        if (o2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                o2Var.movePreviewFragment(f7);
            }
        }
    }
}
