package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class r61 extends MetricAffectingSpan {
    public Typeface f32164a;
    public int f32165b;
    public int f32166c;

    public r61(Typeface typeface) {
        this.f32166c = -1;
        this.f32164a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f32166c;
        if (i10 >= 0) {
            this.f32165b = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        }
        Typeface typeface = this.f32164a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i11 = this.f32165b;
        if (i11 != 0) {
            textPaint.setColor(i11);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f32164a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public r61() {
        Typeface typeface = Typeface.DEFAULT;
        this.f32166c = -1;
        this.f32164a = typeface;
    }

    public r61(Typeface typeface, int i10) {
        this.f32166c = -1;
        this.f32164a = typeface;
        this.f32165b = i10;
    }
}
