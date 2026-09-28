package org.telegram.ui.Components;

import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class c00 implements nl0, ol0 {
    public final m00 f23145a;

    public c00(m00 m00Var) {
        this.f23145a = m00Var;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        m00 m00Var = this.f23145a;
        g00 g00Var = m00Var.J;
        if (!((org.telegram.ui.pw) g00Var).f36686b.f37061j2) {
            k00 k00Var = (k00) view;
            if (m00Var.f26201n) {
                if (i10 != 0) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = k00Var.f25544f;
                    float f11 = dp;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        org.telegram.ui.pw pwVar = (org.telegram.ui.pw) m00Var.J;
                        pwVar.d(pwVar.f36686b.getMessagesController().getDialogFilters().get(k00Var.f25538b.f24958a));
                    }
                }
            } else if (i10 == m00Var.K && g00Var != null) {
                ((org.telegram.ui.pw) g00Var).f36686b.x4(true, false);
            } else {
                m00Var.f(k00Var.f25538b, i10);
            }
        }
    }

    @Override
    public boolean d(int r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c00.d(int, android.view.View):boolean");
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
