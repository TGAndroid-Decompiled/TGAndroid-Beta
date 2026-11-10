package org.telegram.ui.Components;

import android.text.TextPaint;
public final class y31 extends b41 {
    public static boolean h = true;
    public final int f40486e;
    public final uy0 f40487f;

    public y31(String str, int i7, uy0 uy0Var) {
        super(str, (uy0) null);
        this.f40486e = i7;
        this.f40487f = uy0Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i7;
        int i10;
        super.updateDrawState(textPaint);
        int i11 = this.f40486e;
        if (i11 == 2) {
            textPaint.setColor(-1);
        } else if (i11 == 1) {
            if (h) {
                i10 = org.telegram.ui.ActionBar.m6.Vc;
            } else {
                i10 = org.telegram.ui.ActionBar.m6.Tc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        } else {
            if (h) {
                i7 = org.telegram.ui.ActionBar.m6.Uc;
            } else {
                i7 = org.telegram.ui.ActionBar.m6.Sc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        }
        uy0 uy0Var = this.f40487f;
        if (uy0Var != null) {
            uy0Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
