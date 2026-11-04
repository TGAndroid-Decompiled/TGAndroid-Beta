package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class oh0 extends u4.t0 {
    public final u4.b0 f36836a;
    public final uh0 f36837b;

    public oh0(uh0 uh0Var, u4.b0 b0Var) {
        this.f36837b = uh0Var;
        this.f36836a = b0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        int loadCount;
        uh0 uh0Var = this.f36837b;
        if (uh0Var.f38757x && uh0Var.f38758y && !uh0Var.f38756w) {
            int N0 = this.f36836a.N0();
            loadCount = uh0Var.getLoadCount();
            if (N0 >= (uh0Var.f38752f.b() - 1) - loadCount) {
                uh0Var.c();
            }
        }
    }
}
