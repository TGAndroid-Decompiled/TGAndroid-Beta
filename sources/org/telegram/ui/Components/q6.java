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
public class q6 extends Drawable {
    public static final LinearInterpolator f30016c0 = new LinearInterpolator();
    public float A;
    public int B;
    public final Rect C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public rg I;
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
    public final TextPaint f30017a;
    public ColorFilter f30018a0;
    public int f30019b;
    public Runnable f30020b0;
    public boolean f30021c;
    public float d;
    public float f30022e;
    public float f30023f;
    public float f30024g;
    public n6[] h;
    public CharSequence f30025i;
    public float f30026j;
    public float f30027k;
    public float f30028l;
    public float f30029m;
    public n6[] f30030n;
    public CharSequence f30031o;
    public int f30032p;
    public float f30033q;
    public float f30034r;
    public boolean f30035s;
    public ValueAnimator f30036t;
    public CharSequence f30037u;
    public boolean v;
    public long f30038w;
    public TimeInterpolator f30039x;
    public float f30040y;
    public float f30041z;

    public q6(boolean z10, boolean z11, boolean z12) {
        this(z10, z11, z12, false, false);
    }

    public static boolean l(int r2, int r3, java.lang.CharSequence r4, java.lang.CharSequence r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q6.l(int, int, java.lang.CharSequence, java.lang.CharSequence):boolean");
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f30036t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void b() {
        if (this.f30030n != null) {
            int i10 = 0;
            while (true) {
                n6[] n6VarArr = this.f30030n;
                if (i10 >= n6VarArr.length) {
                    break;
                }
                n6 n6Var = n6VarArr[i10];
                q6 q6Var = n6Var.f28973i;
                if (q6Var.getCallback() instanceof View) {
                    b6.release((View) q6Var.getCallback(), n6Var.f28967a);
                }
                i10++;
            }
        }
        this.f30030n = null;
    }

    public final float c() {
        if (this.h != null && this.f30030n != null) {
            return AndroidUtilities.lerp(this.f30026j, this.d, this.f30034r);
        }
        return this.d;
    }

    public final float d(org.telegram.ui.Components.n6 r8, float r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q6.d(org.telegram.ui.Components.n6, float):float");
    }

    @Override
    public final void draw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q6.draw(android.graphics.Canvas):void");
    }

    public final float e() {
        return Math.max(this.d, this.f30026j);
    }

    public final void f(n6 n6Var) {
        this.f30023f = Math.max(this.f30023f, n6Var.f28972g);
        float max = Math.max(this.f30024g, n6Var.h);
        this.f30024g = max;
        this.f30022e = this.f30023f + max;
    }

    public final void g(n6 n6Var) {
        this.f30028l = Math.max(this.f30028l, n6Var.f28972g);
        float max = Math.max(this.f30029m, n6Var.h);
        this.f30029m = max;
        this.f30027k = this.f30028l + max;
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
        ValueAnimator valueAnimator = this.f30036t;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        return false;
    }

    public final float i() {
        float f7;
        CharSequence charSequence = this.f30031o;
        float f10 = 0.0f;
        float f11 = 1.0f;
        if (charSequence != null && charSequence.length() > 0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        CharSequence charSequence2 = this.f30025i;
        if (charSequence2 != null && charSequence2.length() > 0) {
            f10 = 1.0f;
        }
        if (this.f30031o != null) {
            f11 = this.f30034r;
        }
        return AndroidUtilities.lerp(f7, f10, f11);
    }

    public final StaticLayout j(int i10, CharSequence charSequence) {
        if (i10 <= 0) {
            Point point = AndroidUtilities.displaySize;
            i10 = Math.min(point.x, point.y);
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f30017a, i10).setMaxLines(1).setLineSpacing(0.0f, 1.0f).setAlignment(Layout.Alignment.ALIGN_NORMAL).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i10).setIncludePad(this.S).build();
    }

