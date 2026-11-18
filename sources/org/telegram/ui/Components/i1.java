package org.telegram.ui.Components;

import android.view.View;
public final class i1 implements View.OnClickListener {
    public final int f36024a;
    public final org.telegram.ui.Cells.c2 f36025b;

    public i1(org.telegram.ui.Cells.c2 c2Var, int i7) {
        this.f36024a = i7;
        this.f36025b = c2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36024a) {
            case 0:
                org.telegram.ui.Cells.c2 c2Var = this.f36025b;
                c2Var.c(!c2Var.b(), true);
                return;
            default:
                org.telegram.ui.Cells.c2 c2Var2 = this.f36025b;
                c2Var2.c(!c2Var2.b(), true);
                return;
        }
    }
}
