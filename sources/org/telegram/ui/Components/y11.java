package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class y11 extends v4.s0 {
    public final l21 f40545a;

    public y11(l21 l21Var) {
        this.f40545a = l21Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        l21 l21Var = this.f40545a;
        x11 x11Var = l21Var.D1;
        if (i7 == 0) {
            l21Var.C1 = false;
        }
        if ((i7 == 0 || i7 == 2) && l21Var.L0(false) > 0.0f && l21Var.L0(false) < org.telegram.messenger.g0.L(96.0f) && x11Var.canScrollVertically(1) && l21.I0(l21Var)) {
            l21Var.C1 = true;
            x11Var.w0(0, (int) l21Var.L0(false), null);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        float f10;
        l21 l21Var = this.f40545a;
        l21Var.f28624b.invalidate();
        boolean canScrollVertically = l21Var.D1.canScrollVertically(1);
        View view = l21Var.H1;
        Boolean bool = l21Var.N1;
        if (bool != null && bool.booleanValue() == canScrollVertically) {
            return;
        }
        l21Var.N1 = Boolean.valueOf(canScrollVertically);
        view.animate().cancel();
        ViewPropertyAnimator animate = view.animate();
        if (canScrollVertically) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.messenger.camera.q.l(animate.alpha(f10), xq.h, 320L);
    }
}
