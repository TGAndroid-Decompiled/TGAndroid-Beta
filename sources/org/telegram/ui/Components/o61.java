package org.telegram.ui.Components;

import android.text.TextPaint;
public final class o61 extends l61 {
    public final int e;
    public final n11 f28954f;

    public o61(String str, int i10, n11 n11Var) {
        super(str, (n11) null);
        this.e = i10;
        this.f28954f = n11Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i10 = this.e;
        if (i10 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.J6, false));
        } else if (i10 == 2) {
            textPaint.setColor(-1);
        } else if (i10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.hc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21049gc, false));
        }
        n11 n11Var = this.f28954f;
        if (n11Var != null) {
            n11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
