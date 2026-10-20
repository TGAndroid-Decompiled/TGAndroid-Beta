package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class o11 extends MetricAffectingSpan {
    public final int f28918a;
    public final n11 f28919b;

    public o11(n11 n11Var, int i10) {
        this.f28919b = n11Var;
        if (i10 > 0) {
            this.f28918a = i10;
        }
    }

    public final void a(TextPaint textPaint) {
        n11 n11Var = this.f28919b;
        if (w7.j6.a(n11Var.f28649a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (w7.j6.a(n11Var.f28649a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (w7.j6.a(n11Var.f28649a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final n11 b() {
        return this.f28919b;
    }

    public final boolean c() {
        if ((this.f28919b.f28649a & 256) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f28918a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f28919b.a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        int i10 = this.f28918a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f28919b.a(textPaint);
    }
}
