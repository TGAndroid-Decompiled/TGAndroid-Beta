package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class f11 extends MetricAffectingSpan {
    public final int f24077a;
    public final e11 f24078b;

    public f11(e11 e11Var, int i10) {
        this.f24078b = e11Var;
        if (i10 > 0) {
            this.f24077a = i10;
        }
    }

    public final void a(TextPaint textPaint) {
        e11 e11Var = this.f24078b;
        if (w7.d0.a(e11Var.f23827a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (w7.d0.a(e11Var.f23827a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (w7.d0.a(e11Var.f23827a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final e11 b() {
        return this.f24078b;
    }

    public final boolean c() {
        if ((this.f24078b.f23827a & 256) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f24077a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f24078b.a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        int i10 = this.f24077a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f24078b.a(textPaint);
    }
}
