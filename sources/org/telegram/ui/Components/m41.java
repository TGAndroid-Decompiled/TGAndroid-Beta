package org.telegram.ui.Components;

import android.text.TextPaint;
public final class m41 extends p41 {
    public static boolean h = true;
    public final int f30688e;
    public final vz0 f30689f;

    public m41(String str, int i9, vz0 vz0Var) {
        super(str, (vz0) null);
        this.f30688e = i9;
        this.f30689f = vz0Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i9;
        int i10;
        super.updateDrawState(textPaint);
        int i11 = this.f30688e;
        if (i11 == 2) {
            textPaint.setColor(-1);
        } else if (i11 == 1) {
            if (h) {
                i10 = org.telegram.ui.ActionBar.f6.f23079hc;
            } else {
                i10 = org.telegram.ui.ActionBar.f6.fc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        } else {
            if (h) {
                i9 = org.telegram.ui.ActionBar.f6.f23061gc;
            } else {
                i9 = org.telegram.ui.ActionBar.f6.ec;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        }
        vz0 vz0Var = this.f30689f;
        if (vz0Var != null) {
            vz0Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
