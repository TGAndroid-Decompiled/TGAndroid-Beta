package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class et extends MetricAffectingSpan {
    public double f45441a;

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.baselineShift += (int) (textPaint.ascent() * this.f45441a);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.baselineShift += (int) (textPaint.ascent() * this.f45441a);
    }
}
