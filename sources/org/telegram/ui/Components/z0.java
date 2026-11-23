package org.telegram.ui.Components;

import android.view.View;
public final class z0 implements View.OnClickListener {
    public final int f42600a;
    public final org.telegram.ui.Cells.d2[] f42601b;

    public z0(org.telegram.ui.Cells.d2[] d2VarArr, int i7) {
        this.f42600a = i7;
        this.f42601b = d2VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42600a) {
            case 0:
                Integer num = (Integer) view.getTag();
                int intValue = num.intValue();
                org.telegram.ui.Cells.d2[] d2VarArr = this.f42601b;
                d2VarArr[intValue].c(!d2VarArr[num.intValue()].b(), true);
                return;
            default:
                Integer num2 = (Integer) view.getTag();
                int intValue2 = num2.intValue();
                org.telegram.ui.Cells.d2[] d2VarArr2 = this.f42601b;
                d2VarArr2[intValue2].c(!d2VarArr2[num2.intValue()].b(), true);
                return;
        }
    }
}
