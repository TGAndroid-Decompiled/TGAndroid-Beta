package org.telegram.ui.Components;

import android.text.TextPaint;
public final class e41 extends b41 {
    public final int f33196e;
    public final uy0 f33197f;

    public e41(String str, int i7, uy0 uy0Var) {
        super(str, (uy0) null);
        this.f33196e = i7;
        this.f33197f = uy0Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i7 = this.f33196e;
        if (i7 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.J6, false));
        } else if (i7 == 2) {
            textPaint.setColor(-1);
        } else if (i7 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Uc, false));
        }
        uy0 uy0Var = this.f33197f;
        if (uy0Var != null) {
            uy0Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
