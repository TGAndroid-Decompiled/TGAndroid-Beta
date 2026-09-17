package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class e51 extends MetricAffectingSpan {
    public Typeface f25588a;
    public int f25589b;
    public int f25590c;

    public e51(Typeface typeface) {
        this.f25590c = -1;
        this.f25588a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f25590c;
        if (i10 >= 0) {
            this.f25589b = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        }
        Typeface typeface = this.f25588a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i11 = this.f25589b;
        if (i11 != 0) {
            textPaint.setColor(i11);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f25588a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public e51() {
        Typeface typeface = Typeface.DEFAULT;
        this.f25590c = -1;
        this.f25588a = typeface;
    }

    public e51(Typeface typeface, int i10) {
        this.f25590c = -1;
        this.f25588a = typeface;
        this.f25589b = i10;
    }
}
