package org.telegram.ui.Components;

import android.text.TextPaint;
public final class i61 extends l61 {
    public static boolean h = true;
    public final int f27411e;
    public final n11 f27412f;

    public i61(String str, int i10, n11 n11Var) {
        super(str, (n11) null);
        this.f27411e = i10;
        this.f27412f = n11Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10;
        int i11;
        super.updateDrawState(textPaint);
        int i12 = this.f27411e;
        if (i12 == 2) {
            textPaint.setColor(-1);
        } else if (i12 == 1) {
            if (h) {
                i11 = org.telegram.ui.ActionBar.i6.f20905hc;
            } else {
                i11 = org.telegram.ui.ActionBar.i6.f20869fc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        } else {
            if (h) {
                i10 = org.telegram.ui.ActionBar.i6.gc;
            } else {
                i10 = org.telegram.ui.ActionBar.i6.ec;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        }
        n11 n11Var = this.f27412f;
        if (n11Var != null) {
            n11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
