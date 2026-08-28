package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class wz0 extends MetricAffectingSpan {
    public final int f34478a;
    public final vz0 f34479b;

    public wz0(vz0 vz0Var, int i9) {
        this.f34479b = vz0Var;
        if (i9 > 0) {
            this.f34478a = i9;
        }
    }

    public final void a(TextPaint textPaint) {
        vz0 vz0Var = this.f34479b;
        if (g7.z7.a(vz0Var.f34062a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (g7.z7.a(vz0Var.f34062a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (g7.z7.a(vz0Var.f34062a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final vz0 b() {
        return this.f34479b;
    }

    public final boolean c() {
        if ((this.f34479b.f34062a & 256) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i9 = this.f34478a;
        if (i9 != 0) {
            textPaint.setTextSize(i9);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f34479b.a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        int i9 = this.f34478a;
        if (i9 != 0) {
            textPaint.setTextSize(i9);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.f34479b.a(textPaint);
    }
}
