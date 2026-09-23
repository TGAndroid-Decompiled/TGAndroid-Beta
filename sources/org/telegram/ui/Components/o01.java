package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class o01 extends MetricAffectingSpan {
    public final int f26560a;
    public final n01 f26561b;

    public o01(n01 n01Var, int i10) {
        this.f26561b = n01Var;
        if (i10 > 0) {
            this.f26560a = i10;
        }
    }

    public final void a(TextPaint textPaint) {
        n01 n01Var = this.f26561b;
        if (w7.c0.a(n01Var.f26312a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (w7.c0.a(n01Var.f26312a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (w7.c0.a(n01Var.f26312a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final n01 b() {
        return this.f26561b;
    }

    public final boolean c() {
        if ((this.f26561b.f26312a & 256) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f26560a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f26561b.a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        int i10 = this.f26560a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f26561b.a(textPaint);
    }
}
