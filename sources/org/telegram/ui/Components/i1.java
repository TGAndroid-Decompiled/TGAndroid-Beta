package org.telegram.ui.Components;

import android.view.View;
public final class i1 implements View.OnClickListener {
    public final int f27190a;
    public final org.telegram.ui.Cells.a2 f27191b;

    public i1(org.telegram.ui.Cells.a2 a2Var, int i10) {
        this.f27190a = i10;
        this.f27191b = a2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27190a) {
            case 0:
                org.telegram.ui.Cells.a2 a2Var = this.f27191b;
                a2Var.c(!a2Var.b(), true);
                return;
            default:
                org.telegram.ui.Cells.a2 a2Var2 = this.f27191b;
                a2Var2.c(!a2Var2.b(), true);
                return;
        }
    }
}
