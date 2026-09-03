package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;
import android.text.style.MetricAffectingSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class aj0 extends MetricAffectingSpan implements LineHeightSpan {
    public bj0 f25260a;

    @Override
    public final void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        int i14;
        int i15;
        bj0 bj0Var = this.f25260a;
        if (bj0Var.f25618b) {
            int i16 = 2;
            if (bj0Var.f25621f) {
                i14 = 7;
            } else {
                i14 = 2;
            }
            if (i10 <= bj0Var.f25619c) {
                int i17 = fontMetricsInt.ascent;
                if (bj0Var.f25622n) {
                    i15 = 2;
                } else {
                    i15 = 0;
                }
                fontMetricsInt.ascent = i17 - AndroidUtilities.dp(i15 + i14);
                int i18 = fontMetricsInt.top;
                if (!this.f25260a.f25622n) {
                    i16 = 0;
                }
                fontMetricsInt.top = i18 - AndroidUtilities.dp(i16 + i14);
            }
            if (i11 >= this.f25260a.d) {
                float f10 = i14;
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
        if (this.f25260a.f25617a) {
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
        if (this.f25260a.f25617a) {
            f10 = 16.0f;
        } else {
            f10 = SharedConfig.fontSize - 2;
        }
        textPaint.setTextSize(AndroidUtilities.dp(f10));
        if (this.f25260a.f25617a) {
            f11 = 1.1f;
        } else {
            f11 = 1.0f;
        }
        textPaint.setTextScaleX(f11);
    }
}
