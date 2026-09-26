package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class c11 extends MetricAffectingSpan {
    public final int f23151a;
    public final b11 f23152b;

    public c11(b11 b11Var, int i10) {
        this.f23152b = b11Var;
        if (i10 > 0) {
            this.f23151a = i10;
        }
    }

    public final void a(TextPaint textPaint) {
        b11 b11Var = this.f23152b;
        if (w7.d0.a(b11Var.f22848a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (w7.d0.a(b11Var.f22848a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (w7.d0.a(b11Var.f22848a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final b11 b() {
        return this.f23152b;
    }

    public final boolean c() {
        if ((this.f23152b.f22848a & 256) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f23151a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f23152b.a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        int i10 = this.f23151a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f23152b.a(textPaint);
    }
}
