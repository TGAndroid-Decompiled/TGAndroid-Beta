package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class z11 extends MetricAffectingSpan {
    public final int f35177a;
    public final y11 f35178b;

    public z11(y11 y11Var, int i10) {
        this.f35178b = y11Var;
        if (i10 > 0) {
            this.f35177a = i10;
        }
    }

    public final void a(TextPaint textPaint) {
        y11 y11Var = this.f35178b;
        if (a8.pf.a(y11Var.f34904a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (a8.pf.a(y11Var.f34904a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (a8.pf.a(y11Var.f34904a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final y11 b() {
        return this.f35178b;
    }

    public final boolean c() {
        if ((this.f35178b.f34904a & 256) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f35177a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f35178b.a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        int i10 = this.f35177a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f35178b.a(textPaint);
    }
}
