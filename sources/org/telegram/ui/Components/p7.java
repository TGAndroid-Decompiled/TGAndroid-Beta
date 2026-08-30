package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.R;
public final class p7 extends f2.b0 {
    public final c8 d;

    public p7(c8 c8Var) {
        this.d = c8Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.l1 l1Var) {
        super.a(recyclerView, l1Var);
        View view = l1Var.f5785a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.l1 l1Var) {
        if (l1Var.f5788f != 0) {
            return 0;
        }
        return f2.b0.l(3, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.l1 l1Var, f2.l1 l1Var2) {
        int b10 = l1Var.b();
        int b11 = l1Var2.b();
        c8 c8Var = this.d;
        if (c8Var.f23908s0) {
            if (b10 > 0 && b11 > 0) {
                c8Var.f23909t0.move(b10 - 1, b11 - 1);
            } else {
                return false;
            }
        } else {
            c8Var.f23909t0.move(b10, b11);
        }
        c8Var.f23910u0.clear();
        c8Var.f23910u0.addAll(c8Var.f23909t0.list);
        c8Var.f23907s.p(b10, b11);
        return true;
    }

    @Override
    public final void p(f2.l1 l1Var, int i10) {
        Boolean bool;
        o7 o7Var = this.d.f23900n;
        if (l1Var != null) {
            o7Var.d1(false);
        }
        if (i10 != 0) {
            o7Var.I0(false);
            if (l1Var != null) {
                l1Var.f5785a.setPressed(true);
            }
        }
        if (l1Var != null) {
            View view = l1Var.f5785a;
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
    public final void q(f2.l1 l1Var) {
    }
}
