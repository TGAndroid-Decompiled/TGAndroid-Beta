package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class lh0 extends v4.s0 {
    public final v4.b0 f35682a;
    public final rh0 f35683b;

    public lh0(rh0 rh0Var, v4.b0 b0Var) {
        this.f35683b = rh0Var;
        this.f35682a = b0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int loadCount;
        rh0 rh0Var = this.f35683b;
        if (rh0Var.f37648x && rh0Var.f37649y && !rh0Var.f37647w) {
            int N0 = this.f35682a.N0();
            loadCount = rh0Var.getLoadCount();
            if (N0 >= (rh0Var.f37643f.b() - 1) - loadCount) {
                rh0Var.c();
            }
        }
    }
}
