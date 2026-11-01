package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;
import android.text.style.MetricAffectingSpan;
public final class wh0 extends MetricAffectingSpan implements LineHeightSpan {
    public xh0 f32248a;

    @Override
    public final void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        int i14;
        int i15;
        xh0 xh0Var = this.f32248a;
        if (xh0Var.f32560b) {
            int i16 = 2;
            if (xh0Var.f32562f) {
                i14 = 7;
            } else {
                i14 = 2;
            }
            if (i10 <= xh0Var.f32561c) {
                int i17 = fontMetricsInt.ascent;
                if (xh0Var.f32563n) {
                    i15 = 2;
                } else {
                    i15 = 0;
                }
                fontMetricsInt.ascent = i17 - org.telegram.messenger.i0.L(i15 + i14);
                int i18 = fontMetricsInt.top;
                if (!this.f32248a.f32563n) {
                    i16 = 0;
                }
                fontMetricsInt.top = i18 - org.telegram.messenger.i0.L(i16 + i14);
            }
            if (i11 >= this.f32248a.d) {
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
        if (this.f32248a.f32559a) {
            f7 = 16.0f;
        } else {
            f7 = org.telegram.messenger.uz.W0 - 2;
        }
        textPaint.setTextSize(org.telegram.messenger.i0.L(f7));
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        float f7;
        float f10;
        if (this.f32248a.f32559a) {
            f7 = 16.0f;
        } else {
            f7 = org.telegram.messenger.uz.W0 - 2;
        }
        textPaint.setTextSize(org.telegram.messenger.i0.L(f7));
        if (this.f32248a.f32559a) {
            f10 = 1.1f;
        } else {
            f10 = 1.0f;
        }
        textPaint.setTextScaleX(f10);
    }
}
