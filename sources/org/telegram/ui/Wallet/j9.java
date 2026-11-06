package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
public final class j9 extends ReplacementSpan {
    public final String f42673a;
    public final String f42674b;
    public final boolean f42675c;
    public float d;
    public int f42676e;
    public int f42677f;
    public l9 h;
    public l9 f42678n;
    public final m9 f42679r;

    public j9(m9 m9Var, String str, boolean z9, boolean z10) {
        String str2;
        this.f42679r = m9Var;
        this.f42673a = str;
        if (z9) {
            str2 = m9Var.P;
        } else {
            str2 = "";
        }
        this.f42674b = str2;
        this.f42675c = z10;
    }

    public final int a() {
        int i7 = this.f42676e;
        return Math.round((m9.S.getInterpolation(this.f42679r.I) * (this.f42677f - i7)) + i7);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        Canvas canvas2;
        Paint paint2;
        int i14;
        float textSize = paint.getTextSize();
        if (this.f42675c) {
            paint.setTextSize((28.0f * textSize) / 44.0f);
        }
        float f11 = f10 - this.d;
        l9 l9Var = this.f42678n;
        if (l9Var != null) {
            paint2 = paint;
            i14 = i12;
            canvas2 = canvas;
            l9Var.b(canvas2, paint2, this.f42674b, f11, i14);
        } else {
            canvas2 = canvas;
            paint2 = paint;
            i14 = i12;
        }
        this.h.b(canvas2, paint2, this.f42673a, f11, i14);
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
