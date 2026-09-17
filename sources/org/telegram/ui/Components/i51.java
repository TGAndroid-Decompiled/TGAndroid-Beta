package org.telegram.ui.Components;

import android.text.TextPaint;
public final class i51 extends l51 {
    public static boolean h = true;
    public final int f26973e;
    public final n01 f26974f;

    public i51(String str, int i10, n01 n01Var) {
        super(str, (n01) null);
        this.f26973e = i10;
        this.f26974f = n01Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10;
        int i11;
        super.updateDrawState(textPaint);
        int i12 = this.f26973e;
        if (i12 == 2) {
            textPaint.setColor(-1);
        } else if (i12 == 1) {
            if (h) {
                i11 = org.telegram.ui.ActionBar.j6.f20741hc;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.f20706fc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        } else {
            if (h) {
                i10 = org.telegram.ui.ActionBar.j6.gc;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.ec;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        }
        n01 n01Var = this.f26974f;
        if (n01Var != null) {
            n01Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
