package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class y31 extends s4.s0 {
    public final k41 f30471a;

    public y31(k41 k41Var) {
        this.f30471a = k41Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        k41 k41Var = this.f30471a;
        x31 x31Var = k41Var.H;
        if (i10 == 0) {
            k41Var.G = false;
        }
        if ((i10 == 0 || i10 == 2) && k41Var.z(false) > 0.0f && k41Var.z(false) < AndroidUtilities.dp(96.0f) && x31Var.canScrollVertically(1) && k41.u(k41Var)) {
            k41Var.G = true;
            x31Var.w0(0, (int) k41Var.z(false), null);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        float f7;
        k41 k41Var = this.f30471a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) k41Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = k41Var.H.canScrollVertically(1);
        View view = k41Var.L;
        Boolean bool = k41Var.Q;
        if (bool != null && bool.booleanValue() == canScrollVertically) {
            return;
        }
        k41Var.Q = Boolean.valueOf(canScrollVertically);
        view.animate().cancel();
        ViewPropertyAnimator animate = view.animate();
        if (canScrollVertically) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.messenger.wh.r(animate.alpha(f7), qr.h, 320L);
    }
}
