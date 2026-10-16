package org.telegram.ui.Components;

import android.text.TextPaint;
public final class n61 extends q61 {
    public static boolean h = true;
    public final int e;
    public final q11 f27290f;

    public n61(String str, int i10, q11 q11Var) {
        super(str, (q11) null);
        this.e = i10;
        this.f27290f = q11Var;
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
                i11 = org.telegram.ui.ActionBar.g6.hc;
            } else {
                i11 = org.telegram.ui.ActionBar.g6.fc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        } else {
            if (h) {
                i10 = org.telegram.ui.ActionBar.g6.f19660gc;
            } else {
                i10 = org.telegram.ui.ActionBar.g6.f19623ec;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        }
        q11 q11Var = this.f27290f;
        if (q11Var != null) {
            q11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
