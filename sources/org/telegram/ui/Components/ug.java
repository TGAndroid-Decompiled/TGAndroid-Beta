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
public abstract class ug extends View implements z60 {
    public final n6 E;
    public final d6 F;
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
    public final nq[] R;
    public final d6 S;
    public final mc T;
    public boolean U;
    public final x1.a V;
    public boolean W;
    public boolean f40326a;
    public float f40327a0;
    public final d6 f40328b;
    public final d6 f40329b0;
    public final org.telegram.ui.ActionBar.h6 f40330c;
    public final d6 f40331c0;
    public int d;
    public final Path f40332d0;
    public Drawable f40333e;
    public final Paint f40334e0;
    public Drawable f40335f;
    public final n6 f40336f0;
    public float f40337g0;
    public Drawable h;
    public q0 f40338h0;
    public ChatActivityEnterView f40339i0;
    public float f40340j0;
    public float f40341k0;
    public float f40342l0;
    public int m0;
    public final n5 f40343n;
    public int f40344n0;
    public boolean f40345o0;
    public final d6 f40346p0;
    public Drawable f40347q0;
    public float f40348r;
    public fh.g f40349r0;
    public float f40350s;
    public boolean f40351s0;
    public int f40352t0;
    public int f40353u0;
    public int f40354v0;
    public long f40355w;
    public ValueAnimator f40356w0;
    public int f40357x;
    public final RectF f40358x0;
    public boolean f40359y;

    public ug(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        super(context);
        nr nrVar = nr.h;
        this.f40328b = new d6(this, 0L, 260L, nrVar);
        this.F = new d6(this, 0L, 320L, nrVar);
        this.G = new Paint(1);
        this.L = -1;
        this.M = -1;
        this.O = new Paint(1);
        this.R = new nq[1];
        this.S = new d6(this, 0L, 420L, nrVar);
        this.T = new mc(this);
        this.V = new x1.a();
        this.f40329b0 = new d6(this, 0L, 420L, nrVar);
        this.f40331c0 = new d6(this, 0L, 500L, nrVar);
        this.f40332d0 = new Path();
        Paint paint = new Paint(1);
        this.f40334e0 = paint;
        n6 n6Var = new n6(true, true, true);
        this.f40336f0 = n6Var;
        this.f40337g0 = 1.0f;
        this.f40346p0 = new d6(this, 0L, 320L, nrVar);
        this.f40358x0 = new RectF();
        this.d = i7;
        this.f40330c = h6Var;
        this.H = z10;
        n6 n6Var2 = new n6(false, false, false);
        this.E = n6Var2;
        n6Var2.w(org.telegram.messenger.g0.L(15.0f));
        n6Var2.x(org.telegram.messenger.g0.o());
        n6Var2.u(-1);
        n6Var2.f37795b = 3;
        n6Var2.setCallback(this);
        n6Var2.N = org.telegram.messenger.g0.f24046q.x;
        this.f40333e = i5.c.g(context, i7);
        this.f40335f = i5.c.g(context, i7);
        this.h = i5.c.g(context, i7);
        this.f40343n = new n5(org.telegram.messenger.g0.L(14.0f), this);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        n6Var.setCallback(this);
        n6Var.u(-1);
        n6Var.w(org.telegram.messenger.g0.L(12.0f));
        n6Var.x(org.telegram.messenger.g0.o());
        n6Var.f37795b = 17;
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f40356w0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
        this.f40356w0 = ofFloat;
        ofFloat.addUpdateListener(new x(this, 9));
        this.f40356w0.addListener(new y(this, 8));
        this.f40356w0.setDuration(180L);
        this.f40356w0.setInterpolator(new OvershootInterpolator());
        this.f40356w0.start();
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
        RectF rectF = this.f40358x0;
        float L = org.telegram.messenger.g0.L(18.0f) / 2.0f;
        float L2 = (rectF.left + L) - org.telegram.messenger.g0.L(6.0f);
        float L3 = (rectF.top + L) - org.telegram.messenger.g0.L(6.0f);
        canvas.drawCircle(L2, L3, org.telegram.messenger.g0.L(2.0f) + L, org.telegram.ui.ActionBar.m6.Fm);
        canvas.drawCircle(L2, L3, L, this.G);
        if (this.J == null) {
            Drawable mutate = getContext().getResources().getDrawable(2131231977).mutate();
            this.J = mutate;
            int i7 = this.f40352t0;
            this.K = i7;
            mutate.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
        }
        if (this.K != this.f40352t0) {
            Drawable drawable = this.J;
            int i10 = this.f40352t0;
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
        this.f40336f0.t(str, z10, true);
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
        if (this.W == z10 && (!z10 || Math.abs(this.f40327a0 - (-3.0f)) < 0.01f)) {
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
            this.f40331c0.e(true, 0.0f);
        }
        d6 d6Var = this.f40329b0;
        if (z10 && d6Var.f34386c >= 1.0f) {
            j3 = 650;
        } else {
            j3 = 0;
        }
        d6Var.f34388f = j3;
        this.W = z10;
        if (!z10) {
            f10 = 1.0f;
        }
        this.f40327a0 = f10;
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
        return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Pe, this.f40330c);
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
            float f14 = this.S.f34386c;
            float f15 = this.F.f34386c;
            if (this.f40351s0) {
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
            n6 n6Var = this.f40336f0;
            float i10 = (1.0f - f15) * n6Var.i();
            if (i10 > 0.0f) {
                float max = Math.max(n6Var.c() + org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(18.0f));
                if (this.f40351s0) {
                    f12 = T1 - org.telegram.messenger.g0.L(50.0f);
                    f13 = (max / 2.0f) + (T12 - (getCircleHeight() / 2.0f));
                } else {
                    float f17 = max / 2.0f;
                    float measuredWidth = (getMeasuredWidth() - this.P) - f17;
                    float measuredHeight = (getMeasuredHeight() - this.Q) - f17;
                    f12 = measuredWidth;
                    f13 = measuredHeight;
                }
                canvas.drawCircle(f12, f13, ((max / 2.0f) + org.telegram.messenger.g0.L(2.0f)) * i10 * this.f40337g0, paint);
            }
        }
        draw(canvas);
    }

