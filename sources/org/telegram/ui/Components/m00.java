package org.telegram.ui.Components;

import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class m00 implements bm0, cm0 {
    public final w00 f27149a;

    public m00(w00 w00Var) {
        this.f27149a = w00Var;
    }

    @Override
    public boolean a(int r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m00.a(int, android.view.View):boolean");
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        w00 w00Var = this.f27149a;
        q00 q00Var = w00Var.J;
        if (!((org.telegram.ui.xw) q00Var).f41972b.f42353j2) {
            u00 u00Var = (u00) view;
            if (w00Var.f30711n) {
                if (i10 != 0) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = u00Var.f29543f;
                    float f11 = dp;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        org.telegram.ui.xw xwVar = (org.telegram.ui.xw) w00Var.J;
                        xwVar.d(xwVar.f41972b.getMessagesController().getDialogFilters().get(u00Var.f29537b.f28978a));
                    }
                }
            } else if (i10 == w00Var.K && q00Var != null) {
                ((org.telegram.ui.xw) q00Var).f41972b.u4(true, false);
            } else {
                w00Var.f(u00Var.f29537b, i10);
            }
        }
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}
