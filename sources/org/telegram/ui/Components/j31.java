package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class j31 extends s4.s0 {
    public final v31 f25216a;

    public j31(v31 v31Var) {
        this.f25216a = v31Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        v31 v31Var = this.f25216a;
        i31 i31Var = v31Var.H;
        if (i10 == 0) {
            v31Var.G = false;
        }
        if ((i10 == 0 || i10 == 2) && v31Var.z(false) > 0.0f && v31Var.z(false) < AndroidUtilities.dp(96.0f) && i31Var.canScrollVertically(1) && v31.u(v31Var)) {
            v31Var.G = true;
            i31Var.v0(0, (int) v31Var.z(false), null);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        float f7;
        v31 v31Var = this.f25216a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) v31Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = v31Var.H.canScrollVertically(1);
        View view = v31Var.L;
        Boolean bool = v31Var.Q;
        if (bool != null && bool.booleanValue() == canScrollVertically) {
            return;
        }
        v31Var.Q = Boolean.valueOf(canScrollVertically);
        view.animate().cancel();
        ViewPropertyAnimator animate = view.animate();
        if (canScrollVertically) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.messenger.vl.r(animate.alpha(f7), qr.h, 320L);
    }
}
