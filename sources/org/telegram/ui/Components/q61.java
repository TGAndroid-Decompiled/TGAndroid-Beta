package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class q61 extends MetricAffectingSpan {
    public Typeface f31845a;
    public int f31846b;
    public int f31847c;

    public q61(Typeface typeface) {
        this.f31847c = -1;
        this.f31845a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f31847c;
        if (i10 >= 0) {
            this.f31846b = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        }
        Typeface typeface = this.f31845a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i11 = this.f31846b;
        if (i11 != 0) {
            textPaint.setColor(i11);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f31845a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public q61() {
        Typeface typeface = Typeface.DEFAULT;
        this.f31847c = -1;
        this.f31845a = typeface;
    }

    public q61(Typeface typeface, int i10) {
        this.f31847c = -1;
        this.f31845a = typeface;
        this.f31846b = i10;
    }
}
