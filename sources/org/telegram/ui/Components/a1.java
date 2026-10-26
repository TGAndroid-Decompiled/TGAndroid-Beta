package org.telegram.ui.Components;

import android.view.View;
public final class a1 implements View.OnClickListener {
    public final int f26377a;
    public final org.telegram.ui.Cells.y1[] f26378b;

    public a1(org.telegram.ui.Cells.y1[] y1VarArr, int i10) {
        this.f26377a = i10;
        this.f26378b = y1VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26377a) {
            case 0:
                Integer num = (Integer) view.getTag();
                int intValue = num.intValue();
                org.telegram.ui.Cells.y1[] y1VarArr = this.f26378b;
                y1VarArr[intValue].c(!y1VarArr[num.intValue()].b(), true);
                return;
            default:
                Integer num2 = (Integer) view.getTag();
                int intValue2 = num2.intValue();
                org.telegram.ui.Cells.y1[] y1VarArr2 = this.f26378b;
                y1VarArr2[intValue2].c(!y1VarArr2[num2.intValue()].b(), true);
                return;
        }
    }
}
