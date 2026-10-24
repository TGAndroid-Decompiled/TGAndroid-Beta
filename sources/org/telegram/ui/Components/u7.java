package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.R;
public final class u7 extends s4.v {
    public final i8 d;

    public u7(i8 i8Var) {
        this.d = i8Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        View view = b1Var.f46342a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        if (b1Var.f46345f != 0) {
            return 0;
        }
        return s4.v.l(3, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        int b10 = b1Var.b();
        int b11 = b1Var2.b();
        i8 i8Var = this.d;
        if (i8Var.f27350u0) {
            if (b10 > 0 && b11 > 0) {
                i8Var.f27351v0.move(b10 - 1, b11 - 1);
            } else {
                return false;
            }
        } else {
            i8Var.f27351v0.move(b10, b11);
        }
        i8Var.f27353w0.clear();
        i8Var.f27353w0.addAll(i8Var.f27351v0.list);
        i8Var.f27347s.p(b10, b11);
        return true;
    }

    @Override
    public final void p(s4.b1 b1Var, int i10) {
        Boolean bool;
        t7 t7Var = this.d.f27340n;
        if (b1Var != null) {
            t7Var.e1(false);
        }
        if (i10 != 0) {
            t7Var.I0(false);
            if (b1Var != null) {
                b1Var.f46342a.setPressed(true);
            }
        }
        if (b1Var != null) {
            View view = b1Var.f46342a;
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
