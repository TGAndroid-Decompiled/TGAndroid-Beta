package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class pu extends MetricAffectingSpan {
    public double f39541a;

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.baselineShift += (int) (textPaint.ascent() * this.f39541a);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.baselineShift += (int) (textPaint.ascent() * this.f39541a);
    }
}
