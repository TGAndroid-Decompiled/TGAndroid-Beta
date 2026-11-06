package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class a11 extends v4.s0 {
    public final int f31656a;
    public final m11 f31657b;

    public a11(m11 m11Var, int i7) {
        this.f31656a = i7;
        this.f31657b = m11Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f31656a) {
            case 0:
                m11 m11Var = this.f31657b;
                if (m11Var.l()) {
                    m11Var.m();
                    return;
                }
                return;
            default:
                m11 m11Var2 = this.f31657b;
                if (m11Var2.l()) {
                    m11Var2.m();
                    return;
                }
                return;
        }
    }
}
