package org.telegram.ui.Components;

import android.view.View;
public final class i1 implements View.OnClickListener {
    public final int f27027a;
    public final org.telegram.ui.Cells.a2 f27028b;

    public i1(org.telegram.ui.Cells.a2 a2Var, int i10) {
        this.f27027a = i10;
        this.f27028b = a2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27027a) {
            case 0:
                org.telegram.ui.Cells.a2 a2Var = this.f27028b;
                a2Var.c(!a2Var.b(), true);
                return;
            default:
                org.telegram.ui.Cells.a2 a2Var2 = this.f27028b;
                a2Var2.c(!a2Var2.b(), true);
                return;
        }
    }
}
