package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
public final class e9 extends ReplacementSpan {
    public final String f34181a;
    public final String f34182b;
    public final boolean f34183c;
    public float d;
    public int e;
    public int f34184f;
    public g9 h;
    public g9 f34185n;
    public final h9 f34186r;

    public e9(h9 h9Var, String str, boolean z10, boolean z11) {
        String str2;
        this.f34186r = h9Var;
        this.f34181a = str;
        if (z10) {
            str2 = h9Var.O;
        } else {
            str2 = "";
        }
        this.f34182b = str2;
        this.f34183c = z11;
    }

    public final int a() {
        int i10 = this.e;
        return Math.round((h9.R.getInterpolation(this.f34186r.H) * (this.f34184f - i10)) + i10);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        Canvas canvas2;
        Paint paint2;
        int i15;
        float textSize = paint.getTextSize();
        if (this.f34183c) {
            paint.setTextSize((28.0f * textSize) / 44.0f);
        }
        float f10 = f7 - this.d;
        g9 g9Var = this.f34185n;
        if (g9Var != null) {
            paint2 = paint;
            i15 = i13;
            canvas2 = canvas;
            g9Var.b(canvas2, paint2, this.f34182b, f10, i15);
        } else {
            canvas2 = canvas;
            paint2 = paint;
            i15 = i13;
        }
        this.h.b(canvas2, paint2, this.f34181a, f10, i15);
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
