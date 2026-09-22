package org.telegram.ui.Components;

import android.text.TextPaint;
public final class j51 extends m51 {
    public static boolean h = true;
    public final int e;
    public final o01 f25233f;

    public j51(String str, int i10, o01 o01Var) {
        super(str, (o01) null);
        this.e = i10;
        this.f25233f = o01Var;
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
                i11 = org.telegram.ui.ActionBar.i6.f18910hc;
            } else {
                i11 = org.telegram.ui.ActionBar.i6.f18875fc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        } else {
            if (h) {
                i10 = org.telegram.ui.ActionBar.i6.gc;
            } else {
                i10 = org.telegram.ui.ActionBar.i6.ec;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        }
        o01 o01Var = this.f25233f;
        if (o01Var != null) {
            o01Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
