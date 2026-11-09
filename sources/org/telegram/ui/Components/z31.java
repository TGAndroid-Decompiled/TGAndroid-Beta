package org.telegram.ui.Components;

import android.text.TextPaint;
public final class z31 extends c41 {
    public static boolean h = true;
    public final int f40891e;
    public final vy0 f40892f;

    public z31(String str, int i7, vy0 vy0Var) {
        super(str, (vy0) null);
        this.f40891e = i7;
        this.f40892f = vy0Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i7;
        int i10;
        super.updateDrawState(textPaint);
        int i11 = this.f40891e;
        if (i11 == 2) {
            textPaint.setColor(-1);
        } else if (i11 == 1) {
            if (h) {
                i10 = org.telegram.ui.ActionBar.l6.Vc;
            } else {
                i10 = org.telegram.ui.ActionBar.l6.Tc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.l6.x0(null, i10, false));
        } else {
            if (h) {
                i7 = org.telegram.ui.ActionBar.l6.Uc;
            } else {
                i7 = org.telegram.ui.ActionBar.l6.Sc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.l6.x0(null, i7, false));
        }
        vy0 vy0Var = this.f40892f;
        if (vy0Var != null) {
            vy0Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
