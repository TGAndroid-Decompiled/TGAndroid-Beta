package org.telegram.ui.Components;

import android.text.TextPaint;
public final class b51 extends e51 {
    public static boolean h = true;
    public final int e;
    public final yz0 f24546f;

    public b51(String str, int i10, yz0 yz0Var) {
        super(str, (yz0) null);
        this.e = i10;
        this.f24546f = yz0Var;
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
                i11 = org.telegram.ui.ActionBar.t6.Vc;
            } else {
                i11 = org.telegram.ui.ActionBar.t6.Tc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        } else {
            if (h) {
                i10 = org.telegram.ui.ActionBar.t6.Uc;
            } else {
                i10 = org.telegram.ui.ActionBar.t6.Sc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        }
        yz0 yz0Var = this.f24546f;
        if (yz0Var != null) {
            yz0Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
