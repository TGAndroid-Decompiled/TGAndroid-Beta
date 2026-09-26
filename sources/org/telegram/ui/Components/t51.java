package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class t51 extends MetricAffectingSpan {
    public Typeface f28468a;
    public int f28469b;
    public int f28470c;

    public t51(Typeface typeface) {
        this.f28470c = -1;
        this.f28468a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f28470c;
        if (i10 >= 0) {
            this.f28469b = org.telegram.ui.ActionBar.h6.w0(null, i10, false);
        }
        Typeface typeface = this.f28468a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i11 = this.f28469b;
        if (i11 != 0) {
            textPaint.setColor(i11);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f28468a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public t51() {
        Typeface typeface = Typeface.DEFAULT;
        this.f28470c = -1;
        this.f28468a = typeface;
    }

    public t51(Typeface typeface, int i10) {
        this.f28470c = -1;
        this.f28468a = typeface;
        this.f28469b = i10;
    }
}
