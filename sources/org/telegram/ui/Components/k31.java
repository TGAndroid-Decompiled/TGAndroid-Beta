package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class k31 extends s4.s0 {
    public final w31 f25555a;

    public k31(w31 w31Var) {
        this.f25555a = w31Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        w31 w31Var = this.f25555a;
        j31 j31Var = w31Var.H;
        if (i10 == 0) {
            w31Var.G = false;
        }
        if ((i10 == 0 || i10 == 2) && w31Var.z(false) > 0.0f && w31Var.z(false) < AndroidUtilities.dp(96.0f) && j31Var.canScrollVertically(1) && w31.u(w31Var)) {
            w31Var.G = true;
            j31Var.w0(0, (int) w31Var.z(false), null);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        float f7;
        w31 w31Var = this.f25555a;
        viewGroup = ((org.telegram.ui.ActionBar.g3) w31Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = w31Var.H.canScrollVertically(1);
        View view = w31Var.L;
        Boolean bool = w31Var.Q;
        if (bool != null && bool.booleanValue() == canScrollVertically) {
            return;
        }
        w31Var.Q = Boolean.valueOf(canScrollVertically);
        view.animate().cancel();
        ViewPropertyAnimator animate = view.animate();
        if (canScrollVertically) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.messenger.wl.q(animate.alpha(f7), qr.h, 320L);
    }
}
