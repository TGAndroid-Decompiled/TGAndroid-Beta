package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class w11 extends MetricAffectingSpan {
    public final int f32540a;
    public final v11 f32541b;

    public w11(v11 v11Var, int i10) {
        this.f32541b = v11Var;
        if (i10 > 0) {
            this.f32540a = i10;
        }
    }

    public final void a(TextPaint textPaint) {
        v11 v11Var = this.f32541b;
        if (w7.g0.a(v11Var.f31643a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (w7.g0.a(v11Var.f31643a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (w7.g0.a(v11Var.f31643a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final v11 b() {
        return this.f32541b;
    }

    public final boolean c() {
        if ((this.f32541b.f31643a & 256) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f32540a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f32541b.a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        int i10 = this.f32540a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f32541b.a(textPaint);
    }
}
