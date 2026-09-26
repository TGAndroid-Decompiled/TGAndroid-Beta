package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class s51 extends MetricAffectingSpan {
    public Typeface f28157a;
    public int f28158b;
    public int f28159c;

    public s51(Typeface typeface) {
        this.f28159c = -1;
        this.f28157a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f28159c;
        if (i10 >= 0) {
            this.f28158b = org.telegram.ui.ActionBar.h6.w0(null, i10, false);
        }
        Typeface typeface = this.f28157a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i11 = this.f28158b;
        if (i11 != 0) {
            textPaint.setColor(i11);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f28157a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public s51() {
        Typeface typeface = Typeface.DEFAULT;
        this.f28159c = -1;
        this.f28157a = typeface;
    }

    public s51(Typeface typeface, int i10) {
        this.f28159c = -1;
        this.f28157a = typeface;
        this.f28158b = i10;
    }
}
