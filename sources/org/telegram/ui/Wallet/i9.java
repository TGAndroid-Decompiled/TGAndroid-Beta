package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
public final class i9 extends ReplacementSpan {
    public final String f42664a;
    public final String f42665b;
    public final boolean f42666c;
    public float d;
    public int f42667e;
    public int f42668f;
    public k9 h;
    public k9 f42669n;
    public final l9 f42670r;

    public i9(l9 l9Var, String str, boolean z10, boolean z11) {
        String str2;
        this.f42670r = l9Var;
        this.f42664a = str;
        if (z10) {
            str2 = l9Var.Q;
        } else {
            str2 = "";
        }
        this.f42665b = str2;
        this.f42666c = z11;
    }

    public final int a() {
        int i3 = this.f42667e;
        return Math.round((l9.T.getInterpolation(this.f42670r.J) * (this.f42668f - i3)) + i3);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        Canvas canvas2;
        Paint paint2;
        int i14;
        float textSize = paint.getTextSize();
        if (this.f42666c) {
            paint.setTextSize((28.0f * textSize) / 44.0f);
        }
        float f11 = f10 - this.d;
        k9 k9Var = this.f42669n;
        if (k9Var != null) {
            paint2 = paint;
            i14 = i12;
            canvas2 = canvas;
            k9Var.b(canvas2, paint2, this.f42665b, f11, i14);
        } else {
            canvas2 = canvas;
            paint2 = paint;
            i14 = i12;
        }
        this.h.b(canvas2, paint2, this.f42664a, f11, i14);
        paint2.setTextSize(textSize);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i10, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            paint.getFontMetricsInt(fontMetricsInt);
        }
        return a();
    }
}
