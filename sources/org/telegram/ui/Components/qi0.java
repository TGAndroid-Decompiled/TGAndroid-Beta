package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class qi0 extends s4.s0 {
    public final s4.a0 f29739a;
    public final wi0 f29740b;

    public qi0(wi0 wi0Var, s4.a0 a0Var) {
        this.f29740b = wi0Var;
        this.f29739a = a0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        wi0 wi0Var = this.f29740b;
        if (wi0Var.f32259x && wi0Var.f32260y && !wi0Var.f32258w) {
            int N0 = this.f29739a.N0();
            loadCount = wi0Var.getLoadCount();
            if (N0 >= (wi0Var.f32254f.b() - 1) - loadCount) {
                wi0Var.c();
            }
        }
    }
}
