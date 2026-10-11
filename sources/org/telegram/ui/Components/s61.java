package org.telegram.ui.Components;

import android.text.TextPaint;
public final class s61 extends v61 {
    public static boolean h = true;
    public final int f30654e;
    public final v11 f30655f;

    public s61(String str, int i10, v11 v11Var) {
        super(str, (v11) null);
        this.f30654e = i10;
        this.f30655f = v11Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10;
        int i11;
        super.updateDrawState(textPaint);
        int i12 = this.f30654e;
        if (i12 == 2) {
            textPaint.setColor(-1);
        } else if (i12 == 1) {
            if (h) {
                i11 = org.telegram.ui.ActionBar.h6.f20863hc;
            } else {
                i11 = org.telegram.ui.ActionBar.h6.f20828fc;
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
        v11 v11Var = this.f30655f;
        if (v11Var != null) {
            v11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
