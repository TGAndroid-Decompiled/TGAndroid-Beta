package org.telegram.p009ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public class AnchorSpan extends MetricAffectingSpan {
    private String name;

    @Override
    public void updateDrawState(TextPaint textPaint) {
    }

    @Override
    public void updateMeasureState(TextPaint textPaint) {
    }

    public AnchorSpan(String str) {
        this.name = str.toLowerCase();
    }

    public String getName() {
        return this.name;
    }
}
