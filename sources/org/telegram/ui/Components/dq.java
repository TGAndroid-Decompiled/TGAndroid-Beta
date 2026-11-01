package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
public class dq extends ReplacementSpan {
    public int D;
    public int E;
    public final int F;
    public float G;
    public float H;
    public float I;
    public boolean J;
    public Paint.FontMetricsInt K;
    public boolean f25563a;
    public int f25564b;
    public Drawable f25565c;
    public boolean d;
    public boolean e;
    public boolean f25566f;
    public int h;
    public int f25567n;
    public float f25568r;
    public float f25569s;
    public float f25570w;
    public float f25571x;
    public int f25572y;

    public dq(int i10) {
        this(i10, 0);
    }

    public final void a(int i10) {
        boolean z10;
        this.h = i10;
        if (i10 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.e = z10;
    }

    public final void b(Paint.FontMetricsInt fontMetricsInt) {
        this.J = true;
        this.K = fontMetricsInt;
        if (fontMetricsInt != null) {
            c(Math.abs(this.K.ascent) + Math.abs(fontMetricsInt.descent));
            if (this.D == 0) {
                c(org.telegram.messenger.i0.L(20.0f));
            }
        }
    }

    public final void c(int i10) {
        this.D = i10;
        this.f25565c.setBounds(0, 0, i10, i10);
    }

    public final void d(float f7) {
        this.f25568r = 0.0f;
        this.f25569s = f7;
    }

    @Override
    public void draw(android.graphics.Canvas r4, java.lang.CharSequence r5, int r6, int r7, float r8, int r9, int r10, int r11, android.graphics.Paint r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dq.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
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
            int i12 = this.D;
            if (i12 == 0) {
                i12 = this.f25565c.getIntrinsicWidth();
            }
            return (int) (abs * i12);
        }
    }

    public dq(Drawable drawable) {
        this(0, drawable);
    }

    public dq(int i10, int i11) {
        this(i11, org.telegram.messenger.w0.f18945b.getDrawable(i10).mutate());
    }

    public dq(int i10, Drawable drawable) {
        this.f25563a = true;
        this.d = true;
        this.e = true;
        this.f25566f = false;
        this.f25567n = 0;
        this.f25571x = 1.0f;
        this.G = 1.0f;
        this.H = 1.0f;
        this.I = 1.0f;
        this.f25565c = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        this.F = i10;
    }
}
