package org.telegram.ui.Components;

import android.text.TextPaint;
public final class q61 extends t61 {
    public static boolean h = true;
    public final int f30091e;
    public final t11 f30092f;

    public q61(String str, int i10, t11 t11Var) {
        super(str, (t11) null);
        this.f30091e = i10;
        this.f30092f = t11Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10;
        int i11;
        super.updateDrawState(textPaint);
        int i12 = this.f30091e;
        if (i12 == 2) {
            textPaint.setColor(-1);
        } else if (i12 == 1) {
            if (h) {
                i11 = org.telegram.ui.ActionBar.i6.f20874hc;
            } else {
                i11 = org.telegram.ui.ActionBar.i6.f20839fc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.i6.x0(null, i11, false));
        } else {
            if (h) {
                i10 = org.telegram.ui.ActionBar.i6.gc;
            } else {
                i10 = org.telegram.ui.ActionBar.i6.ec;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
        }
        t11 t11Var = this.f30092f;
        if (t11Var != null) {
            t11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
