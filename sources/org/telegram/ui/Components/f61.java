package org.telegram.ui.Components;

import android.text.TextPaint;
public final class f61 extends c61 {
    public final int e;
    public final e11 f24124f;

    public f61(String str, int i10, e11 e11Var) {
        super(str, (e11) null);
        this.e = i10;
        this.f24124f = e11Var;
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
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19186hc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gc, false));
        }
        e11 e11Var = this.f24124f;
        if (e11Var != null) {
            e11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
