package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class q41 extends s4.u0 {
    public final f51 f31835a;

    public q41(f51 f51Var) {
        this.f31835a = f51Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        f51 f51Var = this.f31835a;
        p41 p41Var = f51Var.M;
        if (i10 == 0) {
            f51Var.L = false;
        }
        if ((i10 == 0 || i10 == 2) && f51Var.K(false) > 0.0f && f51Var.K(false) < AndroidUtilities.dp(96.0f) && p41Var.canScrollVertically(1) && f51.F(f51Var)) {
            f51Var.L = true;
            p41Var.w0(0, (int) f51Var.K(false), null);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        float f7;
        f51 f51Var = this.f31835a;
        viewGroup = ((org.telegram.ui.ActionBar.k3) f51Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = f51Var.M.canScrollVertically(1);
        View view = f51Var.Q;
        Boolean bool = f51Var.W;
        if (bool != null && bool.booleanValue() == canScrollVertically) {
            return;
        }
        f51Var.W = Boolean.valueOf(canScrollVertically);
        view.animate().cancel();
        ViewPropertyAnimator animate = view.animate();
        if (canScrollVertically) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.messenger.vh.q(animate.alpha(f7), ds.h, 320L);
    }
}
