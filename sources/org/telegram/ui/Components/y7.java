package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.R;
public final class y7 extends s4.w {
    public final m8 d;

    public y7(m8 m8Var) {
        this.d = m8Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.e1 e1Var) {
        super.a(recyclerView, e1Var);
        View view = e1Var.f47738a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.e1 e1Var) {
        if (e1Var.f47741f != 0) {
            return 0;
        }
        return s4.w.l(3, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.e1 e1Var, s4.e1 e1Var2) {
        int b10 = e1Var.b();
        int b11 = e1Var2.b();
        m8 m8Var = this.d;
        if (m8Var.f30447u0) {
            if (b10 > 0 && b11 > 0) {
                m8Var.f30448v0.move(b10 - 1, b11 - 1);
            } else {
                return false;
            }
        } else {
            m8Var.f30448v0.move(b10, b11);
        }
        m8Var.f30450w0.clear();
        m8Var.f30450w0.addAll(m8Var.f30448v0.list);
        m8Var.f30444s.p(b10, b11);
        return true;
    }

    @Override
    public final void p(s4.e1 e1Var, int i10) {
        Boolean bool;
        x7 x7Var = this.d.f30437n;
        if (e1Var != null) {
            x7Var.d1(false);
        }
        if (i10 != 0) {
            x7Var.I0(false);
            if (e1Var != null) {
                e1Var.f47738a.setPressed(true);
            }
        }
        if (e1Var != null) {
            View view = e1Var.f47738a;
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
    public final void q(s4.e1 e1Var) {
    }
}
