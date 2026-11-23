package org.telegram.ui.Components;

import android.text.TextPaint;
public final class u41 extends r41 {
    public final int f40271e;
    public final ez0 f40272f;

    public u41(String str, int i7, ez0 ez0Var) {
        super(str, (ez0) null);
        this.f40271e = i7;
        this.f40272f = ez0Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i7 = this.f40271e;
        if (i7 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.J6, false));
        } else if (i7 == 2) {
            textPaint.setColor(-1);
        } else if (i7 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Yc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Xc, false));
        }
        ez0 ez0Var = this.f40272f;
        if (ez0Var != null) {
            ez0Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
