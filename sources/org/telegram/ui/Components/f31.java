package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class f31 extends s4.r0 {
    public final int f26099a;
    public final r31 f26100b;

    public f31(r31 r31Var, int i10) {
        this.f26099a = i10;
        this.f26100b = r31Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f26099a) {
            case 0:
                r31 r31Var = this.f26100b;
                if (r31Var.k()) {
                    r31Var.l();
                    return;
                }
                return;
            default:
                r31 r31Var2 = this.f26100b;
                if (r31Var2.k()) {
                    r31Var2.l();
                    return;
                }
                return;
        }
    }
}
