package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.R;
public final class x7 extends s4.w {
    public final l8 d;

    public x7(l8 l8Var) {
        this.d = l8Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        View view = d1Var.f47748a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.d1 d1Var) {
        if (d1Var.f47752f != 0) {
            return 0;
        }
        return s4.w.l(3, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2) {
        int b10 = d1Var.b();
        int b11 = d1Var2.b();
        l8 l8Var = this.d;
        if (l8Var.f28223v0) {
            if (b10 > 0 && b11 > 0) {
                l8Var.f28225w0.move(b10 - 1, b11 - 1);
            } else {
                return false;
            }
        } else {
            l8Var.f28225w0.move(b10, b11);
        }
        l8Var.f28227x0.clear();
        l8Var.f28227x0.addAll(l8Var.f28225w0.list);
        l8Var.f28219s.p(b10, b11);
        return true;
    }

    @Override
    public final void p(s4.d1 d1Var, int i10) {
        Boolean bool;
        w7 w7Var = this.d.f28212n;
        if (d1Var != null) {
            w7Var.d1(false);
        }
        if (i10 != 0) {
            w7Var.I0(false);
            if (d1Var != null) {
                d1Var.f47748a.setPressed(true);
            }
        }
        if (d1Var != null) {
            View view = d1Var.f47748a;
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
    public final void q(s4.d1 d1Var) {
    }
}
