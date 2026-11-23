package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class l41 extends MetricAffectingSpan {
    public Typeface f37061a;
    public int f37062b;
    public int f37063c;

    public l41(Typeface typeface) {
        this.f37063c = -1;
        this.f37061a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i7 = this.f37063c;
        if (i7 >= 0) {
            this.f37062b = org.telegram.ui.ActionBar.m6.v0(i7);
        }
        Typeface typeface = this.f37061a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i10 = this.f37062b;
        if (i10 != 0) {
            textPaint.setColor(i10);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f37061a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public l41() {
        Typeface typeface = Typeface.DEFAULT;
        this.f37063c = -1;
        this.f37061a = typeface;
    }

    public l41(Typeface typeface, int i7) {
        this.f37063c = -1;
        this.f37061a = typeface;
        this.f37062b = i7;
    }
}
