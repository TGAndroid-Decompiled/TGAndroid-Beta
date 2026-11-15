package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
public class g6 extends Drawable {
    public static final LinearInterpolator f34830d0 = new LinearInterpolator();
    public boolean A;
    public float B;
    public int C;
    public final Rect D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public dg J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public float O;
    public boolean P;
    public LinearGradient Q;
    public Matrix R;
    public Paint S;
    public boolean T;
    public boolean U;
    public boolean V;
    public float W;
    public float X;
    public int Y;
    public ValueAnimator Z;
    public final TextPaint f34831a;
    public int f34832a0;
    public int f34833b;
    public ColorFilter f34834b0;
    public boolean f34835c;
    public Runnable f34836c0;
    public float d;
    public float f34837e;
    public float f34838f;
    public float f34839g;
    public d6[] h;
    public CharSequence f34840i;
    public float f34841j;
    public float f34842k;
    public float f34843l;
    public float f34844m;
    public d6[] f34845n;
    public CharSequence f34846o;
    public int f34847p;
    public float f34848q;
    public float f34849r;
    public boolean f34850s;
    public ValueAnimator f34851t;
    public CharSequence f34852u;
    public boolean v;
    public long f34853w;
    public TimeInterpolator f34854x;
    public float f34855y;
    public float f34856z;

    public g6(boolean z10, boolean z11, boolean z12) {
        this(z10, z11, z12, false, false);
    }

    public static boolean l(int r2, int r3, java.lang.CharSequence r4, java.lang.CharSequence r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g6.l(int, int, java.lang.CharSequence, java.lang.CharSequence):boolean");
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f34851t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void b() {
        if (this.f34845n != null) {
            int i7 = 0;
            while (true) {
                d6[] d6VarArr = this.f34845n;
                if (i7 >= d6VarArr.length) {
                    break;
                }
                d6 d6Var = d6VarArr[i7];
                g6 g6Var = d6Var.f33852i;
                if (g6Var.getCallback() instanceof View) {
                    p5.release((View) g6Var.getCallback(), d6Var.f33846a);
                }
                i7++;
            }
        }
        this.f34845n = null;
    }

    public final float c() {
        if (this.h != null && this.f34845n != null) {
            return org.telegram.messenger.g0.T1(this.f34841j, this.d, this.f34849r);
        }
        return this.d;
    }

    public final float d(org.telegram.ui.Components.d6 r8, float r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g6.d(org.telegram.ui.Components.d6, float):float");
    }

    @Override
    public final void draw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g6.draw(android.graphics.Canvas):void");
    }

    public final float e() {
        return Math.max(this.d, this.f34841j);
    }

    public final void f(d6 d6Var) {
        this.f34838f = Math.max(this.f34838f, d6Var.f33851g);
        float max = Math.max(this.f34839g, d6Var.h);
        this.f34839g = max;
        this.f34837e = this.f34838f + max;
    }

    public final void g(d6 d6Var) {
        this.f34843l = Math.max(this.f34843l, d6Var.f33851g);
        float max = Math.max(this.f34844m, d6Var.h);
        this.f34844m = max;
        this.f34842k = this.f34843l + max;
    }

    @Override
    public final Rect getDirtyBounds() {
        return this.D;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final boolean h() {
        ValueAnimator valueAnimator = this.f34851t;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        return false;
    }

    public final float i() {
        float f10;
        CharSequence charSequence = this.f34846o;
        float f11 = 0.0f;
        float f12 = 1.0f;
        if (charSequence != null && charSequence.length() > 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        CharSequence charSequence2 = this.f34840i;
        if (charSequence2 != null && charSequence2.length() > 0) {
            f11 = 1.0f;
        }
        if (this.f34846o != null) {
            f12 = this.f34849r;
        }
        return org.telegram.messenger.g0.T1(f10, f11, f12);
    }

    public final StaticLayout j(int i7, CharSequence charSequence) {
        if (i7 <= 0) {
            Point point = org.telegram.messenger.g0.f23611q;
            i7 = Math.min(point.x, point.y);
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f34831a, i7).setMaxLines(1).setLineSpacing(0.0f, 1.0f).setAlignment(Layout.Alignment.ALIGN_NORMAL).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i7).setIncludePad(this.T).build();
    }

    public final void k(e6 e6Var, CharSequence charSequence, int i7, int i10) {
        if (this.H && charSequence.length() > 1) {
            int i11 = 0;
            while (i11 < charSequence.length()) {
                int i12 = i11 + 1;
                e6Var.c(charSequence.subSequence(i11, i12));
                i11 = i12;
            }
            return;
        }
        e6Var.c(charSequence);
    }

    public final void m(float f10, long j3, float f11, TimeInterpolator timeInterpolator) {
        this.f34856z = f10;
        this.f34853w = j3;
        this.f34855y = f11;
        this.f34854x = timeInterpolator;
    }

    public final void n(float f10, long j3, TimeInterpolator timeInterpolator) {
        m(f10, j3, 1.0f, timeInterpolator);
    }

    public final void o(float f10, float f11, float f12, float f13) {
        int i7 = (int) f10;
        int i10 = (int) f11;
        int i11 = (int) f12;
        int i12 = (int) f13;
        super.setBounds(i7, i10, i11, i12);
        this.D.set(i7, i10, i11, i12);
    }

    public final void p(RectF rectF) {
        setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public final void q(boolean z10) {
        this.P = z10;
        invalidateSelf();
    }

    public final void r(boolean z10, boolean z11) {
        this.E = z10;
        this.F = true;
        this.G = z11;
        this.H = false;
        this.I = false;
    }

    public final void s(float f10, float f11, int i7) {
        this.V = true;
        this.W = f10;
        this.X = f11;
        this.Y = i7;
        this.f34831a.setShadowLayer(f10, 0.0f, f11, i7);
    }

    @Override
    public final void setAlpha(int i7) {
        this.C = i7;
    }

    @Override
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        this.D.set(rect);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f34831a.setColorFilter(colorFilter);
    }

    public final void t(java.lang.CharSequence r21, boolean r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g6.t(java.lang.CharSequence, boolean, boolean):void");
    }

    public final void u(int i7) {
        this.f34831a.setColor(i7);
        this.C = Color.alpha(i7);
    }

    public final void v(int i7, boolean z10) {
        ValueAnimator valueAnimator = this.Z;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Z = null;
        }
        if (!z10) {
            u(i7);
            return;
        }
        int color = this.f34831a.getColor();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.Z = ofFloat;
        ofFloat.addUpdateListener(new hi.g4(this, color, i7, 2));
        this.Z.addListener(new ki.j2(this, i7, 7));
        this.Z.setDuration(240L);
        this.Z.setInterpolator(er.h);
        this.Z.start();
    }

