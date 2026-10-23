package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class j61 extends MetricAffectingSpan {
    public Typeface f27530a;
    public int f27531b;
    public int f27532c;

    public j61(Typeface typeface) {
        this.f27532c = -1;
        this.f27530a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f27532c;
        if (i10 >= 0) {
            this.f27531b = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        }
        Typeface typeface = this.f27530a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i11 = this.f27531b;
        if (i11 != 0) {
            textPaint.setColor(i11);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f27530a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public j61() {
        Typeface typeface = Typeface.DEFAULT;
        this.f27532c = -1;
        this.f27530a = typeface;
    }

    public j61(Typeface typeface, int i10) {
        this.f27532c = -1;
        this.f27530a = typeface;
        this.f27531b = i10;
    }
}
