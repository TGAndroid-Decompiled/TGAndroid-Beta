package org.telegram.ui.Components;

import android.text.TextPaint;
public final class f41 extends c41 {
    public final int f33580e;
    public final vy0 f33581f;

    public f41(String str, int i7, vy0 vy0Var) {
        super(str, (vy0) null);
        this.f33580e = i7;
        this.f33581f = vy0Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i7 = this.f33580e;
        if (i7 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.J6, false));
        } else if (i7 == 2) {
            textPaint.setColor(-1);
        } else if (i7 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Vc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Uc, false));
        }
        vy0 vy0Var = this.f33581f;
        if (vy0Var != null) {
            vy0Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
