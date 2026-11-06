package org.telegram.ui.Components;

import android.text.TextPaint;
public final class x31 extends a41 {
    public static boolean h = true;
    public final int f40150e;
    public final ty0 f40151f;

    public x31(String str, int i7, ty0 ty0Var) {
        super(str, (ty0) null);
        this.f40150e = i7;
        this.f40151f = ty0Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i7;
        int i10;
        super.updateDrawState(textPaint);
        int i11 = this.f40150e;
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
        ty0 ty0Var = this.f40151f;
        if (ty0Var != null) {
            ty0Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
