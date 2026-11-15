package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class y31 extends MetricAffectingSpan {
    public Typeface f41864a;
    public int f41865b;
    public int f41866c;

    public y31(Typeface typeface) {
        this.f41866c = -1;
        this.f41864a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i7 = this.f41866c;
        if (i7 >= 0) {
            this.f41865b = org.telegram.ui.ActionBar.j6.v0(i7);
        }
        Typeface typeface = this.f41864a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i10 = this.f41865b;
        if (i10 != 0) {
            textPaint.setColor(i10);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f41864a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public y31() {
        Typeface typeface = Typeface.DEFAULT;
        this.f41866c = -1;
        this.f41864a = typeface;
    }

    public y31(Typeface typeface, int i7) {
        this.f41866c = -1;
        this.f41864a = typeface;
        this.f41865b = i7;
    }
}
