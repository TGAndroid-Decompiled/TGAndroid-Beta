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
    public static final LinearInterpolator f33980c0 = new LinearInterpolator();
    public float A;
    public int B;
    public final Rect C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public vf I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public float N;
    public boolean O;
    public LinearGradient P;
    public Matrix Q;
    public Paint R;
    public boolean S;
    public boolean T;
    public boolean U;
    public float V;
    public float W;
    public int X;
    public ValueAnimator Y;
    public int Z;
    public final TextPaint f33981a;
    public ColorFilter f33982a0;
    public int f33983b;
    public Runnable f33984b0;
    public boolean f33985c;
    public float d;
    public float f33986e;
    public float f33987f;
    public float f33988g;
    public d6[] h;
    public CharSequence f33989i;
    public float f33990j;
    public float f33991k;
    public float f33992l;
    public float f33993m;
    public d6[] f33994n;
    public CharSequence f33995o;
    public int f33996p;
    public float f33997q;
    public float f33998r;
    public boolean f33999s;
    public ValueAnimator f34000t;
    public CharSequence f34001u;
    public boolean v;
    public long f34002w;
    public TimeInterpolator f34003x;
    public float f34004y;
    public float f34005z;

    public g6(boolean z10, boolean z11, boolean z12) {
        this(z10, z11, z12, false, false);
    }

    public static boolean l(int r2, int r3, java.lang.CharSequence r4, java.lang.CharSequence r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g6.l(int, int, java.lang.CharSequence, java.lang.CharSequence):boolean");
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f34000t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void b() {
        if (this.f33994n != null) {
            int i3 = 0;
            while (true) {
                d6[] d6VarArr = this.f33994n;
                if (i3 >= d6VarArr.length) {
                    break;
                }
                d6 d6Var = d6VarArr[i3];
                g6 g6Var = d6Var.f32958i;
                if (g6Var.getCallback() instanceof View) {
                    p5.release((View) g6Var.getCallback(), d6Var.f32952a);
                }
                i3++;
            }
        }
        this.f33994n = null;
    }

    public final float c() {
        if (this.h != null && this.f33994n != null) {
            return org.telegram.messenger.g0.T1(this.f33990j, this.d, this.f33998r);
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
        return Math.max(this.d, this.f33990j);
    }

    public final void f(d6 d6Var) {
        this.f33987f = Math.max(this.f33987f, d6Var.f32957g);
        float max = Math.max(this.f33988g, d6Var.h);
        this.f33988g = max;
        this.f33986e = this.f33987f + max;
    }

    public final void g(d6 d6Var) {
        this.f33992l = Math.max(this.f33992l, d6Var.f32957g);
        float max = Math.max(this.f33993m, d6Var.h);
        this.f33993m = max;
        this.f33991k = this.f33992l + max;
    }

    @Override
    public final Rect getDirtyBounds() {
        return this.C;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final boolean h() {
        ValueAnimator valueAnimator = this.f34000t;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        return false;
    }

    public final float i() {
        float f10;
        CharSequence charSequence = this.f33995o;
        float f11 = 0.0f;
        float f12 = 1.0f;
        if (charSequence != null && charSequence.length() > 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        CharSequence charSequence2 = this.f33989i;
        if (charSequence2 != null && charSequence2.length() > 0) {
            f11 = 1.0f;
        }
        if (this.f33995o != null) {
            f12 = this.f33998r;
        }
        return org.telegram.messenger.g0.T1(f10, f11, f12);
    }

    public final StaticLayout j(int i3, CharSequence charSequence) {
        if (i3 <= 0) {
            Point point = org.telegram.messenger.g0.f22608q;
            i3 = Math.min(point.x, point.y);
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f33981a, i3).setMaxLines(1).setLineSpacing(0.0f, 1.0f).setAlignment(Layout.Alignment.ALIGN_NORMAL).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i3).setIncludePad(this.S).build();
    }

    public final void k(e6 e6Var, CharSequence charSequence, int i3, int i10) {
        if (this.G && charSequence.length() > 1) {
            int i11 = 0;
            while (i11 < charSequence.length()) {
                int i12 = i11 + 1;
                e6Var.b(charSequence.subSequence(i11, i12));
                i11 = i12;
            }
            return;
        }
        e6Var.b(charSequence);
    }

    public final void m(float f10, long j10, float f11, TimeInterpolator timeInterpolator) {
        this.f34005z = f10;
        this.f34002w = j10;
        this.f34004y = f11;
        this.f34003x = timeInterpolator;
    }

    public final void n(float f10, long j10, TimeInterpolator timeInterpolator) {
        m(f10, j10, 1.0f, timeInterpolator);
    }

    public final void o(float f10, float f11, float f12, float f13) {
        int i3 = (int) f10;
        int i10 = (int) f11;
        int i11 = (int) f12;
        int i12 = (int) f13;
        super.setBounds(i3, i10, i11, i12);
        this.C.set(i3, i10, i11, i12);
    }

    public final void p(RectF rectF) {
        setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public final void q(boolean z10) {
        this.O = z10;
        invalidateSelf();
    }

    public final void r(boolean z10, boolean z11) {
        this.D = z10;
        this.E = true;
        this.F = z11;
        this.G = false;
        this.H = false;
    }

    public final void s(float f10, float f11, int i3) {
        this.U = true;
        this.V = f10;
        this.W = f11;
        this.X = i3;
        this.f33981a.setShadowLayer(f10, 0.0f, f11, i3);
    }

    @Override
    public final void setAlpha(int i3) {
        this.B = i3;
    }

    @Override
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        this.C.set(rect);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f33981a.setColorFilter(colorFilter);
    }

    public final void t(java.lang.CharSequence r21, boolean r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g6.t(java.lang.CharSequence, boolean, boolean):void");
    }

    public final void u(int i3) {
        this.f33981a.setColor(i3);
        this.B = Color.alpha(i3);
    }

    public final void v(int i3, boolean z10) {
        ValueAnimator valueAnimator = this.Y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Y = null;
        }
        if (!z10) {
            u(i3);
            return;
        }
        int color = this.f33981a.getColor();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.Y = ofFloat;
        ofFloat.addUpdateListener(new gi.h4(this, color, i3, 2));
        this.Y.addListener(new ii.m2(this, i3, 7));
        this.Y.setDuration(240L);
        this.Y.setInterpolator(xq.h);
        this.Y.start();
    }

    public final void w(float f10) {
        TextPaint textPaint = this.f33981a;
        float textSize = textPaint.getTextSize();
        textPaint.setTextSize(f10);
        if (Math.abs(textSize - f10) > 0.5f) {
            int i3 = this.M;
            if (i3 <= 0) {
                i3 = this.C.width();
            }
            int i10 = 0;
            if (this.h != null) {
                this.d = 0.0f;
                this.f33988g = 0.0f;
                this.f33987f = 0.0f;
                this.f33986e = 0.0f;
                int i11 = 0;
                while (true) {
                    d6[] d6VarArr = this.h;
                    if (i11 >= d6VarArr.length) {
                        break;
                    }
                    StaticLayout j10 = j(i3 - ((int) Math.ceil(Math.min(this.d, this.f33990j))), d6VarArr[i11].f32953b.getText());
                    d6[] d6VarArr2 = this.h;
                    d6 d6Var = d6VarArr2[i11];
                    d6VarArr2[i11] = new d6(this, j10, d6Var.f32954c, d6Var.d);
                    float f11 = this.d;
                    d6 d6Var2 = this.h[i11];
                    this.d = f11 + d6Var2.f32956f;
                    f(d6Var2);
                    i11++;
                }
            }
            if (this.f33994n != null) {
                this.f33990j = 0.0f;
                this.f33993m = 0.0f;
                this.f33992l = 0.0f;
                this.f33991k = 0.0f;
                while (true) {
                    d6[] d6VarArr3 = this.f33994n;
                    if (i10 >= d6VarArr3.length) {
                        break;
                    }
                    StaticLayout j11 = j(i3 - ((int) Math.ceil(Math.min(this.d, this.f33990j))), d6VarArr3[i10].f32953b.getText());
                    d6[] d6VarArr4 = this.f33994n;
                    d6 d6Var3 = d6VarArr4[i10];
                    d6VarArr4[i10] = new d6(this, j11, d6Var3.f32954c, d6Var3.d);
                    float f12 = this.f33990j;
                    d6 d6Var4 = this.f33994n[i10];
                    this.f33990j = f12 + d6Var4.f32956f;
                    g(d6Var4);
                    i10++;
                }
            }
            invalidateSelf();
        }
    }

    public final void x(Typeface typeface) {
        this.f33981a.setTypeface(typeface);
    }

    public g6(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f33981a = new TextPaint(1);
        this.f33983b = 0;
        this.f33985c = false;
        this.f33996p = 0;
        this.f33997q = 0.0f;
        this.f33998r = 0.0f;
        this.f33999s = true;
        this.f34002w = 320L;
        this.f34003x = xq.h;
        this.f34004y = -1.0f;
        this.f34005z = 0.3f;
        this.A = 0.0f;
        this.B = 255;
        this.C = new Rect();
        this.S = true;
        this.T = true;
        this.U = false;
        this.D = z10;
        this.E = z11;
        this.F = z12;
        this.G = z13;
        this.H = z14;
    }

    @Override
    public final void setBounds(int i3, int i10, int i11, int i12) {
        super.setBounds(i3, i10, i11, i12);
        this.C.set(i3, i10, i11, i12);
    }
}
