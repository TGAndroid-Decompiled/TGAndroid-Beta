package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class q01 extends MetricAffectingSpan {
    public final int f27187a;
    public final p01 f27188b;

    public q01(p01 p01Var, int i10) {
        this.f27188b = p01Var;
        if (i10 > 0) {
            this.f27187a = i10;
        }
    }

    public final void a(TextPaint textPaint) {
        p01 p01Var = this.f27188b;
        if (w7.c0.a(p01Var.f26908a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (w7.c0.a(p01Var.f26908a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (w7.c0.a(p01Var.f26908a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final p01 b() {
        return this.f27188b;
    }

    public final boolean c() {
        if ((this.f27188b.f26908a & 256) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f27187a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f27188b.a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        int i10 = this.f27187a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f27188b.a(textPaint);
    }
}
