package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class g51 extends MetricAffectingSpan {
    public Typeface f24093a;
    public int f24094b;
    public int f24095c;

    public g51(Typeface typeface) {
        this.f24095c = -1;
        this.f24093a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f24095c;
        if (i10 >= 0) {
            this.f24094b = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        }
        Typeface typeface = this.f24093a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i11 = this.f24094b;
        if (i11 != 0) {
            textPaint.setColor(i11);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f24093a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public g51() {
        Typeface typeface = Typeface.DEFAULT;
        this.f24095c = -1;
        this.f24093a = typeface;
    }

    public g51(Typeface typeface, int i10) {
        this.f24095c = -1;
        this.f24093a = typeface;
        this.f24094b = i10;
    }
}
