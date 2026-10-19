package org.telegram.ui.Components;

import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class j00 implements xl0, yl0 {
    public final s00 f27397a;

    public j00(s00 s00Var) {
        this.f27397a = s00Var;
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
        s00 s00Var = this.f27397a;
        n00 n00Var = s00Var.J;
        if (!((org.telegram.ui.bw) n00Var).f35741b.f36113j2) {
            q00 q00Var = (q00) view;
            if (s00Var.f30087n) {
                if (i10 != 0) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = q00Var.f29464f;
                    float f11 = dp;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        org.telegram.ui.bw bwVar = (org.telegram.ui.bw) s00Var.J;
                        bwVar.d(bwVar.f35741b.getMessagesController().getDialogFilters().get(q00Var.f29458b.f29126a));
                    }
                }
            } else if (i10 == s00Var.K && n00Var != null) {
                ((org.telegram.ui.bw) n00Var).f35741b.v4(true, false);
            } else {
                s00Var.f(q00Var.f29458b, i10);
            }
        }
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