    public final void k(o6 o6Var, CharSequence charSequence, int i10, int i11) {
        if (this.G && charSequence.length() > 1) {
            int i12 = 0;
            while (i12 < charSequence.length()) {
                int i13 = i12 + 1;
                o6Var.b(charSequence.subSequence(i12, i13));
                i12 = i13;
            }
            return;
        }
        o6Var.b(charSequence);
    }

    public final void m(float f7, long j3, float f10, TimeInterpolator timeInterpolator) {
        this.f30041z = f7;
        this.f30038w = j3;
        this.f30040y = f10;
        this.f30039x = timeInterpolator;
    }

    public final void n(float f7, long j3, TimeInterpolator timeInterpolator) {
        m(f7, j3, 1.0f, timeInterpolator);
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
        this.f30017a.setShadowLayer(f7, 0.0f, f10, i10);
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
        this.f30017a.setColorFilter(colorFilter);
    }

    public final void t(java.lang.CharSequence r21, boolean r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q6.t(java.lang.CharSequence, boolean, boolean):void");
    }

    public final void u(int i10) {
        this.f30017a.setColor(i10);
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
        int color = this.f30017a.getColor();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.Y = ofFloat;
        ofFloat.addUpdateListener(new ci.b5(this, color, i10, 2));
        this.Y.addListener(new ei.v2(this, i10, 4));
        this.Y.setDuration(240L);
        this.Y.setInterpolator(is.h);
        this.Y.start();
    }

    public final void w(float f7) {
        TextPaint textPaint = this.f30017a;
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
                this.f30024g = 0.0f;
                this.f30023f = 0.0f;
                this.f30022e = 0.0f;
                int i12 = 0;
                while (true) {
                    n6[] n6VarArr = this.h;
                    if (i12 >= n6VarArr.length) {
                        break;
                    }
                    StaticLayout j3 = j(i10 - ((int) Math.ceil(Math.min(this.d, this.f30026j))), n6VarArr[i12].f28968b.getText());
                    n6[] n6VarArr2 = this.h;
                    n6 n6Var = n6VarArr2[i12];
                    n6VarArr2[i12] = new n6(this, j3, n6Var.f28969c, n6Var.d);
                    float f10 = this.d;
                    n6 n6Var2 = this.h[i12];
                    this.d = f10 + n6Var2.f28971f;
                    f(n6Var2);
                    i12++;
                }
            }
            if (this.f30030n != null) {
                this.f30026j = 0.0f;
                this.f30029m = 0.0f;
                this.f30028l = 0.0f;
                this.f30027k = 0.0f;
                while (true) {
                    n6[] n6VarArr3 = this.f30030n;
                    if (i11 >= n6VarArr3.length) {
                        break;
                    }
                    StaticLayout j10 = j(i10 - ((int) Math.ceil(Math.min(this.d, this.f30026j))), n6VarArr3[i11].f28968b.getText());
                    n6[] n6VarArr4 = this.f30030n;
                    n6 n6Var3 = n6VarArr4[i11];
                    n6VarArr4[i11] = new n6(this, j10, n6Var3.f28969c, n6Var3.d);
                    float f11 = this.f30026j;
                    n6 n6Var4 = this.f30030n[i11];
                    this.f30026j = f11 + n6Var4.f28971f;
                    g(n6Var4);
                    i11++;
                }
            }
            invalidateSelf();
        }
    }

    public final void x(Typeface typeface) {
        this.f30017a.setTypeface(typeface);
    }

    public q6(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f30017a = new TextPaint(1);
        this.f30019b = 0;
        this.f30021c = false;
        this.f30032p = 0;
        this.f30033q = 0.0f;
        this.f30034r = 0.0f;
        this.f30035s = true;
        this.f30038w = 320L;
        this.f30039x = is.h;
        this.f30040y = -1.0f;
        this.f30041z = 0.3f;
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
