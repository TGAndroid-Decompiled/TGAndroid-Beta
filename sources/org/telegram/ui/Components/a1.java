package org.telegram.ui.Components;

import android.view.View;
public final class a1 implements View.OnClickListener {
    public final int f24262a;
    public final org.telegram.ui.Cells.c2 f24263b;

    public a1(org.telegram.ui.Cells.c2 c2Var, int i10) {
        this.f24262a = i10;
        this.f24263b = c2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24262a) {
            case 0:
                org.telegram.ui.Cells.c2 c2Var = this.f24263b;
                c2Var.c(!c2Var.b(), true);
                return;
            default:
                org.telegram.ui.Cells.c2 c2Var2 = this.f24263b;
                c2Var2.c(!c2Var2.b(), true);
                return;
        }
    }
}
