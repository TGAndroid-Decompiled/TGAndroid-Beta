package org.telegram.ui.Components;

import android.text.TextPaint;
public final class v61 extends y61 {
    public static boolean h = true;
    public final int e;
    public final z11 f33574f;

    public v61(String str, int i10, z11 z11Var) {
        super(str, (z11) null);
        this.e = i10;
        this.f33574f = z11Var;
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
                i11 = org.telegram.ui.ActionBar.y6.f23435hc;
            } else {
                i11 = org.telegram.ui.ActionBar.y6.f23399fc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
        } else {
            if (h) {
                i10 = org.telegram.ui.ActionBar.y6.gc;
            } else {
                i10 = org.telegram.ui.ActionBar.y6.f23381ec;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        }
        z11 z11Var = this.f33574f;
        if (z11Var != null) {
            z11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
