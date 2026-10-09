package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class m61 extends MetricAffectingSpan {
    public Typeface f28709a;
    public int f28710b;
    public int f28711c;

    public m61(Typeface typeface) {
        this.f28711c = -1;
        this.f28709a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f28711c;
        if (i10 >= 0) {
            this.f28710b = org.telegram.ui.ActionBar.i6.x0(null, i10, false);
        }
        Typeface typeface = this.f28709a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i11 = this.f28710b;
        if (i11 != 0) {
            textPaint.setColor(i11);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f28709a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public m61() {
        Typeface typeface = Typeface.DEFAULT;
        this.f28711c = -1;
        this.f28709a = typeface;
    }

    public m61(Typeface typeface, int i10) {
        this.f28711c = -1;
        this.f28709a = typeface;
        this.f28710b = i10;
    }
}
