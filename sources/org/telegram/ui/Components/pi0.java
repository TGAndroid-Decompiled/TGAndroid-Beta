package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;
import android.text.style.MetricAffectingSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class pi0 extends MetricAffectingSpan implements LineHeightSpan {
    public qi0 f31683a;

    @Override
    public final void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        int i14;
        int i15;
        qi0 qi0Var = this.f31683a;
        if (qi0Var.f31957b) {
            int i16 = 2;
            if (qi0Var.f31960f) {
                i14 = 7;
            } else {
                i14 = 2;
            }
            if (i10 <= qi0Var.f31958c) {
                int i17 = fontMetricsInt.ascent;
                if (qi0Var.f31961n) {
                    i15 = 2;
                } else {
                    i15 = 0;
                }
                fontMetricsInt.ascent = i17 - AndroidUtilities.dp(i15 + i14);
                int i18 = fontMetricsInt.top;
                if (!this.f31683a.f31961n) {
                    i16 = 0;
                }
                fontMetricsInt.top = i18 - AndroidUtilities.dp(i16 + i14);
            }
            if (i11 >= this.f31683a.d) {
                float f9 = i14;
                fontMetricsInt.descent = AndroidUtilities.dp(f9) + fontMetricsInt.descent;
                fontMetricsInt.bottom = AndroidUtilities.dp(f9) + fontMetricsInt.bottom;
            }
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        float f9;
        if (textPaint == null) {
            return;
        }
        if (this.f31683a.f31956a) {
            f9 = 16.0f;
        } else {
            f9 = SharedConfig.fontSize - 2;
        }
        textPaint.setTextSize(AndroidUtilities.dp(f9));
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        float f9;
        float f10;
        if (this.f31683a.f31956a) {
            f9 = 16.0f;
        } else {
            f9 = SharedConfig.fontSize - 2;
        }
        textPaint.setTextSize(AndroidUtilities.dp(f9));
        if (this.f31683a.f31956a) {
            f10 = 1.1f;
        } else {
            f10 = 1.0f;
        }
        textPaint.setTextScaleX(f10);
    }
}
