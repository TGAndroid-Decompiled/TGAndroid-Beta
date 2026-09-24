package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class s51 extends MetricAffectingSpan {
    public Typeface f28150a;
    public int f28151b;
    public int f28152c;

    public s51(Typeface typeface) {
        this.f28152c = -1;
        this.f28150a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f28152c;
        if (i10 >= 0) {
            this.f28151b = org.telegram.ui.ActionBar.h6.w0(null, i10, false);
        }
        Typeface typeface = this.f28150a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i11 = this.f28151b;
        if (i11 != 0) {
            textPaint.setColor(i11);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f28150a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public s51() {
        Typeface typeface = Typeface.DEFAULT;
        this.f28152c = -1;
        this.f28150a = typeface;
    }

    public s51(Typeface typeface, int i10) {
        this.f28152c = -1;
        this.f28150a = typeface;
        this.f28151b = i10;
    }
}
