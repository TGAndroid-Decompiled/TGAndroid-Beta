package org.telegram.ui.Components;

import android.text.TextPaint;
public final class s31 extends v31 {
    public static boolean h = true;
    public final int f37896e;
    public final ty0 f37897f;

    public s31(String str, int i3, ty0 ty0Var) {
        super(str, (ty0) null);
        this.f37896e = i3;
        this.f37897f = ty0Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i3;
        int i10;
        super.updateDrawState(textPaint);
        int i11 = this.f37896e;
        if (i11 == 2) {
            textPaint.setColor(-1);
        } else if (i11 == 1) {
            if (h) {
                i10 = org.telegram.ui.ActionBar.k6.Vc;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.Tc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        } else {
            if (h) {
                i3 = org.telegram.ui.ActionBar.k6.Uc;
            } else {
                i3 = org.telegram.ui.ActionBar.k6.Sc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
        }
        ty0 ty0Var = this.f37897f;
        if (ty0Var != null) {
            ty0Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
