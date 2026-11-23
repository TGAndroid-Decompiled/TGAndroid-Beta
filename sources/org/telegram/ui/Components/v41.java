package org.telegram.ui.Components;

import android.text.TextPaint;
public final class v41 extends s41 {
    public final int f40683e;
    public final fz0 f40684f;

    public v41(String str, int i7, fz0 fz0Var) {
        super(str, (fz0) null);
        this.f40683e = i7;
        this.f40684f = fz0Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i7 = this.f40683e;
        if (i7 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.J6, false));
        } else if (i7 == 2) {
            textPaint.setColor(-1);
        } else if (i7 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Yc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Xc, false));
        }
        fz0 fz0Var = this.f40684f;
        if (fz0Var != null) {
            fz0Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
