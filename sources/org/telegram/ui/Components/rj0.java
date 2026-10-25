package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;
import android.text.style.MetricAffectingSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class rj0 extends MetricAffectingSpan implements LineHeightSpan {
    public sj0 f32257a;

    @Override
    public final void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        int i14;
        int i15;
        sj0 sj0Var = this.f32257a;
        if (sj0Var.f32577b) {
            int i16 = 2;
            if (sj0Var.f32579f) {
                i14 = 7;
            } else {
                i14 = 2;
            }
            if (i10 <= sj0Var.f32578c) {
                int i17 = fontMetricsInt.ascent;
                if (sj0Var.f32580n) {
                    i15 = 2;
                } else {
                    i15 = 0;
                }
                fontMetricsInt.ascent = i17 - AndroidUtilities.dp(i15 + i14);
                int i18 = fontMetricsInt.top;
                if (!this.f32257a.f32580n) {
                    i16 = 0;
                }
                fontMetricsInt.top = i18 - AndroidUtilities.dp(i16 + i14);
            }
            if (i11 >= this.f32257a.d) {
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
        if (this.f32257a.f32576a) {
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
        if (this.f32257a.f32576a) {
            f7 = 16.0f;
        } else {
            f7 = SharedConfig.fontSize - 2;
        }
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        if (this.f32257a.f32576a) {
            f10 = 1.1f;
        } else {
            f10 = 1.0f;
        }
        textPaint.setTextScaleX(f10);
    }
}
