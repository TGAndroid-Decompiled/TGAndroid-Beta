package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
public final class l9 extends ReplacementSpan {
    public final String f44127a;
    public final String f44128b;
    public final boolean f44129c;
    public float d;
    public int f44130e;
    public int f44131f;
    public n9 h;
    public n9 f44132n;
    public final o9 f44133r;

    public l9(o9 o9Var, String str, boolean z10, boolean z11) {
        String str2;
        this.f44133r = o9Var;
        this.f44127a = str;
        if (z10) {
            str2 = o9Var.Q;
        } else {
            str2 = "";
        }
        this.f44128b = str2;
        this.f44129c = z11;
    }

    public final int a() {
        int i7 = this.f44130e;
        return Math.round((o9.T.getInterpolation(this.f44133r.J) * (this.f44131f - i7)) + i7);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        Canvas canvas2;
        Paint paint2;
        int i14;
        float textSize = paint.getTextSize();
        if (this.f44129c) {
            paint.setTextSize((28.0f * textSize) / 44.0f);
        }
        float f11 = f10 - this.d;
        n9 n9Var = this.f44132n;
        if (n9Var != null) {
            paint2 = paint;
            i14 = i12;
            canvas2 = canvas;
            n9Var.b(canvas2, paint2, this.f44128b, f11, i14);
        } else {
            canvas2 = canvas;
            paint2 = paint;
            i14 = i12;
        }
        this.h.b(canvas2, paint2, this.f44127a, f11, i14);
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
