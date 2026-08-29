package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class t41 extends MetricAffectingSpan {
    public Typeface f32866a;
    public int f32867b;
    public int f32868c;

    public t41(Typeface typeface) {
        this.f32868c = -1;
        this.f32866a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f32868c;
        if (i10 >= 0) {
            this.f32867b = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        }
        Typeface typeface = this.f32866a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i11 = this.f32867b;
        if (i11 != 0) {
            textPaint.setColor(i11);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f32866a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public t41() {
        Typeface typeface = Typeface.DEFAULT;
        this.f32868c = -1;
        this.f32866a = typeface;
    }

    public t41(Typeface typeface, int i10) {
        this.f32868c = -1;
        this.f32866a = typeface;
        this.f32867b = i10;
    }
}
