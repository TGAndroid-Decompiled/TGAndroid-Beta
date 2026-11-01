package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class y41 extends MetricAffectingSpan {
    public Typeface f32720a;
    public int f32721b;
    public int f32722c;

    public y41(Typeface typeface) {
        this.f32722c = -1;
        this.f32720a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f32722c;
        if (i10 >= 0) {
            this.f32721b = org.telegram.ui.ActionBar.t6.v0(i10);
        }
        Typeface typeface = this.f32720a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i11 = this.f32721b;
        if (i11 != 0) {
            textPaint.setColor(i11);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f32720a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public y41() {
        Typeface typeface = Typeface.DEFAULT;
        this.f32722c = -1;
        this.f32720a = typeface;
    }

    public y41(Typeface typeface, int i10) {
        this.f32722c = -1;
        this.f32720a = typeface;
        this.f32721b = i10;
    }
}
