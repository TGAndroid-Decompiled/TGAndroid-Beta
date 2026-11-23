package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class g01 extends v4.s {
    public final int Q;
    public final r11 R;

    public g01(r11 r11Var, int i7) {
        super(40);
        this.Q = i7;
        this.R = r11Var;
    }

    @Override
    public final void v0(RecyclerView recyclerView, v4.b1 b1Var, int i7) {
        switch (this.Q) {
            case 0:
                try {
                    hi.k1 k1Var = new hi.k1(3, recyclerView.getContext(), this);
                    k1Var.f59055a = i7;
                    w0(k1Var);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                try {
                    hi.k1 k1Var2 = new hi.k1(5, recyclerView.getContext(), this);
                    k1Var2.f59055a = i7;
                    w0(k1Var2);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
        }
    }
}
