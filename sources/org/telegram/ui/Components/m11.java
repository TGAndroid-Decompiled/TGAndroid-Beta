package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class m11 extends MetricAffectingSpan {
    public final int f28367a;
    public final l11 f28368b;

    public m11(l11 l11Var, int i10) {
        this.f28368b = l11Var;
        if (i10 > 0) {
            this.f28367a = i10;
        }
    }

    public final void a(TextPaint textPaint) {
        l11 l11Var = this.f28368b;
        if (w7.k6.a(l11Var.f28049a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (w7.k6.a(l11Var.f28049a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (w7.k6.a(l11Var.f28049a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final l11 b() {
        return this.f28368b;
    }

    public final boolean c() {
        if ((this.f28368b.f28049a & 256) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f28367a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f28368b.a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        int i10 = this.f28367a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f28368b.a(textPaint);
    }
}
