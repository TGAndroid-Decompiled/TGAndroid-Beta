package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class jk0 extends s4.u0 {
    public final s4.c0 f29668a;
    public final pk0 f29669b;

    public jk0(pk0 pk0Var, s4.c0 c0Var) {
        this.f29669b = pk0Var;
        this.f29668a = c0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        pk0 pk0Var = this.f29669b;
        if (pk0Var.f31591w && pk0Var.f31592x && !pk0Var.v) {
            int N0 = this.f29668a.N0();
            loadCount = pk0Var.getLoadCount();
            if (N0 >= (pk0Var.f31587f.h() - 1) - loadCount) {
                pk0Var.c();
            }
        }
    }
}
