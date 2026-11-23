package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class r41 extends MetricAffectingSpan {
    public final CharSequence f39026a;
    public final int f39027b;
    public final int f39028c;
    public final byte d;
    public final fz0 f39029e;

    public r41(CharSequence charSequence, int i7, int i10, byte b10, fz0 fz0Var) {
        this.f39026a = charSequence;
        this.f39027b = i7;
        this.f39028c = i10;
        this.d = b10;
        this.f39029e = fz0Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSize(org.telegram.messenger.g0.L(org.telegram.messenger.cz.W0 - 1));
        byte b10 = this.d;
        if (b10 == 2) {
            textPaint.setColor(-1);
        } else if (b10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Wc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Vc, false));
        }
        fz0 fz0Var = this.f39029e;
        if (fz0Var != null) {
            fz0Var.a(textPaint);
            return;
        }
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSize(org.telegram.messenger.g0.L(org.telegram.messenger.cz.W0 - 1));
        textPaint.setFlags(textPaint.getFlags() | 128);
        fz0 fz0Var = this.f39029e;
        if (fz0Var != null) {
            fz0Var.a(textPaint);
        } else {
            textPaint.setTypeface(Typeface.MONOSPACE);
        }
    }
}
