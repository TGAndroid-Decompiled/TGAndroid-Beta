package org.telegram.ui.Components;

import android.text.TextPaint;
public final class d51 extends a51 {
    public final int f27662e;
    public final h01 f27663f;

    public d51(String str, int i10, h01 h01Var) {
        super(str, (h01) null);
        this.f27662e = i10;
        this.f27663f = h01Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i10 = this.f27662e;
        if (i10 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J6, false));
        } else if (i10 == 2) {
            textPaint.setColor(-1);
        } else if (i10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.hc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.gc, false));
        }
        h01 h01Var = this.f27663f;
        if (h01Var != null) {
            h01Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
