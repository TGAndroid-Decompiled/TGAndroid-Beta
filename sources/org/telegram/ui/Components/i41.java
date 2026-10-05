package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class i41 extends s4.s0 {
    public final u41 f27401a;

    public i41(u41 u41Var) {
        this.f27401a = u41Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        u41 u41Var = this.f27401a;
        h41 h41Var = u41Var.H;
        if (i10 == 0) {
            u41Var.G = false;
        }
        if ((i10 == 0 || i10 == 2) && u41Var.z(false) > 0.0f && u41Var.z(false) < AndroidUtilities.dp(96.0f) && h41Var.canScrollVertically(1) && u41.u(u41Var)) {
            u41Var.G = true;
            h41Var.w0(0, (int) u41Var.z(false), null);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        float f7;
        u41 u41Var = this.f27401a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) u41Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = u41Var.H.canScrollVertically(1);
        View view = u41Var.L;
        Boolean bool = u41Var.Q;
        if (bool != null && bool.booleanValue() == canScrollVertically) {
            return;
        }
        u41Var.Q = Boolean.valueOf(canScrollVertically);
        view.animate().cancel();
        ViewPropertyAnimator animate = view.animate();
        if (canScrollVertically) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.messenger.bi.r(animate.alpha(f7), tr.h, 320L);
    }
}
