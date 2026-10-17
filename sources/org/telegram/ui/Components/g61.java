package org.telegram.ui.Components;

import android.text.TextPaint;
public final class g61 extends j61 {
    public static boolean h = true;
    public final int e;
    public final l11 f26488f;

    public g61(String str, int i10, l11 l11Var) {
        super(str, (l11) null);
        this.e = i10;
        this.f26488f = l11Var;
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
                i10 = org.telegram.ui.ActionBar.h6.f21045gc;
            } else {
                i10 = org.telegram.ui.ActionBar.h6.f21008ec;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        }
        l11 l11Var = this.f26488f;
        if (l11Var != null) {
            l11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
