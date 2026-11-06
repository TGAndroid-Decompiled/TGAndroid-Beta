package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class z31 extends MetricAffectingSpan {
    public final CharSequence f40857a;
    public final int f40858b;
    public final int f40859c;
    public final byte d;
    public final ty0 f40860e;

    public z31(CharSequence charSequence, int i7, int i10, byte b10, ty0 ty0Var) {
        this.f40857a = charSequence;
        this.f40858b = i7;
        this.f40859c = i10;
        this.d = b10;
        this.f40860e = ty0Var;
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
        ty0 ty0Var = this.f40860e;
        if (ty0Var != null) {
            ty0Var.a(textPaint);
            return;
        }
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSize(org.telegram.messenger.g0.L(org.telegram.messenger.iz.W0 - 1));
        textPaint.setFlags(textPaint.getFlags() | 128);
        ty0 ty0Var = this.f40860e;
        if (ty0Var != null) {
            ty0Var.a(textPaint);
        } else {
            textPaint.setTypeface(Typeface.MONOSPACE);
        }
    }
}
