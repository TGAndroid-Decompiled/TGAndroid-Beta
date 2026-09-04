package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class e51 extends MetricAffectingSpan {
    public Typeface f25560a;
    public int f25561b;
    public int f25562c;

    public e51(Typeface typeface) {
        this.f25562c = -1;
        this.f25560a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f25562c;
        if (i10 >= 0) {
            this.f25561b = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        }
        Typeface typeface = this.f25560a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i11 = this.f25561b;
        if (i11 != 0) {
            textPaint.setColor(i11);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f25560a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public e51() {
        Typeface typeface = Typeface.DEFAULT;
        this.f25562c = -1;
        this.f25560a = typeface;
    }

    public e51(Typeface typeface, int i10) {
        this.f25562c = -1;
        this.f25560a = typeface;
        this.f25561b = i10;
    }
}