    public final void w(float f10) {
        TextPaint textPaint = this.f34831a;
        float textSize = textPaint.getTextSize();
        textPaint.setTextSize(f10);
        if (Math.abs(textSize - f10) > 0.5f) {
            int i7 = this.N;
            if (i7 <= 0) {
                i7 = this.D.width();
            }
            int i10 = 0;
            if (this.h != null) {
                this.d = 0.0f;
                this.f34839g = 0.0f;
                this.f34838f = 0.0f;
                this.f34837e = 0.0f;
                int i11 = 0;
                while (true) {
                    d6[] d6VarArr = this.h;
                    if (i11 >= d6VarArr.length) {
                        break;
                    }
                    StaticLayout j3 = j(i7 - ((int) Math.ceil(Math.min(this.d, this.f34841j))), d6VarArr[i11].f33847b.getText());
                    d6[] d6VarArr2 = this.h;
                    d6 d6Var = d6VarArr2[i11];
                    d6VarArr2[i11] = new d6(this, j3, d6Var.f33848c, d6Var.d);
                    float f11 = this.d;
                    d6 d6Var2 = this.h[i11];
                    this.d = f11 + d6Var2.f33850f;
                    f(d6Var2);
                    i11++;
                }
            }
            if (this.f34845n != null) {
                this.f34841j = 0.0f;
                this.f34844m = 0.0f;
                this.f34843l = 0.0f;
                this.f34842k = 0.0f;
                while (true) {
                    d6[] d6VarArr3 = this.f34845n;
                    if (i10 >= d6VarArr3.length) {
                        break;
                    }
                    StaticLayout j10 = j(i7 - ((int) Math.ceil(Math.min(this.d, this.f34841j))), d6VarArr3[i10].f33847b.getText());
                    d6[] d6VarArr4 = this.f34845n;
                    d6 d6Var3 = d6VarArr4[i10];
                    d6VarArr4[i10] = new d6(this, j10, d6Var3.f33848c, d6Var3.d);
                    float f12 = this.f34841j;
                    d6 d6Var4 = this.f34845n[i10];
                    this.f34841j = f12 + d6Var4.f33850f;
                    g(d6Var4);
                    i10++;
                }
            }
            invalidateSelf();
        }
    }

    public final void x(Typeface typeface) {
        this.f34831a.setTypeface(typeface);
    }

    public g6(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f34831a = new TextPaint(1);
        this.f34833b = 0;
        this.f34835c = false;
        this.f34847p = 0;
        this.f34848q = 0.0f;
        this.f34849r = 0.0f;
        this.f34850s = true;
        this.f34853w = 320L;
        this.f34854x = er.h;
        this.f34855y = -1.0f;
        this.f34856z = 0.3f;
        this.B = 0.0f;
        this.C = 255;
        this.D = new Rect();
        this.T = true;
        this.U = true;
        this.V = false;
        this.E = z10;
        this.F = z11;
        this.G = z12;
        this.H = z13;
        this.I = z14;
    }

    @Override
    public final void setBounds(int i7, int i10, int i11, int i12) {
        super.setBounds(i7, i10, i11, i12);
        this.D.set(i7, i10, i11, i12);
    }
}
