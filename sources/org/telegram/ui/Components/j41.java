package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class j41 extends s4.r0 {
    public final y41 f27515a;

    public j41(y41 y41Var) {
        this.f27515a = y41Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        y41 y41Var = this.f27515a;
        i41 i41Var = y41Var.M;
        if (i10 == 0) {
            y41Var.L = false;
        }
        if ((i10 == 0 || i10 == 2) && y41Var.K(false) > 0.0f && y41Var.K(false) < AndroidUtilities.dp(96.0f) && i41Var.canScrollVertically(1) && y41.E(y41Var)) {
            y41Var.L = true;
            i41Var.v0(0, (int) y41Var.K(false), null);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        float f7;
        y41 y41Var = this.f27515a;
        viewGroup = ((org.telegram.ui.ActionBar.h3) y41Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = y41Var.M.canScrollVertically(1);
        View view = y41Var.Q;
        Boolean bool = y41Var.W;
        if (bool != null && bool.booleanValue() == canScrollVertically) {
            return;
        }
        y41Var.W = Boolean.valueOf(canScrollVertically);
        view.animate().cancel();
        ViewPropertyAnimator animate = view.animate();
        if (canScrollVertically) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.messenger.sl.t(animate.alpha(f7), bs.h, 320L);
    }
}
