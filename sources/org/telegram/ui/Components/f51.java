package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class f51 extends MetricAffectingSpan {
    public Typeface f23821a;
    public int f23822b;
    public int f23823c;

    public f51(Typeface typeface) {
        this.f23823c = -1;
        this.f23821a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f23823c;
        if (i10 >= 0) {
            this.f23822b = org.telegram.ui.ActionBar.i6.w0(null, i10, false);
        }
        Typeface typeface = this.f23821a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i11 = this.f23822b;
        if (i11 != 0) {
            textPaint.setColor(i11);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f23821a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public f51() {
        Typeface typeface = Typeface.DEFAULT;
        this.f23823c = -1;
        this.f23821a = typeface;
    }

    public f51(Typeface typeface, int i10) {
        this.f23823c = -1;
        this.f23821a = typeface;
        this.f23822b = i10;
    }
}
