package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public class a11 extends MetricAffectingSpan {
    public final TextPaint f22520a;
    public final String f22521b;

    public a11(TextPaint textPaint, String str) {
        this.f22520a = textPaint;
        this.f22521b = str;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        TextPaint textPaint2 = this.f22520a;
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
        TextPaint textPaint2 = this.f22520a;
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
