package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
public final class f8 extends ReplacementSpan {
    public final String f32927a;
    public final String f32928b;
    public final boolean f32929c;
    public float d;
    public int e;
    public int f32930f;
    public h8 h;
    public h8 f32931n;
    public final i8 f32932r;

    public f8(i8 i8Var, String str, boolean z10, boolean z11) {
        String str2;
        this.f32932r = i8Var;
        this.f32927a = str;
        if (z10) {
            str2 = i8Var.O;
        } else {
            str2 = "";
        }
        this.f32928b = str2;
        this.f32929c = z11;
    }

    public final int a() {
        int i10 = this.e;
        return Math.round((i8.R.getInterpolation(this.f32932r.H) * (this.f32930f - i10)) + i10);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        Canvas canvas2;
        Paint paint2;
        int i15;
        float textSize = paint.getTextSize();
        if (this.f32929c) {
            paint.setTextSize((28.0f * textSize) / 44.0f);
        }
        float f10 = f7 - this.d;
        h8 h8Var = this.f32931n;
        if (h8Var != null) {
            paint2 = paint;
            i15 = i13;
            canvas2 = canvas;
            h8Var.b(canvas2, paint2, this.f32928b, f10, i15);
        } else {
            canvas2 = canvas;
            paint2 = paint;
            i15 = i13;
        }
        this.h.b(canvas2, paint2, this.f32927a, f10, i15);
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
