package org.telegram.ui.Components;

import android.text.TextPaint;
public final class r61 extends u61 {
    public static boolean h = true;
    public final int f30439e;
    public final u11 f30440f;

    public r61(String str, int i10, u11 u11Var) {
        super(str, (u11) null);
        this.f30439e = i10;
        this.f30440f = u11Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10;
        int i11;
        super.updateDrawState(textPaint);
        int i12 = this.f30439e;
        if (i12 == 2) {
            textPaint.setColor(-1);
        } else if (i12 == 1) {
            if (h) {
                i11 = org.telegram.ui.ActionBar.h6.f20899hc;
            } else {
                i11 = org.telegram.ui.ActionBar.h6.f20864fc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        } else {
            if (h) {
                i10 = org.telegram.ui.ActionBar.h6.gc;
            } else {
                i10 = org.telegram.ui.ActionBar.h6.ec;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        }
        u11 u11Var = this.f30440f;
        if (u11Var != null) {
            u11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
