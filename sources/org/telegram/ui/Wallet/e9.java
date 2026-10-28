package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
public final class e9 extends ReplacementSpan {
    public final String f36548a;
    public final String f36549b;
    public final boolean f36550c;
    public float d;
    public int e;
    public int f36551f;
    public g9 h;
    public g9 f36552n;
    public final h9 f36553r;

    public e9(h9 h9Var, String str, boolean z10, boolean z11) {
        String str2;
        this.f36553r = h9Var;
        this.f36548a = str;
        if (z10) {
            str2 = h9Var.P;
        } else {
            str2 = "";
        }
        this.f36549b = str2;
        this.f36550c = z11;
    }

    public final int a() {
        int i10 = this.e;
        return Math.round((h9.S.getInterpolation(this.f36553r.I) * (this.f36551f - i10)) + i10);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        Canvas canvas2;
        Paint paint2;
        int i15;
        float textSize = paint.getTextSize();
        if (this.f36550c) {
            paint.setTextSize((28.0f * textSize) / 44.0f);
        }
        float f10 = f7 - this.d;
        g9 g9Var = this.f36552n;
        if (g9Var != null) {
            paint2 = paint;
            i15 = i13;
            canvas2 = canvas;
            g9Var.b(canvas2, paint2, this.f36549b, f10, i15);
        } else {
            canvas2 = canvas;
            paint2 = paint;
            i15 = i13;
        }
        this.h.b(canvas2, paint2, this.f36548a, f10, i15);
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
