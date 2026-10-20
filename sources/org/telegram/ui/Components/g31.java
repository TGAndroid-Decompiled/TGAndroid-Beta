package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class g31 extends s4.r0 {
    public final int f26500a;
    public final s31 f26501b;

    public g31(s31 s31Var, int i10) {
        this.f26500a = i10;
        this.f26501b = s31Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f26500a) {
            case 0:
                s31 s31Var = this.f26501b;
                if (s31Var.k()) {
                    s31Var.l();
                    return;
                }
                return;
            default:
                s31 s31Var2 = this.f26501b;
                if (s31Var2.k()) {
                    s31Var2.l();
                    return;
                }
                return;
        }
    }
}
