package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class u31 extends MetricAffectingSpan {
    public Typeface f38494a;
    public int f38495b;
    public int f38496c;

    public u31(Typeface typeface) {
        this.f38496c = -1;
        this.f38494a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i7 = this.f38496c;
        if (i7 >= 0) {
            this.f38495b = org.telegram.ui.ActionBar.k6.v0(i7);
        }
        Typeface typeface = this.f38494a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i10 = this.f38495b;
        if (i10 != 0) {
            textPaint.setColor(i10);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f38494a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public u31() {
        Typeface typeface = Typeface.DEFAULT;
        this.f38496c = -1;
        this.f38494a = typeface;
    }

    public u31(Typeface typeface, int i7) {
        this.f38496c = -1;
        this.f38494a = typeface;
        this.f38495b = i7;
    }
}
