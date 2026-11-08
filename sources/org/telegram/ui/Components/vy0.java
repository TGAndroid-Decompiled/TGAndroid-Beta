package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class vy0 extends MetricAffectingSpan {
    public final int f39748a;
    public final uy0 f39749b;

    public vy0(uy0 uy0Var, int i7) {
        this.f39749b = uy0Var;
        if (i7 > 0) {
            this.f39748a = i7;
        }
    }

    public final void a(TextPaint textPaint) {
        uy0 uy0Var = this.f39749b;
        if (c8.zc.a(uy0Var.f38779a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (c8.zc.a(uy0Var.f38779a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (c8.zc.a(uy0Var.f38779a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final uy0 b() {
        return this.f39749b;
    }

    public final boolean c() {
        if ((this.f39749b.f38779a & 256) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i7 = this.f39748a;
        if (i7 != 0) {
            textPaint.setTextSize(i7);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f39749b.a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        int i7 = this.f39748a;
        if (i7 != 0) {
            textPaint.setTextSize(i7);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f39749b.a(textPaint);
    }
}
