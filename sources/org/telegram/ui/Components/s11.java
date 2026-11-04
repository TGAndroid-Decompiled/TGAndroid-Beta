package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class s11 extends u4.t0 {
    public final f21 f37885a;

    public s11(f21 f21Var) {
        this.f37885a = f21Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i3) {
        f21 f21Var = this.f37885a;
        r11 r11Var = f21Var.E1;
        if (i3 == 0) {
            f21Var.D1 = false;
        }
        if ((i3 == 0 || i3 == 2) && f21Var.L0(false) > 0.0f && f21Var.L0(false) < org.telegram.messenger.g0.L(96.0f) && r11Var.canScrollVertically(1) && f21.I0(f21Var)) {
            f21Var.D1 = true;
            r11Var.w0(0, (int) f21Var.L0(false), null);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        float f10;
        f21 f21Var = this.f37885a;
        f21Var.f28586b.invalidate();
        boolean canScrollVertically = f21Var.E1.canScrollVertically(1);
        View view = f21Var.I1;
        Boolean bool = f21Var.O1;
        if (bool != null && bool.booleanValue() == canScrollVertically) {
            return;
        }
        f21Var.O1 = Boolean.valueOf(canScrollVertically);
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
