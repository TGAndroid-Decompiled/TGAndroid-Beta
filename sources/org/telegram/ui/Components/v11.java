package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class v11 extends MetricAffectingSpan {
    public final int f31703a;
    public final u11 f31704b;

    public v11(u11 u11Var, int i10) {
        this.f31704b = u11Var;
        if (i10 > 0) {
            this.f31703a = i10;
        }
    }

    public final void a(TextPaint textPaint) {
        u11 u11Var = this.f31704b;
        if (w7.g0.a(u11Var.f31299a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (w7.g0.a(u11Var.f31299a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (w7.g0.a(u11Var.f31299a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final u11 b() {
        return this.f31704b;
    }

    public final boolean c() {
        if ((this.f31704b.f31299a & 256) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f31703a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f31704b.a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        int i10 = this.f31703a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f31704b.a(textPaint);
    }
}
