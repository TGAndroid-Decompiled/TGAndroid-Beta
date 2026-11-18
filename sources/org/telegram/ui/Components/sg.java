package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.tgnet.TLRPC;
public abstract class sg extends View implements x60 {
    public final m6 E;
    public final c6 F;
    public final Paint G;
    public boolean H;
    public boolean I;
    public Drawable J;
    public int K;
    public int L;
    public int M;
    public int N;
    public final Paint O;
    public float P;
    public float Q;
    public final lq[] R;
    public final c6 S;
    public final mc T;
    public boolean U;
    public final x1.a V;
    public boolean W;
    public boolean f39618a;
    public float f39619a0;
    public final c6 f39620b;
    public final c6 f39621b0;
    public final org.telegram.ui.ActionBar.i6 f39622c;
    public final c6 f39623c0;
    public int d;
    public final Path f39624d0;
    public Drawable f39625e;
    public final Paint f39626e0;
    public Drawable f39627f;
    public final m6 f39628f0;
    public float f39629g0;
    public Drawable h;
    public p0 f39630h0;
    public ChatActivityEnterView f39631i0;
    public float f39632j0;
    public float f39633k0;
    public float f39634l0;
    public int m0;
    public final m5 f39635n;
    public int f39636n0;
    public boolean f39637o0;
    public final c6 f39638p0;
    public Drawable f39639q0;
    public float f39640r;
    public fh.g f39641r0;
    public float f39642s;
    public boolean f39643s0;
    public int f39644t0;
    public int f39645u0;
    public int f39646v0;
    public long f39647w;
    public ValueAnimator f39648w0;
    public int f39649x;
    public final RectF f39650x0;
    public boolean f39651y;

