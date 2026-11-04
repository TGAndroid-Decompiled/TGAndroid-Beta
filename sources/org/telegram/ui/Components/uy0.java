package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class uy0 extends MetricAffectingSpan {
    public final int f38911a;
    public final ty0 f38912b;

    public uy0(ty0 ty0Var, int i3) {
        this.f38912b = ty0Var;
        if (i3 > 0) {
            this.f38911a = i3;
        }
    }

    public final void a(TextPaint textPaint) {
        ty0 ty0Var = this.f38912b;
        if (x7.u.a(ty0Var.f38578a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (x7.u.a(ty0Var.f38578a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (x7.u.a(ty0Var.f38578a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final ty0 b() {
        return this.f38912b;
    }

    public final boolean c() {
        if ((this.f38912b.f38578a & 256) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i3 = this.f38911a;
        if (i3 != 0) {
            textPaint.setTextSize(i3);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f38912b.a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        int i3 = this.f38911a;
        if (i3 != 0) {
            textPaint.setTextSize(i3);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f38912b.a(textPaint);
    }
}
