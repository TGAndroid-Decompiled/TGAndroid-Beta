package org.telegram.ui.Components;

import android.text.TextPaint;
public final class o51 extends l51 {
    public final int f29671e;
    public final s01 f29672f;

    public o51(String str, int i10, s01 s01Var) {
        super(str, (s01) null);
        this.f29671e = i10;
        this.f29672f = s01Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i10 = this.f29671e;
        if (i10 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.J6, false));
        } else if (i10 == 2) {
            textPaint.setColor(-1);
        } else if (i10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21739hc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21722gc, false));
        }
        s01 s01Var = this.f29672f;
        if (s01Var != null) {
            s01Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
