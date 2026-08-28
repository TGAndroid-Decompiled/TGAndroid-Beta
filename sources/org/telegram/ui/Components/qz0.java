package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class qz0 extends MetricAffectingSpan {
    public TextPaint f32041a;

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        TextPaint textPaint2 = this.f32041a;
        textPaint.setColor(textPaint2.getColor());
        textPaint.setTypeface(textPaint2.getTypeface());
        textPaint.setFlags(textPaint2.getFlags());
        textPaint.setTextSize(textPaint2.getTextSize());
        textPaint.baselineShift = textPaint2.baselineShift;
        textPaint.bgColor = textPaint2.bgColor;
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        TextPaint textPaint2 = this.f32041a;
        textPaint.setColor(textPaint2.getColor());
        textPaint.setTypeface(textPaint2.getTypeface());
        textPaint.setFlags(textPaint2.getFlags());
        textPaint.setTextSize(textPaint2.getTextSize());
        textPaint.baselineShift = textPaint2.baselineShift;
        textPaint.bgColor = textPaint2.bgColor;
    }
}
