package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class n61 extends MetricAffectingSpan {
    public Typeface f29016a;
    public int f29017b;
    public int f29018c;

    public n61(Typeface typeface) {
        this.f29018c = -1;
        this.f29016a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f29018c;
        if (i10 >= 0) {
            this.f29017b = org.telegram.ui.ActionBar.i6.x0(null, i10, false);
        }
        Typeface typeface = this.f29016a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i11 = this.f29017b;
        if (i11 != 0) {
            textPaint.setColor(i11);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f29016a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public n61() {
        Typeface typeface = Typeface.DEFAULT;
        this.f29018c = -1;
        this.f29016a = typeface;
    }

    public n61(Typeface typeface, int i10) {
        this.f29018c = -1;
        this.f29016a = typeface;
        this.f29017b = i10;
    }
}
