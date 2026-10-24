package org.telegram.ui.Components;

import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class h00 implements am0, bm0 {
    public final q00 f26824a;

    public h00(q00 q00Var) {
        this.f26824a = q00Var;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        q00 q00Var = this.f26824a;
        l00 l00Var = q00Var.J;
        if (!((org.telegram.ui.dw) l00Var).f36730b.f37062j2) {
            o00 o00Var = (o00) view;
            if (q00Var.f29721n) {
                if (i10 != 0) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = o00Var.f29098f;
                    float f11 = dp;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        org.telegram.ui.dw dwVar = (org.telegram.ui.dw) q00Var.J;
                        dwVar.d(dwVar.f36730b.getMessagesController().getDialogFilters().get(o00Var.f29092b.f28740a));
                    }
                }
            } else if (i10 == q00Var.K && l00Var != null) {
                ((org.telegram.ui.dw) l00Var).f36730b.v4(true, false);
            } else {
                q00Var.f(o00Var.f29092b, i10);
            }
        }
    }

    @Override
    public boolean d(int r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h00.d(int, android.view.View):boolean");
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
