package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
public final class h9 extends ReplacementSpan {
    public final String f42562a;
    public final String f42563b;
    public final boolean f42564c;
    public float d;
    public int f42565e;
    public int f42566f;
    public j9 h;
    public j9 f42567n;
    public final k9 f42568r;

    public h9(k9 k9Var, String str, boolean z9, boolean z10) {
        String str2;
        this.f42568r = k9Var;
        this.f42562a = str;
        if (z9) {
            str2 = k9Var.P;
        } else {
            str2 = "";
        }
        this.f42563b = str2;
        this.f42564c = z10;
    }

    public final int a() {
        int i7 = this.f42565e;
        return Math.round((k9.S.getInterpolation(this.f42568r.I) * (this.f42566f - i7)) + i7);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        Canvas canvas2;
        Paint paint2;
        int i14;
        float textSize = paint.getTextSize();
        if (this.f42564c) {
            paint.setTextSize((28.0f * textSize) / 44.0f);
        }
        float f11 = f10 - this.d;
        j9 j9Var = this.f42567n;
        if (j9Var != null) {
            paint2 = paint;
            i14 = i12;
            canvas2 = canvas;
            j9Var.b(canvas2, paint2, this.f42563b, f11, i14);
        } else {
            canvas2 = canvas;
            paint2 = paint;
            i14 = i12;
        }
        this.h.b(canvas2, paint2, this.f42562a, f11, i14);
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
