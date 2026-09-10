package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.R;
public final class v7 extends s4.v {
    public final j8 d;

    public v7(j8 j8Var) {
        this.d = j8Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        View view = c1Var.f41610a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        if (c1Var.f41613f != 0) {
            return 0;
        }
        return s4.v.l(3, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        j8 j8Var = this.d;
        if (j8Var.f24302v0) {
            if (b10 > 0 && b11 > 0) {
                j8Var.f24304w0.move(b10 - 1, b11 - 1);
            } else {
                return false;
            }
        } else {
            j8Var.f24304w0.move(b10, b11);
        }
        j8Var.f24306x0.clear();
        j8Var.f24306x0.addAll(j8Var.f24304w0.list);
        j8Var.f24298s.p(b10, b11);
        return true;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        Boolean bool;
        u7 u7Var = this.d.f24291n;
        if (c1Var != null) {
            u7Var.c1(false);
        }
        if (i10 != 0) {
            u7Var.I0(false);
            if (c1Var != null) {
                c1Var.f41610a.setPressed(true);
            }
        }
        if (c1Var != null) {
            View view = c1Var.f41610a;
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
