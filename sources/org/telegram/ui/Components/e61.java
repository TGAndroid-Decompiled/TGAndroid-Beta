package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class e61 extends MetricAffectingSpan {
    public Typeface f25783a;
    public int f25784b;
    public int f25785c;

    public e61(Typeface typeface) {
        this.f25785c = -1;
        this.f25783a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f25785c;
        if (i10 >= 0) {
            this.f25784b = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        }
        Typeface typeface = this.f25783a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i11 = this.f25784b;
        if (i11 != 0) {
            textPaint.setColor(i11);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f25783a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public e61() {
        Typeface typeface = Typeface.DEFAULT;
        this.f25785c = -1;
        this.f25783a = typeface;
    }

    public e61(Typeface typeface, int i10) {
        this.f25785c = -1;
        this.f25783a = typeface;
        this.f25784b = i10;
    }
}
