package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class n11 extends MetricAffectingSpan {
    public final int f28817a;
    public final m11 f28818b;

    public n11(m11 m11Var, int i10) {
        this.f28818b = m11Var;
        if (i10 > 0) {
            this.f28817a = i10;
        }
    }

    public final void a(TextPaint textPaint) {
        m11 m11Var = this.f28818b;
        if (w7.e0.a(m11Var.f28497a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (w7.e0.a(m11Var.f28497a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (w7.e0.a(m11Var.f28497a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final m11 b() {
        return this.f28818b;
    }

    public final boolean c() {
        if ((this.f28818b.f28497a & 256) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f28817a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f28818b.a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        int i10 = this.f28817a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f28818b.a(textPaint);
    }
}
