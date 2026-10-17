package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class d41 extends s4.r0 {
    public final r41 f25480a;

    public d41(r41 r41Var) {
        this.f25480a = r41Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        r41 r41Var = this.f25480a;
        c41 c41Var = r41Var.H;
        if (i10 == 0) {
            r41Var.G = false;
        }
        if ((i10 == 0 || i10 == 2) && r41Var.B(false) > 0.0f && r41Var.B(false) < AndroidUtilities.dp(96.0f) && c41Var.canScrollVertically(1) && r41.w(r41Var)) {
            r41Var.G = true;
            c41Var.v0(0, (int) r41Var.B(false), null);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        float f7;
        r41 r41Var = this.f25480a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) r41Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = r41Var.H.canScrollVertically(1);
        View view = r41Var.L;
        Boolean bool = r41Var.Q;
        if (bool != null && bool.booleanValue() == canScrollVertically) {
            return;
        }
        r41Var.Q = Boolean.valueOf(canScrollVertically);
        view.animate().cancel();
        ViewPropertyAnimator animate = view.animate();
        if (canScrollVertically) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.messenger.wh.t(animate.alpha(f7), bs.h, 320L);
    }
}
