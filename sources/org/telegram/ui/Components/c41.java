package org.telegram.ui.Components;

import android.text.TextPaint;
public final class c41 extends f41 {
    public static boolean h = true;
    public final int f33503e;
    public final wy0 f33504f;

    public c41(String str, int i7, wy0 wy0Var) {
        super(str, (wy0) null);
        this.f33503e = i7;
        this.f33504f = wy0Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i7;
        int i10;
        super.updateDrawState(textPaint);
        int i11 = this.f33503e;
        if (i11 == 2) {
            textPaint.setColor(-1);
        } else if (i11 == 1) {
            if (h) {
                i10 = org.telegram.ui.ActionBar.j6.Yc;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.Wc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.j6.x0(null, i10, false));
        } else {
            if (h) {
                i7 = org.telegram.ui.ActionBar.j6.Xc;
            } else {
                i7 = org.telegram.ui.ActionBar.j6.Vc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.j6.x0(null, i7, false));
        }
        wy0 wy0Var = this.f33504f;
        if (wy0Var != null) {
            wy0Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
