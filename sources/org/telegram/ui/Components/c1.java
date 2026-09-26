package org.telegram.ui.Components;

import android.view.View;
public final class c1 implements View.OnClickListener {
    public final int f23170a;
    public final org.telegram.ui.Cells.a2[] f23171b;

    public c1(org.telegram.ui.Cells.a2[] a2VarArr, int i10) {
        this.f23170a = i10;
        this.f23171b = a2VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f23170a) {
            case 0:
                Integer num = (Integer) view.getTag();
                int intValue = num.intValue();
                org.telegram.ui.Cells.a2[] a2VarArr = this.f23171b;
                a2VarArr[intValue].c(!a2VarArr[num.intValue()].b(), true);
                return;
            default:
                Integer num2 = (Integer) view.getTag();
                int intValue2 = num2.intValue();
                org.telegram.ui.Cells.a2[] a2VarArr2 = this.f23171b;
                a2VarArr2[intValue2].c(!a2VarArr2[num2.intValue()].b(), true);
                return;
        }
    }
}
