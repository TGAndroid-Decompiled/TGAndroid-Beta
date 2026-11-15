package org.telegram.ui.Components;

import android.text.TextPaint;
public final class i41 extends f41 {
    public final int f35438e;
    public final wy0 f35439f;

    public i41(String str, int i7, wy0 wy0Var) {
        super(str, (wy0) null);
        this.f35438e = i7;
        this.f35439f = wy0Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i7 = this.f35438e;
        if (i7 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.J6, false));
        } else if (i7 == 2) {
            textPaint.setColor(-1);
        } else if (i7 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Yc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Xc, false));
        }
        wy0 wy0Var = this.f35439f;
        if (wy0Var != null) {
            wy0Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
