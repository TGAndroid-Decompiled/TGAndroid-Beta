package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class n21 extends v4.u0 {
    public final a31 f37629a;

    public n21(a31 a31Var) {
        this.f37629a = a31Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        a31 a31Var = this.f37629a;
        m21 m21Var = a31Var.H1;
        if (i7 == 0) {
            a31Var.G1 = false;
        }
        if ((i7 == 0 || i7 == 2) && a31Var.M0(false) > 0.0f && a31Var.M0(false) < org.telegram.messenger.g0.L(96.0f) && m21Var.canScrollVertically(1) && a31.J0(a31Var)) {
            a31Var.G1 = true;
            m21Var.w0(0, (int) a31Var.M0(false), null);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        float f10;
        a31 a31Var = this.f37629a;
        a31Var.f30226b.invalidate();
        boolean canScrollVertically = a31Var.H1.canScrollVertically(1);
        View view = a31Var.L1;
        Boolean bool = a31Var.R1;
        if (bool != null && bool.booleanValue() == canScrollVertically) {
            return;
        }
        a31Var.R1 = Boolean.valueOf(canScrollVertically);
        view.animate().cancel();
        ViewPropertyAnimator animate = view.animate();
        if (canScrollVertically) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.messenger.m10.o(animate.alpha(f10), kr.h, 320L);
    }
}
