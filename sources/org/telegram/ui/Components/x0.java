package org.telegram.ui.Components;

import android.view.View;
public final class x0 implements View.OnClickListener {
    public final int f41492a;
    public final org.telegram.ui.Cells.c2 f41493b;

    public x0(org.telegram.ui.Cells.c2 c2Var, int i7) {
        this.f41492a = i7;
        this.f41493b = c2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41492a) {
            case 0:
                org.telegram.ui.Cells.c2 c2Var = this.f41493b;
                c2Var.c(!c2Var.b(), true);
                return;
            default:
                org.telegram.ui.Cells.c2 c2Var2 = this.f41493b;
                c2Var2.c(!c2Var2.b(), true);
                return;
        }
    }
}
