package org.telegram.ui.Components;

import android.text.TextPaint;
public final class s41 extends p41 {
    public final int f39483e;
    public final dz0 f39484f;

    public s41(String str, int i7, dz0 dz0Var) {
        super(str, (dz0) null);
        this.f39483e = i7;
        this.f39484f = dz0Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i7 = this.f39483e;
        if (i7 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.J6, false));
        } else if (i7 == 2) {
            textPaint.setColor(-1);
        } else if (i7 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Yc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Xc, false));
        }
        dz0 dz0Var = this.f39484f;
        if (dz0Var != null) {
            dz0Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
