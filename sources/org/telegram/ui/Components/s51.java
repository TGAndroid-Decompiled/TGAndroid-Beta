package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class s51 extends MetricAffectingSpan {
    public Typeface f28158a;
    public int f28159b;
    public int f28160c;

    public s51(Typeface typeface) {
        this.f28160c = -1;
        this.f28158a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f28160c;
        if (i10 >= 0) {
            this.f28159b = org.telegram.ui.ActionBar.h6.w0(null, i10, false);
        }
        Typeface typeface = this.f28158a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i11 = this.f28159b;
        if (i11 != 0) {
            textPaint.setColor(i11);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f28158a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public s51() {
        Typeface typeface = Typeface.DEFAULT;
        this.f28160c = -1;
        this.f28158a = typeface;
    }

    public s51(Typeface typeface, int i10) {
        this.f28160c = -1;
        this.f28158a = typeface;
        this.f28159b = i10;
    }
}
