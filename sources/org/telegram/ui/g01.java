package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class g01 extends v4.t {
    public final int Q;
    public final r11 R;

    public g01(r11 r11Var, int i7) {
        super(40);
        this.Q = i7;
        this.R = r11Var;
    }

    @Override
    public final void v0(RecyclerView recyclerView, v4.c1 c1Var, int i7) {
        switch (this.Q) {
            case 0:
                try {
                    hi.l1 l1Var = new hi.l1(3, recyclerView.getContext(), this);
                    l1Var.f59066a = i7;
                    w0(l1Var);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                try {
                    hi.l1 l1Var2 = new hi.l1(5, recyclerView.getContext(), this);
                    l1Var2.f59066a = i7;
                    w0(l1Var2);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
        }
    }
}
