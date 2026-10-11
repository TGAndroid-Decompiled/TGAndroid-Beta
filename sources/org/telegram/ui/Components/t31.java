package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class t31 extends s4.t0 {
    public final int f30979a;
    public final e41 f30980b;

    public t31(e41 e41Var, int i10) {
        this.f30979a = i10;
        this.f30980b = e41Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f30979a) {
            case 0:
                e41 e41Var = this.f30980b;
                if (e41Var.k()) {
                    e41Var.l();
                    return;
                }
                return;
            default:
                e41 e41Var2 = this.f30980b;
                if (e41Var2.k()) {
                    e41Var2.l();
                    return;
                }
                return;
        }
    }
}
