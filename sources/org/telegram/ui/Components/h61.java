package org.telegram.ui.Components;

import android.text.TextPaint;
public final class h61 extends k61 {
    public static boolean h = true;
    public final int f27029e;
    public final m11 f27030f;

    public h61(String str, int i10, m11 m11Var) {
        super(str, (m11) null);
        this.f27029e = i10;
        this.f27030f = m11Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10;
        int i11;
        super.updateDrawState(textPaint);
        int i12 = this.f27029e;
        if (i12 == 2) {
            textPaint.setColor(-1);
        } else if (i12 == 1) {
            if (h) {
                i11 = org.telegram.ui.ActionBar.i6.f20896hc;
            } else {
                i11 = org.telegram.ui.ActionBar.i6.f20860fc;
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
        m11 m11Var = this.f27030f;
        if (m11Var != null) {
            m11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
