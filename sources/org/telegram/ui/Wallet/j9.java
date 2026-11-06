package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
public final class j9 extends ReplacementSpan {
    public final String f42649a;
    public final String f42650b;
    public final boolean f42651c;
    public float d;
    public int f42652e;
    public int f42653f;
    public l9 h;
    public l9 f42654n;
    public final m9 f42655r;

    public j9(m9 m9Var, String str, boolean z9, boolean z10) {
        String str2;
        this.f42655r = m9Var;
        this.f42649a = str;
        if (z9) {
            str2 = m9Var.P;
        } else {
            str2 = "";
        }
        this.f42650b = str2;
        this.f42651c = z10;
    }

    public final int a() {
        int i7 = this.f42652e;
        return Math.round((m9.S.getInterpolation(this.f42655r.I) * (this.f42653f - i7)) + i7);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        Canvas canvas2;
        Paint paint2;
        int i14;
        float textSize = paint.getTextSize();
        if (this.f42651c) {
            paint.setTextSize((28.0f * textSize) / 44.0f);
        }
        float f11 = f10 - this.d;
        l9 l9Var = this.f42654n;
        if (l9Var != null) {
            paint2 = paint;
            i14 = i12;
            canvas2 = canvas;
            l9Var.b(canvas2, paint2, this.f42650b, f11, i14);
        } else {
            canvas2 = canvas;
            paint2 = paint;
            i14 = i12;
        }
        this.h.b(canvas2, paint2, this.f42649a, f11, i14);
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
