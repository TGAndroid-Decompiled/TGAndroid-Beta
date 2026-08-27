package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class hu extends MetricAffectingSpan {

    public double f38891a;

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.baselineShift += (int) (((double) textPaint.ascent()) * this.f38891a);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.baselineShift += (int) (((double) textPaint.ascent()) * this.f38891a);
    }
}
