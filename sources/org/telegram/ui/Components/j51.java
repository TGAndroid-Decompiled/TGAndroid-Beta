package org.telegram.ui.Components;

import android.text.TextPaint;
public final class j51 extends m51 {
    public static boolean h = true;
    public final int e;
    public final s01 f25882f;

    public j51(String str, int i10, s01 s01Var) {
        super(str, (s01) null);
        this.e = i10;
        this.f25882f = s01Var;
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
                i11 = org.telegram.ui.ActionBar.j6.f19983hc;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.f19947fc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        } else {
            if (h) {
                i10 = org.telegram.ui.ActionBar.j6.f19966gc;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.f19929ec;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        }
        s01 s01Var = this.f25882f;
        if (s01Var != null) {
            s01Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
