package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class e11 extends MetricAffectingSpan {
    public final int f23811a;
    public final d11 f23812b;

    public e11(d11 d11Var, int i10) {
        this.f23812b = d11Var;
        if (i10 > 0) {
            this.f23811a = i10;
        }
    }

    public final void a(TextPaint textPaint) {
        d11 d11Var = this.f23812b;
        if (w7.d0.a(d11Var.f23467a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (w7.d0.a(d11Var.f23467a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (w7.d0.a(d11Var.f23467a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final d11 b() {
        return this.f23812b;
    }

    public final boolean c() {
        if ((this.f23812b.f23467a & 256) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f23811a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f23812b.a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        int i10 = this.f23811a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f23812b.a(textPaint);
    }
}
