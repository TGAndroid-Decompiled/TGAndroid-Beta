package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class p41 extends s4.t0 {
    public final c51 f29694a;

    public p41(c51 c51Var) {
        this.f29694a = c51Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        c51 c51Var = this.f29694a;
        o41 o41Var = c51Var.H;
        if (i10 == 0) {
            c51Var.G = false;
        }
        if ((i10 == 0 || i10 == 2) && c51Var.C(false) > 0.0f && c51Var.C(false) < AndroidUtilities.dp(96.0f) && o41Var.canScrollVertically(1) && c51.w(c51Var)) {
            c51Var.G = true;
            o41Var.v0(0, (int) c51Var.C(false), null);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        float f7;
        c51 c51Var = this.f29694a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) c51Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = c51Var.H.canScrollVertically(1);
        View view = c51Var.L;
        Boolean bool = c51Var.Q;
        if (bool != null && bool.booleanValue() == canScrollVertically) {
            return;
        }
        c51Var.Q = Boolean.valueOf(canScrollVertically);
        view.animate().cancel();
        ViewPropertyAnimator animate = view.animate();
        if (canScrollVertically) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.messenger.bi.t(animate.alpha(f7), is.h, 320L);
    }
}
