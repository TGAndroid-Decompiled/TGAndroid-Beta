package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class jk0 extends s4.r0 {
    public final s4.b0 f27719a;
    public final pk0 f27720b;

    public jk0(pk0 pk0Var, s4.b0 b0Var) {
        this.f27720b = pk0Var;
        this.f27719a = b0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        pk0 pk0Var = this.f27720b;
        if (pk0Var.f29585w && pk0Var.f29586x && !pk0Var.v) {
            int N0 = this.f27719a.N0();
            loadCount = pk0Var.getLoadCount();
            if (N0 >= (pk0Var.f29581f.h() - 1) - loadCount) {
                pk0Var.c();
            }
        }
    }
}
