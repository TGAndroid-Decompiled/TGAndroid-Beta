package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class a21 extends MetricAffectingSpan {
    public final int f26415a;
    public final z11 f26416b;

    public a21(z11 z11Var, int i10) {
        this.f26416b = z11Var;
        if (i10 > 0) {
            this.f26415a = i10;
        }
    }

    public final void a(TextPaint textPaint) {
        z11 z11Var = this.f26416b;
        if (a8.pf.a(z11Var.f35208a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (a8.pf.a(z11Var.f35208a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (a8.pf.a(z11Var.f35208a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final z11 b() {
        return this.f26416b;
    }

    public final boolean c() {
        if ((this.f26416b.f35208a & 256) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f26415a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f26416b.a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        int i10 = this.f26415a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f26416b.a(textPaint);
    }
}
