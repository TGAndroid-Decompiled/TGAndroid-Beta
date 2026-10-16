package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public class m11 extends MetricAffectingSpan {
    public final TextPaint f26884a;
    public final String f26885b;

    public m11(TextPaint textPaint, String str) {
        this.f26884a = textPaint;
        this.f26885b = str;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        TextPaint textPaint2 = this.f26884a;
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
        TextPaint textPaint2 = this.f26884a;
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
