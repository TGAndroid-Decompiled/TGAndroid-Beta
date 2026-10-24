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
public class n6 extends Drawable {
    public static final LinearInterpolator f28794c0 = new LinearInterpolator();
    public float A;
    public int B;
    public final Rect C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ng I;
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
    public final TextPaint f28795a;
    public ColorFilter f28796a0;
    public int f28797b;
    public Runnable f28798b0;
    public boolean f28799c;
    public float d;
    public float e;
    public float f28800f;
    public float f28801g;
    public k6[] h;
    public CharSequence f28802i;
    public float f28803j;
    public float f28804k;
    public float f28805l;
    public float f28806m;
    public k6[] f28807n;
    public CharSequence f28808o;
    public int f28809p;
    public float f28810q;
    public float f28811r;
    public boolean f28812s;
    public ValueAnimator f28813t;
    public CharSequence f28814u;
    public boolean v;
    public long f28815w;
    public TimeInterpolator f28816x;
    public float f28817y;
    public float f28818z;

    public n6(boolean z10, boolean z11, boolean z12) {
        this(z10, z11, z12, false, false);
    }

    public static boolean l(int r2, int r3, java.lang.CharSequence r4, java.lang.CharSequence r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n6.l(int, int, java.lang.CharSequence, java.lang.CharSequence):boolean");
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f28813t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void b() {
        if (this.f28807n != null) {
            int i10 = 0;
            while (true) {
                k6[] k6VarArr = this.f28807n;
                if (i10 >= k6VarArr.length) {
                    break;
                }
                k6 k6Var = k6VarArr[i10];
                n6 n6Var = k6Var.f27874i;
                if (n6Var.getCallback() instanceof View) {
                    y5.release((View) n6Var.getCallback(), k6Var.f27869a);
                }
                i10++;
            }
        }
        this.f28807n = null;
    }

    public final float c() {
        if (this.h != null && this.f28807n != null) {
            return AndroidUtilities.lerp(this.f28803j, this.d, this.f28811r);
        }
        return this.d;
    }

    public final float d(org.telegram.ui.Components.k6 r8, float r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n6.d(org.telegram.ui.Components.k6, float):float");
    }

    @Override
    public final void draw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n6.draw(android.graphics.Canvas):void");
    }

    public final float e() {
        return Math.max(this.d, this.f28803j);
    }

    public final void f(k6 k6Var) {
        this.f28800f = Math.max(this.f28800f, k6Var.f27873g);
        float max = Math.max(this.f28801g, k6Var.h);
        this.f28801g = max;
        this.e = this.f28800f + max;
    }

    public final void g(k6 k6Var) {
        this.f28805l = Math.max(this.f28805l, k6Var.f27873g);
        float max = Math.max(this.f28806m, k6Var.h);
        this.f28806m = max;
        this.f28804k = this.f28805l + max;
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
        ValueAnimator valueAnimator = this.f28813t;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        return false;
    }

    public final float i() {
        float f7;
        CharSequence charSequence = this.f28808o;
        float f10 = 0.0f;
        float f11 = 1.0f;
        if (charSequence != null && charSequence.length() > 0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        CharSequence charSequence2 = this.f28802i;
        if (charSequence2 != null && charSequence2.length() > 0) {
            f10 = 1.0f;
        }
        if (this.f28808o != null) {
            f11 = this.f28811r;
        }
        return AndroidUtilities.lerp(f7, f10, f11);
    }

    public final StaticLayout j(int i10, CharSequence charSequence) {
        if (i10 <= 0) {
            Point point = AndroidUtilities.displaySize;
            i10 = Math.min(point.x, point.y);
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f28795a, i10).setMaxLines(1).setLineSpacing(0.0f, 1.0f).setAlignment(Layout.Alignment.ALIGN_NORMAL).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i10).setIncludePad(this.S).build();
    }

    public final void k(l6 l6Var, CharSequence charSequence, int i10, int i11) {
        if (this.G && charSequence.length() > 1) {
            int i12 = 0;
            while (i12 < charSequence.length()) {
                int i13 = i12 + 1;
                l6Var.b(charSequence.subSequence(i12, i13));
                i12 = i13;
            }
            return;
        }
        l6Var.b(charSequence);
    }

    public final void m(float f7, long j10, float f10, TimeInterpolator timeInterpolator) {
        this.f28818z = f7;
        this.f28815w = j10;
        this.f28817y = f10;
        this.f28816x = timeInterpolator;
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
        this.f28795a.setShadowLayer(f7, 0.0f, f10, i10);
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
        this.f28795a.setColorFilter(colorFilter);
    }

    public final void t(java.lang.CharSequence r21, boolean r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n6.t(java.lang.CharSequence, boolean, boolean):void");
    }

    public final void u(int i10) {
        this.f28795a.setColor(i10);
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
        int color = this.f28795a.getColor();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.Y = ofFloat;
        ofFloat.addUpdateListener(new ei.u4(this, color, i10, 2));
        this.Y.addListener(new gi.p2(this, i10, 4));
        this.Y.setDuration(240L);
        this.Y.setInterpolator(zr.h);
        this.Y.start();
    }

    public final void w(float f7) {
        TextPaint textPaint = this.f28795a;
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
                this.f28801g = 0.0f;
                this.f28800f = 0.0f;
                this.e = 0.0f;
                int i12 = 0;
                while (true) {
                    k6[] k6VarArr = this.h;
                    if (i12 >= k6VarArr.length) {
                        break;
                    }
                    StaticLayout j10 = j(i10 - ((int) Math.ceil(Math.min(this.d, this.f28803j))), k6VarArr[i12].f27870b.getText());
                    k6[] k6VarArr2 = this.h;
                    k6 k6Var = k6VarArr2[i12];
                    k6VarArr2[i12] = new k6(this, j10, k6Var.f27871c, k6Var.d);
                    float f10 = this.d;
                    k6 k6Var2 = this.h[i12];
                    this.d = f10 + k6Var2.f27872f;
                    f(k6Var2);
                    i12++;
                }
            }
            if (this.f28807n != null) {
                this.f28803j = 0.0f;
                this.f28806m = 0.0f;
                this.f28805l = 0.0f;
                this.f28804k = 0.0f;
                while (true) {
                    k6[] k6VarArr3 = this.f28807n;
                    if (i11 >= k6VarArr3.length) {
                        break;
                    }
                    StaticLayout j11 = j(i10 - ((int) Math.ceil(Math.min(this.d, this.f28803j))), k6VarArr3[i11].f27870b.getText());
                    k6[] k6VarArr4 = this.f28807n;
                    k6 k6Var3 = k6VarArr4[i11];
                    k6VarArr4[i11] = new k6(this, j11, k6Var3.f27871c, k6Var3.d);
                    float f11 = this.f28803j;
                    k6 k6Var4 = this.f28807n[i11];
                    this.f28803j = f11 + k6Var4.f27872f;
                    g(k6Var4);
                    i11++;
                }
            }
            invalidateSelf();
        }
    }

    public final void x(Typeface typeface) {
        this.f28795a.setTypeface(typeface);
    }

    public n6(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f28795a = new TextPaint(1);
        this.f28797b = 0;
        this.f28799c = false;
        this.f28809p = 0;
        this.f28810q = 0.0f;
        this.f28811r = 0.0f;
        this.f28812s = true;
        this.f28815w = 320L;
        this.f28816x = zr.h;
        this.f28817y = -1.0f;
        this.f28818z = 0.3f;
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
