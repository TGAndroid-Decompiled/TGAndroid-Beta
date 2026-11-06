package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
public class wp extends ReplacementSpan {
    public int D;
    public int E;
    public final int F;
    public float G;
    public float H;
    public float I;
    public boolean J;
    public Paint.FontMetricsInt K;
    public boolean f40049a;
    public int f40050b;
    public Drawable f40051c;
    public boolean d;
    public boolean f40052e;
    public boolean f40053f;
    public int h;
    public int f40054n;
    public float f40055r;
    public float f40056s;
    public float f40057w;
    public float f40058x;
    public int f40059y;

    public wp(int i7) {
        this(i7, 0);
    }

    public final void a(int i7) {
        boolean z9;
        this.h = i7;
        if (i7 < 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f40052e = z9;
    }

    public final void b(Paint.FontMetricsInt fontMetricsInt) {
        this.J = true;
        this.K = fontMetricsInt;
        if (fontMetricsInt != null) {
            c(Math.abs(this.K.ascent) + Math.abs(fontMetricsInt.descent));
            if (this.D == 0) {
                c(org.telegram.messenger.g0.L(20.0f));
            }
        }
    }

    public final void c(int i7) {
        this.D = i7;
        this.f40051c.setBounds(0, 0, i7, i7);
    }

    public final void d(float f10) {
        this.f40055r = f10;
    }

    @Override
    public void draw(android.graphics.Canvas r4, java.lang.CharSequence r5, int r6, int r7, float r8, int r9, int r10, int r11, android.graphics.Paint r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wp.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
    }

    public final void e(float f10) {
        this.f40055r = 0.0f;
        this.f40056s = f10;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        if (this.J && this.K != null) {
            if (fontMetricsInt == null) {
                fontMetricsInt = new Paint.FontMetricsInt();
            }
            Paint.FontMetricsInt fontMetricsInt2 = this.K;
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
            return (int) (Math.abs(this.G) * Math.abs(this.H) * this.D);
        } else if (this.E != 0) {
            return (int) (Math.abs(this.H) * this.E);
        } else {
            float abs = Math.abs(this.G) * Math.abs(this.H);
            int i11 = this.D;
            if (i11 == 0) {
                i11 = this.f40051c.getIntrinsicWidth();
            }
            return (int) (abs * i11);
        }
    }

    public wp(Drawable drawable) {
        this(0, drawable);
    }

    public wp(int i7, int i10) {
        this(i10, org.telegram.messenger.t0.f25555b.getDrawable(i7).mutate());
    }

    public wp(int i7, Drawable drawable) {
        this.f40049a = true;
        this.d = true;
        this.f40052e = true;
        this.f40053f = false;
        this.f40054n = 0;
        this.f40058x = 1.0f;
        this.G = 1.0f;
        this.H = 1.0f;
        this.I = 1.0f;
        this.f40051c = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        this.F = i7;
    }
}
