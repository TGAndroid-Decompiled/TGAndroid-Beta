package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
public class wp extends ReplacementSpan {
    public int E;
    public int F;
    public final int G;
    public float H;
    public float I;
    public float J;
    public boolean K;
    public Paint.FontMetricsInt L;
    public boolean f40039a;
    public int f40040b;
    public Drawable f40041c;
    public boolean d;
    public boolean f40042e;
    public boolean f40043f;
    public int h;
    public int f40044n;
    public float f40045r;
    public float f40046s;
    public float f40047w;
    public float f40048x;
    public int f40049y;

    public wp(int i3) {
        this(i3, 0);
    }

    public final void a(int i3) {
        boolean z10;
        this.h = i3;
        if (i3 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f40042e = z10;
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

    public final void c(int i3) {
        this.E = i3;
        this.f40041c.setBounds(0, 0, i3, i3);
    }

    public final void d(float f10) {
        this.f40045r = f10;
    }

    @Override
    public void draw(android.graphics.Canvas r4, java.lang.CharSequence r5, int r6, int r7, float r8, int r9, int r10, int r11, android.graphics.Paint r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wp.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
    }

    public final void e(float f10) {
        this.f40045r = 0.0f;
        this.f40046s = f10;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i10, Paint.FontMetricsInt fontMetricsInt) {
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
                i11 = this.f40041c.getIntrinsicWidth();
            }
            return (int) (abs * i11);
        }
    }

    public wp(Drawable drawable) {
        this(0, drawable);
    }

    public wp(int i3, int i10) {
        this(i10, org.telegram.messenger.t0.f25457b.getDrawable(i3).mutate());
    }

    public wp(int i3, Drawable drawable) {
        this.f40039a = true;
        this.d = true;
        this.f40042e = true;
        this.f40043f = false;
        this.f40044n = 0;
        this.f40048x = 1.0f;
        this.H = 1.0f;
        this.I = 1.0f;
        this.J = 1.0f;
        this.f40041c = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        this.G = i3;
    }
}
