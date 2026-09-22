package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.R;
public final class t7 extends s4.v {
    public final h8 d;

    public t7(h8 h8Var) {
        this.d = h8Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        View view = c1Var.f42671a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        if (c1Var.f42674f != 0) {
            return 0;
        }
        return s4.v.l(3, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        h8 h8Var = this.d;
        if (h8Var.f24580v0) {
            if (b10 > 0 && b11 > 0) {
                h8Var.f24582w0.move(b10 - 1, b11 - 1);
            } else {
                return false;
            }
        } else {
            h8Var.f24582w0.move(b10, b11);
        }
        h8Var.f24584x0.clear();
        h8Var.f24584x0.addAll(h8Var.f24582w0.list);
        h8Var.f24576s.p(b10, b11);
        return true;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        Boolean bool;
        s7 s7Var = this.d.f24569n;
        if (c1Var != null) {
            s7Var.d1(false);
        }
        if (i10 != 0) {
            s7Var.I0(false);
            if (c1Var != null) {
                c1Var.f42671a.setPressed(true);
            }
        }
        if (c1Var != null) {
            View view = c1Var.f42671a;
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
    public final void q(s4.c1 c1Var) {
    }
}
