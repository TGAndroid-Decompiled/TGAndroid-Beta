package org.telegram.ui.Components;

import android.text.TextPaint;
public final class n61 extends k61 {
    public final int f28886e;
    public final m11 f28887f;

    public n61(String str, int i10, m11 m11Var) {
        super(str, (m11) null);
        this.f28886e = i10;
        this.f28887f = m11Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i10 = this.f28886e;
        if (i10 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.J6, false));
        } else if (i10 == 2) {
            textPaint.setColor(-1);
        } else if (i10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20900hc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.gc, false));
        }
        m11 m11Var = this.f28887f;
        if (m11Var != null) {
            m11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
