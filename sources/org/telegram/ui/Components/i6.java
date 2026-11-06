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
public class i6 extends Drawable {
    public static final LinearInterpolator f34474c0 = new LinearInterpolator();
    public float A;
    public int B;
    public final Rect C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public xf I;
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
    public final TextPaint f34475a;
    public ColorFilter f34476a0;
    public int f34477b;
    public Runnable f34478b0;
    public boolean f34479c;
    public float d;
    public float f34480e;
    public float f34481f;
    public float f34482g;
    public f6[] h;
    public CharSequence f34483i;
    public float f34484j;
    public float f34485k;
    public float f34486l;
    public float f34487m;
    public f6[] f34488n;
    public CharSequence f34489o;
    public int f34490p;
    public float f34491q;
    public float f34492r;
    public boolean f34493s;
    public ValueAnimator f34494t;
    public CharSequence f34495u;
    public boolean v;
    public long f34496w;
    public TimeInterpolator f34497x;
    public float f34498y;
    public float f34499z;

    public i6(boolean z9, boolean z10, boolean z11) {
        this(z9, z10, z11, false, false);
    }

    public static boolean l(int r2, int r3, java.lang.CharSequence r4, java.lang.CharSequence r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i6.l(int, int, java.lang.CharSequence, java.lang.CharSequence):boolean");
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f34494t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void b() {
        if (this.f34488n != null) {
            int i7 = 0;
            while (true) {
                f6[] f6VarArr = this.f34488n;
                if (i7 >= f6VarArr.length) {
                    break;
                }
                f6 f6Var = f6VarArr[i7];
                i6 i6Var = f6Var.f33465i;
                if (i6Var.getCallback() instanceof View) {
                    r5.release((View) i6Var.getCallback(), f6Var.f33459a);
                }
                i7++;
            }
        }
        this.f34488n = null;
    }

    public final float c() {
        if (this.h != null && this.f34488n != null) {
            return org.telegram.messenger.g0.T1(this.f34484j, this.d, this.f34492r);
        }
        return this.d;
    }

    public final float d(org.telegram.ui.Components.f6 r8, float r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i6.d(org.telegram.ui.Components.f6, float):float");
    }

    @Override
    public final void draw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i6.draw(android.graphics.Canvas):void");
    }

    public final float e() {
        return Math.max(this.d, this.f34484j);
    }

    public final void f(f6 f6Var) {
        this.f34481f = Math.max(this.f34481f, f6Var.f33464g);
        float max = Math.max(this.f34482g, f6Var.h);
        this.f34482g = max;
        this.f34480e = this.f34481f + max;
    }

    public final void g(f6 f6Var) {
        this.f34486l = Math.max(this.f34486l, f6Var.f33464g);
        float max = Math.max(this.f34487m, f6Var.h);
        this.f34487m = max;
        this.f34485k = this.f34486l + max;
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
        ValueAnimator valueAnimator = this.f34494t;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        return false;
    }

    public final float i() {
        float f10;
        CharSequence charSequence = this.f34489o;
        float f11 = 0.0f;
        float f12 = 1.0f;
        if (charSequence != null && charSequence.length() > 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        CharSequence charSequence2 = this.f34483i;
        if (charSequence2 != null && charSequence2.length() > 0) {
            f11 = 1.0f;
        }
        if (this.f34489o != null) {
            f12 = this.f34492r;
        }
        return org.telegram.messenger.g0.T1(f10, f11, f12);
    }

    public final StaticLayout j(int i7, CharSequence charSequence) {
        if (i7 <= 0) {
            Point point = org.telegram.messenger.g0.f22537q;
            i7 = Math.min(point.x, point.y);
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f34475a, i7).setMaxLines(1).setLineSpacing(0.0f, 1.0f).setAlignment(Layout.Alignment.ALIGN_NORMAL).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i7).setIncludePad(this.S).build();
    }

    public final void k(g6 g6Var, CharSequence charSequence, int i7, int i10) {
        if (this.G && charSequence.length() > 1) {
            int i11 = 0;
            while (i11 < charSequence.length()) {
                int i12 = i11 + 1;
                g6Var.f(charSequence.subSequence(i11, i12));
                i11 = i12;
            }
            return;
        }
        g6Var.f(charSequence);
    }

    public final void m(float f10, long j3, float f11, TimeInterpolator timeInterpolator) {
        this.f34499z = f10;
        this.f34496w = j3;
        this.f34498y = f11;
        this.f34497x = timeInterpolator;
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
        this.C.set(i7, i10, i11, i12);
    }

