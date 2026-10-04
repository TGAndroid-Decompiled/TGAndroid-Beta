package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class h41 extends s4.s0 {
    public final t41 f27014a;

    public h41(t41 t41Var) {
        this.f27014a = t41Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        t41 t41Var = this.f27014a;
        g41 g41Var = t41Var.H;
        if (i10 == 0) {
            t41Var.G = false;
        }
        if ((i10 == 0 || i10 == 2) && t41Var.z(false) > 0.0f && t41Var.z(false) < AndroidUtilities.dp(96.0f) && g41Var.canScrollVertically(1) && t41.u(t41Var)) {
            t41Var.G = true;
            g41Var.w0(0, (int) t41Var.z(false), null);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        float f7;
        t41 t41Var = this.f27014a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) t41Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = t41Var.H.canScrollVertically(1);
        View view = t41Var.L;
        Boolean bool = t41Var.Q;
        if (bool != null && bool.booleanValue() == canScrollVertically) {
            return;
        }
        t41Var.Q = Boolean.valueOf(canScrollVertically);
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
