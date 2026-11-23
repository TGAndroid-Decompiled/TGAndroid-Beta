package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class o11 extends v4.u0 {
    public final int f38056a;
    public final a21 f38057b;

    public o11(a21 a21Var, int i7) {
        this.f38056a = i7;
        this.f38057b = a21Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f38056a) {
            case 0:
                a21 a21Var = this.f38057b;
                if (a21Var.l()) {
                    a21Var.m();
                    return;
                }
                return;
            default:
                a21 a21Var2 = this.f38057b;
                if (a21Var2.l()) {
                    a21Var2.m();
                    return;
                }
                return;
        }
    }
}
