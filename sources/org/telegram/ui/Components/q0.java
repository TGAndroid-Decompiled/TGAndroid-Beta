package org.telegram.ui.Components;

import android.view.View;
public final class q0 implements View.OnClickListener {
    public final int f37298a;
    public final org.telegram.ui.Cells.c2[] f37299b;

    public q0(org.telegram.ui.Cells.c2[] c2VarArr, int i3) {
        this.f37298a = i3;
        this.f37299b = c2VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37298a) {
            case 0:
                Integer num = (Integer) view.getTag();
                int intValue = num.intValue();
                org.telegram.ui.Cells.c2[] c2VarArr = this.f37299b;
                c2VarArr[intValue].c(!c2VarArr[num.intValue()].b(), true);
                return;
            default:
                Integer num2 = (Integer) view.getTag();
                int intValue2 = num2.intValue();
                org.telegram.ui.Cells.c2[] c2VarArr2 = this.f37299b;
                c2VarArr2[intValue2].c(!c2VarArr2[num2.intValue()].b(), true);
                return;
        }
    }
}
