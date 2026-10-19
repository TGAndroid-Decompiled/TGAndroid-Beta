package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class f31 extends s4.r0 {
    public final int f26097a;
    public final r31 f26098b;

    public f31(r31 r31Var, int i10) {
        this.f26097a = i10;
        this.f26098b = r31Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f26097a) {
            case 0:
                r31 r31Var = this.f26098b;
                if (r31Var.k()) {
                    r31Var.l();
                    return;
                }
                return;
            default:
                r31 r31Var2 = this.f26098b;
                if (r31Var2.k()) {
                    r31Var2.l();
                    return;
                }
                return;
        }
    }
}
