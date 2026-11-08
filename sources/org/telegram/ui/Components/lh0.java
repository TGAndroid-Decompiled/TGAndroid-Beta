package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class lh0 extends v4.s0 {
    public final v4.b0 f35700a;
    public final rh0 f35701b;

    public lh0(rh0 rh0Var, v4.b0 b0Var) {
        this.f35701b = rh0Var;
        this.f35700a = b0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int loadCount;
        rh0 rh0Var = this.f35701b;
        if (rh0Var.f37669x && rh0Var.f37670y && !rh0Var.f37668w) {
            int N0 = this.f35700a.N0();
            loadCount = rh0Var.getLoadCount();
            if (N0 >= (rh0Var.f37664f.b() - 1) - loadCount) {
                rh0Var.c();
            }
        }
    }
}
