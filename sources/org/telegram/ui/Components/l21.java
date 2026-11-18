package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class l21 extends v4.u0 {
    public final y21 f36989a;

    public l21(y21 y21Var) {
        this.f36989a = y21Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        y21 y21Var = this.f36989a;
        k21 k21Var = y21Var.H1;
        if (i7 == 0) {
            y21Var.G1 = false;
        }
        if ((i7 == 0 || i7 == 2) && y21Var.M0(false) > 0.0f && y21Var.M0(false) < org.telegram.messenger.g0.L(96.0f) && k21Var.canScrollVertically(1) && y21.J0(y21Var)) {
            y21Var.G1 = true;
            k21Var.w0(0, (int) y21Var.M0(false), null);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        float f10;
        y21 y21Var = this.f36989a;
        y21Var.f30190b.invalidate();
        boolean canScrollVertically = y21Var.H1.canScrollVertically(1);
        View view = y21Var.L1;
        Boolean bool = y21Var.R1;
        if (bool != null && bool.booleanValue() == canScrollVertically) {
            return;
        }
        y21Var.R1 = Boolean.valueOf(canScrollVertically);
        view.animate().cancel();
        ViewPropertyAnimator animate = view.animate();
        if (canScrollVertically) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.messenger.n10.o(animate.alpha(f10), lr.h, 320L);
    }
}
