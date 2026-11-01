package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class e51 extends MetricAffectingSpan {
    public final CharSequence f25738a;
    public final int f25739b;
    public final int f25740c;
    public final byte d;
    public final zz0 e;

    public e51(CharSequence charSequence, int i10, int i11, byte b10, zz0 zz0Var) {
        this.f25738a = charSequence;
        this.f25739b = i10;
        this.f25740c = i11;
        this.d = b10;
        this.e = zz0Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSize(org.telegram.messenger.i0.L(org.telegram.messenger.uz.W0 - 1));
        byte b10 = this.d;
        if (b10 == 2) {
            textPaint.setColor(-1);
        } else if (b10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Tc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Sc, false));
        }
        zz0 zz0Var = this.e;
        if (zz0Var != null) {
            zz0Var.a(textPaint);
            return;
        }
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSize(org.telegram.messenger.i0.L(org.telegram.messenger.uz.W0 - 1));
        textPaint.setFlags(textPaint.getFlags() | 128);
        zz0 zz0Var = this.e;
        if (zz0Var != null) {
            zz0Var.a(textPaint);
        } else {
            textPaint.setTypeface(Typeface.MONOSPACE);
        }
    }
}
