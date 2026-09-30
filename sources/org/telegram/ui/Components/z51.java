package org.telegram.ui.Components;

import android.text.TextPaint;
public final class z51 extends c61 {
    public static boolean h = true;
    public final int e;
    public final e11 f30898f;

    public z51(String str, int i10, e11 e11Var) {
        super(str, (e11) null);
        this.e = i10;
        this.f30898f = e11Var;
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
                i11 = org.telegram.ui.ActionBar.h6.f19152hc;
            } else {
                i11 = org.telegram.ui.ActionBar.h6.f19117fc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
        } else {
            if (h) {
                i10 = org.telegram.ui.ActionBar.h6.gc;
            } else {
                i10 = org.telegram.ui.ActionBar.h6.ec;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        }
        e11 e11Var = this.f30898f;
        if (e11Var != null) {
            e11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
