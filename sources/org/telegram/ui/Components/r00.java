package org.telegram.ui.Components;

import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class r00 implements hm0, im0 {
    public final b10 f30290a;

    public r00(b10 b10Var) {
        this.f30290a = b10Var;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        b10 b10Var = this.f30290a;
        v00 v00Var = b10Var.J;
        if (!((org.telegram.ui.rw) v00Var).f41520b.f41935j2) {
            z00 z00Var = (z00) view;
            if (b10Var.f24761n) {
                if (i10 != 0) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = z00Var.f33368f;
                    float f11 = dp;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        org.telegram.ui.rw rwVar = (org.telegram.ui.rw) b10Var.J;
                        rwVar.d(rwVar.f41520b.getMessagesController().getDialogFilters().get(z00Var.f33361b.f32784a));
                    }
                }
            } else if (i10 == b10Var.K && v00Var != null) {
                ((org.telegram.ui.rw) v00Var).f41520b.u4(true, false);
            } else {
                b10Var.f(z00Var.f33361b, i10);
            }
        }
    }

    @Override
    public boolean d(int r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r00.d(int, android.view.View):boolean");
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
