package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class pk0 extends s4.t0 {
    public final s4.d0 f29886a;
    public final vk0 f29887b;

    public pk0(vk0 vk0Var, s4.d0 d0Var) {
        this.f29887b = vk0Var;
        this.f29886a = d0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        vk0 vk0Var = this.f29887b;
        if (vk0Var.f31912w && vk0Var.f31913x && !vk0Var.v) {
            int N0 = this.f29886a.N0();
            loadCount = vk0Var.getLoadCount();
            if (N0 >= (vk0Var.f31908f.h() - 1) - loadCount) {
                vk0Var.c();
            }
        }
    }
}
