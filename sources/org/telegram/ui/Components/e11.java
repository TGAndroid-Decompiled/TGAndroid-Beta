package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class e11 extends MetricAffectingSpan {
    public final int f23752a;
    public final d11 f23753b;

    public e11(d11 d11Var, int i10) {
        this.f23753b = d11Var;
        if (i10 > 0) {
            this.f23752a = i10;
        }
    }

    public final void a(TextPaint textPaint) {
        d11 d11Var = this.f23753b;
        if (w7.d0.a(d11Var.f23395a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (w7.d0.a(d11Var.f23395a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (w7.d0.a(d11Var.f23395a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final d11 b() {
        return this.f23753b;
    }

    public final boolean c() {
        if ((this.f23753b.f23395a & 256) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f23752a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f23753b.a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        int i10 = this.f23752a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f23753b.a(textPaint);
    }
}
