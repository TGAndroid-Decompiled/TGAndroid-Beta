package org.telegram.ui.Components;

import android.text.TextPaint;
public final class p41 extends s41 {
    public static boolean h = true;
    public final int f38441e;
    public final fz0 f38442f;

    public p41(String str, int i7, fz0 fz0Var) {
        super(str, (fz0) null);
        this.f38441e = i7;
        this.f38442f = fz0Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i7;
        int i10;
        super.updateDrawState(textPaint);
        int i11 = this.f38441e;
        if (i11 == 2) {
            textPaint.setColor(-1);
        } else if (i11 == 1) {
            if (h) {
                i10 = org.telegram.ui.ActionBar.m6.Yc;
            } else {
                i10 = org.telegram.ui.ActionBar.m6.Wc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        } else {
            if (h) {
                i7 = org.telegram.ui.ActionBar.m6.Xc;
            } else {
                i7 = org.telegram.ui.ActionBar.m6.Vc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        }
        fz0 fz0Var = this.f38442f;
        if (fz0Var != null) {
            fz0Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
