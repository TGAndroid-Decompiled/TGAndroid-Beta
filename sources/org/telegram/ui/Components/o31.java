package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class o31 extends MetricAffectingSpan {
    public Typeface f36585a;
    public int f36586b;
    public int f36587c;

    public o31(Typeface typeface) {
        this.f36587c = -1;
        this.f36585a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i7 = this.f36587c;
        if (i7 >= 0) {
            this.f36586b = org.telegram.ui.ActionBar.k6.v0(i7);
        }
        Typeface typeface = this.f36585a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i10 = this.f36586b;
        if (i10 != 0) {
            textPaint.setColor(i10);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f36585a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public o31() {
        Typeface typeface = Typeface.DEFAULT;
        this.f36587c = -1;
        this.f36585a = typeface;
    }

    public o31(Typeface typeface, int i7) {
        this.f36587c = -1;
        this.f36585a = typeface;
        this.f36586b = i7;
    }
}
