package org.telegram.ui.Components;

import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class d00 implements ol0, pl0 {
    public final n00 f23459a;

    public d00(n00 n00Var) {
        this.f23459a = n00Var;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        n00 n00Var = this.f23459a;
        h00 h00Var = n00Var.J;
        if (!((org.telegram.ui.pw) h00Var).f36786b.f37162j2) {
            l00 l00Var = (l00) view;
            if (n00Var.f26492n) {
                if (i10 != 0) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = l00Var.f25852f;
                    float f11 = dp;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        org.telegram.ui.pw pwVar = (org.telegram.ui.pw) n00Var.J;
                        pwVar.d(pwVar.f36786b.getMessagesController().getDialogFilters().get(l00Var.f25846b.f25251a));
                    }
                }
            } else if (i10 == n00Var.K && h00Var != null) {
                ((org.telegram.ui.pw) h00Var).f36786b.x4(true, false);
            } else {
                n00Var.f(l00Var.f25846b, i10);
            }
        }
    }

    @Override
    public boolean d(int r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d00.d(int, android.view.View):boolean");
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
