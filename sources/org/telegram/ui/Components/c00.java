package org.telegram.ui.Components;

import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class c00 implements kl0, ll0 {
    public final l00 f25745a;

    public c00(l00 l00Var) {
        this.f25745a = l00Var;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        l00 l00Var = this.f25745a;
        g00 g00Var = l00Var.G;
        if (!((org.telegram.ui.pw) g00Var).f40168b.f40214g2) {
            j00 j00Var = (j00) view;
            if (l00Var.f28503n) {
                if (i10 != 0) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = j00Var.f27951f;
                    float f12 = dp;
                    if (rectF.left - f12 < f10 && rectF.right + f12 > f10) {
                        org.telegram.ui.pw pwVar = (org.telegram.ui.pw) l00Var.G;
                        pwVar.d(pwVar.f40168b.getMessagesController().getDialogFilters().get(j00Var.f27944b.f27634a));
                    }
                }
            } else if (i10 == l00Var.H && g00Var != null) {
                ((org.telegram.ui.pw) g00Var).f40168b.x4(true, false);
            } else {
                l00Var.f(j00Var.f27944b, i10);
            }
        }
    }

    @Override
    public boolean f(int r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c00.f(int, android.view.View):boolean");
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