    public sg(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context);
        lr lrVar = lr.h;
        this.f39620b = new c6(this, 0L, 260L, lrVar);
        this.F = new c6(this, 0L, 320L, lrVar);
        this.G = new Paint(1);
        this.L = -1;
        this.M = -1;
        this.O = new Paint(1);
        this.R = new lq[1];
        this.S = new c6(this, 0L, 420L, lrVar);
        this.T = new mc(this);
        this.V = new x1.a();
        this.f39621b0 = new c6(this, 0L, 420L, lrVar);
        this.f39623c0 = new c6(this, 0L, 500L, lrVar);
        this.f39624d0 = new Path();
        Paint paint = new Paint(1);
        this.f39626e0 = paint;
        m6 m6Var = new m6(true, true, true);
        this.f39628f0 = m6Var;
        this.f39629g0 = 1.0f;
        this.f39638p0 = new c6(this, 0L, 320L, lrVar);
        this.f39650x0 = new RectF();
        this.d = i7;
        this.f39622c = i6Var;
        this.H = z10;
        m6 m6Var2 = new m6(false, false, false);
        this.E = m6Var2;
        m6Var2.w(org.telegram.messenger.g0.L(15.0f));
        m6Var2.x(org.telegram.messenger.g0.o());
        m6Var2.u(-1);
        m6Var2.f37377b = 3;
        m6Var2.setCallback(this);
        m6Var2.N = org.telegram.messenger.g0.f24118q.x;
        this.f39625e = i5.c.g(context, i7);
        this.f39627f = i5.c.g(context, i7);
        this.h = i5.c.g(context, i7);
        this.f39635n = new m5(org.telegram.messenger.g0.L(14.0f), this);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        m6Var.setCallback(this);
        m6Var.u(-1);
        m6Var.w(org.telegram.messenger.g0.L(12.0f));
        m6Var.x(org.telegram.messenger.g0.o());
        m6Var.f37377b = 17;
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f39648w0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
        this.f39648w0 = ofFloat;
        ofFloat.addUpdateListener(new w(this, 9));
        this.f39648w0.addListener(new x(this, 8));
        this.f39648w0.setDuration(180L);
        this.f39648w0.setInterpolator(new OvershootInterpolator());
        this.f39648w0.start();
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return false;
    }

    public abstract boolean d();

    @Override
    public final void draw(Canvas canvas) {
        if (!this.I) {
            super.draw(canvas);
            return;
        }
        canvas.saveLayerAlpha(-org.telegram.messenger.g0.L(6.0f), -org.telegram.messenger.g0.L(6.0f), getWidth(), getHeight(), 255, 31);
        super.draw(canvas);
        RectF rectF = this.f39650x0;
        float L = org.telegram.messenger.g0.L(18.0f) / 2.0f;
        float L2 = (rectF.left + L) - org.telegram.messenger.g0.L(6.0f);
        float L3 = (rectF.top + L) - org.telegram.messenger.g0.L(6.0f);
        canvas.drawCircle(L2, L3, org.telegram.messenger.g0.L(2.0f) + L, org.telegram.ui.ActionBar.n6.Fm);
        canvas.drawCircle(L2, L3, L, this.G);
        if (this.J == null) {
            Drawable mutate = getContext().getResources().getDrawable(2131231977).mutate();
            this.J = mutate;
            int i7 = this.f39644t0;
            this.K = i7;
            mutate.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
        }
        if (this.K != this.f39644t0) {
            Drawable drawable = this.J;
            int i10 = this.f39644t0;
            this.K = i10;
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        this.J.setBounds((int) (L2 - org.telegram.messenger.g0.L(8.0f)), (int) (L3 - org.telegram.messenger.g0.L(8.0f)), (int) (L2 + org.telegram.messenger.g0.L(8.0f)), (int) (L3 + org.telegram.messenger.g0.L(8.0f)));
        this.J.draw(canvas);
        canvas.restore();
    }

    public final void e(int i7, boolean z10) {
        String str = "";
        if (i7 > 0) {
            str = i5.c.i(i7, "");
        }
        this.f39628f0.t(str, z10, true);
        invalidate();
    }

    @Override
    public final void f(RectF rectF) {
        float measuredWidth = (getMeasuredWidth() - org.telegram.messenger.g0.L(4.0f)) - this.P;
        float measuredHeight = (getMeasuredHeight() - org.telegram.messenger.g0.L(4.0f)) - this.Q;
        rectF.set(measuredWidth - getCircleWidth(), measuredHeight - getCircleHeight(), measuredWidth, measuredHeight);
    }

    public final void g(boolean z10) {
        long j3;
        boolean z11;
        float f10 = -3.0f;
        boolean z12 = false;
        if (this.W == z10 && (!z10 || Math.abs(this.f39619a0 - (-3.0f)) < 0.01f)) {
            boolean z13 = this.U;
            if (Math.abs(0.0f) < 0.01f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z13 == z11) {
                return;
            }
        }
        if (Math.abs(0.0f) < 0.01f) {
            z12 = true;
        }
        this.U = z12;
        if (!this.W && z10) {
            this.f39623c0.e(true, 0.0f);
        }
        c6 c6Var = this.f39621b0;
        if (z10 && c6Var.f33892c >= 1.0f) {
            j3 = 650;
        } else {
            j3 = 0;
        }
        c6Var.f33894f = j3;
        this.W = z10;
        if (!z10) {
            f10 = 1.0f;
        }
        this.f39619a0 = f10;
        invalidate();
    }

    public int getCircleHeight() {
        int i7 = this.M;
        if (i7 >= 0) {
            return i7;
        }
        return getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f);
    }

    public int getCircleWidth() {
        int i7 = this.L;
        if (i7 >= 0) {
            return i7;
        }
        return getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f);
    }

    public int getFillColor() {
        return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Pe, this.f39622c);
    }

    @Override
    public final void h(Canvas canvas, float f10) {
        float T1;
        float T12;
        float W1;
        float f11;
        float f12;
        float f13;
        int i7 = this.N;
        if (i7 != 0) {
            Paint paint = this.O;
            paint.setColor(i7);
            paint.setAlpha((int) (Color.alpha(this.N) * f10));
            float f14 = this.S.f33892c;
            float f15 = this.F.f33892c;
            if (this.f39643s0) {
                T1 = org.telegram.messenger.g0.T1(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(4.0f), f14) - this.P;
                W1 = getCircleHeight() * f14;
                T12 = ((getMeasuredHeight() - this.Q) - org.telegram.messenger.g0.L(4.0f)) - (W1 / 2.0f);
            } else {
                T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.T1(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(4.0f), f14) - this.P, getMeasuredWidth() - org.telegram.messenger.g0.L(9.0f), f15);
                T12 = org.telegram.messenger.g0.T1(((getMeasuredHeight() - this.Q) - org.telegram.messenger.g0.L(4.0f)) - (getCircleHeight() / 2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(24.0f), f15);
                W1 = org.telegram.messenger.g0.W1(f15, getCircleHeight(), org.telegram.messenger.g0.L(32.0f)) * f14;
            }
            float circleWidth = getCircleWidth();
            if (this.H) {
                f11 = 20.0f;
            } else {
                f11 = 22.0f;
            }
            float T13 = org.telegram.messenger.g0.T1(circleWidth, this.E.c() + org.telegram.messenger.g0.L(f11), f15) * f14;
            if (f14 > 0.0f && T13 > 0.0f && W1 > 0.0f) {
                RectF rectF = org.telegram.messenger.g0.P;
                float f16 = W1 / 2.0f;
                rectF.set(T1 - T13, T12 - f16, T1, f16 + T12);
                rectF.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
                float min = (Math.min(T13, W1) / 2.0f) + org.telegram.messenger.g0.L(4.0f);
                canvas.drawRoundRect(rectF, min, min, paint);
            }
            m6 m6Var = this.f39628f0;
            float i10 = (1.0f - f15) * m6Var.i();
            if (i10 > 0.0f) {
                float max = Math.max(m6Var.c() + org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(18.0f));
                if (this.f39643s0) {
                    f12 = T1 - org.telegram.messenger.g0.L(50.0f);
                    f13 = (max / 2.0f) + (T12 - (getCircleHeight() / 2.0f));
                } else {
                    float f17 = max / 2.0f;
                    float measuredWidth = (getMeasuredWidth() - this.P) - f17;
                    float measuredHeight = (getMeasuredHeight() - this.Q) - f17;
                    f12 = measuredWidth;
                    f13 = measuredHeight;
                }
                canvas.drawCircle(f12, f13, ((max / 2.0f) + org.telegram.messenger.g0.L(2.0f)) * i10 * this.f39629g0, paint);
            }
        }
        draw(canvas);
    }

    public final void i(int i7, long j3, boolean z10) {
        if (this.f39647w == j3 && this.f39649x == i7) {
            return;
        }
        this.f39647w = j3;
        this.f39649x = i7;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        boolean z11 = false;
        m6 m6Var = this.E;
        if (i10 > 0) {
            m6Var.t(di.pb.Z0(false, i5.c.l(j3 * Math.max(1, this.f39649x), ',', new StringBuilder("⭐️")), this.R), z10, true);
        } else {
            m6Var.t("", z10, true);
        }
        if (!z10) {
            if (this.f39647w > 0) {
                z11 = true;
            }
            this.F.a(z11);
            return;
        }
        invalidate();
    }

    public boolean j() {
        return this instanceof ai;
    }

    public final void k() {
        int w02;
        boolean z10 = this.H;
        org.telegram.ui.ActionBar.i6 i6Var = this.f39622c;
        if (z10) {
            w02 = -1;
        } else {
            w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Pe, i6Var);
        }
        int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Nl, i6Var);
        int w04 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Tf, i6Var);
        if (w02 != this.f39644t0 || w03 != this.f39645u0 || w04 != this.f39646v0) {
            this.f39644t0 = w02;
            this.f39645u0 = w03;
            this.f39646v0 = w04;
            Drawable drawable = this.f39625e;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            this.f39627f.setColorFilter(new PorterDuffColorFilter(Color.argb(180, Color.red(w03), Color.green(w03), Color.blue(w03)), mode));
            this.h.setColorFilter(new PorterDuffColorFilter(w04, mode));
        }
        boolean z11 = this.H;
        Paint paint = this.G;
        if (z11) {
            paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Pe, i6Var));
        } else if (j()) {
            paint.setColor(getFillColor());
        } else {
            paint.setColor(i0.a.o(-1, 75));
        }
    }

    public final int l() {
        getMeasuredHeight();
        return m();
    }

    public final int m() {
        float f10;
        float f11;
        float f12 = 0.0f;
        if (d()) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (this.f39647w > 0) {
            f12 = 1.0f;
        }
        float circleWidth = this.P + getCircleWidth() + this.P;
        int L = org.telegram.messenger.g0.L(18.0f);
        if (this.H) {
            f11 = 20.0f;
        } else {
            f11 = 22.0f;
        }
        return (int) org.telegram.messenger.g0.T1(circleWidth, org.telegram.messenger.g0.L(f11) + L + this.E.d, f12 * f10);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sg.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sg.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBlurredBackgroundDrawable(fh.g gVar) {
        this.f39641r0 = gVar;
        gVar.r(org.telegram.messenger.g0.L(22.0f));
        this.f39641r0.q(org.telegram.messenger.g0.L(4.0f));
    }

    public void setCircleSize(int i7) {
        this.L = i7;
        this.M = i7;
    }

    public void setEffect(long j3) {
        org.telegram.messenger.f6 f6Var;
        TLRPC.TL_availableEffect b12 = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24770t0).b1(j3);
        if (b12 != null) {
            f6Var = org.telegram.messenger.j6.g(b12.emoticon);
        } else {
            f6Var = null;
        }
        setEmoji(f6Var);
    }

    public void setEmoji(Drawable drawable) {
        this.f39635n.g(drawable, true);
    }

    public void setEphemeralFactor(float f10) {
        if (this.f39640r != f10) {
            this.f39640r = f10;
            invalidate();
        }
    }

    public void setIconDimmed(boolean z10) {
        if (this.f39618a != z10) {
            this.f39618a = z10;
            invalidate();
        }
    }

    public void setLocked(boolean z10) {
        if (this.I == z10) {
            return;
        }
        this.I = z10;
        invalidate();
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.T.c(z10);
    }

    public void setResourceId(int i7) {
        if (this.d != i7) {
            this.d = i7;
            this.f39625e = getContext().getResources().getDrawable(i7).mutate();
            this.f39627f = getContext().getResources().getDrawable(i7).mutate();
            this.h = getContext().getResources().getDrawable(i7).mutate();
            invalidate();
        }
    }

    public void setSameWidthFactor(float f10) {
        if (this.f39642s != f10) {
            this.f39642s = f10;
            invalidate();
        }
    }

    @Override
    public void setScrimHidden(boolean z10) {
        org.telegram.ui.Cells.c0.d(this, z10);
    }

    public void setScrimViewBackgroundColor(int i7) {
        this.N = i7;
        this.O.setColor(i7);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f39628f0 && drawable != this.f39635n && drawable != this.E && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
