package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import org.telegram.ui.ActionBar.Theme;

public final class TypefaceSpan extends MetricAffectingSpan {
    public int color;
    public final int colorKey;
    public final Typeface typeface;

    public TypefaceSpan(Typeface typeface) {
        this.colorKey = -1;
        this.typeface = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i = this.colorKey;
        if (i >= 0) {
            this.color = Theme.getColor(null, i, false);
        }
        Typeface typeface = this.typeface;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i2 = this.color;
        if (i2 != 0) {
            textPaint.setColor(i2);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.typeface;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public TypefaceSpan() {
        Typeface typeface = Typeface.DEFAULT;
        this.colorKey = -1;
        this.typeface = typeface;
    }

    public TypefaceSpan(Typeface typeface, int i) {
        this.colorKey = -1;
        this.typeface = typeface;
        this.color = i;
    }

    public TypefaceSpan(Typeface typeface, int i, int i2) {
        this.typeface = typeface;
        this.colorKey = i;
        this.color = Theme.getColor(null, i, false);
    }
}
