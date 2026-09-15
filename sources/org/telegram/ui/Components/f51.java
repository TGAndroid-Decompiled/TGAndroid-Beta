package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class f51 extends MetricAffectingSpan {
    public Typeface f23822a;
    public int f23823b;
    public int f23824c;

    public f51(Typeface typeface) {
        this.f23824c = -1;
        this.f23822a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f23824c;
        if (i10 >= 0) {
            this.f23823b = org.telegram.ui.ActionBar.i6.w0(null, i10, false);
        }
        Typeface typeface = this.f23822a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i11 = this.f23823b;
        if (i11 != 0) {
            textPaint.setColor(i11);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f23822a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public f51() {
        Typeface typeface = Typeface.DEFAULT;
        this.f23824c = -1;
        this.f23822a = typeface;
    }

    public f51(Typeface typeface, int i10) {
        this.f23824c = -1;
        this.f23822a = typeface;
        this.f23823b = i10;
    }
}
