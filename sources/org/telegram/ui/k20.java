package org.telegram.ui;

import android.view.View;
public final class k20 implements View.OnClickListener {
    public final int f40647a;
    public final org.telegram.ui.Cells.y1[] f40648b;

    public k20(org.telegram.ui.Cells.y1[] y1VarArr, int i10) {
        this.f40647a = i10;
        this.f40648b = y1VarArr;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f40647a;
        org.telegram.ui.Cells.y1[] y1VarArr = this.f40648b;
        switch (i10) {
            case 0:
                Integer num = (Integer) view.getTag();
                y1VarArr[num.intValue()].c(!y1VarArr[num.intValue()].b(), true);
                return;
            case 1:
                org.telegram.ui.Cells.y1 y1Var = y1VarArr[0];
                y1Var.c(!y1Var.b(), true);
                return;
            default:
                int i11 = ProfileActivity.R6;
                org.telegram.ui.Cells.y1 y1Var2 = y1VarArr[0];
                y1Var2.c(!y1Var2.b(), true);
                return;
        }
    }
}
