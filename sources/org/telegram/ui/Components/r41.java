package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class r41 extends s4.u0 {
    public final g51 f32119a;

    public r41(g51 g51Var) {
        this.f32119a = g51Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        g51 g51Var = this.f32119a;
        q41 q41Var = g51Var.M;
        if (i10 == 0) {
            g51Var.L = false;
        }
        if ((i10 == 0 || i10 == 2) && g51Var.K(false) > 0.0f && g51Var.K(false) < AndroidUtilities.dp(96.0f) && q41Var.canScrollVertically(1) && g51.F(g51Var)) {
            g51Var.L = true;
            q41Var.w0(0, (int) g51Var.K(false), null);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        float f7;
        g51 g51Var = this.f32119a;
        viewGroup = ((org.telegram.ui.ActionBar.k3) g51Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = g51Var.M.canScrollVertically(1);
        View view = g51Var.Q;
        Boolean bool = g51Var.W;
        if (bool != null && bool.booleanValue() == canScrollVertically) {
            return;
        }
        g51Var.W = Boolean.valueOf(canScrollVertically);
        view.animate().cancel();
        ViewPropertyAnimator animate = view.animate();
        if (canScrollVertically) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.messenger.wh.q(animate.alpha(f7), ds.h, 320L);
    }
}
