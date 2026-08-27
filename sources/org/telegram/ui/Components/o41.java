package org.telegram.ui.Components;

import android.text.TextPaint;

public final class o41 extends r41 {
    public static boolean h = true;

    public final int f31154e;

    public final xz0 f31155f;

    public o41(String str, int i10, xz0 xz0Var) {
        super(str, (xz0) null);
        this.f31154e = i10;
        this.f31155f = xz0Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i10 = this.f31154e;
        if (i10 == 2) {
            textPaint.setColor(-1);
        } else if (i10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(null, h ? org.telegram.ui.ActionBar.g6.f23131hc : org.telegram.ui.ActionBar.g6.fc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(null, h ? org.telegram.ui.ActionBar.g6.gc : org.telegram.ui.ActionBar.g6.f23077ec, false));
        }
        xz0 xz0Var = this.f31155f;
        if (xz0Var != null) {
            xz0Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
