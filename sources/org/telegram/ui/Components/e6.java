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
    public static final LinearInterpolator f25692c0 = new LinearInterpolator();
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
    public final TextPaint f25693a;
    public ColorFilter f25694a0;
    public int f25695b;
    public Runnable f25696b0;
    public boolean f25697c;
    public float d;
    public float e;
    public float f25698f;
    public float f25699g;
    public b6[] h;
    public CharSequence f25700i;
    public float f25701j;
    public float f25702k;
    public float f25703l;
    public float f25704m;
    public b6[] f25705n;
    public CharSequence f25706o;
    public int f25707p;
    public float f25708q;
    public float f25709r;
    public boolean f25710s;
    public ValueAnimator f25711t;
    public CharSequence f25712u;
    public boolean v;
    public long f25713w;
    public TimeInterpolator f25714x;
    public float f25715y;
    public float f25716z;

    public e6(boolean z10, boolean z11, boolean z12) {
        this(z10, z11, z12, false, false);
    }

    public static boolean l(int r2, int r3, java.lang.CharSequence r4, java.lang.CharSequence r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e6.l(int, int, java.lang.CharSequence, java.lang.CharSequence):boolean");
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f25711t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void b() {
        if (this.f25705n != null) {
            int i10 = 0;
            while (true) {
                b6[] b6VarArr = this.f25705n;
                if (i10 >= b6VarArr.length) {
                    break;
                }
                b6 b6Var = b6VarArr[i10];
                e6 e6Var = b6Var.f24552i;
                if (e6Var.getCallback() instanceof View) {
                    o5.release((View) e6Var.getCallback(), b6Var.f24547a);
                }
                i10++;
            }
        }
        this.f25705n = null;
    }

    public final float c() {
        if (this.h != null && this.f25705n != null) {
            return org.telegram.messenger.i0.T1(this.f25701j, this.d, this.f25709r);
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
        return Math.max(this.d, this.f25701j);
    }

    public final void f(b6 b6Var) {
        this.f25698f = Math.max(this.f25698f, b6Var.f24551g);
        float max = Math.max(this.f25699g, b6Var.h);
        this.f25699g = max;
        this.e = this.f25698f + max;
    }

    public final void g(b6 b6Var) {
        this.f25703l = Math.max(this.f25703l, b6Var.f24551g);
        float max = Math.max(this.f25704m, b6Var.h);
        this.f25704m = max;
        this.f25702k = this.f25703l + max;
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
        ValueAnimator valueAnimator = this.f25711t;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        return false;
    }

    public final float i() {
        float f7;
        CharSequence charSequence = this.f25706o;
        float f10 = 0.0f;
        float f11 = 1.0f;
        if (charSequence != null && charSequence.length() > 0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        CharSequence charSequence2 = this.f25700i;
        if (charSequence2 != null && charSequence2.length() > 0) {
            f10 = 1.0f;
        }
        if (this.f25706o != null) {
            f11 = this.f25709r;
        }
        return org.telegram.messenger.i0.T1(f7, f10, f11);
    }

    public final StaticLayout j(int i10, CharSequence charSequence) {
        if (i10 <= 0) {
            Point point = org.telegram.messenger.i0.f16026q;
            i10 = Math.min(point.x, point.y);
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f25693a, i10).setMaxLines(1).setLineSpacing(0.0f, 1.0f).setAlignment(Layout.Alignment.ALIGN_NORMAL).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i10).setIncludePad(this.S).build();
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
        this.f25716z = f7;
        this.f25713w = j10;
        this.f25715y = f10;
        this.f25714x = timeInterpolator;
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
        this.f25693a.setShadowLayer(f7, 0.0f, f10, i10);
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
        this.f25693a.setColorFilter(colorFilter);
    }

    public final void t(java.lang.CharSequence r20, boolean r21, boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e6.t(java.lang.CharSequence, boolean, boolean):void");
    }

    public final void u(int i10) {
        this.f25693a.setColor(i10);
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
        int color = this.f25693a.getColor();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.Y = ofFloat;
        ofFloat.addUpdateListener(new jg.a0(this, color, i10, 2));
        this.Y.addListener(new bi.d5(this, i10, 5));
        this.Y.setDuration(240L);
        this.Y.setInterpolator(gr.h);
        this.Y.start();
    }

    public final void w(float f7) {
        TextPaint textPaint = this.f25693a;
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
                this.f25699g = 0.0f;
                this.f25698f = 0.0f;
                this.e = 0.0f;
                int i12 = 0;
                while (true) {
                    b6[] b6VarArr = this.h;
                    if (i12 >= b6VarArr.length) {
                        break;
                    }
                    StaticLayout j10 = j(i10 - ((int) Math.ceil(Math.min(this.d, this.f25701j))), b6VarArr[i12].f24548b.getText());
                    b6[] b6VarArr2 = this.h;
                    b6 b6Var = b6VarArr2[i12];
                    b6VarArr2[i12] = new b6(this, j10, b6Var.f24549c, b6Var.d);
                    float f10 = this.d;
                    b6 b6Var2 = this.h[i12];
                    this.d = f10 + b6Var2.f24550f;
                    f(b6Var2);
                    i12++;
                }
            }
            if (this.f25705n != null) {
                this.f25701j = 0.0f;
                this.f25704m = 0.0f;
                this.f25703l = 0.0f;
                this.f25702k = 0.0f;
                while (true) {
                    b6[] b6VarArr3 = this.f25705n;
                    if (i11 >= b6VarArr3.length) {
                        break;
                    }
                    StaticLayout j11 = j(i10 - ((int) Math.ceil(Math.min(this.d, this.f25701j))), b6VarArr3[i11].f24548b.getText());
                    b6[] b6VarArr4 = this.f25705n;
                    b6 b6Var3 = b6VarArr4[i11];
                    b6VarArr4[i11] = new b6(this, j11, b6Var3.f24549c, b6Var3.d);
                    float f11 = this.f25701j;
                    b6 b6Var4 = this.f25705n[i11];
                    this.f25701j = f11 + b6Var4.f24550f;
                    g(b6Var4);
                    i11++;
                }
            }
            invalidateSelf();
        }
    }

    public final void x(Typeface typeface) {
        this.f25693a.setTypeface(typeface);
    }

    public e6(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f25693a = new TextPaint(1);
        this.f25695b = 0;
        this.f25697c = false;
        this.f25707p = 0;
        this.f25708q = 0.0f;
        this.f25709r = 0.0f;
        this.f25710s = true;
        this.f25713w = 320L;
        this.f25714x = gr.h;
        this.f25715y = -1.0f;
        this.f25716z = 0.3f;
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
