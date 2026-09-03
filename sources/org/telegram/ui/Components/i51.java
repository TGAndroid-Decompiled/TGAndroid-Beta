package org.telegram.ui.Components;

import android.text.TextPaint;
public final class i51 extends l51 {
    public static boolean h = true;
    public final int f27719e;
    public final s01 f27720f;

    public i51(String str, int i10, s01 s01Var) {
        super(str, (s01) null);
        this.f27719e = i10;
        this.f27720f = s01Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10;
        int i11;
        super.updateDrawState(textPaint);
        int i12 = this.f27719e;
        if (i12 == 2) {
            textPaint.setColor(-1);
        } else if (i12 == 1) {
            if (h) {
                i11 = org.telegram.ui.ActionBar.k6.f21739hc;
            } else {
                i11 = org.telegram.ui.ActionBar.k6.f21703fc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        } else {
            if (h) {
                i10 = org.telegram.ui.ActionBar.k6.f21722gc;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.f21685ec;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        }
        s01 s01Var = this.f27720f;
        if (s01Var != null) {
            s01Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
