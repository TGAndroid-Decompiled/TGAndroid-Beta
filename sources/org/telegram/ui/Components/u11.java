package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class u11 extends MetricAffectingSpan {
    public final int f31338a;
    public final t11 f31339b;

    public u11(t11 t11Var, int i10) {
        this.f31339b = t11Var;
        if (i10 > 0) {
            this.f31338a = i10;
        }
    }

    public final void a(TextPaint textPaint) {
        t11 t11Var = this.f31339b;
        if (w7.g0.a(t11Var.f30974a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (w7.g0.a(t11Var.f30974a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (w7.g0.a(t11Var.f30974a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final t11 b() {
        return this.f31339b;
    }

    public final boolean c() {
        if ((this.f31339b.f30974a & 256) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f31338a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f31339b.a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        int i10 = this.f31338a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f31339b.a(textPaint);
    }
}
