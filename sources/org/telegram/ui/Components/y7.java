package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.R;
public final class y7 extends s4.v {
    public final m8 d;

    public y7(m8 m8Var) {
        this.d = m8Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        View view = b1Var.f44838a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        if (b1Var.f44841f != 0) {
            return 0;
        }
        return s4.v.l(3, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        int b10 = b1Var.b();
        int b11 = b1Var2.b();
        m8 m8Var = this.d;
        if (m8Var.f26993v0) {
            if (b10 > 0 && b11 > 0) {
                m8Var.f26995w0.move(b10 - 1, b11 - 1);
            } else {
                return false;
            }
        } else {
            m8Var.f26995w0.move(b10, b11);
        }
        m8Var.f26997x0.clear();
        m8Var.f26997x0.addAll(m8Var.f26995w0.list);
        m8Var.f26989s.p(b10, b11);
        return true;
    }

    @Override
    public final void p(s4.b1 b1Var, int i10) {
        Boolean bool;
        x7 x7Var = this.d.f26982n;
        if (b1Var != null) {
            x7Var.d1(false);
        }
        if (i10 != 0) {
            x7Var.I0(false);
            if (b1Var != null) {
                b1Var.f44838a.setPressed(true);
            }
        }
        if (b1Var != null) {
            View view = b1Var.f44838a;
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
