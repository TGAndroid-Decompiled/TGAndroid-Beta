package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class xy0 extends MetricAffectingSpan {
    public final int f41802a;
    public final wy0 f41803b;

    public xy0(wy0 wy0Var, int i7) {
        this.f41803b = wy0Var;
        if (i7 > 0) {
            this.f41802a = i7;
        }
    }

    public final void a(TextPaint textPaint) {
        wy0 wy0Var = this.f41803b;
        if (c8.zc.a(wy0Var.f41484a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (c8.zc.a(wy0Var.f41484a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (c8.zc.a(wy0Var.f41484a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final wy0 b() {
        return this.f41803b;
    }

    public final boolean c() {
        if ((this.f41803b.f41484a & 256) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i7 = this.f41802a;
        if (i7 != 0) {
            textPaint.setTextSize(i7);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f41803b.a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        int i7 = this.f41802a;
        if (i7 != 0) {
            textPaint.setTextSize(i7);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f41803b.a(textPaint);
    }
}
