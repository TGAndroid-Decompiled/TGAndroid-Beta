package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class uy0 extends MetricAffectingSpan {
    public final int f38767a;
    public final ty0 f38768b;

    public uy0(ty0 ty0Var, int i7) {
        this.f38768b = ty0Var;
        if (i7 > 0) {
            this.f38767a = i7;
        }
    }

    public final void a(TextPaint textPaint) {
        ty0 ty0Var = this.f38768b;
        if (c8.yc.a(ty0Var.f38442a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (c8.yc.a(ty0Var.f38442a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (c8.yc.a(ty0Var.f38442a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final ty0 b() {
        return this.f38768b;
    }

    public final boolean c() {
        if ((this.f38768b.f38442a & 256) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i7 = this.f38767a;
        if (i7 != 0) {
            textPaint.setTextSize(i7);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f38768b.a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        int i7 = this.f38767a;
        if (i7 != 0) {
            textPaint.setTextSize(i7);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f38768b.a(textPaint);
    }
}
