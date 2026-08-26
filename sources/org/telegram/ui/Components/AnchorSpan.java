package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class AnchorSpan extends MetricAffectingSpan {
    public final String name;

    public AnchorSpan(String str) {
        this.name = str.toLowerCase();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
    }
}
