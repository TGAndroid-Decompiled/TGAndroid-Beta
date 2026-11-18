package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class i41 extends MetricAffectingSpan {
    public Typeface f36046a;
    public int f36047b;
    public int f36048c;

    public i41(Typeface typeface) {
        this.f36048c = -1;
        this.f36046a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i7 = this.f36048c;
        if (i7 >= 0) {
            this.f36047b = org.telegram.ui.ActionBar.n6.v0(i7);
        }
        Typeface typeface = this.f36046a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i10 = this.f36047b;
        if (i10 != 0) {
            textPaint.setColor(i10);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f36046a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public i41() {
        Typeface typeface = Typeface.DEFAULT;
        this.f36048c = -1;
        this.f36046a = typeface;
    }

    public i41(Typeface typeface, int i7) {
        this.f36048c = -1;
        this.f36046a = typeface;
        this.f36047b = i7;
    }
}
