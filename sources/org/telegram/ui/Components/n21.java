package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class n21 extends f2.d1 {
    public final z21 f31006a;

    public n21(z21 z21Var) {
        this.f31006a = z21Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i9) {
        z21 z21Var = this.f31006a;
        m21 m21Var = z21Var.D;
        if (i9 == 0) {
            z21Var.C = false;
        }
        if ((i9 == 0 || i9 == 2) && z21Var.z(false) > 0.0f && z21Var.z(false) < AndroidUtilities.dp(96.0f) && m21Var.canScrollVertically(1) && z21.u(z21Var)) {
            z21Var.C = true;
            m21Var.v0(0, (int) z21Var.z(false), null);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        ViewGroup viewGroup;
        float f10;
        z21 z21Var = this.f31006a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) z21Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = z21Var.D.canScrollVertically(1);
        View view = z21Var.H;
        Boolean bool = z21Var.M;
        if (bool != null && bool.booleanValue() == canScrollVertically) {
            return;
        }
        z21Var.M = Boolean.valueOf(canScrollVertically);
        view.animate().cancel();
        ViewPropertyAnimator animate = view.animate();
        if (canScrollVertically) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.messenger.ll.r(animate.alpha(f10), gr.h, 320L);
    }
}
