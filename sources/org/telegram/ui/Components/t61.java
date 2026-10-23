package org.telegram.ui.Components;

import android.text.TextPaint;
public final class t61 extends q61 {
    public final int e;
    public final q11 f30654f;

    public t61(String str, int i10, q11 q11Var) {
        super(str, (q11) null);
        this.e = i10;
        this.f30654f = q11Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i10 = this.e;
        if (i10 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.J6, false));
        } else if (i10 == 2) {
            textPaint.setColor(-1);
        } else if (i10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.hc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21242gc, false));
        }
        q11 q11Var = this.f30654f;
        if (q11Var != null) {
            q11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
