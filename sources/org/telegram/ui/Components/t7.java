package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.R;
public final class t7 extends f2.b0 {
    public final g8 d;

    public t7(g8 g8Var) {
        this.d = g8Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.n1 n1Var) {
        super.a(recyclerView, n1Var);
        View view = n1Var.f6432a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.n1 n1Var) {
        if (n1Var.f6436f != 0) {
            return 0;
        }
        return f2.b0.l(3, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.n1 n1Var, f2.n1 n1Var2) {
        int b10 = n1Var.b();
        int b11 = n1Var2.b();
        g8 g8Var = this.d;
        if (g8Var.f28798r0) {
            if (b10 > 0 && b11 > 0) {
                g8Var.f28800s0.move(b10 - 1, b11 - 1);
            } else {
                return false;
            }
        } else {
            g8Var.f28800s0.move(b10, b11);
        }
        g8Var.f28801t0.clear();
        g8Var.f28801t0.addAll(g8Var.f28800s0.list);
        g8Var.f28799s.p(b10, b11);
        return true;
    }

    @Override
    public final void p(f2.n1 n1Var, int i10) {
        Boolean bool;
        s7 s7Var = this.d.f28792n;
        if (n1Var != null) {
            s7Var.d1(false);
        }
        if (i10 != 0) {
            s7Var.I0(false);
            if (n1Var != null) {
                n1Var.f6432a.setPressed(true);
            }
        }
        if (n1Var != null) {
            View view = n1Var.f6432a;
            int i11 = R.id.dragging;
            if (i10 == 2) {
                bool = Boolean.TRUE;
            } else {
                bool = null;
            }
            view.setTag(i11, bool);
        }
    }

    @Override
    public final void q(f2.n1 n1Var) {
    }
}
