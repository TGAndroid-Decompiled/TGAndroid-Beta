package org.telegram.ui.Components;

import android.text.TextPaint;
public final class o51 extends l51 {
    public final int e;
    public final n01 f26612f;

    public o51(String str, int i10, n01 n01Var) {
        super(str, (n01) null);
        this.e = i10;
        this.f26612f = n01Var;
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
            textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18865hc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.gc, false));
        }
        n01 n01Var = this.f26612f;
        if (n01Var != null) {
            n01Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
