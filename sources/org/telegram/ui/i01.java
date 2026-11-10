package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class i01 extends v4.s {
    public final int Q;
    public final t11 R;

    public i01(t11 t11Var, int i7) {
        super(40);
        this.Q = i7;
        this.R = t11Var;
    }

    @Override
    public final void v0(RecyclerView recyclerView, v4.a1 a1Var, int i7) {
        switch (this.Q) {
            case 0:
                try {
                    fi.j1 j1Var = new fi.j1(3, recyclerView.getContext(), this);
                    j1Var.f57221a = i7;
                    w0(j1Var);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                try {
                    fi.j1 j1Var2 = new fi.j1(5, recyclerView.getContext(), this);
                    j1Var2.f57221a = i7;
                    w0(j1Var2);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
        }
    }
}
