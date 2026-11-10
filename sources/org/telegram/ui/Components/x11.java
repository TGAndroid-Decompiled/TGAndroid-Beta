package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class x11 extends v4.s0 {
    public final k21 f40133a;

    public x11(k21 k21Var) {
        this.f40133a = k21Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        k21 k21Var = this.f40133a;
        w11 w11Var = k21Var.G1;
        if (i7 == 0) {
            k21Var.F1 = false;
        }
        if ((i7 == 0 || i7 == 2) && k21Var.L0(false) > 0.0f && k21Var.L0(false) < org.telegram.messenger.g0.L(96.0f) && w11Var.canScrollVertically(1) && k21.I0(k21Var)) {
            k21Var.F1 = true;
            w11Var.w0(0, (int) k21Var.L0(false), null);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        float f10;
        k21 k21Var = this.f40133a;
        k21Var.f28672b.invalidate();
        boolean canScrollVertically = k21Var.G1.canScrollVertically(1);
        View view = k21Var.K1;
        Boolean bool = k21Var.Q1;
        if (bool != null && bool.booleanValue() == canScrollVertically) {
            return;
        }
        k21Var.Q1 = Boolean.valueOf(canScrollVertically);
        view.animate().cancel();
        ViewPropertyAnimator animate = view.animate();
        if (canScrollVertically) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.messenger.camera.q.l(animate.alpha(f10), wq.h, 320L);
    }
}
