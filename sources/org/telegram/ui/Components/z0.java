package org.telegram.ui.Components;

import android.view.View;
public final class z0 implements View.OnClickListener {
    public final int f40787a;
    public final org.telegram.ui.Cells.c2 f40788b;

    public z0(org.telegram.ui.Cells.c2 c2Var, int i7) {
        this.f40787a = i7;
        this.f40788b = c2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40787a) {
            case 0:
                org.telegram.ui.Cells.c2 c2Var = this.f40788b;
                c2Var.c(!c2Var.b(), true);
                return;
            default:
                org.telegram.ui.Cells.c2 c2Var2 = this.f40788b;
                c2Var2.c(!c2Var2.b(), true);
                return;
        }
    }
}
