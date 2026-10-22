package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class g31 extends s4.r0 {
    public final int f26503a;
    public final s31 f26504b;

    public g31(s31 s31Var, int i10) {
        this.f26503a = i10;
        this.f26504b = s31Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f26503a) {
            case 0:
                s31 s31Var = this.f26504b;
                if (s31Var.k()) {
                    s31Var.l();
                    return;
                }
                return;
            default:
                s31 s31Var2 = this.f26504b;
                if (s31Var2.k()) {
                    s31Var2.l();
                    return;
                }
                return;
        }
    }
}
