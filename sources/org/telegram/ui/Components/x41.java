package org.telegram.ui.Components;

import android.text.TextPaint;
public final class x41 extends a51 {
    public static boolean h = true;
    public final int f34570e;
    public final h01 f34571f;

    public x41(String str, int i10, h01 h01Var) {
        super(str, (h01) null);
        this.f34570e = i10;
        this.f34571f = h01Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10;
        int i11;
        super.updateDrawState(textPaint);
        int i12 = this.f34570e;
        if (i12 == 2) {
            textPaint.setColor(-1);
        } else if (i12 == 1) {
            if (h) {
                i11 = org.telegram.ui.ActionBar.g6.hc;
            } else {
                i11 = org.telegram.ui.ActionBar.g6.f23104fc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        } else {
            if (h) {
                i10 = org.telegram.ui.ActionBar.g6.gc;
            } else {
                i10 = org.telegram.ui.ActionBar.g6.f23086ec;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        }
        h01 h01Var = this.f34571f;
        if (h01Var != null) {
            h01Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
