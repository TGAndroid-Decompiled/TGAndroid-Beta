package org.telegram.ui.Components;

import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class t00 implements lm0, mm0 {
    public final d10 f30711a;

    public t00(d10 d10Var) {
        this.f30711a = d10Var;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        d10 d10Var = this.f30711a;
        x00 x00Var = d10Var.J;
        if (!((org.telegram.ui.uw) x00Var).f42601b.f42931j2) {
            b10 b10Var = (b10) view;
            if (d10Var.f25180n) {
                if (i10 != 0) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = b10Var.f24534f;
                    float f11 = dp;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        org.telegram.ui.uw uwVar = (org.telegram.ui.uw) d10Var.J;
                        uwVar.d(uwVar.f42601b.getMessagesController().getDialogFilters().get(b10Var.f24527b.f33234a));
                    }
                }
            } else if (i10 == d10Var.K && x00Var != null) {
                ((org.telegram.ui.uw) x00Var).f42601b.u4(true, false);
            } else {
                d10Var.f(b10Var.f24527b, i10);
            }
        }
    }

    @Override
    public boolean d(int r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t00.d(int, android.view.View):boolean");
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
