package org.telegram.ui.Components;

import android.text.TextPaint;
public final class m61 extends p61 {
    public static boolean h = true;
    public final int e;
    public final p11 f28524f;

    public m61(String str, int i10, p11 p11Var) {
        super(str, (p11) null);
        this.e = i10;
        this.f28524f = p11Var;
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
                i11 = org.telegram.ui.ActionBar.k6.hc;
            } else {
                i11 = org.telegram.ui.ActionBar.k6.fc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        } else {
            if (h) {
                i10 = org.telegram.ui.ActionBar.k6.f21243gc;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.f21206ec;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        }
        p11 p11Var = this.f28524f;
        if (p11Var != null) {
            p11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
