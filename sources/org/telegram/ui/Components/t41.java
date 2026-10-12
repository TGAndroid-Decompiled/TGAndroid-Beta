package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class t41 extends s4.t0 {
    public final g51 f30765a;

    public t41(g51 g51Var) {
        this.f30765a = g51Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        g51 g51Var = this.f30765a;
        s41 s41Var = g51Var.H;
        if (i10 == 0) {
            g51Var.G = false;
        }
        if ((i10 == 0 || i10 == 2) && g51Var.B(false) > 0.0f && g51Var.B(false) < AndroidUtilities.dp(96.0f) && s41Var.canScrollVertically(1) && g51.w(g51Var)) {
            g51Var.G = true;
            s41Var.v0(0, (int) g51Var.B(false), null);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        float f7;
        g51 g51Var = this.f30765a;
        viewGroup = ((org.telegram.ui.ActionBar.e3) g51Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = g51Var.H.canScrollVertically(1);
        View view = g51Var.L;
        Boolean bool = g51Var.Q;
        if (bool != null && bool.booleanValue() == canScrollVertically) {
            return;
        }
        g51Var.Q = Boolean.valueOf(canScrollVertically);
        view.animate().cancel();
        ViewPropertyAnimator animate = view.animate();
        if (canScrollVertically) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.messenger.am.t(animate.alpha(f7), js.h, 320L);
    }
}
