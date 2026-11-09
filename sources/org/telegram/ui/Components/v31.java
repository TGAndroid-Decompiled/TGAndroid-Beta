package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class v31 extends MetricAffectingSpan {
    public Typeface f38910a;
    public int f38911b;
    public int f38912c;

    public v31(Typeface typeface) {
        this.f38912c = -1;
        this.f38910a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i7 = this.f38912c;
        if (i7 >= 0) {
            this.f38911b = org.telegram.ui.ActionBar.l6.v0(i7);
        }
        Typeface typeface = this.f38910a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i10 = this.f38911b;
        if (i10 != 0) {
            textPaint.setColor(i10);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f38910a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public v31() {
        Typeface typeface = Typeface.DEFAULT;
        this.f38912c = -1;
        this.f38910a = typeface;
    }

    public v31(Typeface typeface, int i7) {
        this.f38912c = -1;
        this.f38910a = typeface;
        this.f38911b = i7;
    }
}
