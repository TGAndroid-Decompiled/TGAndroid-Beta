package org.telegram.ui.Components;

import android.text.TextPaint;
public final class p51 extends m51 {
    public final int e;
    public final s01 f27756f;

    public p51(String str, int i10, s01 s01Var) {
        super(str, (s01) null);
        this.e = i10;
        this.f27756f = s01Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i10 = this.e;
        if (i10 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false));
        } else if (i10 == 2) {
            textPaint.setColor(-1);
        } else if (i10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19983hc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19966gc, false));
        }
        s01 s01Var = this.f27756f;
        if (s01Var != null) {
            s01Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
