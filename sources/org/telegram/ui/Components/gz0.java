package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class gz0 extends MetricAffectingSpan {
    public final int f35710a;
    public final fz0 f35711b;

    public gz0(fz0 fz0Var, int i7) {
        this.f35711b = fz0Var;
        if (i7 > 0) {
            this.f35710a = i7;
        }
    }

    public final void a(TextPaint textPaint) {
        fz0 fz0Var = this.f35711b;
        if (c8.dd.a(fz0Var.f35335a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (c8.dd.a(fz0Var.f35335a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (c8.dd.a(fz0Var.f35335a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final fz0 b() {
        return this.f35711b;
    }

    public final boolean c() {
        if ((this.f35711b.f35335a & 256) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i7 = this.f35710a;
        if (i7 != 0) {
            textPaint.setTextSize(i7);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f35711b.a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        int i7 = this.f35710a;
        if (i7 != 0) {
            textPaint.setTextSize(i7);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f35711b.a(textPaint);
    }
}
