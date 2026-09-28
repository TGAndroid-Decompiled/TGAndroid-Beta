package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class u51 extends MetricAffectingSpan {
    public Typeface f28749a;
    public int f28750b;
    public int f28751c;

    public u51(Typeface typeface) {
        this.f28751c = -1;
        this.f28749a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f28751c;
        if (i10 >= 0) {
            this.f28750b = org.telegram.ui.ActionBar.h6.w0(null, i10, false);
        }
        Typeface typeface = this.f28749a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i11 = this.f28750b;
        if (i11 != 0) {
            textPaint.setColor(i11);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f28749a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public u51() {
        Typeface typeface = Typeface.DEFAULT;
        this.f28751c = -1;
        this.f28749a = typeface;
    }

    public u51(Typeface typeface, int i10) {
        this.f28751c = -1;
        this.f28749a = typeface;
        this.f28750b = i10;
    }
}
