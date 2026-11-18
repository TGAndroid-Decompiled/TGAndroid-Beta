package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
public final class z9 extends ReplacementSpan {
    public final String f45361a;
    public final String f45362b;
    public final boolean f45363c;
    public float d;
    public int f45364e;
    public int f45365f;
    public ba h;
    public ba f45366n;
    public final ca f45367r;

    public z9(ca caVar, String str, boolean z10, boolean z11) {
        String str2;
        this.f45367r = caVar;
        this.f45361a = str;
        if (z10) {
            str2 = caVar.Q;
        } else {
            str2 = "";
        }
        this.f45362b = str2;
        this.f45363c = z11;
    }

    public final int a() {
        int i7 = this.f45364e;
        return Math.round((ca.T.getInterpolation(this.f45367r.J) * (this.f45365f - i7)) + i7);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        Canvas canvas2;
        Paint paint2;
        int i14;
        float textSize = paint.getTextSize();
        if (this.f45363c) {
            paint.setTextSize((28.0f * textSize) / 44.0f);
        }
        float f11 = f10 - this.d;
        ba baVar = this.f45366n;
        if (baVar != null) {
            paint2 = paint;
            i14 = i12;
            canvas2 = canvas;
            baVar.b(canvas2, paint2, this.f45362b, f11, i14);
        } else {
            canvas2 = canvas;
            paint2 = paint;
            i14 = i12;
        }
        this.h.b(canvas2, paint2, this.f45361a, f11, i14);
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
