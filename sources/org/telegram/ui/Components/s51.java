package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class s51 extends MetricAffectingSpan {
    public Typeface f26954a;
    public int f26955b;
    public int f26956c;

    public s51(Typeface typeface) {
        this.f26956c = -1;
        this.f26954a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f26956c;
        if (i10 >= 0) {
            this.f26955b = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        }
        Typeface typeface = this.f26954a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i11 = this.f26955b;
        if (i11 != 0) {
            textPaint.setColor(i11);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f26954a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public s51() {
        Typeface typeface = Typeface.DEFAULT;
        this.f26956c = -1;
        this.f26954a = typeface;
    }

    public s51(Typeface typeface, int i10) {
        this.f26956c = -1;
        this.f26954a = typeface;
        this.f26955b = i10;
    }
}
