package org.telegram.ui.Components;

import android.view.View;
public final class z0 implements View.OnClickListener {
    public final int f40883a;
    public final org.telegram.ui.Cells.c2 f40884b;

    public z0(org.telegram.ui.Cells.c2 c2Var, int i3) {
        this.f40883a = i3;
        this.f40884b = c2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40883a) {
            case 0:
                org.telegram.ui.Cells.c2 c2Var = this.f40884b;
                c2Var.c(!c2Var.b(), true);
                return;
            default:
                org.telegram.ui.Cells.c2 c2Var2 = this.f40884b;
                c2Var2.c(!c2Var2.b(), true);
                return;
        }
    }
}
