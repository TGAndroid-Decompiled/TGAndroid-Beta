package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class e41 extends MetricAffectingSpan {
    public final CharSequence f34186a;
    public final int f34187b;
    public final int f34188c;
    public final byte d;
    public final wy0 f34189e;

    public e41(CharSequence charSequence, int i7, int i10, byte b10, wy0 wy0Var) {
        this.f34186a = charSequence;
        this.f34187b = i7;
        this.f34188c = i10;
        this.d = b10;
        this.f34189e = wy0Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSize(org.telegram.messenger.g0.L(org.telegram.messenger.gz.W0 - 1));
        byte b10 = this.d;
        if (b10 == 2) {
            textPaint.setColor(-1);
        } else if (b10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Wc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Vc, false));
        }
        wy0 wy0Var = this.f34189e;
        if (wy0Var != null) {
            wy0Var.a(textPaint);
            return;
        }
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSize(org.telegram.messenger.g0.L(org.telegram.messenger.gz.W0 - 1));
        textPaint.setFlags(textPaint.getFlags() | 128);
        wy0 wy0Var = this.f34189e;
        if (wy0Var != null) {
            wy0Var.a(textPaint);
        } else {
            textPaint.setTypeface(Typeface.MONOSPACE);
        }
    }
}
