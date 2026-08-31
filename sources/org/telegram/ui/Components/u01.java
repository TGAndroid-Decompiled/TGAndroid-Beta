package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class u01 extends MetricAffectingSpan {
    public final int f31512a;
    public final t01 f31513b;

    public u01(t01 t01Var, int i10) {
        this.f31513b = t01Var;
        if (i10 > 0) {
            this.f31512a = i10;
        }
    }

    public final void a(TextPaint textPaint) {
        t01 t01Var = this.f31513b;
        if (k7.x8.a(t01Var.f31225a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (k7.x8.a(t01Var.f31225a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (k7.x8.a(t01Var.f31225a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final t01 b() {
        return this.f31513b;
    }

    public final boolean c() {
        if ((this.f31513b.f31225a & 256) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f31512a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f31513b.a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        int i10 = this.f31512a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f31513b.a(textPaint);
    }
}
