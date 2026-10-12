package org.telegram.ui.Components;

import android.text.TextPaint;
public final class v61 extends y61 {
    public static boolean h = true;
    public final int f31444e;
    public final z11 f31445f;

    public v61(String str, int i10, z11 z11Var) {
        super(str, (z11) null);
        this.f31444e = i10;
        this.f31445f = z11Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10;
        int i11;
        super.updateDrawState(textPaint);
        int i12 = this.f31444e;
        if (i12 == 2) {
            textPaint.setColor(-1);
        } else if (i12 == 1) {
            if (h) {
                i11 = org.telegram.ui.ActionBar.h6.f20636hc;
            } else {
                i11 = org.telegram.ui.ActionBar.h6.f20601fc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        } else {
            if (h) {
                i10 = org.telegram.ui.ActionBar.h6.gc;
            } else {
                i10 = org.telegram.ui.ActionBar.h6.ec;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        }
        z11 z11Var = this.f31445f;
        if (z11Var != null) {
            z11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
