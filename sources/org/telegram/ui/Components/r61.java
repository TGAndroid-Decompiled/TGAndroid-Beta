package org.telegram.ui.Components;

import android.text.TextPaint;
public final class r61 extends u61 {
    public static boolean h = true;
    public final int f30404e;
    public final u11 f30405f;

    public r61(String str, int i10, u11 u11Var) {
        super(str, (u11) null);
        this.f30404e = i10;
        this.f30405f = u11Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10;
        int i11;
        super.updateDrawState(textPaint);
        int i12 = this.f30404e;
        if (i12 == 2) {
            textPaint.setColor(-1);
        } else if (i12 == 1) {
            if (h) {
                i11 = org.telegram.ui.ActionBar.i6.f20878hc;
            } else {
                i11 = org.telegram.ui.ActionBar.i6.f20843fc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.i6.x0(null, i11, false));
        } else {
            if (h) {
                i10 = org.telegram.ui.ActionBar.i6.gc;
            } else {
                i10 = org.telegram.ui.ActionBar.i6.ec;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
        }
        u11 u11Var = this.f30405f;
        if (u11Var != null) {
            u11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
