package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class t31 extends MetricAffectingSpan {
    public Typeface f38210a;
    public int f38211b;
    public int f38212c;

    public t31(Typeface typeface) {
        this.f38212c = -1;
        this.f38210a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i7 = this.f38212c;
        if (i7 >= 0) {
            this.f38211b = org.telegram.ui.ActionBar.k6.v0(i7);
        }
        Typeface typeface = this.f38210a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i10 = this.f38211b;
        if (i10 != 0) {
            textPaint.setColor(i10);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f38210a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public t31() {
        Typeface typeface = Typeface.DEFAULT;
        this.f38212c = -1;
        this.f38210a = typeface;
    }

    public t31(Typeface typeface, int i7) {
        this.f38212c = -1;
        this.f38210a = typeface;
        this.f38211b = i7;
    }
}
