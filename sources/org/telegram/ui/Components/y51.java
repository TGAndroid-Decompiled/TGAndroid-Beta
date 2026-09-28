package org.telegram.ui.Components;

import android.text.TextPaint;
public final class y51 extends b61 {
    public static boolean h = true;
    public final int e;
    public final d11 f30585f;

    public y51(String str, int i10, d11 d11Var) {
        super(str, (d11) null);
        this.e = i10;
        this.f30585f = d11Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10;
        int i11;
        super.updateDrawState(textPaint);
        int i12 = this.e;
        if (i12 == 2) {
            textPaint.setColor(-1);
        } else if (i12 == 1) {
            if (h) {
                i11 = org.telegram.ui.ActionBar.h6.f19136hc;
            } else {
                i11 = org.telegram.ui.ActionBar.h6.f19101fc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
        } else {
            if (h) {
                i10 = org.telegram.ui.ActionBar.h6.gc;
            } else {
                i10 = org.telegram.ui.ActionBar.h6.ec;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        }
        d11 d11Var = this.f30585f;
        if (d11Var != null) {
            d11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
