package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;
import android.text.style.MetricAffectingSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

public final class gi0 extends MetricAffectingSpan implements LineHeightSpan {

    public hi0 f28717a;

    @Override
    public final void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        hi0 hi0Var = this.f28717a;
        if (hi0Var.f29027b) {
            int i14 = hi0Var.f29030f ? 7 : 2;
            if (i10 <= hi0Var.f29028c) {
                fontMetricsInt.ascent -= AndroidUtilities.dp((hi0Var.f29031n ? 2 : 0) + i14);
                fontMetricsInt.top -= AndroidUtilities.dp((this.f28717a.f29031n ? 2 : 0) + i14);
            }
            if (i11 >= this.f28717a.d) {
                float f10 = i14;
                fontMetricsInt.descent = AndroidUtilities.dp(f10) + fontMetricsInt.descent;
                fontMetricsInt.bottom = AndroidUtilities.dp(f10) + fontMetricsInt.bottom;
            }
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint == null) {
            return;
        }
        textPaint.setTextSize(AndroidUtilities.dp(this.f28717a.f29026a ? 16.0f : SharedConfig.fontSize - 2));
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSize(AndroidUtilities.dp(this.f28717a.f29026a ? 16.0f : SharedConfig.fontSize - 2));
        textPaint.setTextScaleX(this.f28717a.f29026a ? 1.1f : 1.0f);
    }
}
