package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class zz0 extends MetricAffectingSpan {
    public final int f33276a;
    public final yz0 f33277b;

    public zz0(yz0 yz0Var, int i10) {
        this.f33277b = yz0Var;
        if (i10 > 0) {
            this.f33276a = i10;
        }
    }

    public final void a(TextPaint textPaint) {
        yz0 yz0Var = this.f33277b;
        if (v7.u7.a(yz0Var.f32850a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (v7.u7.a(yz0Var.f32850a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (v7.u7.a(yz0Var.f32850a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final yz0 b() {
        return this.f33277b;
    }

    public final boolean c() {
        if ((this.f33277b.f32850a & 256) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f33276a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f33277b.a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        int i10 = this.f33276a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f33277b.a(textPaint);
    }
}
