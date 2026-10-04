package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;
import android.text.style.MetricAffectingSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class ej0 extends MetricAffectingSpan implements LineHeightSpan {
    public fj0 f26073a;

    @Override
    public final void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        int i14;
        int i15;
        fj0 fj0Var = this.f26073a;
        if (fj0Var.f26465b) {
            int i16 = 2;
            if (fj0Var.f26468f) {
                i14 = 7;
            } else {
                i14 = 2;
            }
            if (i10 <= fj0Var.f26466c) {
                int i17 = fontMetricsInt.ascent;
                if (fj0Var.f26469n) {
                    i15 = 2;
                } else {
                    i15 = 0;
                }
                fontMetricsInt.ascent = i17 - AndroidUtilities.dp(i15 + i14);
                int i18 = fontMetricsInt.top;
                if (!this.f26073a.f26469n) {
                    i16 = 0;
                }
                fontMetricsInt.top = i18 - AndroidUtilities.dp(i16 + i14);
            }
            if (i11 >= this.f26073a.d) {
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
        if (this.f26073a.f26464a) {
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
        if (this.f26073a.f26464a) {
            f7 = 16.0f;
        } else {
            f7 = SharedConfig.fontSize - 2;
        }
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        if (this.f26073a.f26464a) {
            f10 = 1.1f;
        } else {
            f10 = 1.0f;
        }
        textPaint.setTextScaleX(f10);
    }
}
