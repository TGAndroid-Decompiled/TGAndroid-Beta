package org.telegram.ui.Components;

import android.text.TextPaint;
public final class k51 extends n51 {
    public static boolean h = true;
    public final int f28273e;
    public final t01 f28274f;

    public k51(String str, int i10, t01 t01Var) {
        super(str, (t01) null);
        this.f28273e = i10;
        this.f28274f = t01Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10;
        int i11;
        super.updateDrawState(textPaint);
        int i12 = this.f28273e;
        if (i12 == 2) {
            textPaint.setColor(-1);
        } else if (i12 == 1) {
            if (h) {
                i11 = org.telegram.ui.ActionBar.k6.f21737hc;
            } else {
                i11 = org.telegram.ui.ActionBar.k6.f21701fc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        } else {
            if (h) {
                i10 = org.telegram.ui.ActionBar.k6.f21720gc;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.f21683ec;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        }
        t01 t01Var = this.f28274f;
        if (t01Var != null) {
            t01Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
