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
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        View view = b1Var.f45938a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        if (b1Var.f45941f != 0) {
            return 0;
        }
        return s4.v.l(3, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        int b10 = b1Var.b();
        int b11 = b1Var2.b();
        k8 k8Var = this.d;
        if (k8Var.f27790v0) {
            if (b10 > 0 && b11 > 0) {
                k8Var.f27792w0.move(b10 - 1, b11 - 1);
            } else {
                return false;
            }
        } else {
            k8Var.f27792w0.move(b10, b11);
        }
        k8Var.f27794x0.clear();
        k8Var.f27794x0.addAll(k8Var.f27792w0.list);
        k8Var.f27786s.p(b10, b11);
        return true;
    }

    @Override
    public final void p(s4.b1 b1Var, int i10) {
        Boolean bool;
        v7 v7Var = this.d.f27779n;
        if (b1Var != null) {
            v7Var.d1(false);
        }
        if (i10 != 0) {
            v7Var.I0(false);
            if (b1Var != null) {
                b1Var.f45938a.setPressed(true);
            }
        }
        if (b1Var != null) {
            View view = b1Var.f45938a;
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
    public final void q(s4.b1 b1Var) {
    }
}
