package org.telegram.ui.Components;

import android.text.TextPaint;
public final class c51 extends f51 {
    public static boolean h = true;
    public final int e;
    public final zz0 f25013f;

    public c51(String str, int i10, zz0 zz0Var) {
        super(str, (zz0) null);
        this.e = i10;
        this.f25013f = zz0Var;
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
                i11 = org.telegram.ui.ActionBar.t6.Vc;
            } else {
                i11 = org.telegram.ui.ActionBar.t6.Tc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        } else {
            if (h) {
                i10 = org.telegram.ui.ActionBar.t6.Uc;
            } else {
                i10 = org.telegram.ui.ActionBar.t6.Sc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        }
        zz0 zz0Var = this.f25013f;
        if (zz0Var != null) {
            zz0Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
