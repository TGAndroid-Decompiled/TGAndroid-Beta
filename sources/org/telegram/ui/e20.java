package org.telegram.ui;

import android.view.View;
public final class e20 implements View.OnClickListener {
    public final int f37682a;
    public final org.telegram.ui.Cells.y1[] f37683b;

    public e20(org.telegram.ui.Cells.y1[] y1VarArr, int i10) {
        this.f37682a = i10;
        this.f37683b = y1VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37682a) {
            case 0:
                Integer num = (Integer) view.getTag();
                int intValue = num.intValue();
                org.telegram.ui.Cells.y1[] y1VarArr = this.f37683b;
                y1VarArr[intValue].c(!y1VarArr[num.intValue()].b(), true);
                return;
            case 1:
                org.telegram.ui.Cells.y1 y1Var = this.f37683b[0];
                y1Var.c(!y1Var.b(), true);
                return;
            default:
                org.telegram.ui.Cells.y1 y1Var2 = this.f37683b[0];
                y1Var2.c(!y1Var2.b(), true);
                return;
        }
    }
}
