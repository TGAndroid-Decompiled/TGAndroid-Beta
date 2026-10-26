package org.telegram.ui.Components;

import android.text.TextPaint;
public final class u61 extends x61 {
    public static boolean h = true;
    public final int e;
    public final y11 f33260f;

    public u61(String str, int i10, y11 y11Var) {
        super(str, (y11) null);
        this.e = i10;
        this.f33260f = y11Var;
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
                i11 = org.telegram.ui.ActionBar.y6.f23434hc;
            } else {
                i11 = org.telegram.ui.ActionBar.y6.f23398fc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
        } else {
            if (h) {
                i10 = org.telegram.ui.ActionBar.y6.gc;
            } else {
                i10 = org.telegram.ui.ActionBar.y6.f23380ec;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        }
        y11 y11Var = this.f33260f;
        if (y11Var != null) {
            y11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
