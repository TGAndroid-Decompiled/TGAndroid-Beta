package org.telegram.ui.Components;

import android.text.TextPaint;
public final class q51 extends n51 {
    public final int e;
    public final p01 f27220f;

    public q51(String str, int i10, p01 p01Var) {
        super(str, (p01) null);
        this.e = i10;
        this.f27220f = p01Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i10 = this.e;
        if (i10 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false));
        } else if (i10 == 2) {
            textPaint.setColor(-1);
        } else if (i10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18939hc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gc, false));
        }
        p01 p01Var = this.f27220f;
        if (p01Var != null) {
            p01Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
