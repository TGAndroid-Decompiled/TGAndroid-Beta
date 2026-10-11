package org.telegram.ui.Components;

import android.text.TextPaint;
public final class y61 extends v61 {
    public final int f33100e;
    public final v11 f33101f;

    public y61(String str, int i10, v11 v11Var) {
        super(str, (v11) null);
        this.f33100e = i10;
        this.f33101f = v11Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i10 = this.f33100e;
        if (i10 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.J6, false));
        } else if (i10 == 2) {
            textPaint.setColor(-1);
        } else if (i10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20863hc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.gc, false));
        }
        v11 v11Var = this.f33101f;
        if (v11Var != null) {
            v11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
