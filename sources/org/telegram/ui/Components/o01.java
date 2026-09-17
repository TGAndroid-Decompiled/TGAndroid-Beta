package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class o01 extends MetricAffectingSpan {
    public final int f28912a;
    public final n01 f28913b;

    public o01(n01 n01Var, int i10) {
        this.f28913b = n01Var;
        if (i10 > 0) {
            this.f28912a = i10;
        }
    }

    public final void a(TextPaint textPaint) {
        n01 n01Var = this.f28913b;
        if (w7.b0.a(n01Var.f28592a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (w7.b0.a(n01Var.f28592a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (w7.b0.a(n01Var.f28592a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final n01 b() {
        return this.f28913b;
    }

    public final boolean c() {
        if ((this.f28913b.f28592a & 256) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f28912a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f28913b.a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        int i10 = this.f28912a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f28913b.a(textPaint);
    }
}
