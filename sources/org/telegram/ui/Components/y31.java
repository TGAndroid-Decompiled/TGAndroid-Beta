package org.telegram.ui.Components;

import android.text.TextPaint;
public final class y31 extends v31 {
    public final int f40605e;
    public final ty0 f40606f;

    public y31(String str, int i3, ty0 ty0Var) {
        super(str, (ty0) null);
        this.f40605e = i3;
        this.f40606f = ty0Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i3 = this.f40605e;
        if (i3 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.J6, false));
        } else if (i3 == 2) {
            textPaint.setColor(-1);
        } else if (i3 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Uc, false));
        }
        ty0 ty0Var = this.f40606f;
        if (ty0Var != null) {
            ty0Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
