package org.telegram.ui.Components;

import android.view.View;
public final class h1 implements View.OnClickListener {
    public final int f26756a;
    public final org.telegram.ui.Cells.z1 f26757b;

    public h1(org.telegram.ui.Cells.z1 z1Var, int i10) {
        this.f26756a = i10;
        this.f26757b = z1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26756a) {
            case 0:
                org.telegram.ui.Cells.z1 z1Var = this.f26757b;
                z1Var.c(!z1Var.b(), true);
                return;
            default:
                org.telegram.ui.Cells.z1 z1Var2 = this.f26757b;
                z1Var2.c(!z1Var2.b(), true);
                return;
        }
    }
}
