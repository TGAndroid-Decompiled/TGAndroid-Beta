package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class t31 extends s4.u0 {
    public final int f32821a;
    public final e41 f32822b;

    public t31(e41 e41Var, int i10) {
        this.f32821a = i10;
        this.f32822b = e41Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f32821a) {
            case 0:
                e41 e41Var = this.f32822b;
                if (e41Var.l()) {
                    e41Var.m();
                    return;
                }
                return;
            default:
                e41 e41Var2 = this.f32822b;
                if (e41Var2.l()) {
                    e41Var2.m();
                    return;
                }
                return;
        }
    }
}
