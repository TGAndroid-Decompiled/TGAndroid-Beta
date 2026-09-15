package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class p01 extends MetricAffectingSpan {
    public final int f26922a;
    public final o01 f26923b;

    public p01(o01 o01Var, int i10) {
        this.f26923b = o01Var;
        if (i10 > 0) {
            this.f26922a = i10;
        }
    }

    public final void a(TextPaint textPaint) {
        o01 o01Var = this.f26923b;
        if (w7.c0.a(o01Var.f26643a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (w7.c0.a(o01Var.f26643a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (w7.c0.a(o01Var.f26643a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final o01 b() {
        return this.f26923b;
    }

    public final boolean c() {
        if ((this.f26923b.f26643a & 256) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f26922a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f26923b.a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        int i10 = this.f26922a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f26923b.a(textPaint);
    }
}
