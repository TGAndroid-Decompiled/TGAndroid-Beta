package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class k41 extends s4.r0 {
    public final x41 f26577a;

    public k41(x41 x41Var) {
        this.f26577a = x41Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        x41 x41Var = this.f26577a;
        j41 j41Var = x41Var.H;
        if (i10 == 0) {
            x41Var.G = false;
        }
        if ((i10 == 0 || i10 == 2) && x41Var.B(false) > 0.0f && x41Var.B(false) < AndroidUtilities.dp(96.0f) && j41Var.canScrollVertically(1) && x41.w(x41Var)) {
            x41Var.G = true;
            j41Var.v0(0, (int) x41Var.B(false), null);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        float f7;
        x41 x41Var = this.f26577a;
        viewGroup = ((org.telegram.ui.ActionBar.e3) x41Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = x41Var.H.canScrollVertically(1);
        View view = x41Var.L;
        Boolean bool = x41Var.Q;
        if (bool != null && bool.booleanValue() == canScrollVertically) {
            return;
        }
        x41Var.Q = Boolean.valueOf(canScrollVertically);
        view.animate().cancel();
        ViewPropertyAnimator animate = view.animate();
        if (canScrollVertically) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.messenger.yh.s(animate.alpha(f7), es.h, 320L);
    }
}
