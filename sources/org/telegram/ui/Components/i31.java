package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class i31 extends s4.s0 {
    public final u31 f26954a;

    public i31(u31 u31Var) {
        this.f26954a = u31Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        u31 u31Var = this.f26954a;
        h31 h31Var = u31Var.H;
        if (i10 == 0) {
            u31Var.G = false;
        }
        if ((i10 == 0 || i10 == 2) && u31Var.A(false) > 0.0f && u31Var.A(false) < AndroidUtilities.dp(96.0f) && h31Var.canScrollVertically(1) && u31.u(u31Var)) {
            u31Var.G = true;
            h31Var.v0(0, (int) u31Var.A(false), null);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        float f7;
        u31 u31Var = this.f26954a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) u31Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = u31Var.H.canScrollVertically(1);
        View view = u31Var.L;
        Boolean bool = u31Var.Q;
        if (bool != null && bool.booleanValue() == canScrollVertically) {
            return;
        }
        u31Var.Q = Boolean.valueOf(canScrollVertically);
        view.animate().cancel();
        ViewPropertyAnimator animate = view.animate();
        if (canScrollVertically) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.messenger.vl.q(animate.alpha(f7), pr.h, 320L);
    }
}
