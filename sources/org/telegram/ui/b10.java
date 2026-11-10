package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
public final class b10 implements View.OnClickListener {
    public final int f43898a;
    public final org.telegram.ui.Cells.c2[] f43899b;

    public b10(org.telegram.ui.Cells.c2[] c2VarArr, int i7) {
        this.f43898a = i7;
        this.f43899b = c2VarArr;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f43898a;
        org.telegram.ui.Cells.c2[] c2VarArr = this.f43899b;
        switch (i7) {
            case 0:
                Integer num = (Integer) view.getTag();
                c2VarArr[num.intValue()].c(!c2VarArr[num.intValue()].b(), true);
                return;
            case 1:
                org.telegram.ui.Cells.c2 c2Var = c2VarArr[0];
                c2Var.c(!c2Var.b(), true);
                return;
            default:
                RectF rectF = ProfileActivity.V6;
                org.telegram.ui.Cells.c2 c2Var2 = c2VarArr[0];
                c2Var2.c(!c2Var2.b(), true);
                return;
        }
    }
}
