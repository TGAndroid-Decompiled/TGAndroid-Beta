package org.telegram.ui.Components;

import android.view.View;
public final class i1 implements View.OnClickListener {
    public final int f29171a;
    public final org.telegram.ui.Cells.y1 f29172b;

    public i1(org.telegram.ui.Cells.y1 y1Var, int i10) {
        this.f29171a = i10;
        this.f29172b = y1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29171a) {
            case 0:
                org.telegram.ui.Cells.y1 y1Var = this.f29172b;
                y1Var.c(!y1Var.b(), true);
                return;
            default:
                org.telegram.ui.Cells.y1 y1Var2 = this.f29172b;
                y1Var2.c(!y1Var2.b(), true);
                return;
        }
    }
}
