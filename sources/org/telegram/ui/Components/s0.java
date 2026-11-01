package org.telegram.ui.Components;

import android.view.View;
public final class s0 implements View.OnClickListener {
    public final int f30143a;
    public final org.telegram.ui.Cells.c2[] f30144b;

    public s0(org.telegram.ui.Cells.c2[] c2VarArr, int i10) {
        this.f30143a = i10;
        this.f30144b = c2VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30143a) {
            case 0:
                Integer num = (Integer) view.getTag();
                int intValue = num.intValue();
                org.telegram.ui.Cells.c2[] c2VarArr = this.f30144b;
                c2VarArr[intValue].c(!c2VarArr[num.intValue()].b(), true);
                return;
            default:
                Integer num2 = (Integer) view.getTag();
                int intValue2 = num2.intValue();
                org.telegram.ui.Cells.c2[] c2VarArr2 = this.f30144b;
                c2VarArr2[intValue2].c(!c2VarArr2[num2.intValue()].b(), true);
                return;
        }
    }
}
