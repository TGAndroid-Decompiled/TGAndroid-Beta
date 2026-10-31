package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;
import android.text.style.MetricAffectingSpan;
public final class vh0 extends MetricAffectingSpan implements LineHeightSpan {
    public wh0 f31258a;

    @Override
    public final void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        int i14;
        int i15;
        wh0 wh0Var = this.f31258a;
        if (wh0Var.f32185b) {
            int i16 = 2;
            if (wh0Var.f32187f) {
                i14 = 7;
            } else {
                i14 = 2;
            }
            if (i10 <= wh0Var.f32186c) {
                int i17 = fontMetricsInt.ascent;
                if (wh0Var.f32188n) {
                    i15 = 2;
                } else {
                    i15 = 0;
                }
                fontMetricsInt.ascent = i17 - org.telegram.messenger.i0.L(i15 + i14);
                int i18 = fontMetricsInt.top;
                if (!this.f31258a.f32188n) {
                    i16 = 0;
                }
                fontMetricsInt.top = i18 - org.telegram.messenger.i0.L(i16 + i14);
            }
            if (i11 >= this.f31258a.d) {
                float f7 = i14;
                fontMetricsInt.descent = org.telegram.messenger.i0.L(f7) + fontMetricsInt.descent;
                fontMetricsInt.bottom = org.telegram.messenger.i0.L(f7) + fontMetricsInt.bottom;
            }
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        float f7;
        if (textPaint == null) {
            return;
        }
        if (this.f31258a.f32184a) {
            f7 = 16.0f;
        } else {
            f7 = org.telegram.messenger.tz.W0 - 2;
        }
        textPaint.setTextSize(org.telegram.messenger.i0.L(f7));
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        float f7;
        float f10;
        if (this.f31258a.f32184a) {
            f7 = 16.0f;
        } else {
            f7 = org.telegram.messenger.tz.W0 - 2;
        }
        textPaint.setTextSize(org.telegram.messenger.i0.L(f7));
        if (this.f31258a.f32184a) {
            f10 = 1.1f;
        } else {
            f10 = 1.0f;
        }
        textPaint.setTextScaleX(f10);
    }
}
