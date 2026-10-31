package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class x41 extends MetricAffectingSpan {
    public Typeface f32348a;
    public int f32349b;
    public int f32350c;

    public x41(Typeface typeface) {
        this.f32350c = -1;
        this.f32348a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f32350c;
        if (i10 >= 0) {
            this.f32349b = org.telegram.ui.ActionBar.t6.v0(i10);
        }
        Typeface typeface = this.f32348a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i11 = this.f32349b;
        if (i11 != 0) {
            textPaint.setColor(i11);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f32348a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public x41() {
        Typeface typeface = Typeface.DEFAULT;
        this.f32350c = -1;
        this.f32348a = typeface;
    }

    public x41(Typeface typeface, int i10) {
        this.f32350c = -1;
        this.f32348a = typeface;
        this.f32349b = i10;
    }
}
