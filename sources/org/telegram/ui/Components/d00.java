package org.telegram.ui.Components;

import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class d00 implements nl0, ol0 {
    public final n00 f25567a;

    public d00(n00 n00Var) {
        this.f25567a = n00Var;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        n00 n00Var = this.f25567a;
        h00 h00Var = n00Var.J;
        if (!((org.telegram.ui.ly) h00Var).f38419b.f41463j2) {
            l00 l00Var = (l00) view;
            if (n00Var.f28891n) {
                if (i10 != 0) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = l00Var.f28321f;
                    float f11 = dp;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        org.telegram.ui.ly lyVar = (org.telegram.ui.ly) n00Var.J;
                        lyVar.d(lyVar.f38419b.getMessagesController().getDialogFilters().get(l00Var.f28314b.f27637a));
                    }
                }
            } else if (i10 == n00Var.K && h00Var != null) {
                ((org.telegram.ui.ly) h00Var).f38419b.G4(true, false);
            } else {
                n00Var.f(l00Var.f28314b, i10);
            }
        }
    }

    @Override
    public boolean d(int r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d00.d(int, android.view.View):boolean");
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void s0(View view, float f7, float f10) {
    }
}
