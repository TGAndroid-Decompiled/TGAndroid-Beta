package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class n11 extends MetricAffectingSpan {
    public final int f28644a;
    public final m11 f28645b;

    public n11(m11 m11Var, int i10) {
        this.f28645b = m11Var;
        if (i10 > 0) {
            this.f28644a = i10;
        }
    }

    public final void a(TextPaint textPaint) {
        m11 m11Var = this.f28645b;
        if (w7.j6.a(m11Var.f28357a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (w7.j6.a(m11Var.f28357a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (w7.j6.a(m11Var.f28357a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final m11 b() {
        return this.f28645b;
    }

    public final boolean c() {
        if ((this.f28645b.f28357a & 256) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f28644a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f28645b.a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        int i10 = this.f28644a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f28645b.a(textPaint);
    }
}
