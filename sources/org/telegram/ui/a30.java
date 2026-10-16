package org.telegram.ui;

import android.view.View;
public final class a30 implements View.OnClickListener {
    public final int f33731a;
    public final org.telegram.ui.Cells.a2[] f33732b;

    public a30(org.telegram.ui.Cells.a2[] a2VarArr, int i10) {
        this.f33731a = i10;
        this.f33732b = a2VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33731a) {
            case 0:
                Integer num = (Integer) view.getTag();
                int intValue = num.intValue();
                org.telegram.ui.Cells.a2[] a2VarArr = this.f33732b;
                a2VarArr[intValue].c(!a2VarArr[num.intValue()].b(), true);
                return;
            case 1:
                org.telegram.ui.Cells.a2 a2Var = this.f33732b[0];
                a2Var.c(!a2Var.b(), true);
                return;
            default:
                org.telegram.ui.Cells.a2 a2Var2 = this.f33732b[0];
                a2Var2.c(!a2Var2.b(), true);
                return;
        }
    }
}
