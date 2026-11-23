package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;
import android.text.style.MetricAffectingSpan;
public final class ih0 extends MetricAffectingSpan implements LineHeightSpan {
    public jh0 f36212a;

    @Override
    public final void chooseHeight(CharSequence charSequence, int i7, int i10, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        int i13;
        int i14;
        jh0 jh0Var = this.f36212a;
        if (jh0Var.f36461b) {
            int i15 = 2;
            if (jh0Var.f36464f) {
                i13 = 7;
            } else {
                i13 = 2;
            }
            if (i7 <= jh0Var.f36462c) {
                int i16 = fontMetricsInt.ascent;
                if (jh0Var.f36465n) {
                    i14 = 2;
                } else {
                    i14 = 0;
                }
                fontMetricsInt.ascent = i16 - org.telegram.messenger.g0.L(i14 + i13);
                int i17 = fontMetricsInt.top;
                if (!this.f36212a.f36465n) {
                    i15 = 0;
                }
                fontMetricsInt.top = i17 - org.telegram.messenger.g0.L(i15 + i13);
            }
            if (i10 >= this.f36212a.d) {
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
        if (this.f36212a.f36460a) {
            f10 = 16.0f;
        } else {
            f10 = org.telegram.messenger.cz.W0 - 2;
        }
        textPaint.setTextSize(org.telegram.messenger.g0.L(f10));
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        float f10;
        float f11;
        if (this.f36212a.f36460a) {
            f10 = 16.0f;
        } else {
            f10 = org.telegram.messenger.cz.W0 - 2;
        }
        textPaint.setTextSize(org.telegram.messenger.g0.L(f10));
        if (this.f36212a.f36460a) {
            f11 = 1.1f;
        } else {
            f11 = 1.0f;
        }
        textPaint.setTextScaleX(f11);
    }
}
