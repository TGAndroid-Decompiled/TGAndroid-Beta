package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class d61 extends MetricAffectingSpan {
    public Typeface f25607a;
    public int f25608b;
    public int f25609c;

    public d61(Typeface typeface) {
        this.f25609c = -1;
        this.f25607a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f25609c;
        if (i10 >= 0) {
            this.f25608b = org.telegram.ui.ActionBar.i6.w0(null, i10, false);
        }
        Typeface typeface = this.f25607a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i11 = this.f25608b;
        if (i11 != 0) {
            textPaint.setColor(i11);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f25607a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public d61() {
        Typeface typeface = Typeface.DEFAULT;
        this.f25609c = -1;
        this.f25607a = typeface;
    }

    public d61(Typeface typeface, int i10) {
        this.f25609c = -1;
        this.f25607a = typeface;
        this.f25608b = i10;
    }
}
