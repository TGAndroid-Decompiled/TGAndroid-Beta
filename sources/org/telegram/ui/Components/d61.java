package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class d61 extends MetricAffectingSpan {
    public Typeface f25431a;
    public int f25432b;
    public int f25433c;

    public d61(Typeface typeface) {
        this.f25433c = -1;
        this.f25431a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f25433c;
        if (i10 >= 0) {
            this.f25432b = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        }
        Typeface typeface = this.f25431a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i11 = this.f25432b;
        if (i11 != 0) {
            textPaint.setColor(i11);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f25431a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public d61() {
        Typeface typeface = Typeface.DEFAULT;
        this.f25433c = -1;
        this.f25431a = typeface;
    }

    public d61(Typeface typeface, int i10) {
        this.f25433c = -1;
        this.f25431a = typeface;
        this.f25432b = i10;
    }
}
