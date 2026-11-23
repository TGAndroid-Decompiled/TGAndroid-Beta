package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class o21 extends v4.u0 {
    public final b31 f38066a;

    public o21(b31 b31Var) {
        this.f38066a = b31Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        b31 b31Var = this.f38066a;
        n21 n21Var = b31Var.H1;
        if (i7 == 0) {
            b31Var.G1 = false;
        }
        if ((i7 == 0 || i7 == 2) && b31Var.M0(false) > 0.0f && b31Var.M0(false) < org.telegram.messenger.g0.L(96.0f) && n21Var.canScrollVertically(1) && b31.J0(b31Var)) {
            b31Var.G1 = true;
            n21Var.w0(0, (int) b31Var.M0(false), null);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        float f10;
        b31 b31Var = this.f38066a;
        b31Var.f30176b.invalidate();
        boolean canScrollVertically = b31Var.H1.canScrollVertically(1);
        View view = b31Var.L1;
        Boolean bool = b31Var.R1;
        if (bool != null && bool.booleanValue() == canScrollVertically) {
            return;
        }
        b31Var.R1 = Boolean.valueOf(canScrollVertically);
        view.animate().cancel();
        ViewPropertyAnimator animate = view.animate();
        if (canScrollVertically) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.messenger.o10.o(animate.alpha(f10), nr.h, 320L);
    }
}
