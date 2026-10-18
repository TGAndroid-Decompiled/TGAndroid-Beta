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
    public static final LinearInterpolator f29189d0 = new LinearInterpolator();
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
    public float X;
    public int Y;
    public ValueAnimator Z;
    public final TextPaint f29190a;
    public int f29191a0;
    public int f29192b;
    public ColorFilter f29193b0;
    public boolean f29194c;
    public Runnable f29195c0;
    public float d;
    public float e;
    public float f29196f;
    public float f29197g;
    public m6[] h;
    public CharSequence f29198i;
    public float f29199j;
    public float f29200k;
    public float f29201l;
    public float f29202m;
    public m6[] f29203n;
    public CharSequence f29204o;
    public int f29205p;
    public float f29206q;
    public float f29207r;
    public boolean f29208s;
    public ValueAnimator f29209t;
    public CharSequence f29210u;
    public boolean v;
    public long f29211w;
    public TimeInterpolator f29212x;
    public float f29213y;
    public float f29214z;

    public p6(boolean z10, boolean z11, boolean z12) {
        this(z10, z11, z12, false, false);
    }

    public static boolean l(int r2, int r3, java.lang.CharSequence r4, java.lang.CharSequence r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p6.l(int, int, java.lang.CharSequence, java.lang.CharSequence):boolean");
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f29209t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void b() {
        if (this.f29203n != null) {
            int i10 = 0;
            while (true) {
                m6[] m6VarArr = this.f29203n;
                if (i10 >= m6VarArr.length) {
                    break;
                }
                m6 m6Var = m6VarArr[i10];
                p6 p6Var = m6Var.f28408i;
                if (p6Var.getCallback() instanceof View) {
                    a6.release((View) p6Var.getCallback(), m6Var.f28403a);
                }
                i10++;
            }
        }
        this.f29203n = null;
    }

    public final float c() {
        if (this.h != null && this.f29203n != null) {
            return AndroidUtilities.lerp(this.f29199j, this.d, this.f29207r);
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
        return Math.max(this.d, this.f29199j);
    }

    public final void f(m6 m6Var) {
        this.f29196f = Math.max(this.f29196f, m6Var.f28407g);
        float max = Math.max(this.f29197g, m6Var.h);
        this.f29197g = max;
        this.e = this.f29196f + max;
    }

    public final void g(m6 m6Var) {
        this.f29201l = Math.max(this.f29201l, m6Var.f28407g);
        float max = Math.max(this.f29202m, m6Var.h);
        this.f29202m = max;
        this.f29200k = this.f29201l + max;
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
        ValueAnimator valueAnimator = this.f29209t;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        return false;
    }

    public final float i() {
        float f7;
        CharSequence charSequence = this.f29204o;
        float f10 = 0.0f;
        float f11 = 1.0f;
        if (charSequence != null && charSequence.length() > 0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        CharSequence charSequence2 = this.f29198i;
        if (charSequence2 != null && charSequence2.length() > 0) {
            f10 = 1.0f;
        }
        if (this.f29204o != null) {
            f11 = this.f29207r;
        }
        return AndroidUtilities.lerp(f7, f10, f11);
    }

    public final StaticLayout j(int i10, CharSequence charSequence) {
        if (i10 <= 0) {
            Point point = AndroidUtilities.displaySize;
            i10 = Math.min(point.x, point.y);
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f29190a, i10).setMaxLines(1).setLineSpacing(0.0f, 1.0f).setAlignment(Layout.Alignment.ALIGN_NORMAL).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i10).setIncludePad(this.S).build();
    }

    public final void k(n6 n6Var, CharSequence charSequence, int i10, int i11) {
        if (this.G && charSequence.length() > 1) {
            int i12 = 0;
            while (i12 < charSequence.length()) {
                int i13 = i12 + 1;
                n6Var.d(charSequence.subSequence(i12, i13));
                i12 = i13;
            }
            return;
        }
        n6Var.d(charSequence);
    }

    public final void m(float f7, long j10, float f10, TimeInterpolator timeInterpolator) {
        this.f29214z = f7;
        this.f29211w = j10;
        this.f29213y = f10;
        this.f29212x = timeInterpolator;
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

    public final void s(float f7, float f10, float f11, int i10) {
        this.U = true;
        this.V = f7;
        this.W = f10;
        this.X = f11;
        this.Y = i10;
        this.f29190a.setShadowLayer(f7, f10, f11, i10);
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
        this.f29190a.setColorFilter(colorFilter);
    }

    public final void t(java.lang.CharSequence r21, boolean r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p6.t(java.lang.CharSequence, boolean, boolean):void");
    }

    public final void u(int i10) {
        this.f29190a.setColor(i10);
        this.B = Color.alpha(i10);
    }

    public final void v(int i10, boolean z10) {
        ValueAnimator valueAnimator = this.Z;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Z = null;
        }
        if (!z10) {
            u(i10);
            return;
        }
        int color = this.f29190a.getColor();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.Z = ofFloat;
        ofFloat.addUpdateListener(new ei.u4(this, color, i10, 2));
        this.Z.addListener(new gi.p2(this, i10, 4));
        this.Z.setDuration(240L);
        this.Z.setInterpolator(bs.h);
        this.Z.start();
    }

    public final void w(float f7) {
        TextPaint textPaint = this.f29190a;
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
                this.f29197g = 0.0f;
                this.f29196f = 0.0f;
                this.e = 0.0f;
                int i12 = 0;
                while (true) {
                    m6[] m6VarArr = this.h;
                    if (i12 >= m6VarArr.length) {
                        break;
                    }
                    StaticLayout j10 = j(i10 - ((int) Math.ceil(Math.min(this.d, this.f29199j))), m6VarArr[i12].f28404b.getText());
                    m6[] m6VarArr2 = this.h;
                    m6 m6Var = m6VarArr2[i12];
                    m6VarArr2[i12] = new m6(this, j10, m6Var.f28405c, m6Var.d);
                    float f10 = this.d;
                    m6 m6Var2 = this.h[i12];
                    this.d = f10 + m6Var2.f28406f;
                    f(m6Var2);
                    i12++;
                }
            }
            if (this.f29203n != null) {
                this.f29199j = 0.0f;
                this.f29202m = 0.0f;
                this.f29201l = 0.0f;
                this.f29200k = 0.0f;
                while (true) {
                    m6[] m6VarArr3 = this.f29203n;
                    if (i11 >= m6VarArr3.length) {
                        break;
                    }
                    StaticLayout j11 = j(i10 - ((int) Math.ceil(Math.min(this.d, this.f29199j))), m6VarArr3[i11].f28404b.getText());
                    m6[] m6VarArr4 = this.f29203n;
                    m6 m6Var3 = m6VarArr4[i11];
                    m6VarArr4[i11] = new m6(this, j11, m6Var3.f28405c, m6Var3.d);
                    float f11 = this.f29199j;
                    m6 m6Var4 = this.f29203n[i11];
                    this.f29199j = f11 + m6Var4.f28406f;
                    g(m6Var4);
                    i11++;
                }
            }
            invalidateSelf();
        }
    }

    public final void x(Typeface typeface) {
        this.f29190a.setTypeface(typeface);
    }

    public p6(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f29190a = new TextPaint(1);
        this.f29192b = 0;
        this.f29194c = false;
        this.f29205p = 0;
        this.f29206q = 0.0f;
        this.f29207r = 0.0f;
        this.f29208s = true;
        this.f29211w = 320L;
        this.f29212x = bs.h;
        this.f29213y = -1.0f;
        this.f29214z = 0.3f;
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
