package org.telegram.ui.Components;

import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class j00 implements am0, bm0 {
    public final s00 f29417a;

    public j00(s00 s00Var) {
        this.f29417a = s00Var;
    }

    @Override
    public boolean c(int r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j00.c(int, android.view.View):boolean");
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void e(float f7, float f10, int i10, View view) {
        s00 s00Var = this.f29417a;
        n00 n00Var = s00Var.J;
        if (!((org.telegram.ui.rx) n00Var).f43310b.f38614j2) {
            q00 q00Var = (q00) view;
            if (s00Var.f32377n) {
                if (i10 != 0) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = q00Var.f31762f;
                    float f11 = dp;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        org.telegram.ui.rx rxVar = (org.telegram.ui.rx) s00Var.J;
                        rxVar.d(rxVar.f43310b.getMessagesController().getDialogFilters().get(q00Var.f31756b.f31401a));
                    }
                }
            } else if (i10 == s00Var.K && n00Var != null) {
                ((org.telegram.ui.rx) n00Var).f43310b.F4(true, false);
            } else {
                s00Var.f(q00Var.f31756b, i10);
            }
        }
    }

    @Override
    public void l0(View view, float f7, float f10) {
    }
}
