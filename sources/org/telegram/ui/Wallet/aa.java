package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
public final class aa extends ReplacementSpan {
    public final String f44063a;
    public final String f44064b;
    public final boolean f44065c;
    public float d;
    public int f44066e;
    public int f44067f;
    public ca h;
    public ca f44068n;
    public final da f44069r;

    public aa(da daVar, String str, boolean z10, boolean z11) {
        String str2;
        this.f44069r = daVar;
        this.f44063a = str;
        if (z10) {
            str2 = daVar.Q;
        } else {
            str2 = "";
        }
        this.f44064b = str2;
        this.f44065c = z11;
    }

    public final int a() {
        int i7 = this.f44066e;
        return Math.round((da.T.getInterpolation(this.f44069r.J) * (this.f44067f - i7)) + i7);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        Canvas canvas2;
        Paint paint2;
        int i14;
        float textSize = paint.getTextSize();
        if (this.f44065c) {
            paint.setTextSize((28.0f * textSize) / 44.0f);
        }
        float f11 = f10 - this.d;
        ca caVar = this.f44068n;
        if (caVar != null) {
            paint2 = paint;
            i14 = i12;
            canvas2 = canvas;
            caVar.b(canvas2, paint2, this.f44064b, f11, i14);
        } else {
            canvas2 = canvas;
            paint2 = paint;
            i14 = i12;
        }
        this.h.b(canvas2, paint2, this.f44063a, f11, i14);
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
