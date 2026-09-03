package org.telegram.ui.Components;

import android.view.View;
public final class c1 implements View.OnClickListener {
    public final int f23789a;
    public final org.telegram.ui.Cells.y1[] f23790b;

    public c1(org.telegram.ui.Cells.y1[] y1VarArr, int i10) {
        this.f23789a = i10;
        this.f23790b = y1VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f23789a) {
            case 0:
                Integer num = (Integer) view.getTag();
                int intValue = num.intValue();
                org.telegram.ui.Cells.y1[] y1VarArr = this.f23790b;
                y1VarArr[intValue].c(!y1VarArr[num.intValue()].b(), true);
                return;
            default:
                Integer num2 = (Integer) view.getTag();
                int intValue2 = num2.intValue();
                org.telegram.ui.Cells.y1[] y1VarArr2 = this.f23790b;
                y1VarArr2[intValue2].c(!y1VarArr2[num2.intValue()].b(), true);
                return;
        }
    }
}
