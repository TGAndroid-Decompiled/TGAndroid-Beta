package org.telegram.ui.Components;

import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b00 implements ll0, ml0 {
    public final l00 f22830a;

    public b00(l00 l00Var) {
        this.f22830a = l00Var;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        l00 l00Var = this.f22830a;
        f00 f00Var = l00Var.J;
        if (!((org.telegram.ui.pw) f00Var).f36686b.f37061j2) {
            j00 j00Var = (j00) view;
            if (l00Var.f25950n) {
                if (i10 != 0) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = j00Var.f25215f;
                    float f11 = dp;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        org.telegram.ui.pw pwVar = (org.telegram.ui.pw) l00Var.J;
                        pwVar.d(pwVar.f36686b.getMessagesController().getDialogFilters().get(j00Var.f25209b.f24583a));
                    }
                }
            } else if (i10 == l00Var.K && f00Var != null) {
                ((org.telegram.ui.pw) f00Var).f36686b.x4(true, false);
            } else {
                l00Var.f(j00Var.f25209b, i10);
            }
        }
    }

    @Override
    public boolean d(int r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b00.d(int, android.view.View):boolean");
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
