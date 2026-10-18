package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class m11 extends MetricAffectingSpan {
    public final int f28374a;
    public final l11 f28375b;

    public m11(l11 l11Var, int i10) {
        this.f28375b = l11Var;
        if (i10 > 0) {
            this.f28374a = i10;
        }
    }

    public final void a(TextPaint textPaint) {
        l11 l11Var = this.f28375b;
        if (w7.m6.a(l11Var.f28056a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (w7.m6.a(l11Var.f28056a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (w7.m6.a(l11Var.f28056a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final l11 b() {
        return this.f28375b;
    }

    public final boolean c() {
        if ((this.f28375b.f28056a & 256) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f28374a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f28375b.a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        int i10 = this.f28374a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f28375b.a(textPaint);
    }
}
