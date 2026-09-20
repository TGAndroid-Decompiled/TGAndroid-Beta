package org.telegram.ui.Components;

import android.text.TextPaint;
public final class d61 extends a61 {
    public final int e;
    public final c11 f23507f;

    public d61(String str, int i10, c11 c11Var) {
        super(str, (c11) null);
        this.e = i10;
        this.f23507f = c11Var;
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
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19171hc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gc, false));
        }
        c11 c11Var = this.f23507f;
        if (c11Var != null) {
            c11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
