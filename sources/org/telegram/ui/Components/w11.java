package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class w11 extends v4.s0 {
    public final j21 f39809a;

    public w11(j21 j21Var) {
        this.f39809a = j21Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        j21 j21Var = this.f39809a;
        v11 v11Var = j21Var.D1;
        if (i7 == 0) {
            j21Var.C1 = false;
        }
        if ((i7 == 0 || i7 == 2) && j21Var.L0(false) > 0.0f && j21Var.L0(false) < org.telegram.messenger.g0.L(96.0f) && v11Var.canScrollVertically(1) && j21.I0(j21Var)) {
            j21Var.C1 = true;
            v11Var.w0(0, (int) j21Var.L0(false), null);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        float f10;
        j21 j21Var = this.f39809a;
        j21Var.f28615b.invalidate();
        boolean canScrollVertically = j21Var.D1.canScrollVertically(1);
        View view = j21Var.H1;
        Boolean bool = j21Var.N1;
        if (bool != null && bool.booleanValue() == canScrollVertically) {
            return;
        }
        j21Var.N1 = Boolean.valueOf(canScrollVertically);
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
