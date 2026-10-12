package org.telegram.ui.Components;

import android.text.TextPaint;
public final class b71 extends y61 {
    public final int f24579e;
    public final z11 f24580f;

    public b71(String str, int i10, z11 z11Var) {
        super(str, (z11) null);
        this.f24579e = i10;
        this.f24580f = z11Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i10 = this.f24579e;
        if (i10 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.J6, false));
        } else if (i10 == 2) {
            textPaint.setColor(-1);
        } else if (i10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20636hc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.gc, false));
        }
        z11 z11Var = this.f24580f;
        if (z11Var != null) {
            z11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
