package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class e61 extends MetricAffectingSpan {
    public Typeface f26026a;
    public int f26027b;
    public int f26028c;

    public e61(Typeface typeface) {
        this.f26028c = -1;
        this.f26026a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f26028c;
        if (i10 >= 0) {
            this.f26027b = org.telegram.ui.ActionBar.i6.w0(null, i10, false);
        }
        Typeface typeface = this.f26026a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i11 = this.f26027b;
        if (i11 != 0) {
            textPaint.setColor(i11);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f26026a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public e61() {
        Typeface typeface = Typeface.DEFAULT;
        this.f26028c = -1;
        this.f26026a = typeface;
    }

    public e61(Typeface typeface, int i10) {
        this.f26028c = -1;
        this.f26026a = typeface;
        this.f26027b = i10;
    }
}
