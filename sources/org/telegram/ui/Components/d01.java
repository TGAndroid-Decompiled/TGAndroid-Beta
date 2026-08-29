package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public class d01 extends MetricAffectingSpan {
    public final TextPaint f27626a;
    public final String f27627b;

    public d01(TextPaint textPaint, String str) {
        this.f27626a = textPaint;
        this.f27627b = str;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        TextPaint textPaint2 = this.f27626a;
        if (textPaint2 != null) {
            textPaint.setColor(textPaint2.getColor());
            textPaint.setTypeface(textPaint2.getTypeface());
            textPaint.setFlags(textPaint2.getFlags());
            textPaint.setTextSize(textPaint2.getTextSize());
            textPaint.baselineShift = textPaint2.baselineShift;
            textPaint.bgColor = textPaint2.bgColor;
        }
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        TextPaint textPaint2 = this.f27626a;
        if (textPaint2 != null) {
            textPaint.setColor(textPaint2.getColor());
            textPaint.setTypeface(textPaint2.getTypeface());
            textPaint.setFlags(textPaint2.getFlags());
            textPaint.setTextSize(textPaint2.getTextSize());
            textPaint.baselineShift = textPaint2.baselineShift;
            textPaint.bgColor = textPaint2.bgColor;
        }
    }
}
