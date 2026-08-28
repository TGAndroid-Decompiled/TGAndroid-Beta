package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class i41 extends MetricAffectingSpan {
    public Typeface f29312a;
    public int f29313b;
    public int f29314c;

    public i41(Typeface typeface) {
        this.f29314c = -1;
        this.f29312a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i9 = this.f29314c;
        if (i9 >= 0) {
            this.f29313b = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
        }
        Typeface typeface = this.f29312a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i10 = this.f29313b;
        if (i10 != 0) {
            textPaint.setColor(i10);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f29312a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public i41() {
        Typeface typeface = Typeface.DEFAULT;
        this.f29314c = -1;
        this.f29312a = typeface;
    }

    public i41(Typeface typeface, int i9) {
        this.f29314c = -1;
        this.f29312a = typeface;
        this.f29313b = i9;
    }
}
