package org.telegram.ui;

import android.view.View;
public final class i20 implements View.OnClickListener {
    public final int f40122a;
    public final org.telegram.ui.Cells.y1[] f40123b;

    public i20(org.telegram.ui.Cells.y1[] y1VarArr, int i10) {
        this.f40122a = i10;
        this.f40123b = y1VarArr;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f40122a;
        org.telegram.ui.Cells.y1[] y1VarArr = this.f40123b;
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
