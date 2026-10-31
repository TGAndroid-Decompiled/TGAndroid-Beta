package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class pi0 extends s4.s0 {
    public final s4.a0 f29367a;
    public final vi0 f29368b;

    public pi0(vi0 vi0Var, s4.a0 a0Var) {
        this.f29368b = vi0Var;
        this.f29367a = a0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        vi0 vi0Var = this.f29368b;
        if (vi0Var.f31267x && vi0Var.f31268y && !vi0Var.f31266w) {
            int N0 = this.f29367a.N0();
            loadCount = vi0Var.getLoadCount();
            if (N0 >= (vi0Var.f31262f.b() - 1) - loadCount) {
                vi0Var.c();
            }
        }
    }
}
