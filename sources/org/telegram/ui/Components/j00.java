package org.telegram.ui.Components;

import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class j00 implements yl0, zl0 {
    public final s00 f27374a;

    public j00(s00 s00Var) {
        this.f27374a = s00Var;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public boolean a(int r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j00.a(int, android.view.View):boolean");
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        s00 s00Var = this.f27374a;
        n00 n00Var = s00Var.J;
        if (!((org.telegram.ui.bw) n00Var).f35751b.f36123j2) {
            q00 q00Var = (q00) view;
            if (s00Var.f30084n) {
                if (i10 != 0) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = q00Var.f29440f;
                    float f11 = dp;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        org.telegram.ui.bw bwVar = (org.telegram.ui.bw) s00Var.J;
                        bwVar.d(bwVar.f35751b.getMessagesController().getDialogFilters().get(q00Var.f29434b.f29179a));
                    }
                }
            } else if (i10 == s00Var.K && n00Var != null) {
                ((org.telegram.ui.bw) n00Var).f35751b.v4(true, false);
            } else {
                s00Var.f(q00Var.f29434b, i10);
            }
        }
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
