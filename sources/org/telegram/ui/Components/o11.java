package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class o11 extends MetricAffectingSpan {
    public final int f29297a;
    public final n11 f29298b;

    public o11(n11 n11Var, int i10) {
        this.f29298b = n11Var;
        if (i10 > 0) {
            this.f29297a = i10;
        }
    }

    public final void a(TextPaint textPaint) {
        n11 n11Var = this.f29298b;
        if (w7.e0.a(n11Var.f28925a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (w7.e0.a(n11Var.f28925a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (w7.e0.a(n11Var.f28925a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final n11 b() {
        return this.f29298b;
    }

    public final boolean c() {
        if ((this.f29298b.f28925a & 256) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f29297a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f29298b.a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        int i10 = this.f29297a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f29298b.a(textPaint);
    }
}
