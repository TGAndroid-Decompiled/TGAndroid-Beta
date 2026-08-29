package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class i01 extends MetricAffectingSpan {
    public final int f29293a;
    public final h01 f29294b;

    public i01(h01 h01Var, int i10) {
        this.f29294b = h01Var;
        if (i10 > 0) {
            this.f29293a = i10;
        }
    }

    public final void a(TextPaint textPaint) {
        h01 h01Var = this.f29294b;
        if (i7.n8.a(h01Var.f29024a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (i7.n8.a(h01Var.f29024a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (i7.n8.a(h01Var.f29024a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final h01 b() {
        return this.f29294b;
    }

    public final boolean c() {
        if ((this.f29294b.f29024a & 256) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f29293a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f29294b.a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        int i10 = this.f29293a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f29294b.a(textPaint);
    }
}
