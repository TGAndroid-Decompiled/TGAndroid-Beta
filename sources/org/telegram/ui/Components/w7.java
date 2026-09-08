package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.R;
public final class w7 extends s4.v {
    public final k8 d;

    public w7(k8 k8Var) {
        this.d = k8Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        View view = c1Var.f45766a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        if (c1Var.f45770f != 0) {
            return 0;
        }
        return s4.v.l(3, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        k8 k8Var = this.d;
        if (k8Var.f27767v0) {
            if (b10 > 0 && b11 > 0) {
                k8Var.f27769w0.move(b10 - 1, b11 - 1);
            } else {
                return false;
            }
        } else {
            k8Var.f27769w0.move(b10, b11);
        }
        k8Var.f27771x0.clear();
        k8Var.f27771x0.addAll(k8Var.f27769w0.list);
        k8Var.f27763s.p(b10, b11);
        return true;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        Boolean bool;
        v7 v7Var = this.d.f27756n;
        if (c1Var != null) {
            v7Var.c1(false);
        }
        if (i10 != 0) {
            v7Var.I0(false);
            if (c1Var != null) {
                c1Var.f45766a.setPressed(true);
            }
        }
        if (c1Var != null) {
            View view = c1Var.f45766a;
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
