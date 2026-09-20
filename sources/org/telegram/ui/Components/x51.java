package org.telegram.ui.Components;

import android.text.TextPaint;
public final class x51 extends a61 {
    public static boolean h = true;
    public final int e;
    public final c11 f30175f;

    public x51(String str, int i10, c11 c11Var) {
        super(str, (c11) null);
        this.e = i10;
        this.f30175f = c11Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10;
        int i11;
        super.updateDrawState(textPaint);
        int i12 = this.e;
        if (i12 == 2) {
            textPaint.setColor(-1);
        } else if (i12 == 1) {
            if (h) {
                i11 = org.telegram.ui.ActionBar.j6.f19171hc;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.f19135fc;
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
        c11 c11Var = this.f30175f;
        if (c11Var != null) {
            c11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
