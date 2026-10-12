package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class r61 extends MetricAffectingSpan {
    public Typeface f30062a;
    public int f30063b;
    public int f30064c;

    public r61(Typeface typeface) {
        this.f30064c = -1;
        this.f30062a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f30064c;
        if (i10 >= 0) {
            this.f30063b = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        }
        Typeface typeface = this.f30062a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i11 = this.f30063b;
        if (i11 != 0) {
            textPaint.setColor(i11);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f30062a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public r61() {
        Typeface typeface = Typeface.DEFAULT;
        this.f30064c = -1;
        this.f30062a = typeface;
    }

    public r61(Typeface typeface, int i10) {
        this.f30064c = -1;
        this.f30062a = typeface;
        this.f30063b = i10;
    }
}
