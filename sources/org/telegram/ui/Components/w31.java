package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class w31 extends s4.s0 {
    public final i41 f28654a;

    public w31(i41 i41Var) {
        this.f28654a = i41Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        i41 i41Var = this.f28654a;
        v31 v31Var = i41Var.H;
        if (i10 == 0) {
            i41Var.G = false;
        }
        if ((i10 == 0 || i10 == 2) && i41Var.z(false) > 0.0f && i41Var.z(false) < AndroidUtilities.dp(96.0f) && v31Var.canScrollVertically(1) && i41.u(i41Var)) {
            i41Var.G = true;
            v31Var.v0(0, (int) i41Var.z(false), null);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        float f7;
        i41 i41Var = this.f28654a;
        viewGroup = ((org.telegram.ui.ActionBar.h3) i41Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = i41Var.H.canScrollVertically(1);
        View view = i41Var.L;
        Boolean bool = i41Var.Q;
        if (bool != null && bool.booleanValue() == canScrollVertically) {
            return;
        }
        i41Var.Q = Boolean.valueOf(canScrollVertically);
        view.animate().cancel();
        ViewPropertyAnimator animate = view.animate();
        if (canScrollVertically) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.messenger.em.q(animate.alpha(f7), wr.h, 320L);
    }
}
