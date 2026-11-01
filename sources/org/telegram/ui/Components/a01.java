package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class a01 extends MetricAffectingSpan {
    public final int f24260a;
    public final zz0 f24261b;

    public a01(zz0 zz0Var, int i10) {
        this.f24261b = zz0Var;
        if (i10 > 0) {
            this.f24260a = i10;
        }
    }

    public final void a(TextPaint textPaint) {
        zz0 zz0Var = this.f24261b;
        if (v7.u7.a(zz0Var.f33282a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (v7.u7.a(zz0Var.f33282a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (v7.u7.a(zz0Var.f33282a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final zz0 b() {
        return this.f24261b;
    }

    public final boolean c() {
        if ((this.f24261b.f33282a & 256) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f24260a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f24261b.a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        int i10 = this.f24260a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f24261b.a(textPaint);
    }
}
