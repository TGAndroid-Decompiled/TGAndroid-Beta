package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class ez0 extends MetricAffectingSpan {
    public final int f34852a;
    public final dz0 f34853b;

    public ez0(dz0 dz0Var, int i7) {
        this.f34853b = dz0Var;
        if (i7 > 0) {
            this.f34852a = i7;
        }
    }

    public final void a(TextPaint textPaint) {
        dz0 dz0Var = this.f34853b;
        if (c8.dd.a(dz0Var.f34537a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (c8.dd.a(dz0Var.f34537a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (c8.dd.a(dz0Var.f34537a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final dz0 b() {
        return this.f34853b;
    }

    public final boolean c() {
        if ((this.f34853b.f34537a & 256) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i7 = this.f34852a;
        if (i7 != 0) {
            textPaint.setTextSize(i7);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f34853b.a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        int i7 = this.f34852a;
        if (i7 != 0) {
            textPaint.setTextSize(i7);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f34853b.a(textPaint);
    }
}
