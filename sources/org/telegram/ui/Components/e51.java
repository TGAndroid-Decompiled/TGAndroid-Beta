package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class e51 extends MetricAffectingSpan {
    public Typeface f25561a;
    public int f25562b;
    public int f25563c;

    public e51(Typeface typeface) {
        this.f25563c = -1;
        this.f25561a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f25563c;
        if (i10 >= 0) {
            this.f25562b = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        }
        Typeface typeface = this.f25561a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i11 = this.f25562b;
        if (i11 != 0) {
            textPaint.setColor(i11);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f25561a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public e51() {
        Typeface typeface = Typeface.DEFAULT;
        this.f25563c = -1;
        this.f25561a = typeface;
    }

    public e51(Typeface typeface, int i10) {
        this.f25563c = -1;
        this.f25561a = typeface;
        this.f25562b = i10;
    }
}
