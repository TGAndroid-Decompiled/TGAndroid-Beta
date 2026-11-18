package org.telegram.ui.Components;

import android.text.TextPaint;
public final class m41 extends p41 {
    public static boolean h = true;
    public final int f37355e;
    public final dz0 f37356f;

    public m41(String str, int i7, dz0 dz0Var) {
        super(str, (dz0) null);
        this.f37355e = i7;
        this.f37356f = dz0Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i7;
        int i10;
        super.updateDrawState(textPaint);
        int i11 = this.f37355e;
        if (i11 == 2) {
            textPaint.setColor(-1);
        } else if (i11 == 1) {
            if (h) {
                i10 = org.telegram.ui.ActionBar.n6.Yc;
            } else {
                i10 = org.telegram.ui.ActionBar.n6.Wc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
        } else {
            if (h) {
                i7 = org.telegram.ui.ActionBar.n6.Xc;
            } else {
                i7 = org.telegram.ui.ActionBar.n6.Vc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
        }
        dz0 dz0Var = this.f37356f;
        if (dz0Var != null) {
            dz0Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
