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
public class e6 extends Drawable {
    public static final LinearInterpolator f25741c0 = new LinearInterpolator();
    public float A;
    public int B;
    public final Rect C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public tf I;
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
    public final TextPaint f25742a;
    public ColorFilter f25743a0;
    public int f25744b;
    public Runnable f25745b0;
    public boolean f25746c;
    public float d;
    public float e;
    public float f25747f;
    public float f25748g;
    public b6[] h;
    public CharSequence f25749i;
    public float f25750j;
    public float f25751k;
    public float f25752l;
    public float f25753m;
    public b6[] f25754n;
    public CharSequence f25755o;
    public int f25756p;
    public float f25757q;
    public float f25758r;
    public boolean f25759s;
    public ValueAnimator f25760t;
    public CharSequence f25761u;
    public boolean v;
    public long f25762w;
    public TimeInterpolator f25763x;
    public float f25764y;
    public float f25765z;

    public e6(boolean z10, boolean z11, boolean z12) {
        this(z10, z11, z12, false, false);
    }

    public static boolean l(int r2, int r3, java.lang.CharSequence r4, java.lang.CharSequence r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e6.l(int, int, java.lang.CharSequence, java.lang.CharSequence):boolean");
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f25760t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void b() {
        if (this.f25754n != null) {
            int i10 = 0;
            while (true) {
                b6[] b6VarArr = this.f25754n;
                if (i10 >= b6VarArr.length) {
                    break;
                }
                b6 b6Var = b6VarArr[i10];
                e6 e6Var = b6Var.f24662i;
                if (e6Var.getCallback() instanceof View) {
                    o5.release((View) e6Var.getCallback(), b6Var.f24657a);
                }
                i10++;
            }
        }
        this.f25754n = null;
    }

    public final float c() {
        if (this.h != null && this.f25754n != null) {
            return org.telegram.messenger.i0.T1(this.f25750j, this.d, this.f25758r);
        }
        return this.d;
    }

    public final float d(org.telegram.ui.Components.b6 r8, float r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e6.d(org.telegram.ui.Components.b6, float):float");
    }

    @Override
    public final void draw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e6.draw(android.graphics.Canvas):void");
    }

    public final float e() {
        return Math.max(this.d, this.f25750j);
    }

    public final void f(b6 b6Var) {
        this.f25747f = Math.max(this.f25747f, b6Var.f24661g);
        float max = Math.max(this.f25748g, b6Var.h);
        this.f25748g = max;
        this.e = this.f25747f + max;
    }

    public final void g(b6 b6Var) {
        this.f25752l = Math.max(this.f25752l, b6Var.f24661g);
        float max = Math.max(this.f25753m, b6Var.h);
        this.f25753m = max;
        this.f25751k = this.f25752l + max;
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
        ValueAnimator valueAnimator = this.f25760t;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        return false;
    }

    public final float i() {
        float f7;
        CharSequence charSequence = this.f25755o;
        float f10 = 0.0f;
        float f11 = 1.0f;
        if (charSequence != null && charSequence.length() > 0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        CharSequence charSequence2 = this.f25749i;
        if (charSequence2 != null && charSequence2.length() > 0) {
            f10 = 1.0f;
        }
        if (this.f25755o != null) {
            f11 = this.f25758r;
        }
        return org.telegram.messenger.i0.T1(f7, f10, f11);
    }

    public final StaticLayout j(int i10, CharSequence charSequence) {
        if (i10 <= 0) {
            Point point = org.telegram.messenger.i0.f16172q;
            i10 = Math.min(point.x, point.y);
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f25742a, i10).setMaxLines(1).setLineSpacing(0.0f, 1.0f).setAlignment(Layout.Alignment.ALIGN_NORMAL).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i10).setIncludePad(this.S).build();
    }

    public final void k(c6 c6Var, CharSequence charSequence, int i10, int i11) {
        if (this.G && charSequence.length() > 1) {
            int i12 = 0;
            while (i12 < charSequence.length()) {
                int i13 = i12 + 1;
                c6Var.c(charSequence.subSequence(i12, i13));
                i12 = i13;
            }
            return;
        }
        c6Var.c(charSequence);
    }

    public final void m(float f7, long j10, float f10, TimeInterpolator timeInterpolator) {
        this.f25765z = f7;
        this.f25762w = j10;
        this.f25764y = f10;
        this.f25763x = timeInterpolator;
    }

