package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class q41 extends s4.t0 {
    public final d51 f29993a;

    public q41(d51 d51Var) {
        this.f29993a = d51Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        d51 d51Var = this.f29993a;
        p41 p41Var = d51Var.H;
        if (i10 == 0) {
            d51Var.G = false;
        }
        if ((i10 == 0 || i10 == 2) && d51Var.C(false) > 0.0f && d51Var.C(false) < AndroidUtilities.dp(96.0f) && p41Var.canScrollVertically(1) && d51.w(d51Var)) {
            d51Var.G = true;
            p41Var.v0(0, (int) d51Var.C(false), null);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        float f7;
        d51 d51Var = this.f29993a;
        viewGroup = ((org.telegram.ui.ActionBar.e3) d51Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = d51Var.H.canScrollVertically(1);
        View view = d51Var.L;
        Boolean bool = d51Var.Q;
        if (bool != null && bool.booleanValue() == canScrollVertically) {
            return;
        }
        d51Var.Q = Boolean.valueOf(canScrollVertically);
        view.animate().cancel();
        ViewPropertyAnimator animate = view.animate();
        if (canScrollVertically) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.messenger.ai.t(animate.alpha(f7), is.h, 320L);
    }
}
