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
public class r6 extends Drawable {
    public static final LinearInterpolator f32118c0 = new LinearInterpolator();
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
    public final TextPaint f32119a;
    public ColorFilter f32120a0;
    public int f32121b;
    public Runnable f32122b0;
    public boolean f32123c;
    public float d;
    public float e;
    public float f32124f;
    public float f32125g;
    public o6[] h;
    public CharSequence f32126i;
    public float f32127j;
    public float f32128k;
    public float f32129l;
    public float f32130m;
    public o6[] f32131n;
    public CharSequence f32132o;
    public int f32133p;
    public float f32134q;
    public float f32135r;
    public boolean f32136s;
    public ValueAnimator f32137t;
    public CharSequence f32138u;
    public boolean v;
    public long f32139w;
    public TimeInterpolator f32140x;
    public float f32141y;
    public float f32142z;

    public r6(boolean z10, boolean z11, boolean z12) {
        this(z10, z11, z12, false, false);
    }

    public static boolean l(int r2, int r3, java.lang.CharSequence r4, java.lang.CharSequence r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r6.l(int, int, java.lang.CharSequence, java.lang.CharSequence):boolean");
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f32137t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void b() {
        if (this.f32131n != null) {
            int i10 = 0;
            while (true) {
                o6[] o6VarArr = this.f32131n;
                if (i10 >= o6VarArr.length) {
                    break;
                }
                o6 o6Var = o6VarArr[i10];
                r6 r6Var = o6Var.f31166i;
                if (r6Var.getCallback() instanceof View) {
                    c6.release((View) r6Var.getCallback(), o6Var.f31161a);
                }
                i10++;
            }
        }
        this.f32131n = null;
    }

    public final float c() {
        if (this.h != null && this.f32131n != null) {
            return AndroidUtilities.lerp(this.f32127j, this.d, this.f32135r);
        }
        return this.d;
    }

    public final float d(org.telegram.ui.Components.o6 r8, float r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r6.d(org.telegram.ui.Components.o6, float):float");
    }

    @Override
    public final void draw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r6.draw(android.graphics.Canvas):void");
    }

    public final float e() {
        return Math.max(this.d, this.f32127j);
    }

    public final void f(o6 o6Var) {
        this.f32124f = Math.max(this.f32124f, o6Var.f31165g);
        float max = Math.max(this.f32125g, o6Var.h);
        this.f32125g = max;
        this.e = this.f32124f + max;
    }

    public final void g(o6 o6Var) {
        this.f32129l = Math.max(this.f32129l, o6Var.f31165g);
        float max = Math.max(this.f32130m, o6Var.h);
        this.f32130m = max;
        this.f32128k = this.f32129l + max;
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
        ValueAnimator valueAnimator = this.f32137t;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        return false;
    }

    public final float i() {
        float f7;
        CharSequence charSequence = this.f32132o;
        float f10 = 0.0f;
        float f11 = 1.0f;
        if (charSequence != null && charSequence.length() > 0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        CharSequence charSequence2 = this.f32126i;
        if (charSequence2 != null && charSequence2.length() > 0) {
            f10 = 1.0f;
        }
        if (this.f32132o != null) {
            f11 = this.f32135r;
        }
        return AndroidUtilities.lerp(f7, f10, f11);
    }

    public final StaticLayout j(int i10, CharSequence charSequence) {
        if (i10 <= 0) {
            Point point = AndroidUtilities.displaySize;
            i10 = Math.min(point.x, point.y);
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f32119a, i10).setMaxLines(1).setLineSpacing(0.0f, 1.0f).setAlignment(Layout.Alignment.ALIGN_NORMAL).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i10).setIncludePad(this.S).build();
    }

    public final void k(p6 p6Var, CharSequence charSequence, int i10, int i11) {
        if (this.G && charSequence.length() > 1) {
            int i12 = 0;
            while (i12 < charSequence.length()) {
                int i13 = i12 + 1;
                p6Var.b(charSequence.subSequence(i12, i13));
                i12 = i13;
            }
            return;
        }
        p6Var.b(charSequence);
    }

    public final void m(float f7, long j10, float f10, TimeInterpolator timeInterpolator) {
        this.f32142z = f7;
        this.f32139w = j10;
        this.f32141y = f10;
        this.f32140x = timeInterpolator;
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
        this.f32119a.setShadowLayer(f7, 0.0f, f10, i10);
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
        this.f32119a.setColorFilter(colorFilter);
    }

    public final void t(java.lang.CharSequence r21, boolean r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r6.t(java.lang.CharSequence, boolean, boolean):void");
    }

    public final void u(int i10) {
        this.f32119a.setColor(i10);
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
        int color = this.f32119a.getColor();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.Y = ofFloat;
        ofFloat.addUpdateListener(new fi.t4(this, color, i10, 2));
        this.Y.addListener(new hi.y2(this, i10, 4));
        this.Y.setDuration(240L);
        this.Y.setInterpolator(ds.h);
        this.Y.start();
    }

    public final void w(float f7) {
        TextPaint textPaint = this.f32119a;
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
                this.f32125g = 0.0f;
                this.f32124f = 0.0f;
                this.e = 0.0f;
                int i12 = 0;
                while (true) {
                    o6[] o6VarArr = this.h;
                    if (i12 >= o6VarArr.length) {
                        break;
                    }
                    StaticLayout j10 = j(i10 - ((int) Math.ceil(Math.min(this.d, this.f32127j))), o6VarArr[i12].f31162b.getText());
                    o6[] o6VarArr2 = this.h;
                    o6 o6Var = o6VarArr2[i12];
                    o6VarArr2[i12] = new o6(this, j10, o6Var.f31163c, o6Var.d);
                    float f10 = this.d;
                    o6 o6Var2 = this.h[i12];
                    this.d = f10 + o6Var2.f31164f;
                    f(o6Var2);
                    i12++;
                }
            }
            if (this.f32131n != null) {
                this.f32127j = 0.0f;
                this.f32130m = 0.0f;
                this.f32129l = 0.0f;
                this.f32128k = 0.0f;
                while (true) {
                    o6[] o6VarArr3 = this.f32131n;
                    if (i11 >= o6VarArr3.length) {
                        break;
                    }
                    StaticLayout j11 = j(i10 - ((int) Math.ceil(Math.min(this.d, this.f32127j))), o6VarArr3[i11].f31162b.getText());
                    o6[] o6VarArr4 = this.f32131n;
                    o6 o6Var3 = o6VarArr4[i11];
                    o6VarArr4[i11] = new o6(this, j11, o6Var3.f31163c, o6Var3.d);
                    float f11 = this.f32127j;
                    o6 o6Var4 = this.f32131n[i11];
                    this.f32127j = f11 + o6Var4.f31164f;
                    g(o6Var4);
                    i11++;
                }
            }
            invalidateSelf();
        }
    }

    public final void x(Typeface typeface) {
        this.f32119a.setTypeface(typeface);
    }

    public r6(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f32119a = new TextPaint(1);
        this.f32121b = 0;
        this.f32123c = false;
        this.f32133p = 0;
        this.f32134q = 0.0f;
        this.f32135r = 0.0f;
        this.f32136s = true;
        this.f32139w = 320L;
        this.f32140x = ds.h;
        this.f32141y = -1.0f;
        this.f32142z = 0.3f;
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
