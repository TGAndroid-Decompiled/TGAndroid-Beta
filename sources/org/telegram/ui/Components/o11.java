package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class o11 extends MetricAffectingSpan {
    public final int f28919a;
    public final n11 f28920b;

    public o11(n11 n11Var, int i10) {
        this.f28920b = n11Var;
        if (i10 > 0) {
            this.f28919a = i10;
        }
    }

    public final void a(TextPaint textPaint) {
        n11 n11Var = this.f28920b;
        if (w7.j6.a(n11Var.f28650a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (w7.j6.a(n11Var.f28650a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (w7.j6.a(n11Var.f28650a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final n11 b() {
        return this.f28920b;
    }

    public final boolean c() {
        if ((this.f28920b.f28650a & 256) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f28919a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f28920b.a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        int i10 = this.f28919a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f28920b.a(textPaint);
    }
}
