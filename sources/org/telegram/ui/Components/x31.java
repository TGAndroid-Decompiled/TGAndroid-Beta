package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class x31 extends s4.s0 {
    public final j41 f30266a;

    public x31(j41 j41Var) {
        this.f30266a = j41Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        j41 j41Var = this.f30266a;
        w31 w31Var = j41Var.H;
        if (i10 == 0) {
            j41Var.G = false;
        }
        if ((i10 == 0 || i10 == 2) && j41Var.z(false) > 0.0f && j41Var.z(false) < AndroidUtilities.dp(96.0f) && w31Var.canScrollVertically(1) && j41.u(j41Var)) {
            j41Var.G = true;
            w31Var.v0(0, (int) j41Var.z(false), null);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        float f7;
        j41 j41Var = this.f30266a;
        viewGroup = ((org.telegram.ui.ActionBar.e3) j41Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = j41Var.H.canScrollVertically(1);
        View view = j41Var.L;
        Boolean bool = j41Var.Q;
        if (bool != null && bool.booleanValue() == canScrollVertically) {
            return;
        }
        j41Var.Q = Boolean.valueOf(canScrollVertically);
        view.animate().cancel();
        ViewPropertyAnimator animate = view.animate();
        if (canScrollVertically) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.messenger.ok.s(animate.alpha(f7), sr.h, 320L);
    }
}
