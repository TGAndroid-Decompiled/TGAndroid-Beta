package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
public final class e8 extends ReplacementSpan {
    public final String f34869a;
    public final String f34870b;
    public final boolean f34871c;
    public float d;
    public int f34872e;
    public int f34873f;
    public g8 h;
    public g8 f34874n;
    public final h8 f34875r;

    public e8(h8 h8Var, String str, boolean z10, boolean z11) {
        String str2;
        this.f34875r = h8Var;
        this.f34869a = str;
        if (z10) {
            str2 = h8Var.O;
        } else {
            str2 = "";
        }
        this.f34870b = str2;
        this.f34871c = z11;
    }

    public final int a() {
        int i10 = this.f34872e;
        return Math.round((h8.R.getInterpolation(this.f34875r.H) * (this.f34873f - i10)) + i10);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        Canvas canvas2;
        Paint paint2;
        int i15;
        float textSize = paint.getTextSize();
        if (this.f34871c) {
            paint.setTextSize((28.0f * textSize) / 44.0f);
        }
        float f10 = f7 - this.d;
        g8 g8Var = this.f34874n;
        if (g8Var != null) {
            paint2 = paint;
            i15 = i13;
            canvas2 = canvas;
            g8Var.b(canvas2, paint2, this.f34870b, f10, i15);
        } else {
            canvas2 = canvas;
            paint2 = paint;
            i15 = i13;
        }
        this.h.b(canvas2, paint2, this.f34869a, f10, i15);
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
