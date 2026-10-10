package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;
import android.text.style.MetricAffectingSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class xj0 extends MetricAffectingSpan implements LineHeightSpan {
    public yj0 f32952a;

    @Override
    public final void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        int i14;
        int i15;
        yj0 yj0Var = this.f32952a;
        if (yj0Var.f33313b) {
            int i16 = 2;
            if (yj0Var.f33316f) {
                i14 = 7;
            } else {
                i14 = 2;
            }
            if (i10 <= yj0Var.f33314c) {
                int i17 = fontMetricsInt.ascent;
                if (yj0Var.f33317n) {
                    i15 = 2;
                } else {
                    i15 = 0;
                }
                fontMetricsInt.ascent = i17 - AndroidUtilities.dp(i15 + i14);
                int i18 = fontMetricsInt.top;
                if (!this.f32952a.f33317n) {
                    i16 = 0;
                }
                fontMetricsInt.top = i18 - AndroidUtilities.dp(i16 + i14);
            }
            if (i11 >= this.f32952a.d) {
                float f7 = i14;
                fontMetricsInt.descent = AndroidUtilities.dp(f7) + fontMetricsInt.descent;
                fontMetricsInt.bottom = AndroidUtilities.dp(f7) + fontMetricsInt.bottom;
            }
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        float f7;
        if (textPaint == null) {
            return;
        }
        if (this.f32952a.f33312a) {
            f7 = 16.0f;
        } else {
            f7 = SharedConfig.fontSize - 2;
        }
        textPaint.setTextSize(AndroidUtilities.dp(f7));
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        float f7;
        float f10;
        if (this.f32952a.f33312a) {
            f7 = 16.0f;
        } else {
            f7 = SharedConfig.fontSize - 2;
        }
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        if (this.f32952a.f33312a) {
            f10 = 1.1f;
        } else {
            f10 = 1.0f;
        }
        textPaint.setTextScaleX(f10);
    }
}
