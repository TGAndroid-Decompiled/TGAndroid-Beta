package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
public final class g8 extends ReplacementSpan {
    public final String f35027a;
    public final String f35028b;
    public final boolean f35029c;
    public float d;
    public int f35030e;
    public int f35031f;
    public i8 h;
    public i8 f35032n;
    public final j8 f35033r;

    public g8(j8 j8Var, String str, boolean z10, boolean z11) {
        String str2;
        this.f35033r = j8Var;
        this.f35027a = str;
        if (z10) {
            str2 = j8Var.O;
        } else {
            str2 = "";
        }
        this.f35028b = str2;
        this.f35029c = z11;
    }

    public final int a() {
        int i10 = this.f35030e;
        return Math.round((j8.R.getInterpolation(this.f35033r.H) * (this.f35031f - i10)) + i10);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        Canvas canvas2;
        Paint paint2;
        int i15;
        float textSize = paint.getTextSize();
        if (this.f35029c) {
            paint.setTextSize((28.0f * textSize) / 44.0f);
        }
        float f10 = f7 - this.d;
        i8 i8Var = this.f35032n;
        if (i8Var != null) {
            paint2 = paint;
            i15 = i13;
            canvas2 = canvas;
            i8Var.b(canvas2, paint2, this.f35028b, f10, i15);
        } else {
            canvas2 = canvas;
            paint2 = paint;
            i15 = i13;
        }
        this.h.b(canvas2, paint2, this.f35027a, f10, i15);
        paint2.setTextSize(textSize);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            paint.getFontMetricsInt(fontMetricsInt);
        }
        return a();
    }
}
