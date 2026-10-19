package org.telegram.ui.Components;

import android.text.TextPaint;
public final class h61 extends k61 {
    public static boolean h = true;
    public final int e;
    public final m11 f26791f;

    public h61(String str, int i10, m11 m11Var) {
        super(str, (m11) null);
        this.e = i10;
        this.f26791f = m11Var;
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
                i11 = org.telegram.ui.ActionBar.h6.hc;
            } else {
                i11 = org.telegram.ui.ActionBar.h6.fc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        } else {
            if (h) {
                i10 = org.telegram.ui.ActionBar.h6.f21048gc;
            } else {
                i10 = org.telegram.ui.ActionBar.h6.f21011ec;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        }
        m11 m11Var = this.f26791f;
        if (m11Var != null) {
            m11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
