package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import org.telegram.ui.ActionBar.Theme;
public class TypefaceSpan extends MetricAffectingSpan {
    private int color;
    private int colorKey;
    Theme.ResourcesProvider resourcesProvider;
    private int textSize;
    private Typeface typeface;

    public TypefaceSpan(Typeface typeface) {
        this.colorKey = -1;
        this.typeface = typeface;
    }

    public TypefaceSpan(Typeface typeface, int i, int i2) {
        this.colorKey = -1;
        this.typeface = typeface;
        if (i > 0) {
            this.textSize = i;
        }
        this.color = i2;
    }

    public TypefaceSpan(Typeface typeface, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
        this.colorKey = -1;
        this.typeface = typeface;
        if (i > 0) {
            this.textSize = i;
        }
        this.resourcesProvider = resourcesProvider;
        this.colorKey = i2;
        this.color = Theme.getColor(i2, resourcesProvider);
    }

    public void setColor(int i) {
        this.color = i;
    }

    @Override
    public void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.typeface;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i = this.textSize;
        if (i != 0) {
            textPaint.setTextSize(i);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        int i = this.colorKey;
        if (i >= 0) {
            this.color = Theme.getColor(i, this.resourcesProvider);
        }
        Typeface typeface = this.typeface;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i2 = this.textSize;
        if (i2 != 0) {
            textPaint.setTextSize(i2);
        }
        int i3 = this.color;
        if (i3 != 0) {
            textPaint.setColor(i3);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }
}
