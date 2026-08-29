package org.telegram.ui.Components;

import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class vz implements al0, bl0 {
    public final f00 f34244a;

    public vz(f00 f00Var) {
        this.f34244a = f00Var;
    }

    @Override
    public void b(float f9, float f10, int i10, View view) {
        f00 f00Var = this.f34244a;
        a00 a00Var = f00Var.F;
        if (!((org.telegram.ui.fw) a00Var).f38242b.f38285f2) {
            d00 d00Var = (d00) view;
            if (f00Var.f28243n) {
                if (i10 != 0) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = d00Var.f27615f;
                    float f11 = dp;
                    if (rectF.left - f11 < f9 && rectF.right + f11 > f9) {
                        org.telegram.ui.fw fwVar = (org.telegram.ui.fw) f00Var.F;
                        fwVar.d(fwVar.f38242b.getMessagesController().getDialogFilters().get(d00Var.f27608b.f27251a));
                    }
                }
            } else if (i10 == f00Var.G && a00Var != null) {
                ((org.telegram.ui.fw) a00Var).f38242b.x4(true, false);
            } else {
                f00Var.f(d00Var.f27608b, i10);
            }
        }
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public boolean c(int r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vz.c(int, android.view.View):boolean");
    }

    @Override
    public void o0(View view, float f9, float f10) {
    }
}
