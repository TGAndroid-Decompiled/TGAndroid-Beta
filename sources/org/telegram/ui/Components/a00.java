package org.telegram.ui.Components;

import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class a00 implements kl0, ll0 {
    public final k00 f22470a;

    public a00(k00 k00Var) {
        this.f22470a = k00Var;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        k00 k00Var = this.f22470a;
        e00 e00Var = k00Var.J;
        if (!((org.telegram.ui.tw) e00Var).f37889b.f38284j2) {
            i00 i00Var = (i00) view;
            if (k00Var.f25586n) {
                if (i10 != 0) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = i00Var.f24811f;
                    float f11 = dp;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        org.telegram.ui.tw twVar = (org.telegram.ui.tw) k00Var.J;
                        twVar.d(twVar.f37889b.getMessagesController().getDialogFilters().get(i00Var.f24805b.f24220a));
                    }
                }
            } else if (i10 == k00Var.K && e00Var != null) {
                ((org.telegram.ui.tw) e00Var).f37889b.x4(true, false);
            } else {
                k00Var.f(i00Var.f24805b, i10);
            }
        }
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public boolean d(int r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a00.d(int, android.view.View):boolean");
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
