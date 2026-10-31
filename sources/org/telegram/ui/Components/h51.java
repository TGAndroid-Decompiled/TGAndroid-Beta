package org.telegram.ui.Components;

import android.text.TextPaint;
public final class h51 extends e51 {
    public final int e;
    public final yz0 f26628f;

    public h51(String str, int i10, yz0 yz0Var) {
        super(str, (yz0) null);
        this.e = i10;
        this.f26628f = yz0Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i10 = this.e;
        if (i10 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.J6, false));
        } else if (i10 == 2) {
            textPaint.setColor(-1);
        } else if (i10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Vc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Uc, false));
        }
        yz0 yz0Var = this.f26628f;
        if (yz0Var != null) {
            yz0Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
