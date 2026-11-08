package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
public final class i9 extends ReplacementSpan {
    public final String f42643a;
    public final String f42644b;
    public final boolean f42645c;
    public float d;
    public int f42646e;
    public int f42647f;
    public k9 h;
    public k9 f42648n;
    public final l9 f42649r;

    public i9(l9 l9Var, String str, boolean z9, boolean z10) {
        String str2;
        this.f42649r = l9Var;
        this.f42643a = str;
        if (z9) {
            str2 = l9Var.P;
        } else {
            str2 = "";
        }
        this.f42644b = str2;
        this.f42645c = z10;
    }

    public final int a() {
        int i7 = this.f42646e;
        return Math.round((l9.S.getInterpolation(this.f42649r.I) * (this.f42647f - i7)) + i7);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        Canvas canvas2;
        Paint paint2;
        int i14;
        float textSize = paint.getTextSize();
        if (this.f42645c) {
            paint.setTextSize((28.0f * textSize) / 44.0f);
        }
        float f11 = f10 - this.d;
        k9 k9Var = this.f42648n;
        if (k9Var != null) {
            paint2 = paint;
            i14 = i12;
            canvas2 = canvas;
            k9Var.b(canvas2, paint2, this.f42644b, f11, i14);
        } else {
            canvas2 = canvas;
            paint2 = paint;
            i14 = i12;
        }
        this.h.b(canvas2, paint2, this.f42643a, f11, i14);
        paint2.setTextSize(textSize);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            paint.getFontMetricsInt(fontMetricsInt);
        }
        return a();
    }
}
