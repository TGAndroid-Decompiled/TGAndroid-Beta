package org.telegram.ui.Components;

import android.text.TextPaint;
public final class o61 extends l61 {
    public final int f29381e;
    public final n11 f29382f;

    public o61(String str, int i10, n11 n11Var) {
        super(str, (n11) null);
        this.f29381e = i10;
        this.f29382f = n11Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i10 = this.f29381e;
        if (i10 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.J6, false));
        } else if (i10 == 2) {
            textPaint.setColor(-1);
        } else if (i10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20905hc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.gc, false));
        }
        n11 n11Var = this.f29382f;
        if (n11Var != null) {
            n11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
