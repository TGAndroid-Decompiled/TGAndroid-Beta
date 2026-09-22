package org.telegram.ui.Components;

import android.text.TextPaint;
public final class p51 extends m51 {
    public final int e;
    public final o01 f26950f;

    public p51(String str, int i10, o01 o01Var) {
        super(str, (o01) null);
        this.e = i10;
        this.f26950f = o01Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i10 = this.e;
        if (i10 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.J6, false));
        } else if (i10 == 2) {
            textPaint.setColor(-1);
        } else if (i10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18910hc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.gc, false));
        }
        o01 o01Var = this.f26950f;
        if (o01Var != null) {
            o01Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
