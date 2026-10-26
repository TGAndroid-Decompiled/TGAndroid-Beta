package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class q61 extends MetricAffectingSpan {
    public Typeface f31847a;
    public int f31848b;
    public int f31849c;

    public q61(Typeface typeface) {
        this.f31849c = -1;
        this.f31847a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f31849c;
        if (i10 >= 0) {
            this.f31848b = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        }
        Typeface typeface = this.f31847a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i11 = this.f31848b;
        if (i11 != 0) {
            textPaint.setColor(i11);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f31847a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public q61() {
        Typeface typeface = Typeface.DEFAULT;
        this.f31849c = -1;
        this.f31847a = typeface;
    }

    public q61(Typeface typeface, int i10) {
        this.f31849c = -1;
        this.f31847a = typeface;
        this.f31848b = i10;
    }
}
