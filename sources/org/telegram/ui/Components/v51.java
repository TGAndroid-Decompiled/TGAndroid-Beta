package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class v51 extends MetricAffectingSpan {
    public Typeface f29043a;
    public int f29044b;
    public int f29045c;

    public v51(Typeface typeface) {
        this.f29045c = -1;
        this.f29043a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f29045c;
        if (i10 >= 0) {
            this.f29044b = org.telegram.ui.ActionBar.h6.w0(null, i10, false);
        }
        Typeface typeface = this.f29043a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i11 = this.f29044b;
        if (i11 != 0) {
            textPaint.setColor(i11);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f29043a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public v51() {
        Typeface typeface = Typeface.DEFAULT;
        this.f29045c = -1;
        this.f29043a = typeface;
    }

    public v51(Typeface typeface, int i10) {
        this.f29045c = -1;
        this.f29043a = typeface;
        this.f29044b = i10;
    }
}
