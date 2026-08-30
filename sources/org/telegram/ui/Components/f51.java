package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class f51 extends MetricAffectingSpan {
    public Typeface f24789a;
    public int f24790b;
    public int f24791c;

    public f51(Typeface typeface) {
        this.f24791c = -1;
        this.f24789a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f24791c;
        if (i10 >= 0) {
            this.f24790b = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        }
        Typeface typeface = this.f24789a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i11 = this.f24790b;
        if (i11 != 0) {
            textPaint.setColor(i11);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f24789a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public f51() {
        Typeface typeface = Typeface.DEFAULT;
        this.f24791c = -1;
        this.f24789a = typeface;
    }

    public f51(Typeface typeface, int i10) {
        this.f24791c = -1;
        this.f24789a = typeface;
        this.f24790b = i10;
    }
}
