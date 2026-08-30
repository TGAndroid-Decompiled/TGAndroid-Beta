package org.telegram.ui.Components;

import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class a00 implements jl0, kl0 {
    public final j00 f23230a;

    public a00(j00 j00Var) {
        this.f23230a = j00Var;
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        j00 j00Var = this.f23230a;
        e00 e00Var = j00Var.G;
        if (!((org.telegram.ui.ow) e00Var).f36989b.f37037g2) {
            h00 h00Var = (h00) view;
            if (j00Var.f25830n) {
                if (i10 != 0) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = h00Var.f25292f;
                    float f12 = dp;
                    if (rectF.left - f12 < f10 && rectF.right + f12 > f10) {
                        org.telegram.ui.ow owVar = (org.telegram.ui.ow) j00Var.G;
                        owVar.d(owVar.f36989b.getMessagesController().getDialogFilters().get(h00Var.f25286b.f25005a));
                    }
                }
            } else if (i10 == j00Var.H && e00Var != null) {
                ((org.telegram.ui.ow) e00Var).f36989b.x4(true, false);
            } else {
                j00Var.f(h00Var.f25286b, i10);
            }
        }
    }

    @Override
    public boolean e1(View view) {
        return false;
    }

    @Override
    public boolean f(int r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a00.f(int, android.view.View):boolean");
    }

    @Override
    public void o0(View view, float f10, float f11) {
    }
}
