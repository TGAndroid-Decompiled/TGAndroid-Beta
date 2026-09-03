package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class e51 extends MetricAffectingSpan {
    public Typeface f26451a;
    public int f26452b;
    public int f26453c;

    public e51(Typeface typeface) {
        this.f26453c = -1;
        this.f26451a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f26453c;
        if (i10 >= 0) {
            this.f26452b = org.telegram.ui.ActionBar.k6.w0(null, i10, false);
        }
        Typeface typeface = this.f26451a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i11 = this.f26452b;
        if (i11 != 0) {
            textPaint.setColor(i11);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f26451a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public e51() {
        Typeface typeface = Typeface.DEFAULT;
        this.f26453c = -1;
        this.f26451a = typeface;
    }

    public e51(Typeface typeface, int i10) {
        this.f26453c = -1;
        this.f26451a = typeface;
        this.f26452b = i10;
    }
}
