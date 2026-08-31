package org.telegram.ui.Components;

import android.text.TextPaint;
public final class q51 extends n51 {
    public final int f30285e;
    public final t01 f30286f;

    public q51(String str, int i10, t01 t01Var) {
        super(str, (t01) null);
        this.f30285e = i10;
        this.f30286f = t01Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i10 = this.f30285e;
        if (i10 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.J6, false));
        } else if (i10 == 2) {
            textPaint.setColor(-1);
        } else if (i10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21737hc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21720gc, false));
        }
        t01 t01Var = this.f30286f;
        if (t01Var != null) {
            t01Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
