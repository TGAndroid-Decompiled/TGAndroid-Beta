package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class a31 extends s4.s0 {
    public final n31 f24281a;

    public a31(n31 n31Var) {
        this.f24281a = n31Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        n31 n31Var = this.f24281a;
        z21 z21Var = n31Var.D1;
        if (i10 == 0) {
            n31Var.C1 = false;
        }
        if ((i10 == 0 || i10 == 2) && n31Var.L0(false) > 0.0f && n31Var.L0(false) < org.telegram.messenger.i0.L(96.0f) && z21Var.canScrollVertically(1) && n31.I0(n31Var)) {
            n31Var.C1 = true;
            z21Var.w0(0, (int) n31Var.L0(false), null);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        float f7;
        n31 n31Var = this.f24281a;
        n31Var.f21587b.invalidate();
        boolean canScrollVertically = n31Var.D1.canScrollVertically(1);
        View view = n31Var.H1;
        Boolean bool = n31Var.N1;
        if (bool != null && bool.booleanValue() == canScrollVertically) {
            return;
        }
        n31Var.N1 = Boolean.valueOf(canScrollVertically);
        view.animate().cancel();
        ViewPropertyAnimator animate = view.animate();
        if (canScrollVertically) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.messenger.a30.m(animate.alpha(f7), gr.h, 320L);
    }
}
