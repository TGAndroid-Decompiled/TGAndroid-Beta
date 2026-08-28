package org.telegram.ui;

import android.view.View;
public final class c20 implements View.OnClickListener {
    public final int f37048a;
    public final org.telegram.ui.Cells.z1[] f37049b;

    public c20(org.telegram.ui.Cells.z1[] z1VarArr, int i9) {
        this.f37048a = i9;
        this.f37049b = z1VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37048a) {
            case 0:
                Integer num = (Integer) view.getTag();
                int intValue = num.intValue();
                org.telegram.ui.Cells.z1[] z1VarArr = this.f37049b;
                z1VarArr[intValue].c(!z1VarArr[num.intValue()].b(), true);
                return;
            case 1:
                org.telegram.ui.Cells.z1 z1Var = this.f37049b[0];
                z1Var.c(!z1Var.b(), true);
                return;
            default:
                org.telegram.ui.Cells.z1 z1Var2 = this.f37049b[0];
                z1Var2.c(!z1Var2.b(), true);
                return;
        }
    }
}
