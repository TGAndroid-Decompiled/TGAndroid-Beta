package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;
import android.text.style.MetricAffectingSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class ei0 extends MetricAffectingSpan implements LineHeightSpan {
    public fi0 f28034a;

    @Override
    public final void chooseHeight(CharSequence charSequence, int i9, int i10, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        int i13;
        int i14;
        fi0 fi0Var = this.f28034a;
        if (fi0Var.f28437b) {
            int i15 = 2;
            if (fi0Var.f28440f) {
                i13 = 7;
            } else {
                i13 = 2;
            }
            if (i9 <= fi0Var.f28438c) {
                int i16 = fontMetricsInt.ascent;
                if (fi0Var.f28441n) {
                    i14 = 2;
                } else {
                    i14 = 0;
                }
                fontMetricsInt.ascent = i16 - AndroidUtilities.dp(i14 + i13);
                int i17 = fontMetricsInt.top;
                if (!this.f28034a.f28441n) {
                    i15 = 0;
                }
                fontMetricsInt.top = i17 - AndroidUtilities.dp(i15 + i13);
            }
            if (i10 >= this.f28034a.d) {
                float f10 = i13;
                fontMetricsInt.descent = AndroidUtilities.dp(f10) + fontMetricsInt.descent;
                fontMetricsInt.bottom = AndroidUtilities.dp(f10) + fontMetricsInt.bottom;
            }
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        float f10;
        if (textPaint == null) {
            return;
        }
        if (this.f28034a.f28436a) {
            f10 = 16.0f;
        } else {
            f10 = SharedConfig.fontSize - 2;
        }
        textPaint.setTextSize(AndroidUtilities.dp(f10));
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        float f10;
        float f11;
        if (this.f28034a.f28436a) {
            f10 = 16.0f;
        } else {
            f10 = SharedConfig.fontSize - 2;
        }
        textPaint.setTextSize(AndroidUtilities.dp(f10));
        if (this.f28034a.f28436a) {
            f11 = 1.1f;
        } else {
            f11 = 1.0f;
        }
        textPaint.setTextScaleX(f11);
    }
}
