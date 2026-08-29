package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class y21 extends f2.a1 {
    public final k31 f34904a;

    public y21(k31 k31Var) {
        this.f34904a = k31Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        k31 k31Var = this.f34904a;
        x21 x21Var = k31Var.D;
        if (i10 == 0) {
            k31Var.C = false;
        }
        if ((i10 == 0 || i10 == 2) && k31Var.A(false) > 0.0f && k31Var.A(false) < AndroidUtilities.dp(96.0f) && x21Var.canScrollVertically(1) && k31.u(k31Var)) {
            k31Var.C = true;
            x21Var.v0(0, (int) k31Var.A(false), null);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        float f9;
        k31 k31Var = this.f34904a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) k31Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = k31Var.D.canScrollVertically(1);
        View view = k31Var.H;
        Boolean bool = k31Var.M;
        if (bool != null && bool.booleanValue() == canScrollVertically) {
            return;
        }
        k31Var.M = Boolean.valueOf(canScrollVertically);
        view.animate().cancel();
        ViewPropertyAnimator animate = view.animate();
        if (canScrollVertically) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        org.telegram.ui.b.q(animate.alpha(f9), jr.h, 320L);
    }
}
