package org.telegram.ui.Components;

import android.text.TextPaint;

public final class u41 extends r41 {

    public final int f32968e;

    public final xz0 f32969f;

    public u41(String str, int i10, xz0 xz0Var) {
        super(str, (xz0) null);
        this.f32968e = i10;
        this.f32969f = xz0Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i10 = this.f32968e;
        if (i10 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J6, false));
        } else if (i10 == 2) {
            textPaint.setColor(-1);
        } else if (i10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23131hc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.gc, false));
        }
        xz0 xz0Var = this.f32969f;
        if (xz0Var != null) {
            xz0Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
