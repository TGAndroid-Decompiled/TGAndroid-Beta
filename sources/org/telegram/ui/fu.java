package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class fu extends MetricAffectingSpan {
    public double f38236a;

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.baselineShift += (int) (textPaint.ascent() * this.f38236a);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.baselineShift += (int) (textPaint.ascent() * this.f38236a);
    }
}
