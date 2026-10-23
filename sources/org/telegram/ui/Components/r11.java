package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class r11 extends MetricAffectingSpan {
    public final int f30053a;
    public final q11 f30054b;

    public r11(q11 q11Var, int i10) {
        this.f30054b = q11Var;
        if (i10 > 0) {
            this.f30053a = i10;
        }
    }

    public final void a(TextPaint textPaint) {
        q11 q11Var = this.f30054b;
        if (w7.j6.a(q11Var.f29754a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (w7.j6.a(q11Var.f29754a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (w7.j6.a(q11Var.f29754a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final q11 b() {
        return this.f30054b;
    }

    public final boolean c() {
        if ((this.f30054b.f29754a & 256) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f30053a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f30054b.a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        int i10 = this.f30053a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f30054b.a(textPaint);
    }
}
