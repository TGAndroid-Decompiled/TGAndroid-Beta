package org.telegram.ui.Components;

import android.view.View;
public final class i1 implements View.OnClickListener {
    public final int f29136a;
    public final org.telegram.ui.Cells.y1 f29137b;

    public i1(org.telegram.ui.Cells.y1 y1Var, int i10) {
        this.f29136a = i10;
        this.f29137b = y1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29136a) {
            case 0:
                org.telegram.ui.Cells.y1 y1Var = this.f29137b;
                y1Var.c(!y1Var.b(), true);
                return;
            default:
                org.telegram.ui.Cells.y1 y1Var2 = this.f29137b;
                y1Var2.c(!y1Var2.b(), true);
                return;
        }
    }
}
