package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
public final class k9 extends ReplacementSpan {
    public final String f42735a;
    public final String f42736b;
    public final boolean f42737c;
    public float d;
    public int f42738e;
    public int f42739f;
    public m9 h;
    public m9 f42740n;
    public final n9 f42741r;

    public k9(n9 n9Var, String str, boolean z9, boolean z10) {
        String str2;
        this.f42741r = n9Var;
        this.f42735a = str;
        if (z9) {
            str2 = n9Var.P;
        } else {
            str2 = "";
        }
        this.f42736b = str2;
        this.f42737c = z10;
    }

    public final int a() {
        int i7 = this.f42738e;
        return Math.round((n9.S.getInterpolation(this.f42741r.I) * (this.f42739f - i7)) + i7);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        Canvas canvas2;
        Paint paint2;
        int i14;
        float textSize = paint.getTextSize();
        if (this.f42737c) {
            paint.setTextSize((28.0f * textSize) / 44.0f);
        }
        float f11 = f10 - this.d;
        m9 m9Var = this.f42740n;
        if (m9Var != null) {
            paint2 = paint;
            i14 = i12;
            canvas2 = canvas;
            m9Var.b(canvas2, paint2, this.f42736b, f11, i14);
        } else {
            canvas2 = canvas;
            paint2 = paint;
            i14 = i12;
        }
        this.h.b(canvas2, paint2, this.f42735a, f11, i14);
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
