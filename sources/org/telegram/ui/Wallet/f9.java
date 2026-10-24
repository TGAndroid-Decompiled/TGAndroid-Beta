package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
public final class f9 extends ReplacementSpan {
    public final String f34520a;
    public final String f34521b;
    public final boolean f34522c;
    public float d;
    public int e;
    public int f34523f;
    public h9 h;
    public h9 f34524n;
    public final i9 f34525r;

    public f9(i9 i9Var, String str, boolean z10, boolean z11) {
        String str2;
        this.f34525r = i9Var;
        this.f34520a = str;
        if (z10) {
            str2 = i9Var.P;
        } else {
            str2 = "";
        }
        this.f34521b = str2;
        this.f34522c = z11;
    }

    public final int a() {
        int i10 = this.e;
        return Math.round((i9.S.getInterpolation(this.f34525r.I) * (this.f34523f - i10)) + i10);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        Canvas canvas2;
        Paint paint2;
        int i15;
        float textSize = paint.getTextSize();
        if (this.f34522c) {
            paint.setTextSize((28.0f * textSize) / 44.0f);
        }
        float f10 = f7 - this.d;
        h9 h9Var = this.f34524n;
        if (h9Var != null) {
            paint2 = paint;
            i15 = i13;
            canvas2 = canvas;
            h9Var.b(canvas2, paint2, this.f34521b, f10, i15);
        } else {
            canvas2 = canvas;
            paint2 = paint;
            i15 = i13;
        }
        this.h.b(canvas2, paint2, this.f34520a, f10, i15);
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