    public final void n(float f7, long j10, TimeInterpolator timeInterpolator) {
        m(f7, j10, 1.0f, timeInterpolator);
    }

    public final void o(float f7, float f10, float f11, float f12) {
        int i10 = (int) f7;
        int i11 = (int) f10;
        int i12 = (int) f11;
        int i13 = (int) f12;
        super.setBounds(i10, i11, i12, i13);
        this.C.set(i10, i11, i12, i13);
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

    public final void s(float f7, float f10, int i10) {
        this.U = true;
        this.V = f7;
        this.W = f10;
        this.X = i10;
        this.f25742a.setShadowLayer(f7, 0.0f, f10, i10);
    }

    @Override
    public final void setAlpha(int i10) {
        this.B = i10;
    }

    @Override
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        this.C.set(rect);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f25742a.setColorFilter(colorFilter);
    }

    public final void t(java.lang.CharSequence r20, boolean r21, boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e6.t(java.lang.CharSequence, boolean, boolean):void");
    }

    public final void u(int i10) {
        this.f25742a.setColor(i10);
        this.B = Color.alpha(i10);
    }

    public final void v(int i10, boolean z10) {
        ValueAnimator valueAnimator = this.Y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Y = null;
        }
        if (!z10) {
            u(i10);
            return;
        }
        int color = this.f25742a.getColor();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.Y = ofFloat;
        ofFloat.addUpdateListener(new jg.a0(this, color, i10, 2));
        this.Y.addListener(new bi.d5(this, i10, 5));
        this.Y.setDuration(240L);
        this.Y.setInterpolator(gr.h);
        this.Y.start();
    }

    public final void w(float f7) {
        TextPaint textPaint = this.f25742a;
        float textSize = textPaint.getTextSize();
        textPaint.setTextSize(f7);
        if (Math.abs(textSize - f7) > 0.5f) {
            int i10 = this.M;
            if (i10 <= 0) {
                i10 = this.C.width();
            }
            int i11 = 0;
            if (this.h != null) {
                this.d = 0.0f;
                this.f25748g = 0.0f;
                this.f25747f = 0.0f;
                this.e = 0.0f;
                int i12 = 0;
                while (true) {
                    b6[] b6VarArr = this.h;
                    if (i12 >= b6VarArr.length) {
                        break;
                    }
                    StaticLayout j10 = j(i10 - ((int) Math.ceil(Math.min(this.d, this.f25750j))), b6VarArr[i12].f24658b.getText());
                    b6[] b6VarArr2 = this.h;
                    b6 b6Var = b6VarArr2[i12];
                    b6VarArr2[i12] = new b6(this, j10, b6Var.f24659c, b6Var.d);
                    float f10 = this.d;
                    b6 b6Var2 = this.h[i12];
                    this.d = f10 + b6Var2.f24660f;
                    f(b6Var2);
                    i12++;
                }
            }
            if (this.f25754n != null) {
                this.f25750j = 0.0f;
                this.f25753m = 0.0f;
                this.f25752l = 0.0f;
                this.f25751k = 0.0f;
                while (true) {
                    b6[] b6VarArr3 = this.f25754n;
                    if (i11 >= b6VarArr3.length) {
                        break;
                    }
                    StaticLayout j11 = j(i10 - ((int) Math.ceil(Math.min(this.d, this.f25750j))), b6VarArr3[i11].f24658b.getText());
                    b6[] b6VarArr4 = this.f25754n;
                    b6 b6Var3 = b6VarArr4[i11];
                    b6VarArr4[i11] = new b6(this, j11, b6Var3.f24659c, b6Var3.d);
                    float f11 = this.f25750j;
                    b6 b6Var4 = this.f25754n[i11];
                    this.f25750j = f11 + b6Var4.f24660f;
                    g(b6Var4);
                    i11++;
                }
            }
            invalidateSelf();
        }
    }

    public final void x(Typeface typeface) {
        this.f25742a.setTypeface(typeface);
    }

    public e6(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f25742a = new TextPaint(1);
        this.f25744b = 0;
        this.f25746c = false;
        this.f25756p = 0;
        this.f25757q = 0.0f;
        this.f25758r = 0.0f;
        this.f25759s = true;
        this.f25762w = 320L;
        this.f25763x = gr.h;
        this.f25764y = -1.0f;
        this.f25765z = 0.3f;
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
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.C.set(i10, i11, i12, i13);
    }
}