    public final void p(RectF rectF) {
        setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public final void q(boolean z9) {
        this.O = z9;
        invalidateSelf();
    }

    public final void r(boolean z9, boolean z10) {
        this.D = z9;
        this.E = true;
        this.F = z10;
        this.G = false;
        this.H = false;
    }

    public final void s(float f10, float f11, int i7) {
        this.U = true;
        this.V = f10;
        this.W = f11;
        this.X = i7;
        this.f34475a.setShadowLayer(f10, 0.0f, f11, i7);
    }

    @Override
    public final void setAlpha(int i7) {
        this.B = i7;
    }

    @Override
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        this.C.set(rect);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f34475a.setColorFilter(colorFilter);
    }

    public final void t(java.lang.CharSequence r21, boolean r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i6.t(java.lang.CharSequence, boolean, boolean):void");
    }

    public final void u(int i7) {
        this.f34475a.setColor(i7);
        this.B = Color.alpha(i7);
    }

    public final void v(int i7, boolean z9) {
        ValueAnimator valueAnimator = this.Y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Y = null;
        }
        if (!z9) {
            u(i7);
            return;
        }
        int color = this.f34475a.getColor();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.Y = ofFloat;
        ofFloat.addUpdateListener(new fi.k4(this, color, i7, 2));
        this.Y.addListener(new hi.m2(this, i7, 7));
        this.Y.setDuration(240L);
        this.Y.setInterpolator(xq.h);
        this.Y.start();
    }

    public final void w(float f10) {
        TextPaint textPaint = this.f34475a;
        float textSize = textPaint.getTextSize();
        textPaint.setTextSize(f10);
        if (Math.abs(textSize - f10) > 0.5f) {
            int i7 = this.M;
            if (i7 <= 0) {
                i7 = this.C.width();
            }
            int i10 = 0;
            if (this.h != null) {
                this.d = 0.0f;
                this.f34482g = 0.0f;
                this.f34481f = 0.0f;
                this.f34480e = 0.0f;
                int i11 = 0;
                while (true) {
                    f6[] f6VarArr = this.h;
                    if (i11 >= f6VarArr.length) {
                        break;
                    }
                    StaticLayout j3 = j(i7 - ((int) Math.ceil(Math.min(this.d, this.f34484j))), f6VarArr[i11].f33460b.getText());
                    f6[] f6VarArr2 = this.h;
                    f6 f6Var = f6VarArr2[i11];
                    f6VarArr2[i11] = new f6(this, j3, f6Var.f33461c, f6Var.d);
                    float f11 = this.d;
                    f6 f6Var2 = this.h[i11];
                    this.d = f11 + f6Var2.f33463f;
                    f(f6Var2);
                    i11++;
                }
            }
            if (this.f34488n != null) {
                this.f34484j = 0.0f;
                this.f34487m = 0.0f;
                this.f34486l = 0.0f;
                this.f34485k = 0.0f;
                while (true) {
                    f6[] f6VarArr3 = this.f34488n;
                    if (i10 >= f6VarArr3.length) {
                        break;
                    }
                    StaticLayout j10 = j(i7 - ((int) Math.ceil(Math.min(this.d, this.f34484j))), f6VarArr3[i10].f33460b.getText());
                    f6[] f6VarArr4 = this.f34488n;
                    f6 f6Var3 = f6VarArr4[i10];
                    f6VarArr4[i10] = new f6(this, j10, f6Var3.f33461c, f6Var3.d);
                    float f12 = this.f34484j;
                    f6 f6Var4 = this.f34488n[i10];
                    this.f34484j = f12 + f6Var4.f33463f;
                    g(f6Var4);
                    i10++;
                }
            }
            invalidateSelf();
        }
    }

    public final void x(Typeface typeface) {
        this.f34475a.setTypeface(typeface);
    }

    public i6(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f34475a = new TextPaint(1);
        this.f34477b = 0;
        this.f34479c = false;
        this.f34490p = 0;
        this.f34491q = 0.0f;
        this.f34492r = 0.0f;
        this.f34493s = true;
        this.f34496w = 320L;
        this.f34497x = xq.h;
        this.f34498y = -1.0f;
        this.f34499z = 0.3f;
        this.A = 0.0f;
        this.B = 255;
        this.C = new Rect();
        this.S = true;
        this.T = true;
        this.U = false;
        this.D = z9;
        this.E = z10;
        this.F = z11;
        this.G = z12;
        this.H = z13;
    }

    @Override
    public final void setBounds(int i7, int i10, int i11, int i12) {
        super.setBounds(i7, i10, i11, i12);
        this.C.set(i7, i10, i11, i12);
    }
}
