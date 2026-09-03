package org.telegram.ui.Components;

import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b00 implements il0, jl0 {
    public final k00 f23501a;

    public b00(k00 k00Var) {
        this.f23501a = k00Var;
    }

    @Override
    public boolean Z0(View view) {
        return false;
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        k00 k00Var = this.f23501a;
        f00 f00Var = k00Var.G;
        if (!((org.telegram.ui.qw) f00Var).f37510b.f37555g2) {
            i00 i00Var = (i00) view;
            if (k00Var.f26106n) {
                if (i10 != 0) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = i00Var.f25540f;
                    float f12 = dp;
                    if (rectF.left - f12 < f10 && rectF.right + f12 > f10) {
                        org.telegram.ui.qw qwVar = (org.telegram.ui.qw) k00Var.G;
                        qwVar.d(qwVar.f37510b.getMessagesController().getDialogFilters().get(i00Var.f25534b.f25280a));
                    }
                }
            } else if (i10 == k00Var.H && f00Var != null) {
                ((org.telegram.ui.qw) f00Var).f37510b.x4(true, false);
            } else {
                k00Var.f(i00Var.f25534b, i10);
            }
        }
    }

    @Override
    public boolean d(int r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b00.d(int, android.view.View):boolean");
    }

    @Override
    public void n0(View view, float f10, float f11) {
    }
}
