package org.telegram.ui.Components;

import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class a00 implements bl0, cl0 {
    public final k00 f22259a;

    public a00(k00 k00Var) {
        this.f22259a = k00Var;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        k00 k00Var = this.f22259a;
        e00 e00Var = k00Var.J;
        if (!((org.telegram.ui.vw) e00Var).f38511b.f39243j2) {
            i00 i00Var = (i00) view;
            if (k00Var.f25492n) {
                if (i10 != 0) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = i00Var.f24771f;
                    float f11 = dp;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        org.telegram.ui.vw vwVar = (org.telegram.ui.vw) k00Var.J;
                        vwVar.d(vwVar.f38511b.getMessagesController().getDialogFilters().get(i00Var.f24765b.f24051a));
                    }
                }
            } else if (i10 == k00Var.K && e00Var != null) {
                ((org.telegram.ui.vw) e00Var).f38511b.x4(true, false);
            } else {
                k00Var.f(i00Var.f24765b, i10);
            }
        }
    }

    @Override
    public boolean d(int r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a00.d(int, android.view.View):boolean");
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
