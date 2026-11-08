package org.telegram.ui.Components;

import android.view.View;
public final class a1 implements View.OnClickListener {
    public final int f31641a;
    public final org.telegram.ui.Cells.c2 f31642b;

    public a1(org.telegram.ui.Cells.c2 c2Var, int i7) {
        this.f31641a = i7;
        this.f31642b = c2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31641a) {
            case 0:
                org.telegram.ui.Cells.c2 c2Var = this.f31642b;
                c2Var.c(!c2Var.b(), true);
                return;
            default:
                org.telegram.ui.Cells.c2 c2Var2 = this.f31642b;
                c2Var2.c(!c2Var2.b(), true);
                return;
        }
    }
}
