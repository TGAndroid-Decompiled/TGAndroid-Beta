package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class c11 extends MetricAffectingSpan {
    public final int f21968a;
    public final b11 f21969b;

    public c11(b11 b11Var, int i10) {
        this.f21969b = b11Var;
        if (i10 > 0) {
            this.f21968a = i10;
        }
    }

    public final void a(TextPaint textPaint) {
        b11 b11Var = this.f21969b;
        if (w7.c0.a(b11Var.f21677a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (w7.c0.a(b11Var.f21677a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (w7.c0.a(b11Var.f21677a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final b11 b() {
        return this.f21969b;
    }

    public final boolean c() {
        if ((this.f21969b.f21677a & 256) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f21968a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f21969b.a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        int i10 = this.f21968a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f21969b.a(textPaint);
    }
}
