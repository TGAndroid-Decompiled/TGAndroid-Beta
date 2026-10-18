package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class e31 extends s4.r0 {
    public final int f25790a;
    public final q31 f25791b;

    public e31(q31 q31Var, int i10) {
        this.f25790a = i10;
        this.f25791b = q31Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f25790a) {
            case 0:
                q31 q31Var = this.f25791b;
                if (q31Var.k()) {
                    q31Var.l();
                    return;
                }
                return;
            default:
                q31 q31Var2 = this.f25791b;
                if (q31Var2.k()) {
                    q31Var2.l();
                    return;
                }
                return;
        }
    }
}
