package org.telegram.ui.Components;

import android.text.TextPaint;
public final class y31 extends v31 {
    public final int f40490e;
    public final ty0 f40491f;

    public y31(String str, int i7, ty0 ty0Var) {
        super(str, (ty0) null);
        this.f40490e = i7;
        this.f40491f = ty0Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i7 = this.f40490e;
        if (i7 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.J6, false));
        } else if (i7 == 2) {
            textPaint.setColor(-1);
        } else if (i7 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Uc, false));
        }
        ty0 ty0Var = this.f40491f;
        if (ty0Var != null) {
            ty0Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
