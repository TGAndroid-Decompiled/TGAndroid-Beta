package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class k41 extends MetricAffectingSpan {

    public Typeface f29944a;

    public int f29945b;

    public int f29946c;

    public k41(Typeface typeface) {
        this.f29946c = -1;
        this.f29944a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f29946c;
        if (i10 >= 0) {
            this.f29945b = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        }
        Typeface typeface = this.f29944a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i11 = this.f29945b;
        if (i11 != 0) {
            textPaint.setColor(i11);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f29944a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public k41() {
        Typeface typeface = Typeface.DEFAULT;
        this.f29946c = -1;
        this.f29944a = typeface;
    }

    public k41(Typeface typeface, int i10) {
        this.f29946c = -1;
        this.f29944a = typeface;
        this.f29945b = i10;
    }
}
