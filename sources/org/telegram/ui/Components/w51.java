package org.telegram.ui.Components;

import android.text.TextPaint;
public final class w51 extends z51 {
    public static boolean h = true;
    public final int e;
    public final b11 f28665f;

    public w51(String str, int i10, b11 b11Var) {
        super(str, (b11) null);
        this.e = i10;
        this.f28665f = b11Var;
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
                i11 = org.telegram.ui.ActionBar.j6.f18004hc;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.f17969fc;
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
        b11 b11Var = this.f28665f;
        if (b11Var != null) {
            b11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
