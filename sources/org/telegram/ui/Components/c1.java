package org.telegram.ui.Components;

import android.view.View;
public final class c1 implements View.OnClickListener {
    public final int f22878a;
    public final org.telegram.ui.Cells.z1[] f22879b;

    public c1(org.telegram.ui.Cells.z1[] z1VarArr, int i10) {
        this.f22878a = i10;
        this.f22879b = z1VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22878a) {
            case 0:
                Integer num = (Integer) view.getTag();
                int intValue = num.intValue();
                org.telegram.ui.Cells.z1[] z1VarArr = this.f22879b;
                z1VarArr[intValue].c(!z1VarArr[num.intValue()].b(), true);
                return;
            default:
                Integer num2 = (Integer) view.getTag();
                int intValue2 = num2.intValue();
                org.telegram.ui.Cells.z1[] z1VarArr2 = this.f22879b;
                z1VarArr2[intValue2].c(!z1VarArr2[num2.intValue()].b(), true);
                return;
        }
    }
}
