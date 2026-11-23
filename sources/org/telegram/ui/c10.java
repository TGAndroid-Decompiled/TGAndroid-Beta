package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
public final class c10 implements View.OnClickListener {
    public final int f46379a;
    public final org.telegram.ui.Cells.d2[] f46380b;

    public c10(org.telegram.ui.Cells.d2[] d2VarArr, int i7) {
        this.f46379a = i7;
        this.f46380b = d2VarArr;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f46379a;
        org.telegram.ui.Cells.d2[] d2VarArr = this.f46380b;
        switch (i7) {
            case 0:
                Integer num = (Integer) view.getTag();
                d2VarArr[num.intValue()].c(!d2VarArr[num.intValue()].b(), true);
                return;
            case 1:
                org.telegram.ui.Cells.d2 d2Var = d2VarArr[0];
                d2Var.c(!d2Var.b(), true);
                return;
            default:
                RectF rectF = ProfileActivity.Z6;
                org.telegram.ui.Cells.d2 d2Var2 = d2VarArr[0];
                d2Var2.c(!d2Var2.b(), true);
                return;
        }
    }
}
