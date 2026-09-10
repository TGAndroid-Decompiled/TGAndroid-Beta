package org.telegram.ui.Components;

import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class h00 implements kl0, ll0 {
    public final r00 f23465a;

    public h00(r00 r00Var) {
        this.f23465a = r00Var;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        r00 r00Var = this.f23465a;
        l00 l00Var = r00Var.J;
        if (!((org.telegram.ui.vw) l00Var).f37634b.f38459j2) {
            p00 p00Var = (p00) view;
            if (r00Var.f26528n) {
                if (i10 != 0) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = p00Var.f25956f;
                    float f11 = dp;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        org.telegram.ui.vw vwVar = (org.telegram.ui.vw) r00Var.J;
                        vwVar.d(vwVar.f37634b.getMessagesController().getDialogFilters().get(p00Var.f25950b.f25349a));
                    }
                }
            } else if (i10 == r00Var.K && l00Var != null) {
                ((org.telegram.ui.vw) l00Var).f37634b.x4(true, false);
            } else {
                r00Var.f(p00Var.f25950b, i10);
            }
        }
    }

    @Override
    public boolean d(int r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h00.d(int, android.view.View):boolean");
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}
