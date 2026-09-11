package org.telegram.ui.Components;

import android.text.TextPaint;
public final class o51 extends l51 {
    public final int f28968e;
    public final n01 f28969f;

    public o51(String str, int i10, n01 n01Var) {
        super(str, (n01) null);
        this.f28968e = i10;
        this.f28969f = n01Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i10 = this.f28968e;
        if (i10 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false));
        } else if (i10 == 2) {
            textPaint.setColor(-1);
        } else if (i10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20740hc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gc, false));
        }
        n01 n01Var = this.f28969f;
        if (n01Var != null) {
            n01Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
