package org.telegram.ui;

import android.view.View;

public final class f20 implements View.OnClickListener {

    public final int f37912a;

    public final org.telegram.ui.Cells.y1[] f37913b;

    public f20(org.telegram.ui.Cells.y1[] y1VarArr, int i10) {
        this.f37912a = i10;
        this.f37913b = y1VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37912a) {
            case 0:
                Integer num = (Integer) view.getTag();
                int iIntValue = num.intValue();
                org.telegram.ui.Cells.y1[] y1VarArr = this.f37913b;
                y1VarArr[iIntValue].c(!y1VarArr[num.intValue()].b(), true);
                break;
            case 1:
                org.telegram.ui.Cells.y1 y1Var = this.f37913b[0];
                y1Var.c(!y1Var.b(), true);
                break;
            default:
                org.telegram.ui.Cells.y1 y1Var2 = this.f37913b[0];
                y1Var2.c(!y1Var2.b(), true);
                break;
        }
    }
}
