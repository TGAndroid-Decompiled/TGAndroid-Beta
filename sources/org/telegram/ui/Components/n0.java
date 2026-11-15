package org.telegram.ui.Components;

import android.view.View;
public final class n0 implements View.OnClickListener {
    public final int f37418a;
    public final org.telegram.ui.Cells.c2[] f37419b;

    public n0(org.telegram.ui.Cells.c2[] c2VarArr, int i7) {
        this.f37418a = i7;
        this.f37419b = c2VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37418a) {
            case 0:
                Integer num = (Integer) view.getTag();
                int intValue = num.intValue();
                org.telegram.ui.Cells.c2[] c2VarArr = this.f37419b;
                c2VarArr[intValue].c(!c2VarArr[num.intValue()].b(), true);
                return;
            default:
                Integer num2 = (Integer) view.getTag();
                int intValue2 = num2.intValue();
                org.telegram.ui.Cells.c2[] c2VarArr2 = this.f37419b;
                c2VarArr2[intValue2].c(!c2VarArr2[num2.intValue()].b(), true);
                return;
        }
    }
}
