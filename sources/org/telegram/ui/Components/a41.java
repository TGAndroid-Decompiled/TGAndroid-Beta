package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class a41 extends MetricAffectingSpan {
    public final CharSequence f31700a;
    public final int f31701b;
    public final int f31702c;
    public final byte d;
    public final uy0 f31703e;

    public a41(CharSequence charSequence, int i7, int i10, byte b10, uy0 uy0Var) {
        this.f31700a = charSequence;
        this.f31701b = i7;
        this.f31702c = i10;
        this.d = b10;
        this.f31703e = uy0Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSize(org.telegram.messenger.g0.L(org.telegram.messenger.iz.W0 - 1));
        byte b10 = this.d;
        if (b10 == 2) {
            textPaint.setColor(-1);
        } else if (b10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Tc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Sc, false));
        }
        uy0 uy0Var = this.f31703e;
        if (uy0Var != null) {
            uy0Var.a(textPaint);
            return;
        }
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSize(org.telegram.messenger.g0.L(org.telegram.messenger.iz.W0 - 1));
        textPaint.setFlags(textPaint.getFlags() | 128);
        uy0 uy0Var = this.f31703e;
        if (uy0Var != null) {
            uy0Var.a(textPaint);
        } else {
            textPaint.setTypeface(Typeface.MONOSPACE);
        }
    }
}
