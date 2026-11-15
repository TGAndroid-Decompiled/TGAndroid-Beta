package org.telegram.ui.Components;

import android.view.View;
public final class n0 implements View.OnClickListener {
    public final int f37419a;
    public final org.telegram.ui.Cells.c2[] f37420b;

    public n0(org.telegram.ui.Cells.c2[] c2VarArr, int i7) {
        this.f37419a = i7;
        this.f37420b = c2VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37419a) {
            case 0:
                Integer num = (Integer) view.getTag();
                int intValue = num.intValue();
                org.telegram.ui.Cells.c2[] c2VarArr = this.f37420b;
                c2VarArr[intValue].c(!c2VarArr[num.intValue()].b(), true);
                return;
            default:
                Integer num2 = (Integer) view.getTag();
                int intValue2 = num2.intValue();
                org.telegram.ui.Cells.c2[] c2VarArr2 = this.f37420b;
                c2VarArr2[intValue2].c(!c2VarArr2[num2.intValue()].b(), true);
                return;
        }
    }
}
