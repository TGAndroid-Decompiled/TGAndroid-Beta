package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class t01 extends MetricAffectingSpan {
    public final int f28858a;
    public final s01 f28859b;

    public t01(s01 s01Var, int i10) {
        this.f28859b = s01Var;
        if (i10 > 0) {
            this.f28858a = i10;
        }
    }

    public final void a(TextPaint textPaint) {
        s01 s01Var = this.f28859b;
        if (k7.w8.a(s01Var.f28583a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (k7.w8.a(s01Var.f28583a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (k7.w8.a(s01Var.f28583a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final s01 b() {
        return this.f28859b;
    }

    public final boolean c() {
        if ((this.f28859b.f28583a & 256) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f28858a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f28859b.a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        int i10 = this.f28858a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f28859b.a(textPaint);
    }
}
