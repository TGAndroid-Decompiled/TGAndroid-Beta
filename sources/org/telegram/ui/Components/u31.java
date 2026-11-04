package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class u31 extends MetricAffectingSpan {
    public final CharSequence f38635a;
    public final int f38636b;
    public final int f38637c;
    public final byte d;
    public final ty0 f38638e;

    public u31(CharSequence charSequence, int i3, int i10, byte b10, ty0 ty0Var) {
        this.f38635a = charSequence;
        this.f38636b = i3;
        this.f38637c = i10;
        this.d = b10;
        this.f38638e = ty0Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSize(org.telegram.messenger.g0.L(org.telegram.messenger.az.W0 - 1));
        byte b10 = this.d;
        if (b10 == 2) {
            textPaint.setColor(-1);
        } else if (b10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Tc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Sc, false));
        }
        ty0 ty0Var = this.f38638e;
        if (ty0Var != null) {
            ty0Var.a(textPaint);
            return;
        }
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSize(org.telegram.messenger.g0.L(org.telegram.messenger.az.W0 - 1));
        textPaint.setFlags(textPaint.getFlags() | 128);
        ty0 ty0Var = this.f38638e;
        if (ty0Var != null) {
            ty0Var.a(textPaint);
        } else {
            textPaint.setTypeface(Typeface.MONOSPACE);
        }
    }
}
