package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class mh0 extends v4.s0 {
    public final v4.b0 f36092a;
    public final sh0 f36093b;

    public mh0(sh0 sh0Var, v4.b0 b0Var) {
        this.f36093b = sh0Var;
        this.f36092a = b0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int loadCount;
        sh0 sh0Var = this.f36093b;
        if (sh0Var.f38072x && sh0Var.f38073y && !sh0Var.f38071w) {
            int N0 = this.f36092a.N0();
            loadCount = sh0Var.getLoadCount();
            if (N0 >= (sh0Var.f38067f.b() - 1) - loadCount) {
                sh0Var.c();
            }
        }
    }
}
