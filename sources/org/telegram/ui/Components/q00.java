package org.telegram.ui.Components;

import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class q00 implements fm0, gm0 {
    public final a10 f29981a;

    public q00(a10 a10Var) {
        this.f29981a = a10Var;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        a10 a10Var = this.f29981a;
        u00 u00Var = a10Var.J;
        if (!((org.telegram.ui.sw) u00Var).f41778b.f42200j2) {
            y00 y00Var = (y00) view;
            if (a10Var.f24515n) {
                if (i10 != 0) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = y00Var.f33074f;
                    float f11 = dp;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        org.telegram.ui.sw swVar = (org.telegram.ui.sw) a10Var.J;
                        swVar.d(swVar.f41778b.getMessagesController().getDialogFilters().get(y00Var.f33067b.f32498a));
                    }
                }
            } else if (i10 == a10Var.K && u00Var != null) {
                ((org.telegram.ui.sw) u00Var).f41778b.u4(true, false);
            } else {
                a10Var.f(y00Var.f33067b, i10);
            }
        }
    }

    @Override
    public boolean d(int r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q00.d(int, android.view.View):boolean");
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
