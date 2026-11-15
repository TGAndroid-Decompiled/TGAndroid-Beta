package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class c01 extends v4.s {
    public final int Q;
    public final n11 R;

    public c01(n11 n11Var, int i7) {
        super(40);
        this.Q = i7;
        this.R = n11Var;
    }

    @Override
    public final void v0(RecyclerView recyclerView, v4.b1 b1Var, int i7) {
        switch (this.Q) {
            case 0:
                try {
                    hi.l1 l1Var = new hi.l1(3, recyclerView.getContext(), this);
                    l1Var.f58480a = i7;
                    w0(l1Var);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                try {
                    hi.l1 l1Var2 = new hi.l1(5, recyclerView.getContext(), this);
                    l1Var2.f58480a = i7;
                    w0(l1Var2);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
        }
    }
}
