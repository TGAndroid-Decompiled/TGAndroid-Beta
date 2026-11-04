package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
public final class q00 implements View.OnClickListener {
    public final int f48715a;
    public final org.telegram.ui.Cells.c2[] f48716b;

    public q00(org.telegram.ui.Cells.c2[] c2VarArr, int i3) {
        this.f48715a = i3;
        this.f48716b = c2VarArr;
    }

    @Override
    public final void onClick(View view) {
        int i3 = this.f48715a;
        org.telegram.ui.Cells.c2[] c2VarArr = this.f48716b;
        switch (i3) {
            case 0:
                Integer num = (Integer) view.getTag();
                c2VarArr[num.intValue()].c(!c2VarArr[num.intValue()].b(), true);
                return;
            case 1:
                org.telegram.ui.Cells.c2 c2Var = c2VarArr[0];
                c2Var.c(!c2Var.b(), true);
                return;
            default:
                RectF rectF = ProfileActivity.T6;
                org.telegram.ui.Cells.c2 c2Var2 = c2VarArr[0];
                c2Var2.c(!c2Var2.b(), true);
                return;
        }
    }
}
