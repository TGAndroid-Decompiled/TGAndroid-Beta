package org.telegram.ui.Components;

import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class c00 implements jl0, kl0 {
    public final l00 f25726a;

    public c00(l00 l00Var) {
        this.f25726a = l00Var;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        l00 l00Var = this.f25726a;
        g00 g00Var = l00Var.G;
        if (!((org.telegram.ui.pw) g00Var).f40138b.f40184g2) {
            j00 j00Var = (j00) view;
            if (l00Var.f28552n) {
                if (i10 != 0) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = j00Var.f27937f;
                    float f12 = dp;
                    if (rectF.left - f12 < f10 && rectF.right + f12 > f10) {
                        org.telegram.ui.pw pwVar = (org.telegram.ui.pw) l00Var.G;
                        pwVar.d(pwVar.f40138b.getMessagesController().getDialogFilters().get(j00Var.f27930b.f27676a));
                    }
                }
            } else if (i10 == l00Var.H && g00Var != null) {
                ((org.telegram.ui.pw) g00Var).f40138b.x4(true, false);
            } else {
                l00Var.f(j00Var.f27930b, i10);
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
