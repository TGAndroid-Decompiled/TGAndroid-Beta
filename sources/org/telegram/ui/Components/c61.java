package org.telegram.ui.Components;

import android.text.TextPaint;
public final class c61 extends z51 {
    public final int e;
    public final b11 f23221f;

    public c61(String str, int i10, b11 b11Var) {
        super(str, (b11) null);
        this.e = i10;
        this.f23221f = b11Var;
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
            textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19121hc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.gc, false));
        }
        b11 b11Var = this.f23221f;
        if (b11Var != null) {
            b11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
