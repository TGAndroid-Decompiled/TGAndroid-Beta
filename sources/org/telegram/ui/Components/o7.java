package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.R;
public final class o7 extends f2.d0 {
    public final c8 d;

    public o7(c8 c8Var) {
        this.d = c8Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.q1 q1Var) {
        super.a(recyclerView, q1Var);
        View view = q1Var.f5501a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.q1 q1Var) {
        if (q1Var.f5505f != 0) {
            return 0;
        }
        return f2.d0.l(3, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.q1 q1Var, f2.q1 q1Var2) {
        int b10 = q1Var.b();
        int b11 = q1Var2.b();
        c8 c8Var = this.d;
        if (c8Var.f27400r0) {
            if (b10 > 0 && b11 > 0) {
                c8Var.f27402s0.move(b10 - 1, b11 - 1);
            } else {
                return false;
            }
        } else {
            c8Var.f27402s0.move(b10, b11);
        }
        c8Var.f27403t0.clear();
        c8Var.f27403t0.addAll(c8Var.f27402s0.list);
        c8Var.f27401s.p(b10, b11);
        return true;
    }

    @Override
    public final void p(f2.q1 q1Var, int i9) {
        Boolean bool;
        n7 n7Var = this.d.f27394n;
        if (q1Var != null) {
            n7Var.d1(false);
        }
        if (i9 != 0) {
            n7Var.I0(false);
            if (q1Var != null) {
                q1Var.f5501a.setPressed(true);
            }
        }
        if (q1Var != null) {
            View view = q1Var.f5501a;
            int i10 = R.id.dragging;
            if (i9 == 2) {
                bool = Boolean.TRUE;
            } else {
                bool = null;
            }
            view.setTag(i10, bool);
        }
    }

    @Override
    public final void q(f2.q1 q1Var) {
    }
}
