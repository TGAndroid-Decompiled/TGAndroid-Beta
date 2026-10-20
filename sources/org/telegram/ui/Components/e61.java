package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class e61 extends MetricAffectingSpan {
    public Typeface f25779a;
    public int f25780b;
    public int f25781c;

    public e61(Typeface typeface) {
        this.f25781c = -1;
        this.f25779a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f25781c;
        if (i10 >= 0) {
            this.f25780b = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        }
        Typeface typeface = this.f25779a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i11 = this.f25780b;
        if (i11 != 0) {
            textPaint.setColor(i11);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f25779a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public e61() {
        Typeface typeface = Typeface.DEFAULT;
        this.f25781c = -1;
        this.f25779a = typeface;
    }

    public e61(Typeface typeface, int i10) {
        this.f25781c = -1;
        this.f25779a = typeface;
        this.f25780b = i10;
    }
}
