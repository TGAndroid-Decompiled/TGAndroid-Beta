package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class j31 extends f2.a1 {
    public final w31 f27985a;

    public j31(w31 w31Var) {
        this.f27985a = w31Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        w31 w31Var = this.f27985a;
        i31 i31Var = w31Var.E;
        if (i10 == 0) {
            w31Var.D = false;
        }
        if ((i10 == 0 || i10 == 2) && w31Var.A(false) > 0.0f && w31Var.A(false) < AndroidUtilities.dp(96.0f) && i31Var.canScrollVertically(1) && w31.u(w31Var)) {
            w31Var.D = true;
            i31Var.v0(0, (int) w31Var.A(false), null);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        float f10;
        w31 w31Var = this.f27985a;
        viewGroup = ((org.telegram.ui.ActionBar.h3) w31Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = w31Var.E.canScrollVertically(1);
        View view = w31Var.I;
        Boolean bool = w31Var.N;
        if (bool != null && bool.booleanValue() == canScrollVertically) {
            return;
        }
        w31Var.N = Boolean.valueOf(canScrollVertically);
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
