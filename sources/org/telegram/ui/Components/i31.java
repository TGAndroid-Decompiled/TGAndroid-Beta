package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class i31 extends f2.a1 {
    public final v31 f27712a;

    public i31(v31 v31Var) {
        this.f27712a = v31Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        v31 v31Var = this.f27712a;
        h31 h31Var = v31Var.E;
        if (i10 == 0) {
            v31Var.D = false;
        }
        if ((i10 == 0 || i10 == 2) && v31Var.A(false) > 0.0f && v31Var.A(false) < AndroidUtilities.dp(96.0f) && h31Var.canScrollVertically(1) && v31.u(v31Var)) {
            v31Var.D = true;
            h31Var.v0(0, (int) v31Var.A(false), null);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        float f10;
        v31 v31Var = this.f27712a;
        viewGroup = ((org.telegram.ui.ActionBar.h3) v31Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = v31Var.E.canScrollVertically(1);
        View view = v31Var.I;
        Boolean bool = v31Var.N;
        if (bool != null && bool.booleanValue() == canScrollVertically) {
            return;
        }
        v31Var.N = Boolean.valueOf(canScrollVertically);
        view.animate().cancel();
        ViewPropertyAnimator animate = view.animate();
        if (canScrollVertically) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.b.p(animate.alpha(f10), pr.h, 320L);
    }
}
