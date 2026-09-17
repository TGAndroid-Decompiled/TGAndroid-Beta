package org.telegram.ui.Components;

import android.text.TextPaint;
public final class k51 extends n51 {
    public static boolean h = true;
    public final int e;
    public final p01 f25569f;

    public k51(String str, int i10, p01 p01Var) {
        super(str, (p01) null);
        this.e = i10;
        this.f25569f = p01Var;
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
                i11 = org.telegram.ui.ActionBar.j6.f18939hc;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.f18903fc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        } else {
            if (h) {
                i10 = org.telegram.ui.ActionBar.j6.gc;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.ec;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        }
        p01 p01Var = this.f25569f;
        if (p01Var != null) {
            p01Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
