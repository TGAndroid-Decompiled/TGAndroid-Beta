package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class yz0 extends MetricAffectingSpan {

    public final int f35100a;

    public final xz0 f35101b;

    public yz0(xz0 xz0Var, int i10) {
        this.f35101b = xz0Var;
        if (i10 > 0) {
            this.f35100a = i10;
        }
    }

    public final void a(TextPaint textPaint) {
        xz0 xz0Var = this.f35101b;
        if (h7.a8.a(xz0Var.f34734a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (h7.a8.a(xz0Var.f34734a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (h7.a8.a(xz0Var.f34734a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final xz0 b() {
        return this.f35101b;
    }

    public final boolean c() {
        return (this.f35101b.f34734a & 256) > 0;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f35100a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f35101b.a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        int i10 = this.f35100a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f35101b.a(textPaint);
    }
}
