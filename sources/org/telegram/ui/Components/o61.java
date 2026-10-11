package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class o61 extends MetricAffectingSpan {
    public Typeface f29275a;
    public int f29276b;
    public int f29277c;

    public o61(Typeface typeface) {
        this.f29277c = -1;
        this.f29275a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f29277c;
        if (i10 >= 0) {
            this.f29276b = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        }
        Typeface typeface = this.f29275a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i11 = this.f29276b;
        if (i11 != 0) {
            textPaint.setColor(i11);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f29275a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public o61() {
        Typeface typeface = Typeface.DEFAULT;
        this.f29277c = -1;
        this.f29275a = typeface;
    }

    public o61(Typeface typeface, int i10) {
        this.f29277c = -1;
        this.f29275a = typeface;
        this.f29276b = i10;
    }
}
