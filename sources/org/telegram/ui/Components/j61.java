package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class j61 extends MetricAffectingSpan {
    public Typeface f25899a;
    public int f25900b;
    public int f25901c;

    public j61(Typeface typeface) {
        this.f25901c = -1;
        this.f25899a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f25901c;
        if (i10 >= 0) {
            this.f25900b = org.telegram.ui.ActionBar.g6.x0(null, i10, false);
        }
        Typeface typeface = this.f25899a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i11 = this.f25900b;
        if (i11 != 0) {
            textPaint.setColor(i11);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f25899a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public j61() {
        Typeface typeface = Typeface.DEFAULT;
        this.f25901c = -1;
        this.f25899a = typeface;
    }

    public j61(Typeface typeface, int i10) {
        this.f25901c = -1;
        this.f25899a = typeface;
        this.f25900b = i10;
    }
}
