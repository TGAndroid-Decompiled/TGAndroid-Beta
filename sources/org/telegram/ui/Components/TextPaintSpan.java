package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public class TextPaintSpan extends MetricAffectingSpan {
    private TextPaint textPaint;

    public TextPaintSpan(TextPaint textPaint) {
        this.textPaint = textPaint;
    }

    @Override
    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setColor(this.textPaint.getColor());
        textPaint.setTypeface(this.textPaint.getTypeface());
        textPaint.setFlags(this.textPaint.getFlags());
        textPaint.setTextSize(this.textPaint.getTextSize());
        TextPaint textPaint2 = this.textPaint;
        textPaint.baselineShift = textPaint2.baselineShift;
        textPaint.bgColor = textPaint2.bgColor;
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.textPaint.getColor());
        textPaint.setTypeface(this.textPaint.getTypeface());
        textPaint.setFlags(this.textPaint.getFlags());
        textPaint.setTextSize(this.textPaint.getTextSize());
        TextPaint textPaint2 = this.textPaint;
        textPaint.baselineShift = textPaint2.baselineShift;
        textPaint.bgColor = textPaint2.bgColor;
    }
}
