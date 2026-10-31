package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class z21 extends s4.s0 {
    public final m31 f32886a;

    public z21(m31 m31Var) {
        this.f32886a = m31Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        m31 m31Var = this.f32886a;
        y21 y21Var = m31Var.D1;
        if (i10 == 0) {
            m31Var.C1 = false;
        }
        if ((i10 == 0 || i10 == 2) && m31Var.L0(false) > 0.0f && m31Var.L0(false) < org.telegram.messenger.i0.L(96.0f) && y21Var.canScrollVertically(1) && m31.I0(m31Var)) {
            m31Var.C1 = true;
            y21Var.w0(0, (int) m31Var.L0(false), null);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        float f7;
        m31 m31Var = this.f32886a;
        m31Var.f21586b.invalidate();
        boolean canScrollVertically = m31Var.D1.canScrollVertically(1);
        View view = m31Var.H1;
        Boolean bool = m31Var.N1;
        if (bool != null && bool.booleanValue() == canScrollVertically) {
            return;
        }
        m31Var.N1 = Boolean.valueOf(canScrollVertically);
        view.animate().cancel();
        ViewPropertyAnimator animate = view.animate();
        if (canScrollVertically) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.messenger.z20.m(animate.alpha(f7), gr.h, 320L);
    }
}
