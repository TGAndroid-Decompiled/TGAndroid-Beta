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
import org.telegram.messenger.AndroidUtilities;
public class p6 extends Drawable {
    public static final LinearInterpolator f29434c0 = new LinearInterpolator();
    public float A;
    public int B;
    public final Rect C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public pg I;
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
    public final TextPaint f29435a;
    public ColorFilter f29436a0;
    public int f29437b;
    public Runnable f29438b0;
    public boolean f29439c;
    public float d;
    public float e;
    public float f29440f;
    public float f29441g;
    public m6[] h;
    public CharSequence f29442i;
    public float f29443j;
    public float f29444k;
    public float f29445l;
    public float f29446m;
    public m6[] f29447n;
    public CharSequence f29448o;
    public int f29449p;
    public float f29450q;
    public float f29451r;
    public boolean f29452s;
    public ValueAnimator f29453t;
    public CharSequence f29454u;
    public boolean v;
    public long f29455w;
    public TimeInterpolator f29456x;
    public float f29457y;
    public float f29458z;

    public p6(boolean z10, boolean z11, boolean z12) {
        this(z10, z11, z12, false, false);
    }

    public static boolean l(int r2, int r3, java.lang.CharSequence r4, java.lang.CharSequence r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p6.l(int, int, java.lang.CharSequence, java.lang.CharSequence):boolean");
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f29453t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void b() {
        if (this.f29447n != null) {
            int i10 = 0;
            while (true) {
                m6[] m6VarArr = this.f29447n;
                if (i10 >= m6VarArr.length) {
                    break;
                }
                m6 m6Var = m6VarArr[i10];
                p6 p6Var = m6Var.f28520i;
                if (p6Var.getCallback() instanceof View) {
                    a6.release((View) p6Var.getCallback(), m6Var.f28515a);
                }
                i10++;
            }
        }
        this.f29447n = null;
    }

    public final float c() {
        if (this.h != null && this.f29447n != null) {
            return AndroidUtilities.lerp(this.f29443j, this.d, this.f29451r);
        }
        return this.d;
    }

    public final float d(org.telegram.ui.Components.m6 r8, float r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p6.d(org.telegram.ui.Components.m6, float):float");
    }

    @Override
    public final void draw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p6.draw(android.graphics.Canvas):void");
    }

    public final float e() {
        return Math.max(this.d, this.f29443j);
    }

    public final void f(m6 m6Var) {
        this.f29440f = Math.max(this.f29440f, m6Var.f28519g);
        float max = Math.max(this.f29441g, m6Var.h);
        this.f29441g = max;
        this.e = this.f29440f + max;
    }

    public final void g(m6 m6Var) {
        this.f29445l = Math.max(this.f29445l, m6Var.f28519g);
        float max = Math.max(this.f29446m, m6Var.h);
        this.f29446m = max;
        this.f29444k = this.f29445l + max;
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
        ValueAnimator valueAnimator = this.f29453t;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        return false;
    }

    public final float i() {
        float f7;
        CharSequence charSequence = this.f29448o;
        float f10 = 0.0f;
        float f11 = 1.0f;
        if (charSequence != null && charSequence.length() > 0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        CharSequence charSequence2 = this.f29442i;
        if (charSequence2 != null && charSequence2.length() > 0) {
            f10 = 1.0f;
        }
        if (this.f29448o != null) {
            f11 = this.f29451r;
        }
        return AndroidUtilities.lerp(f7, f10, f11);
    }

    public final StaticLayout j(int i10, CharSequence charSequence) {
        if (i10 <= 0) {
            Point point = AndroidUtilities.displaySize;
            i10 = Math.min(point.x, point.y);
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f29435a, i10).setMaxLines(1).setLineSpacing(0.0f, 1.0f).setAlignment(Layout.Alignment.ALIGN_NORMAL).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i10).setIncludePad(this.S).build();
    }

    public final void k(n6 n6Var, CharSequence charSequence, int i10, int i11) {
        if (this.G && charSequence.length() > 1) {
            int i12 = 0;
            while (i12 < charSequence.length()) {
                int i13 = i12 + 1;
                n6Var.b(charSequence.subSequence(i12, i13));
                i12 = i13;
            }
            return;
        }
        n6Var.b(charSequence);
    }

    public final void m(float f7, long j10, float f10, TimeInterpolator timeInterpolator) {
        this.f29458z = f7;
        this.f29455w = j10;
        this.f29457y = f10;
        this.f29456x = timeInterpolator;
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
        this.f29435a.setShadowLayer(f7, 0.0f, f10, i10);
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
        this.f29435a.setColorFilter(colorFilter);
    }

    public final void t(java.lang.CharSequence r21, boolean r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p6.t(java.lang.CharSequence, boolean, boolean):void");
    }

    public final void u(int i10) {
        this.f29435a.setColor(i10);
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
        int color = this.f29435a.getColor();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.Y = ofFloat;
        ofFloat.addUpdateListener(new ei.u4(this, color, i10, 2));
        this.Y.addListener(new gi.p2(this, i10, 4));
        this.Y.setDuration(240L);
        this.Y.setInterpolator(bs.h);
        this.Y.start();
    }

    public final void w(float f7) {
        TextPaint textPaint = this.f29435a;
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
                this.f29441g = 0.0f;
                this.f29440f = 0.0f;
                this.e = 0.0f;
                int i12 = 0;
                while (true) {
                    m6[] m6VarArr = this.h;
                    if (i12 >= m6VarArr.length) {
                        break;
                    }
                    StaticLayout j10 = j(i10 - ((int) Math.ceil(Math.min(this.d, this.f29443j))), m6VarArr[i12].f28516b.getText());
                    m6[] m6VarArr2 = this.h;
                    m6 m6Var = m6VarArr2[i12];
                    m6VarArr2[i12] = new m6(this, j10, m6Var.f28517c, m6Var.d);
                    float f10 = this.d;
                    m6 m6Var2 = this.h[i12];
                    this.d = f10 + m6Var2.f28518f;
                    f(m6Var2);
                    i12++;
                }
            }
            if (this.f29447n != null) {
                this.f29443j = 0.0f;
                this.f29446m = 0.0f;
                this.f29445l = 0.0f;
                this.f29444k = 0.0f;
                while (true) {
                    m6[] m6VarArr3 = this.f29447n;
                    if (i11 >= m6VarArr3.length) {
                        break;
                    }
                    StaticLayout j11 = j(i10 - ((int) Math.ceil(Math.min(this.d, this.f29443j))), m6VarArr3[i11].f28516b.getText());
                    m6[] m6VarArr4 = this.f29447n;
                    m6 m6Var3 = m6VarArr4[i11];
                    m6VarArr4[i11] = new m6(this, j11, m6Var3.f28517c, m6Var3.d);
                    float f11 = this.f29443j;
                    m6 m6Var4 = this.f29447n[i11];
                    this.f29443j = f11 + m6Var4.f28518f;
                    g(m6Var4);
                    i11++;
                }
            }
            invalidateSelf();
        }
    }

    public final void x(Typeface typeface) {
        this.f29435a.setTypeface(typeface);
    }

    public p6(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f29435a = new TextPaint(1);
        this.f29437b = 0;
        this.f29439c = false;
        this.f29449p = 0;
        this.f29450q = 0.0f;
        this.f29451r = 0.0f;
        this.f29452s = true;
        this.f29455w = 320L;
        this.f29456x = bs.h;
        this.f29457y = -1.0f;
        this.f29458z = 0.3f;
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
