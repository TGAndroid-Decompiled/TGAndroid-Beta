package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class o41 extends MetricAffectingSpan {
    public final CharSequence f37958a;
    public final int f37959b;
    public final int f37960c;
    public final byte d;
    public final dz0 f37961e;

    public o41(CharSequence charSequence, int i7, int i10, byte b10, dz0 dz0Var) {
        this.f37958a = charSequence;
        this.f37959b = i7;
        this.f37960c = i10;
        this.d = b10;
        this.f37961e = dz0Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSize(org.telegram.messenger.g0.L(org.telegram.messenger.bz.W0 - 1));
        byte b10 = this.d;
        if (b10 == 2) {
            textPaint.setColor(-1);
        } else if (b10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Wc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Vc, false));
        }
        dz0 dz0Var = this.f37961e;
        if (dz0Var != null) {
            dz0Var.a(textPaint);
            return;
        }
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSize(org.telegram.messenger.g0.L(org.telegram.messenger.bz.W0 - 1));
        textPaint.setFlags(textPaint.getFlags() | 128);
        dz0 dz0Var = this.f37961e;
        if (dz0Var != null) {
            dz0Var.a(textPaint);
        } else {
            textPaint.setTypeface(Typeface.MONOSPACE);
        }
    }
}
