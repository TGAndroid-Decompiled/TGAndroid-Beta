package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class o41 extends s4.t0 {
    public final b51 f29385a;

    public o41(b51 b51Var) {
        this.f29385a = b51Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        b51 b51Var = this.f29385a;
        n41 n41Var = b51Var.H;
        if (i10 == 0) {
            b51Var.G = false;
        }
        if ((i10 == 0 || i10 == 2) && b51Var.C(false) > 0.0f && b51Var.C(false) < AndroidUtilities.dp(96.0f) && n41Var.canScrollVertically(1) && b51.w(b51Var)) {
            b51Var.G = true;
            n41Var.v0(0, (int) b51Var.C(false), null);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        float f7;
        b51 b51Var = this.f29385a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) b51Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = b51Var.H.canScrollVertically(1);
        View view = b51Var.L;
        Boolean bool = b51Var.Q;
        if (bool != null && bool.booleanValue() == canScrollVertically) {
            return;
        }
        b51Var.Q = Boolean.valueOf(canScrollVertically);
        view.animate().cancel();
        ViewPropertyAnimator animate = view.animate();
        if (canScrollVertically) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.messenger.bi.t(animate.alpha(f7), hs.h, 320L);
    }
}
