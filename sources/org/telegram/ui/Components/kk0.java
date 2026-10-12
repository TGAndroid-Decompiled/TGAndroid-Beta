package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class kk0 extends s4.r0 {
    public final s4.b0 f26722a;
    public final qk0 f26723b;

    public kk0(qk0 qk0Var, s4.b0 b0Var) {
        this.f26723b = qk0Var;
        this.f26722a = b0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        qk0 qk0Var = this.f26723b;
        if (qk0Var.f28635w && qk0Var.f28636x && !qk0Var.v) {
            int N0 = this.f26722a.N0();
            loadCount = qk0Var.getLoadCount();
            if (N0 >= (qk0Var.f28631f.h() - 1) - loadCount) {
                qk0Var.c();
            }
        }
    }
}
