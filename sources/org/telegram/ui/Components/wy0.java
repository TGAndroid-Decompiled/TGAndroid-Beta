package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class wy0 extends MetricAffectingSpan {
    public final int f40237a;
    public final vy0 f40238b;

    public wy0(vy0 vy0Var, int i7) {
        this.f40238b = vy0Var;
        if (i7 > 0) {
            this.f40237a = i7;
        }
    }

    public final void a(TextPaint textPaint) {
        vy0 vy0Var = this.f40238b;
        if (c8.zc.a(vy0Var.f39836a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (c8.zc.a(vy0Var.f39836a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (c8.zc.a(vy0Var.f39836a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final vy0 b() {
        return this.f40238b;
    }

    public final boolean c() {
        if ((this.f40238b.f39836a & 256) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i7 = this.f40237a;
        if (i7 != 0) {
            textPaint.setTextSize(i7);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f40238b.a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        int i7 = this.f40237a;
        if (i7 != 0) {
            textPaint.setTextSize(i7);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f40238b.a(textPaint);
    }
}
