package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class f01 extends v4.t {
    public final int Q;
    public final q11 R;

    public f01(q11 q11Var, int i7) {
        super(40);
        this.Q = i7;
        this.R = q11Var;
    }

    @Override
    public final void v0(RecyclerView recyclerView, v4.c1 c1Var, int i7) {
        switch (this.Q) {
            case 0:
                try {
                    hi.t1 t1Var = new hi.t1(3, recyclerView.getContext(), this);
                    t1Var.f59190a = i7;
                    w0(t1Var);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                try {
                    hi.t1 t1Var2 = new hi.t1(5, recyclerView.getContext(), this);
                    t1Var2.f59190a = i7;
                    w0(t1Var2);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
        }
    }
}
