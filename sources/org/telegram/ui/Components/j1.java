package org.telegram.ui.Components;

import android.view.View;
public final class j1 implements View.OnClickListener {
    public final int f36307a;
    public final org.telegram.ui.Cells.d2 f36308b;

    public j1(org.telegram.ui.Cells.d2 d2Var, int i7) {
        this.f36307a = i7;
        this.f36308b = d2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36307a) {
            case 0:
                org.telegram.ui.Cells.d2 d2Var = this.f36308b;
                d2Var.c(!d2Var.b(), true);
                return;
            default:
                org.telegram.ui.Cells.d2 d2Var2 = this.f36308b;
                d2Var2.c(!d2Var2.b(), true);
                return;
        }
    }
}
