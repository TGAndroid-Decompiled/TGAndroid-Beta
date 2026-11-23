package org.telegram.ui.Components;

import android.view.View;
public final class j1 implements View.OnClickListener {
    public final int f36348a;
    public final org.telegram.ui.Cells.d2 f36349b;

    public j1(org.telegram.ui.Cells.d2 d2Var, int i7) {
        this.f36348a = i7;
        this.f36349b = d2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36348a) {
            case 0:
                org.telegram.ui.Cells.d2 d2Var = this.f36349b;
                d2Var.c(!d2Var.b(), true);
                return;
            default:
                org.telegram.ui.Cells.d2 d2Var2 = this.f36349b;
                d2Var2.c(!d2Var2.b(), true);
                return;
        }
    }
}
