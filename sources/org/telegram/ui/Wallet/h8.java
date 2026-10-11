package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
public final class h8 extends ReplacementSpan {
    public final String f35090a;
    public final String f35091b;
    public final boolean f35092c;
    public float d;
    public int f35093e;
    public int f35094f;
    public j8 h;
    public j8 f35095n;
    public final k8 f35096r;

    public h8(k8 k8Var, String str, boolean z10, boolean z11) {
        String str2;
        this.f35096r = k8Var;
        this.f35090a = str;
        if (z10) {
            str2 = k8Var.O;
        } else {
            str2 = "";
        }
        this.f35091b = str2;
        this.f35092c = z11;
    }

    public final int a() {
        int i10 = this.f35093e;
        return Math.round((k8.R.getInterpolation(this.f35096r.H) * (this.f35094f - i10)) + i10);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        Canvas canvas2;
        Paint paint2;
        int i15;
        float textSize = paint.getTextSize();
        if (this.f35092c) {
            paint.setTextSize((28.0f * textSize) / 44.0f);
        }
        float f10 = f7 - this.d;
        j8 j8Var = this.f35095n;
        if (j8Var != null) {
            paint2 = paint;
            i15 = i13;
            canvas2 = canvas;
            j8Var.b(canvas2, paint2, this.f35091b, f10, i15);
        } else {
            canvas2 = canvas;
            paint2 = paint;
            i15 = i13;
        }
        this.h.b(canvas2, paint2, this.f35090a, f10, i15);
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
