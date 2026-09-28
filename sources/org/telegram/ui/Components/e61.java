package org.telegram.ui.Components;

import android.text.TextPaint;
public final class e61 extends b61 {
    public final int e;
    public final d11 f23921f;

    public e61(String str, int i10, d11 d11Var) {
        super(str, (d11) null);
        this.e = i10;
        this.f23921f = d11Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i10 = this.e;
        if (i10 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.J6, false));
        } else if (i10 == 2) {
            textPaint.setColor(-1);
        } else if (i10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19135hc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.gc, false));
        }
        d11 d11Var = this.f23921f;
        if (d11Var != null) {
            d11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
