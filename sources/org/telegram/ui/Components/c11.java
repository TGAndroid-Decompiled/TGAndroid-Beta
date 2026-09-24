package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class c11 extends MetricAffectingSpan {
    public final int f23122a;
    public final b11 f23123b;

    public c11(b11 b11Var, int i10) {
        this.f23123b = b11Var;
        if (i10 > 0) {
            this.f23122a = i10;
        }
    }

    public final void a(TextPaint textPaint) {
        b11 b11Var = this.f23123b;
        if (w7.d0.a(b11Var.f22840a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (w7.d0.a(b11Var.f22840a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (w7.d0.a(b11Var.f22840a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final b11 b() {
        return this.f23123b;
    }

    public final boolean c() {
        if ((this.f23123b.f22840a & 256) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f23122a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f23123b.a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        int i10 = this.f23122a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f23123b.a(textPaint);
    }
}
