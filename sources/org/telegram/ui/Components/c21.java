package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class c21 extends v4.t0 {
    public final p21 f33472a;

    public c21(p21 p21Var) {
        this.f33472a = p21Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        p21 p21Var = this.f33472a;
        b21 b21Var = p21Var.H1;
        if (i7 == 0) {
            p21Var.G1 = false;
        }
        if ((i7 == 0 || i7 == 2) && p21Var.L0(false) > 0.0f && p21Var.L0(false) < org.telegram.messenger.g0.L(96.0f) && b21Var.canScrollVertically(1) && p21.I0(p21Var)) {
            p21Var.G1 = true;
            b21Var.w0(0, (int) p21Var.L0(false), null);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        float f10;
        p21 p21Var = this.f33472a;
        p21Var.f29682b.invalidate();
        boolean canScrollVertically = p21Var.H1.canScrollVertically(1);
        View view = p21Var.L1;
        Boolean bool = p21Var.R1;
        if (bool != null && bool.booleanValue() == canScrollVertically) {
            return;
        }
        p21Var.R1 = Boolean.valueOf(canScrollVertically);
        view.animate().cancel();
        ViewPropertyAnimator animate = view.animate();
        if (canScrollVertically) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.messenger.i20.n(animate.alpha(f10), er.h, 320L);
    }
}
