package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class z31 extends s4.s0 {
    public final l41 f30814a;

    public z31(l41 l41Var) {
        this.f30814a = l41Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        l41 l41Var = this.f30814a;
        y31 y31Var = l41Var.H;
        if (i10 == 0) {
            l41Var.G = false;
        }
        if ((i10 == 0 || i10 == 2) && l41Var.z(false) > 0.0f && l41Var.z(false) < AndroidUtilities.dp(96.0f) && y31Var.canScrollVertically(1) && l41.u(l41Var)) {
            l41Var.G = true;
            y31Var.w0(0, (int) l41Var.z(false), null);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        float f7;
        l41 l41Var = this.f30814a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) l41Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = l41Var.H.canScrollVertically(1);
        View view = l41Var.L;
        Boolean bool = l41Var.Q;
        if (bool != null && bool.booleanValue() == canScrollVertically) {
            return;
        }
        l41Var.Q = Boolean.valueOf(canScrollVertically);
        view.animate().cancel();
        ViewPropertyAnimator animate = view.animate();
        if (canScrollVertically) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.messenger.rk.s(animate.alpha(f7), qr.h, 320L);
    }
}
