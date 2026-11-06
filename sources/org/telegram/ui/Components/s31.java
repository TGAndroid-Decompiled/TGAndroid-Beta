package org.telegram.ui.Components;

import android.text.TextPaint;
public final class s31 extends v31 {
    public static boolean h = true;
    public final int f37929e;
    public final ty0 f37930f;

    public s31(String str, int i7, ty0 ty0Var) {
        super(str, (ty0) null);
        this.f37929e = i7;
        this.f37930f = ty0Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i7;
        int i10;
        super.updateDrawState(textPaint);
        int i11 = this.f37929e;
        if (i11 == 2) {
            textPaint.setColor(-1);
        } else if (i11 == 1) {
            if (h) {
                i10 = org.telegram.ui.ActionBar.k6.Vc;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.Tc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        } else {
            if (h) {
                i7 = org.telegram.ui.ActionBar.k6.Uc;
            } else {
                i7 = org.telegram.ui.ActionBar.k6.Sc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
        }
        ty0 ty0Var = this.f37930f;
        if (ty0Var != null) {
            ty0Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
