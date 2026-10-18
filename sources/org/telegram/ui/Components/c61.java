package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class c61 extends MetricAffectingSpan {
    public Typeface f25111a;
    public int f25112b;
    public int f25113c;

    public c61(Typeface typeface) {
        this.f25113c = -1;
        this.f25111a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f25113c;
        if (i10 >= 0) {
            this.f25112b = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        }
        Typeface typeface = this.f25111a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i11 = this.f25112b;
        if (i11 != 0) {
            textPaint.setColor(i11);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f25111a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public c61() {
        Typeface typeface = Typeface.DEFAULT;
        this.f25113c = -1;
        this.f25111a = typeface;
    }

    public c61(Typeface typeface, int i10) {
        this.f25113c = -1;
        this.f25111a = typeface;
        this.f25112b = i10;
    }
}
