package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class b41 extends MetricAffectingSpan {
    public final CharSequence f32098a;
    public final int f32099b;
    public final int f32100c;
    public final byte d;
    public final vy0 f32101e;

    public b41(CharSequence charSequence, int i7, int i10, byte b10, vy0 vy0Var) {
        this.f32098a = charSequence;
        this.f32099b = i7;
        this.f32100c = i10;
        this.d = b10;
        this.f32101e = vy0Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSize(org.telegram.messenger.g0.L(org.telegram.messenger.iz.W0 - 1));
        byte b10 = this.d;
        if (b10 == 2) {
            textPaint.setColor(-1);
        } else if (b10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Tc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Sc, false));
        }
        vy0 vy0Var = this.f32101e;
        if (vy0Var != null) {
            vy0Var.a(textPaint);
            return;
        }
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSize(org.telegram.messenger.g0.L(org.telegram.messenger.iz.W0 - 1));
        textPaint.setFlags(textPaint.getFlags() | 128);
        vy0 vy0Var = this.f32101e;
        if (vy0Var != null) {
            vy0Var.a(textPaint);
        } else {
            textPaint.setTypeface(Typeface.MONOSPACE);
        }
    }
}
