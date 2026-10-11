package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class n61 extends MetricAffectingSpan {
    public Typeface f29056a;
    public int f29057b;
    public int f29058c;

    public n61(Typeface typeface) {
        this.f29058c = -1;
        this.f29056a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f29058c;
        if (i10 >= 0) {
            this.f29057b = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        }
        Typeface typeface = this.f29056a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i11 = this.f29057b;
        if (i11 != 0) {
            textPaint.setColor(i11);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f29056a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public n61() {
        Typeface typeface = Typeface.DEFAULT;
        this.f29058c = -1;
        this.f29056a = typeface;
    }

    public n61(Typeface typeface, int i10) {
        this.f29058c = -1;
        this.f29056a = typeface;
        this.f29057b = i10;
    }
}
