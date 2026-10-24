package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class q11 extends MetricAffectingSpan {
    public final int f29752a;
    public final p11 f29753b;

    public q11(p11 p11Var, int i10) {
        this.f29753b = p11Var;
        if (i10 > 0) {
            this.f29752a = i10;
        }
    }

    public final void a(TextPaint textPaint) {
        p11 p11Var = this.f29753b;
        if (w7.j6.a(p11Var.f29448a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (w7.j6.a(p11Var.f29448a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (w7.j6.a(p11Var.f29448a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final p11 b() {
        return this.f29753b;
    }

    public final boolean c() {
        if ((this.f29753b.f29448a & 256) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f29752a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f29753b.a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        int i10 = this.f29752a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f29753b.a(textPaint);
    }
}
