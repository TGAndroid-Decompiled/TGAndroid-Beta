package org.telegram.ui.Components;

import android.text.TextPaint;
public final class m61 extends j61 {
    public final int e;
    public final l11 f28460f;

    public m61(String str, int i10, l11 l11Var) {
        super(str, (l11) null);
        this.e = i10;
        this.f28460f = l11Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i10 = this.e;
        if (i10 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.J6, false));
        } else if (i10 == 2) {
            textPaint.setColor(-1);
        } else if (i10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.hc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21052gc, false));
        }
        l11 l11Var = this.f28460f;
        if (l11Var != null) {
            l11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
