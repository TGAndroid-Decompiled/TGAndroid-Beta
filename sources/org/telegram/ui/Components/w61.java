package org.telegram.ui.Components;

import android.text.TextPaint;
public final class w61 extends t61 {
    public final int f32561e;
    public final t11 f32562f;

    public w61(String str, int i10, t11 t11Var) {
        super(str, (t11) null);
        this.f32561e = i10;
        this.f32562f = t11Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i10 = this.f32561e;
        if (i10 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.J6, false));
        } else if (i10 == 2) {
            textPaint.setColor(-1);
        } else if (i10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20874hc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.gc, false));
        }
        t11 t11Var = this.f32562f;
        if (t11Var != null) {
            t11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
