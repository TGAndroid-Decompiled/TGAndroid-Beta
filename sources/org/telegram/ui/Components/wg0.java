package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;
import android.text.style.MetricAffectingSpan;
public final class wg0 extends MetricAffectingSpan implements LineHeightSpan {
    public xg0 f41344a;

    @Override
    public final void chooseHeight(CharSequence charSequence, int i7, int i10, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        int i13;
        int i14;
        xg0 xg0Var = this.f41344a;
        if (xg0Var.f41677b) {
            int i15 = 2;
            if (xg0Var.f41680f) {
                i13 = 7;
            } else {
                i13 = 2;
            }
            if (i7 <= xg0Var.f41678c) {
                int i16 = fontMetricsInt.ascent;
                if (xg0Var.f41681n) {
                    i14 = 2;
                } else {
                    i14 = 0;
                }
                fontMetricsInt.ascent = i16 - org.telegram.messenger.g0.L(i14 + i13);
                int i17 = fontMetricsInt.top;
                if (!this.f41344a.f41681n) {
                    i15 = 0;
                }
                fontMetricsInt.top = i17 - org.telegram.messenger.g0.L(i15 + i13);
            }
            if (i10 >= this.f41344a.d) {
                float f10 = i13;
                fontMetricsInt.descent = org.telegram.messenger.g0.L(f10) + fontMetricsInt.descent;
                fontMetricsInt.bottom = org.telegram.messenger.g0.L(f10) + fontMetricsInt.bottom;
            }
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        float f10;
        if (textPaint == null) {
            return;
        }
        if (this.f41344a.f41676a) {
            f10 = 16.0f;
        } else {
            f10 = org.telegram.messenger.gz.W0 - 2;
        }
        textPaint.setTextSize(org.telegram.messenger.g0.L(f10));
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        float f10;
        float f11;
        if (this.f41344a.f41676a) {
            f10 = 16.0f;
        } else {
            f10 = org.telegram.messenger.gz.W0 - 2;
        }
        textPaint.setTextSize(org.telegram.messenger.g0.L(f10));
        if (this.f41344a.f41676a) {
            f11 = 1.1f;
        } else {
            f11 = 1.0f;
        }
        textPaint.setTextScaleX(f11);
    }
}
