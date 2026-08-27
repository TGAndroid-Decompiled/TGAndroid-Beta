package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.R;

public final class o7 extends f2.c0 {
    public final b8 d;

    public o7(b8 b8Var) {
        this.d = b8Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.o1 o1Var) {
        super.a(recyclerView, o1Var);
        View view = o1Var.f5789a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.o1 o1Var) {
        if (o1Var.f5793f != 0) {
            return 0;
        }
        return f2.c0.l(3, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.o1 o1Var, f2.o1 o1Var2) {
        int iB = o1Var.b();
        int iB2 = o1Var2.b();
        b8 b8Var = this.d;
        if (!b8Var.f27032r0) {
            b8Var.f27034s0.move(iB, iB2);
        } else {
            if (iB <= 0 || iB2 <= 0) {
                return false;
            }
            b8Var.f27034s0.move(iB - 1, iB2 - 1);
        }
        b8Var.f27035t0.clear();
        b8Var.f27035t0.addAll(b8Var.f27034s0.list);
        b8Var.f27033s.p(iB, iB2);
        return true;
    }

    @Override
    public final void p(f2.o1 o1Var, int i10) {
        n7 n7Var = this.d.f27026n;
        if (o1Var != null) {
            n7Var.d1(false);
        }
        if (i10 != 0) {
            n7Var.I0(false);
            if (o1Var != null) {
                o1Var.f5789a.setPressed(true);
            }
        }
        if (o1Var != null) {
            o1Var.f5789a.setTag(R.id.dragging, i10 == 2 ? Boolean.TRUE : null);
        }
    }

    @Override
    public final void q(f2.o1 o1Var) {
    }
}
