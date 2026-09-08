package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class e51 extends MetricAffectingSpan {
    public Typeface f25587a;
    public int f25588b;
    public int f25589c;

    public e51(Typeface typeface) {
        this.f25589c = -1;
        this.f25587a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f25589c;
        if (i10 >= 0) {
            this.f25588b = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        }
        Typeface typeface = this.f25587a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i11 = this.f25588b;
        if (i11 != 0) {
            textPaint.setColor(i11);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f25587a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public e51() {
        Typeface typeface = Typeface.DEFAULT;
        this.f25589c = -1;
        this.f25587a = typeface;
    }

    public e51(Typeface typeface, int i10) {
        this.f25589c = -1;
        this.f25587a = typeface;
        this.f25588b = i10;
    }
}
