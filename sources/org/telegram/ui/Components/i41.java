package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class i41 extends s4.r0 {
    public final x41 f27290a;

    public i41(x41 x41Var) {
        this.f27290a = x41Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        x41 x41Var = this.f27290a;
        h41 h41Var = x41Var.M;
        if (i10 == 0) {
            x41Var.L = false;
        }
        if ((i10 == 0 || i10 == 2) && x41Var.K(false) > 0.0f && x41Var.K(false) < AndroidUtilities.dp(96.0f) && h41Var.canScrollVertically(1) && x41.E(x41Var)) {
            x41Var.L = true;
            h41Var.v0(0, (int) x41Var.K(false), null);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        float f7;
        x41 x41Var = this.f27290a;
        viewGroup = ((org.telegram.ui.ActionBar.h3) x41Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = x41Var.M.canScrollVertically(1);
        View view = x41Var.Q;
        Boolean bool = x41Var.W;
        if (bool != null && bool.booleanValue() == canScrollVertically) {
            return;
        }
        x41Var.W = Boolean.valueOf(canScrollVertically);
        view.animate().cancel();
        ViewPropertyAnimator animate = view.animate();
        if (canScrollVertically) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.messenger.tl.t(animate.alpha(f7), zr.h, 320L);
    }
}
