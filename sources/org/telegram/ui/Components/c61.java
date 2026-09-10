package org.telegram.ui.Components;

import android.text.TextPaint;
public final class c61 extends z51 {
    public final int e;
    public final b11 f22033f;

    public c61(String str, int i10, b11 b11Var) {
        super(str, (b11) null);
        this.e = i10;
        this.f22033f = b11Var;
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
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18004hc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gc, false));
        }
        b11 b11Var = this.f22033f;
        if (b11Var != null) {
            b11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
