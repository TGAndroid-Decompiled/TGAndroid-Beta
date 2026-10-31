package org.telegram.ui.Components;

import android.view.View;
public final class a1 implements View.OnClickListener {
    public final int f24259a;
    public final org.telegram.ui.Cells.c2 f24260b;

    public a1(org.telegram.ui.Cells.c2 c2Var, int i10) {
        this.f24259a = i10;
        this.f24260b = c2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24259a) {
            case 0:
                org.telegram.ui.Cells.c2 c2Var = this.f24260b;
                c2Var.c(!c2Var.b(), true);
                return;
            default:
                org.telegram.ui.Cells.c2 c2Var2 = this.f24260b;
                c2Var2.c(!c2Var2.b(), true);
                return;
        }
    }
}
