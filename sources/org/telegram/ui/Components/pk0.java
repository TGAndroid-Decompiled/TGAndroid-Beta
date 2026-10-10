package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class pk0 extends s4.t0 {
    public final s4.d0 f29783a;
    public final vk0 f29784b;

    public pk0(vk0 vk0Var, s4.d0 d0Var) {
        this.f29784b = vk0Var;
        this.f29783a = d0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        vk0 vk0Var = this.f29784b;
        if (vk0Var.f31878w && vk0Var.f31879x && !vk0Var.v) {
            int N0 = this.f29783a.N0();
            loadCount = vk0Var.getLoadCount();
            if (N0 >= (vk0Var.f31874f.h() - 1) - loadCount) {
                vk0Var.c();
            }
        }
    }
}
