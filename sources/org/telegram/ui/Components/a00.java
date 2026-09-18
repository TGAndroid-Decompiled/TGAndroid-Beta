package org.telegram.ui.Components;

import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class a00 implements ll0, ml0 {
    public final k00 f22435a;

    public a00(k00 k00Var) {
        this.f22435a = k00Var;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        k00 k00Var = this.f22435a;
        e00 e00Var = k00Var.J;
        if (!((org.telegram.ui.tw) e00Var).f37815b.f38177j2) {
            i00 i00Var = (i00) view;
            if (k00Var.f25504n) {
                if (i10 != 0) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = i00Var.f24794f;
                    float f11 = dp;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        org.telegram.ui.tw twVar = (org.telegram.ui.tw) k00Var.J;
                        twVar.d(twVar.f37815b.getMessagesController().getDialogFilters().get(i00Var.f24788b.f24280a));
                    }
                }
            } else if (i10 == k00Var.K && e00Var != null) {
                ((org.telegram.ui.tw) e00Var).f37815b.x4(true, false);
            } else {
                k00Var.f(i00Var.f24788b, i10);
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
