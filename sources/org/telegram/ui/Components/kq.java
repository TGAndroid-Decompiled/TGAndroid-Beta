package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
public class kq extends ReplacementSpan {
    public int E;
    public int F;
    public final int G;
    public float H;
    public float I;
    public float J;
    public boolean K;
    public Paint.FontMetricsInt L;
    public boolean f36847a;
    public int f36848b;
    public Drawable f36849c;
    public boolean d;
    public boolean f36850e;
    public boolean f36851f;
    public int h;
    public int f36852n;
    public float f36853r;
    public float f36854s;
    public float f36855w;
    public float f36856x;
    public int f36857y;

    public kq(int i7) {
        this(i7, 0);
    }

    public final void a(int i7) {
        boolean z10;
        this.h = i7;
        if (i7 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f36850e = z10;
    }

    public final void b(Paint.FontMetricsInt fontMetricsInt) {
        this.K = true;
        this.L = fontMetricsInt;
        if (fontMetricsInt != null) {
            c(Math.abs(this.L.ascent) + Math.abs(fontMetricsInt.descent));
            if (this.E == 0) {
                c(org.telegram.messenger.g0.L(20.0f));
            }
        }
    }

    public final void c(int i7) {
        this.E = i7;
        this.f36849c.setBounds(0, 0, i7, i7);
    }

    public final void d(float f10) {
        this.f36853r = f10;
    }

    @Override
    public void draw(android.graphics.Canvas r4, java.lang.CharSequence r5, int r6, int r7, float r8, int r9, int r10, int r11, android.graphics.Paint r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kq.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
    }

    public final void e(float f10) {
        this.f36853r = 0.0f;
        this.f36854s = f10;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        if (this.K && this.L != null) {
            if (fontMetricsInt == null) {
                fontMetricsInt = new Paint.FontMetricsInt();
            }
            Paint.FontMetricsInt fontMetricsInt2 = this.L;
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
            return (int) (Math.abs(this.H) * Math.abs(this.I) * this.E);
        } else if (this.F != 0) {
            return (int) (Math.abs(this.I) * this.F);
        } else {
            float abs = Math.abs(this.H) * Math.abs(this.I);
            int i11 = this.E;
            if (i11 == 0) {
                i11 = this.f36849c.getIntrinsicWidth();
            }
            return (int) (abs * i11);
        }
    }

    public kq(Drawable drawable) {
        this(0, drawable);
    }

    public kq(int i7, int i10) {
        this(i10, org.telegram.messenger.t0.f27013b.getDrawable(i7).mutate());
    }

    public kq(int i7, Drawable drawable) {
        this.f36847a = true;
        this.d = true;
        this.f36850e = true;
        this.f36851f = false;
        this.f36852n = 0;
        this.f36856x = 1.0f;
        this.H = 1.0f;
        this.I = 1.0f;
        this.J = 1.0f;
        this.f36849c = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        this.G = i7;
    }
}
