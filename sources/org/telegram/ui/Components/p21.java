package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

public final class p21 extends f2.b1 {

    public final b31 f31485a;

    public p21(b31 b31Var) {
        this.f31485a = b31Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        b31 b31Var = this.f31485a;
        o21 o21Var = b31Var.D;
        if (i10 == 0) {
            b31Var.C = false;
        }
        if ((i10 == 0 || i10 == 2) && b31Var.B(false) > 0.0f && b31Var.B(false) < AndroidUtilities.dp(96.0f) && o21Var.canScrollVertically(1) && b31.v(b31Var)) {
            b31Var.C = true;
            o21Var.v0(0, (int) b31Var.B(false), null);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        b31 b31Var = this.f31485a;
        ((org.telegram.ui.ActionBar.e3) b31Var).containerView.invalidate();
        boolean zCanScrollVertically = b31Var.D.canScrollVertically(1);
        View view = b31Var.H;
        Boolean bool = b31Var.M;
        if (bool == null || bool.booleanValue() != zCanScrollVertically) {
            b31Var.M = Boolean.valueOf(zCanScrollVertically);
            view.animate().cancel();
            org.telegram.messenger.rl.o(view.animate().alpha(zCanScrollVertically ? 1.0f : 0.0f), er.h, 320L);
        }
    }
}
