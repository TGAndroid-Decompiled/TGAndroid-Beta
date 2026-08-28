package org.telegram.ui.Components;

import android.text.TextPaint;
public final class s41 extends p41 {
    public final int f32362e;
    public final vz0 f32363f;

    public s41(String str, int i9, vz0 vz0Var) {
        super(str, (vz0) null);
        this.f32362e = i9;
        this.f32363f = vz0Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i9 = this.f32362e;
        if (i9 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.J6, false));
        } else if (i9 == 2) {
            textPaint.setColor(-1);
        } else if (i9 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23079hc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23061gc, false));
        }
        vz0 vz0Var = this.f32363f;
        if (vz0Var != null) {
            vz0Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
