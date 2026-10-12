package org.telegram.ui.Components;

import android.text.TextPaint;
public final class s61 extends p61 {
    public final int e;
    public final p11 f29049f;

    public s61(String str, int i10, p11 p11Var) {
        super(str, (p11) null);
        this.e = i10;
        this.f29049f = p11Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i10 = this.e;
        if (i10 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.J6, false));
        } else if (i10 == 2) {
            textPaint.setColor(-1);
        } else if (i10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.hc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19960gc, false));
        }
        p11 p11Var = this.f29049f;
        if (p11Var != null) {
            p11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
