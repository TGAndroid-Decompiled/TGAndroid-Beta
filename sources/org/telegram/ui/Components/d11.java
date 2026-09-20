package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class d11 extends MetricAffectingSpan {
    public final int f23462a;
    public final c11 f23463b;

    public d11(c11 c11Var, int i10) {
        this.f23463b = c11Var;
        if (i10 > 0) {
            this.f23462a = i10;
        }
    }

    public final void a(TextPaint textPaint) {
        c11 c11Var = this.f23463b;
        if (w7.d0.a(c11Var.f23124a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (w7.d0.a(c11Var.f23124a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (w7.d0.a(c11Var.f23124a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final c11 b() {
        return this.f23463b;
    }

    public final boolean c() {
        if ((this.f23463b.f23124a & 256) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f23462a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f23463b.a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        int i10 = this.f23462a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f23463b.a(textPaint);
    }
}
