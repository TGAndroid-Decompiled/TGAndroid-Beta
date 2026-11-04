package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class o31 extends MetricAffectingSpan {
    public Typeface f36687a;
    public int f36688b;
    public int f36689c;

    public o31(Typeface typeface) {
        this.f36689c = -1;
        this.f36687a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i3 = this.f36689c;
        if (i3 >= 0) {
            this.f36688b = org.telegram.ui.ActionBar.k6.v0(i3);
        }
        Typeface typeface = this.f36687a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i10 = this.f36688b;
        if (i10 != 0) {
            textPaint.setColor(i10);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f36687a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public o31() {
        Typeface typeface = Typeface.DEFAULT;
        this.f36689c = -1;
        this.f36687a = typeface;
    }

    public o31(Typeface typeface, int i3) {
        this.f36689c = -1;
        this.f36687a = typeface;
        this.f36688b = i3;
    }
}
