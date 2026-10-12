package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class i61 extends MetricAffectingSpan {
    public Typeface f25892a;
    public int f25893b;
    public int f25894c;

    public i61(Typeface typeface) {
        this.f25894c = -1;
        this.f25892a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f25894c;
        if (i10 >= 0) {
            this.f25893b = org.telegram.ui.ActionBar.g6.x0(null, i10, false);
        }
        Typeface typeface = this.f25892a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i11 = this.f25893b;
        if (i11 != 0) {
            textPaint.setColor(i11);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f25892a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public i61() {
        Typeface typeface = Typeface.DEFAULT;
        this.f25894c = -1;
        this.f25892a = typeface;
    }

    public i61(Typeface typeface, int i10) {
        this.f25894c = -1;
        this.f25892a = typeface;
        this.f25893b = i10;
    }
}