    public final void i(int i7, long j3, boolean z10) {
        if (this.f40355w == j3 && this.f40357x == i7) {
            return;
        }
        this.f40355w = j3;
        this.f40357x = i7;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        boolean z11 = false;
        n6 n6Var = this.E;
        if (i10 > 0) {
            n6Var.t(di.pb.Z0(false, i5.c.l(j3 * Math.max(1, this.f40357x), ',', new StringBuilder("⭐️")), this.R), z10, true);
        } else {
            n6Var.t("", z10, true);
        }
        if (!z10) {
            if (this.f40355w > 0) {
                z11 = true;
            }
            this.F.a(z11);
            return;
        }
        invalidate();
    }

    public boolean j() {
        return this instanceof ci;
    }

    public final void k() {
        int w02;
        boolean z10 = this.H;
        org.telegram.ui.ActionBar.h6 h6Var = this.f40330c;
        if (z10) {
            w02 = -1;
        } else {
            w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Pe, h6Var);
        }
        int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Nl, h6Var);
        int w04 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Tf, h6Var);
        if (w02 != this.f40352t0 || w03 != this.f40353u0 || w04 != this.f40354v0) {
            this.f40352t0 = w02;
            this.f40353u0 = w03;
            this.f40354v0 = w04;
            Drawable drawable = this.f40333e;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            this.f40335f.setColorFilter(new PorterDuffColorFilter(Color.argb(180, Color.red(w03), Color.green(w03), Color.blue(w03)), mode));
            this.h.setColorFilter(new PorterDuffColorFilter(w04, mode));
        }
        boolean z11 = this.H;
        Paint paint = this.G;
        if (z11) {
            paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Pe, h6Var));
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
        if (this.f40355w > 0) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ug.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ug.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBlurredBackgroundDrawable(fh.g gVar) {
        this.f40349r0 = gVar;
        gVar.r(org.telegram.messenger.g0.L(22.0f));
        this.f40349r0.q(org.telegram.messenger.g0.L(4.0f));
    }

    public void setCircleSize(int i7) {
        this.L = i7;
        this.M = i7;
    }

    public void setEffect(long j3) {
        org.telegram.messenger.f6 f6Var;
        TLRPC.TL_availableEffect b12 = org.telegram.messenger.np.u1(org.telegram.messenger.k10.f24968t0).b1(j3);
        if (b12 != null) {
            f6Var = org.telegram.messenger.j6.g(b12.emoticon);
        } else {
            f6Var = null;
        }
        setEmoji(f6Var);
    }

    public void setEmoji(Drawable drawable) {
        this.f40343n.g(drawable, true);
    }

    public void setEphemeralFactor(float f10) {
        if (this.f40348r != f10) {
            this.f40348r = f10;
            invalidate();
        }
    }

    public void setIconDimmed(boolean z10) {
        if (this.f40326a != z10) {
            this.f40326a = z10;
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
            this.f40333e = getContext().getResources().getDrawable(i7).mutate();
            this.f40335f = getContext().getResources().getDrawable(i7).mutate();
            this.h = getContext().getResources().getDrawable(i7).mutate();
            invalidate();
        }
    }

    public void setSameWidthFactor(float f10) {
        if (this.f40350s != f10) {
            this.f40350s = f10;
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
        if (drawable != this.f40336f0 && drawable != this.f40343n && drawable != this.E && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
