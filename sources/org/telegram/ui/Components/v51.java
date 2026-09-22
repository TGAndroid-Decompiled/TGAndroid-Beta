package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class v51 extends MetricAffectingSpan {
    public Typeface f28987a;
    public int f28988b;
    public int f28989c;

    public v51(Typeface typeface) {
        this.f28989c = -1;
        this.f28987a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f28989c;
        if (i10 >= 0) {
            this.f28988b = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        }
        Typeface typeface = this.f28987a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i11 = this.f28988b;
        if (i11 != 0) {
            textPaint.setColor(i11);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f28987a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public v51() {
        Typeface typeface = Typeface.DEFAULT;
        this.f28989c = -1;
        this.f28987a = typeface;
    }

    public v51(Typeface typeface, int i10) {
        this.f28989c = -1;
        this.f28987a = typeface;
        this.f28988b = i10;
    }
}
