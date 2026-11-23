package org.telegram.ui.Components;

import android.view.View;
public final class i1 implements View.OnClickListener {
    public final int f35861a;
    public final org.telegram.ui.Cells.d2 f35862b;

    public i1(org.telegram.ui.Cells.d2 d2Var, int i7) {
        this.f35861a = i7;
        this.f35862b = d2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35861a) {
            case 0:
                org.telegram.ui.Cells.d2 d2Var = this.f35862b;
                d2Var.c(!d2Var.b(), true);
                return;
            default:
                org.telegram.ui.Cells.d2 d2Var2 = this.f35862b;
                d2Var2.c(!d2Var2.b(), true);
                return;
        }
    }
}
