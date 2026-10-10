package org.telegram.ui.Components;

import android.text.TextPaint;
public final class x61 extends u61 {
    public final int f32850e;
    public final u11 f32851f;

    public x61(String str, int i10, u11 u11Var) {
        super(str, (u11) null);
        this.f32850e = i10;
        this.f32851f = u11Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i10 = this.f32850e;
        if (i10 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.J6, false));
        } else if (i10 == 2) {
            textPaint.setColor(-1);
        } else if (i10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20878hc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.gc, false));
        }
        u11 u11Var = this.f32851f;
        if (u11Var != null) {
            u11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
