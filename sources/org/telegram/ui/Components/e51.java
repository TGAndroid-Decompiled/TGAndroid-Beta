package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class e51 extends MetricAffectingSpan {
    public Typeface f23570a;
    public int f23571b;
    public int f23572c;

    public e51(Typeface typeface) {
        this.f23572c = -1;
        this.f23570a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f23572c;
        if (i10 >= 0) {
            this.f23571b = org.telegram.ui.ActionBar.h6.w0(null, i10, false);
        }
        Typeface typeface = this.f23570a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i11 = this.f23571b;
        if (i11 != 0) {
            textPaint.setColor(i11);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f23570a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public e51() {
        Typeface typeface = Typeface.DEFAULT;
        this.f23572c = -1;
        this.f23570a = typeface;
    }

    public e51(Typeface typeface, int i10) {
        this.f23572c = -1;
        this.f23570a = typeface;
        this.f23571b = i10;
    }
}
