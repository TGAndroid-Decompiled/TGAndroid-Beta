package org.telegram.ui.Components;

import android.text.TextPaint;
public final class o41 extends r41 {
    public static boolean h = true;
    public final int f38012e;
    public final ez0 f38013f;

    public o41(String str, int i7, ez0 ez0Var) {
        super(str, (ez0) null);
        this.f38012e = i7;
        this.f38013f = ez0Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i7;
        int i10;
        super.updateDrawState(textPaint);
        int i11 = this.f38012e;
        if (i11 == 2) {
            textPaint.setColor(-1);
        } else if (i11 == 1) {
            if (h) {
                i10 = org.telegram.ui.ActionBar.n6.Yc;
            } else {
                i10 = org.telegram.ui.ActionBar.n6.Wc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
        } else {
            if (h) {
                i7 = org.telegram.ui.ActionBar.n6.Xc;
            } else {
                i7 = org.telegram.ui.ActionBar.n6.Vc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
        }
        ez0 ez0Var = this.f38013f;
        if (ez0Var != null) {
            ez0Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
