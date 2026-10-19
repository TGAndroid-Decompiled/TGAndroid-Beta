package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class e41 extends s4.r0 {
    public final s41 f25776a;

    public e41(s41 s41Var) {
        this.f25776a = s41Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        s41 s41Var = this.f25776a;
        d41 d41Var = s41Var.H;
        if (i10 == 0) {
            s41Var.G = false;
        }
        if ((i10 == 0 || i10 == 2) && s41Var.B(false) > 0.0f && s41Var.B(false) < AndroidUtilities.dp(96.0f) && d41Var.canScrollVertically(1) && s41.w(s41Var)) {
            s41Var.G = true;
            d41Var.v0(0, (int) s41Var.B(false), null);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        float f7;
        s41 s41Var = this.f25776a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) s41Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = s41Var.H.canScrollVertically(1);
        View view = s41Var.L;
        Boolean bool = s41Var.Q;
        if (bool != null && bool.booleanValue() == canScrollVertically) {
            return;
        }
        s41Var.Q = Boolean.valueOf(canScrollVertically);
        view.animate().cancel();
        ViewPropertyAnimator animate = view.animate();
        if (canScrollVertically) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.messenger.lk.t(animate.alpha(f7), bs.h, 320L);
    }
}
