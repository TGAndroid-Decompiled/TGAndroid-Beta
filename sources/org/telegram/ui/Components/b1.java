package org.telegram.ui.Components;

import android.view.View;

public final class b1 implements View.OnClickListener {

    public final int f26875a;

    public final org.telegram.ui.Cells.y1[] f26876b;

    public b1(org.telegram.ui.Cells.y1[] y1VarArr, int i10) {
        this.f26875a = i10;
        this.f26876b = y1VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26875a) {
            case 0:
                Integer num = (Integer) view.getTag();
                int iIntValue = num.intValue();
                org.telegram.ui.Cells.y1[] y1VarArr = this.f26876b;
                y1VarArr[iIntValue].c(!y1VarArr[num.intValue()].b(), true);
                break;
            default:
                Integer num2 = (Integer) view.getTag();
                int iIntValue2 = num2.intValue();
                org.telegram.ui.Cells.y1[] y1VarArr2 = this.f26876b;
                y1VarArr2[iIntValue2].c(!y1VarArr2[num2.intValue()].b(), true);
                break;
        }
    }
}
