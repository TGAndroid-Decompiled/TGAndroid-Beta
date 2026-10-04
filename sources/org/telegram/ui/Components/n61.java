package org.telegram.ui.Components;

import android.text.TextPaint;
public final class n61 extends k61 {
    public final int f28881e;
    public final m11 f28882f;

    public n61(String str, int i10, m11 m11Var) {
        super(str, (m11) null);
        this.f28881e = i10;
        this.f28882f = m11Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i10 = this.f28881e;
        if (i10 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.J6, false));
        } else if (i10 == 2) {
            textPaint.setColor(-1);
        } else if (i10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20896hc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.gc, false));
        }
        m11 m11Var = this.f28882f;
        if (m11Var != null) {
            m11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
