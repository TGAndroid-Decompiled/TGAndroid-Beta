package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class r11 extends v4.s0 {
    public final e21 f37568a;

    public r11(e21 e21Var) {
        this.f37568a = e21Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        e21 e21Var = this.f37568a;
        q11 q11Var = e21Var.D1;
        if (i7 == 0) {
            e21Var.C1 = false;
        }
        if ((i7 == 0 || i7 == 2) && e21Var.L0(false) > 0.0f && e21Var.L0(false) < org.telegram.messenger.g0.L(96.0f) && q11Var.canScrollVertically(1) && e21.I0(e21Var)) {
            e21Var.C1 = true;
            q11Var.w0(0, (int) e21Var.L0(false), null);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        float f10;
        e21 e21Var = this.f37568a;
        e21Var.f28615b.invalidate();
        boolean canScrollVertically = e21Var.D1.canScrollVertically(1);
        View view = e21Var.H1;
        Boolean bool = e21Var.N1;
        if (bool != null && bool.booleanValue() == canScrollVertically) {
            return;
        }
        e21Var.N1 = Boolean.valueOf(canScrollVertically);
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
