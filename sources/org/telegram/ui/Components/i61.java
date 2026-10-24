package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class i61 extends MetricAffectingSpan {
    public Typeface f27311a;
    public int f27312b;
    public int f27313c;

    public i61(Typeface typeface) {
        this.f27313c = -1;
        this.f27311a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f27313c;
        if (i10 >= 0) {
            this.f27312b = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        }
        Typeface typeface = this.f27311a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i11 = this.f27312b;
        if (i11 != 0) {
            textPaint.setColor(i11);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f27311a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public i61() {
        Typeface typeface = Typeface.DEFAULT;
        this.f27313c = -1;
        this.f27311a = typeface;
    }

    public i61(Typeface typeface, int i10) {
        this.f27313c = -1;
        this.f27311a = typeface;
        this.f27312b = i10;
    }
}
