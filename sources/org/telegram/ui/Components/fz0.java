package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class fz0 extends MetricAffectingSpan {
    public final int f35239a;
    public final ez0 f35240b;

    public fz0(ez0 ez0Var, int i7) {
        this.f35240b = ez0Var;
        if (i7 > 0) {
            this.f35239a = i7;
        }
    }

    public final void a(TextPaint textPaint) {
        ez0 ez0Var = this.f35240b;
        if (c8.ed.a(ez0Var.f34924a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (c8.ed.a(ez0Var.f34924a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (c8.ed.a(ez0Var.f34924a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final ez0 b() {
        return this.f35240b;
    }

    public final boolean c() {
        if ((this.f35240b.f34924a & 256) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i7 = this.f35239a;
        if (i7 != 0) {
            textPaint.setTextSize(i7);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f35240b.a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        int i7 = this.f35239a;
        if (i7 != 0) {
            textPaint.setTextSize(i7);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f35240b.a(textPaint);
    }
}
