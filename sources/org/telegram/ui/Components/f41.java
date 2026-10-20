package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class f41 extends s4.r0 {
    public final t41 f26076a;

    public f41(t41 t41Var) {
        this.f26076a = t41Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        t41 t41Var = this.f26076a;
        e41 e41Var = t41Var.H;
        if (i10 == 0) {
            t41Var.G = false;
        }
        if ((i10 == 0 || i10 == 2) && t41Var.B(false) > 0.0f && t41Var.B(false) < AndroidUtilities.dp(96.0f) && e41Var.canScrollVertically(1) && t41.w(t41Var)) {
            t41Var.G = true;
            e41Var.v0(0, (int) t41Var.B(false), null);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        float f7;
        t41 t41Var = this.f26076a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) t41Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = t41Var.H.canScrollVertically(1);
        View view = t41Var.L;
        Boolean bool = t41Var.Q;
        if (bool != null && bool.booleanValue() == canScrollVertically) {
            return;
        }
        t41Var.Q = Boolean.valueOf(canScrollVertically);
        view.animate().cancel();
        ViewPropertyAnimator animate = view.animate();
        if (canScrollVertically) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.messenger.mk.t(animate.alpha(f7), bs.h, 320L);
    }
}
