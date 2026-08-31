package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class g51 extends MetricAffectingSpan {
    public Typeface f27114a;
    public int f27115b;
    public int f27116c;

    public g51(Typeface typeface) {
        this.f27116c = -1;
        this.f27114a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f27116c;
        if (i10 >= 0) {
            this.f27115b = org.telegram.ui.ActionBar.k6.w0(null, i10, false);
        }
        Typeface typeface = this.f27114a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i11 = this.f27115b;
        if (i11 != 0) {
            textPaint.setColor(i11);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f27114a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public g51() {
        Typeface typeface = Typeface.DEFAULT;
        this.f27116c = -1;
        this.f27114a = typeface;
    }

    public g51(Typeface typeface, int i10) {
        this.f27116c = -1;
        this.f27114a = typeface;
        this.f27115b = i10;
    }
}
