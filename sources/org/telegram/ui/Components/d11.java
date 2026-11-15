package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class d11 extends v4.t0 {
    public final int f33813a;
    public final p11 f33814b;

    public d11(p11 p11Var, int i7) {
        this.f33813a = i7;
        this.f33814b = p11Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f33813a) {
            case 0:
                p11 p11Var = this.f33814b;
                if (p11Var.l()) {
                    p11Var.m();
                    return;
                }
                return;
            default:
                p11 p11Var2 = this.f33814b;
                if (p11Var2.l()) {
                    p11Var2.m();
                    return;
                }
                return;
        }
    }
}
