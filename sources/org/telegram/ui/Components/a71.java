package org.telegram.ui.Components;

import android.text.TextPaint;
public final class a71 extends x61 {
    public final int e;
    public final y11 f26429f;

    public a71(String str, int i10, y11 y11Var) {
        super(str, (y11) null);
        this.e = i10;
        this.f26429f = y11Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i10 = this.e;
        if (i10 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.J6, false));
        } else if (i10 == 2) {
            textPaint.setColor(-1);
        } else if (i10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23434hc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.gc, false));
        }
        y11 y11Var = this.f26429f;
        if (y11Var != null) {
            y11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
