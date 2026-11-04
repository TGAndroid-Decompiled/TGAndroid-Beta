package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.tgnet.TLRPC;
public abstract class bg extends View implements e60 {
    public final Paint E;
    public boolean F;
    public boolean G;
    public Drawable H;
    public int I;
    public int J;
    public int K;
    public int L;
    public final Paint M;
    public float N;
    public float O;
    public final wp[] P;
    public final u5 Q;
    public final gc R;
    public boolean S;
    public final w1.a T;
    public boolean U;
    public float V;
    public final u5 W;
    public final org.telegram.ui.ActionBar.e6 f32179a;
    public final u5 f32180a0;
    public int f32181b;
    public final Path f32182b0;
    public Drawable f32183c;
    public final Paint f32184c0;
    public Drawable d;
    public final g6 f32185d0;
    public Drawable f32186e;
    public float f32187e0;
    public final e5 f32188f;
    public final u5 f32189f0;
    public Drawable f32190g0;
    public float h;
    public gh.g f32191h0;
    public boolean f32192i0;
    public int f32193j0;
    public int f32194k0;
    public int f32195l0;
    public ValueAnimator m0;
    public float f32196n;
    public final RectF f32197n0;
    public long f32198r;
    public int f32199s;
    public boolean f32200w;
    public final g6 f32201x;
    public final u5 f32202y;

    public bg(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        xq xqVar = xq.h;
        this.f32202y = new u5(this, 0L, 320L, xqVar);
        this.E = new Paint(1);
        this.J = -1;
        this.K = -1;
        this.M = new Paint(1);
        this.P = new wp[1];
        this.Q = new u5(this, 0L, 420L, xqVar);
        this.R = new gc(this);
        this.T = new w1.a();
        this.W = new u5(this, 0L, 420L, xqVar);
        this.f32180a0 = new u5(this, 0L, 500L, xqVar);
        this.f32182b0 = new Path();
        Paint paint = new Paint(1);
        this.f32184c0 = paint;
        g6 g6Var = new g6(true, true, true);
        this.f32185d0 = g6Var;
        this.f32187e0 = 1.0f;
        this.f32189f0 = new u5(this, 0L, 320L, xqVar);
        this.f32197n0 = new RectF();
        this.f32181b = i3;
        this.f32179a = e6Var;
        this.F = z10;
        g6 g6Var2 = new g6(false, false, false);
        this.f32201x = g6Var2;
        g6Var2.w(org.telegram.messenger.g0.L(15.0f));
        g6Var2.x(org.telegram.messenger.g0.o());
        g6Var2.u(-1);
        g6Var2.f33983b = 3;
        g6Var2.setCallback(this);
        g6Var2.M = org.telegram.messenger.g0.f22608q.x;
        this.f32183c = k2.p1.g(context, i3);
        this.d = k2.p1.g(context, i3);
        this.f32186e = k2.p1.g(context, i3);
        this.f32188f = new e5(org.telegram.messenger.g0.L(14.0f), this);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        g6Var.setCallback(this);
        g6Var.u(-1);
        g6Var.w(org.telegram.messenger.g0.L(12.0f));
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.f33983b = 17;
    }

    public final void a() {
        ValueAnimator valueAnimator = this.m0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
        this.m0 = ofFloat;
        ofFloat.addUpdateListener(new c6(this, 8));
        this.m0.addListener(new x5(this, 7));
        this.m0.setDuration(180L);
        this.m0.setInterpolator(new OvershootInterpolator());
        this.m0.start();
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
        if (!this.G) {
            super.draw(canvas);
            return;
        }
        canvas.saveLayerAlpha(-org.telegram.messenger.g0.L(6.0f), -org.telegram.messenger.g0.L(6.0f), getWidth(), getHeight(), 255, 31);
        super.draw(canvas);
        RectF rectF = this.f32197n0;
        float L = org.telegram.messenger.g0.L(18.0f) / 2.0f;
        float L2 = (rectF.left + L) - org.telegram.messenger.g0.L(6.0f);
        float L3 = (rectF.top + L) - org.telegram.messenger.g0.L(6.0f);
        canvas.drawCircle(L2, L3, org.telegram.messenger.g0.L(2.0f) + L, org.telegram.ui.ActionBar.k6.Cm);
        canvas.drawCircle(L2, L3, L, this.E);
        if (this.H == null) {
            Drawable mutate = getContext().getResources().getDrawable(2131231976).mutate();
            this.H = mutate;
            int i3 = this.f32193j0;
            this.I = i3;
            mutate.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
        }
        if (this.I != this.f32193j0) {
            Drawable drawable = this.H;
            int i10 = this.f32193j0;
            this.I = i10;
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        this.H.setBounds((int) (L2 - org.telegram.messenger.g0.L(8.0f)), (int) (L3 - org.telegram.messenger.g0.L(8.0f)), (int) (L2 + org.telegram.messenger.g0.L(8.0f)), (int) (L3 + org.telegram.messenger.g0.L(8.0f)));
        this.H.draw(canvas);
        canvas.restore();
    }

    public final void e(int i3, boolean z10) {
        String str = "";
        if (i3 > 0) {
            str = k2.p1.i(i3, "");
        }
        this.f32185d0.t(str, z10, true);
        invalidate();
    }

    public final void f(boolean z10) {
        long j10;
        boolean z11;
        float f10 = -3.0f;
        boolean z12 = false;
        if (this.U == z10 && (!z10 || Math.abs(this.V - (-3.0f)) < 0.01f)) {
            boolean z13 = this.S;
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
        this.S = z12;
        if (!this.U && z10) {
            this.f32180a0.e(true, 0.0f);
        }
        u5 u5Var = this.W;
        if (z10 && u5Var.f38645c >= 1.0f) {
            j10 = 650;
        } else {
            j10 = 0;
        }
        u5Var.f38647f = j10;
        this.U = z10;
        if (!z10) {
            f10 = 1.0f;
        }
        this.V = f10;
        invalidate();
    }

    @Override
    public final void g(RectF rectF) {
        float measuredWidth = (getMeasuredWidth() - org.telegram.messenger.g0.L(4.0f)) - this.N;
        float measuredHeight = (getMeasuredHeight() - org.telegram.messenger.g0.L(4.0f)) - this.O;
        rectF.set(measuredWidth - getCircleWidth(), measuredHeight - getCircleHeight(), measuredWidth, measuredHeight);
    }

    public int getCircleHeight() {
        int i3 = this.K;
        if (i3 >= 0) {
            return i3;
        }
        return getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f);
    }

    public int getCircleWidth() {
        int i3 = this.J;
        if (i3 >= 0) {
            return i3;
        }
        return getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f);
    }

    public int getFillColor() {
        return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Me, this.f32179a);
    }

    @Override
    public final void h(Canvas canvas, float f10) {
        float T1;
        float T12;
        float W1;
        float f11;
        float f12;
        float f13;
        int i3 = this.L;
        if (i3 != 0) {
            Paint paint = this.M;
            paint.setColor(i3);
            paint.setAlpha((int) (Color.alpha(this.L) * f10));
            float f14 = this.Q.f38645c;
            float f15 = this.f32202y.f38645c;
            if (this.f32192i0) {
                T1 = org.telegram.messenger.g0.T1(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(4.0f), f14) - this.N;
                W1 = getCircleHeight() * f14;
                T12 = ((getMeasuredHeight() - this.O) - org.telegram.messenger.g0.L(4.0f)) - (W1 / 2.0f);
            } else {
                T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.T1(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(4.0f), f14) - this.N, getMeasuredWidth() - org.telegram.messenger.g0.L(9.0f), f15);
                T12 = org.telegram.messenger.g0.T1(((getMeasuredHeight() - this.O) - org.telegram.messenger.g0.L(4.0f)) - (getCircleHeight() / 2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(24.0f), f15);
                W1 = org.telegram.messenger.g0.W1(f15, getCircleHeight(), org.telegram.messenger.g0.L(32.0f)) * f14;
            }
            float circleWidth = getCircleWidth();
            if (this.F) {
                f11 = 20.0f;
            } else {
                f11 = 22.0f;
            }
            float T13 = org.telegram.messenger.g0.T1(circleWidth, this.f32201x.c() + org.telegram.messenger.g0.L(f11), f15) * f14;
            if (f14 > 0.0f && T13 > 0.0f && W1 > 0.0f) {
                RectF rectF = org.telegram.messenger.g0.P;
                float f16 = W1 / 2.0f;
                rectF.set(T1 - T13, T12 - f16, T1, f16 + T12);
                rectF.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
                float min = (Math.min(T13, W1) / 2.0f) + org.telegram.messenger.g0.L(4.0f);
                canvas.drawRoundRect(rectF, min, min, paint);
            }
            g6 g6Var = this.f32185d0;
            float i10 = (1.0f - f15) * g6Var.i();
            if (i10 > 0.0f) {
                float max = Math.max(g6Var.c() + org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(18.0f));
                if (this.f32192i0) {
                    f12 = T1 - org.telegram.messenger.g0.L(50.0f);
                    f13 = (max / 2.0f) + (T12 - (getCircleHeight() / 2.0f));
                } else {
                    float f17 = max / 2.0f;
                    float measuredWidth = (getMeasuredWidth() - this.N) - f17;
                    float measuredHeight = (getMeasuredHeight() - this.O) - f17;
                    f12 = measuredWidth;
                    f13 = measuredHeight;
                }
                canvas.drawCircle(f12, f13, ((max / 2.0f) + org.telegram.messenger.g0.L(2.0f)) * i10 * this.f32187e0, paint);
            }
        }
        draw(canvas);
    }

    public final void i(int i3, long j10, boolean z10) {
        if (this.f32198r == j10 && this.f32199s == i3) {
            return;
        }
        this.f32198r = j10;
        this.f32199s = i3;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        boolean z11 = false;
        g6 g6Var = this.f32201x;
        if (i10 > 0) {
            g6Var.t(ci.wb.Y0(false, k2.p1.l(j10 * Math.max(1, this.f32199s), ',', new StringBuilder("⭐️")), this.P), z10, true);
        } else {
            g6Var.t("", z10, true);
        }
        if (!z10) {
            if (this.f32198r > 0) {
                z11 = true;
            }
            this.f32202y.a(z11);
            return;
        }
        invalidate();
    }

    public boolean j() {
        return this instanceof ih;
    }

    public final void k() {
        int w02;
        boolean z10 = this.F;
        org.telegram.ui.ActionBar.e6 e6Var = this.f32179a;
        if (z10) {
            w02 = -1;
        } else {
            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Me, e6Var);
        }
        int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kl, e6Var);
        int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Qf, e6Var);
        if (w02 != this.f32193j0 || w03 != this.f32194k0 || w04 != this.f32195l0) {
            this.f32193j0 = w02;
            this.f32194k0 = w03;
            this.f32195l0 = w04;
            Drawable drawable = this.f32183c;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            this.d.setColorFilter(new PorterDuffColorFilter(Color.argb(180, Color.red(w03), Color.green(w03), Color.blue(w03)), mode));
            this.f32186e.setColorFilter(new PorterDuffColorFilter(w04, mode));
        }
        boolean z11 = this.F;
        Paint paint = this.E;
        if (z11) {
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Me, e6Var));
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
        if (this.f32198r > 0) {
            f12 = 1.0f;
        }
        float circleWidth = this.N + getCircleWidth() + this.N;
        int L = org.telegram.messenger.g0.L(18.0f);
        if (this.F) {
            f11 = 20.0f;
        } else {
            f11 = 22.0f;
        }
        return (int) org.telegram.messenger.g0.T1(circleWidth, org.telegram.messenger.g0.L(f11) + L + this.f32201x.d, f12 * f10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Drawable drawable;
        int C;
        int measuredHeight;
        boolean z10;
        float f10;
        float f11;
        float f12;
        float T1;
        float T12;
        float W1;
        float f13;
        float f14;
        float f15;
        int i3;
        float f16;
        float f17;
        Paint paint;
        float measuredWidth;
        float measuredHeight2;
        float f18;
        float f19;
        int i10;
        int i11;
        float f20;
        float f21;
        float f22;
        Drawable drawable2;
        int i12;
        int save = canvas.save();
        if (!this.F) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
        }
        k();
        float N = org.telegram.messenger.g0.N(3.0f);
        float N2 = org.telegram.messenger.g0.N(38.0f);
        float N3 = org.telegram.messenger.g0.N(20.0f);
        g6 g6Var = this.f32201x;
        float T13 = org.telegram.messenger.g0.T1(Math.max(N2, g6Var.c() + N3), N2, this.f32196n);
        RectF rectF = this.f32197n0;
        rectF.set((getMeasuredWidth() - T13) - N, (getMeasuredHeight() - N2) - N, getMeasuredWidth() - N, getMeasuredHeight() - N);
        boolean z11 = this.F;
        Paint paint2 = this.E;
        if (z11) {
            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(19.0f), paint2);
        }
        if (c()) {
            drawable = this.d;
        } else {
            drawable = this.f32183c;
        }
        Drawable drawable3 = drawable;
        if (this.F) {
            C = Math.round((rectF.right - (rectF.height() / 2.0f)) - (drawable3.getIntrinsicWidth() / 2.0f));
            measuredHeight = Math.round(((rectF.height() / 2.0f) + rectF.top) - (drawable3.getIntrinsicHeight() / 2.0f));
        } else {
            C = org.telegram.ui.Cells.f1.C(2, getMeasuredWidth() - (getMeasuredHeight() / 2), drawable3);
            measuredHeight = (getMeasuredHeight() - drawable3.getIntrinsicHeight()) / 2;
            if (b()) {
                measuredHeight -= org.telegram.messenger.g0.L(1.0f);
            } else {
                C += org.telegram.messenger.g0.L(2.0f);
            }
        }
        int i13 = C;
        int i14 = measuredHeight;
        float d = this.W.d(this.U);
        float d10 = this.Q.d(d());
        if (this.f32198r > 0 && !this.f32200w) {
            z10 = true;
        } else {
            z10 = false;
        }
        float d11 = (1.0f - this.h) * this.f32202y.d(z10);
        float e10 = this.f32189f0.e(false, 1.0f);
        if (d10 < 1.0f) {
            canvas2.save();
            f12 = 2.0f;
            float f23 = 1.0f - e10;
            canvas2.translate((-org.telegram.messenger.g0.L(24.0f)) * f23, org.telegram.messenger.g0.L(24.0f) * f23);
            float T14 = org.telegram.messenger.g0.T1(0.35f, 1.0f, e10);
            float f24 = i13;
            f11 = 1.0f;
            float f25 = i14;
            f10 = d;
            canvas2.scale(T14, T14, (drawable3.getIntrinsicWidth() / 2.0f) + f24, (drawable3.getIntrinsicHeight() / 2.0f) + f25);
            canvas2.rotate(60.0f * f23, (drawable3.getIntrinsicWidth() / 2.0f) + f24, (drawable3.getIntrinsicHeight() / 2.0f) + f25);
            drawable3.setBounds(i13, i14, drawable3.getIntrinsicWidth() + i13, drawable3.getIntrinsicHeight() + i14);
            drawable3.setAlpha((int) ((1.0f - d11) * 255.0f));
            drawable3.draw(canvas2);
            canvas2.restore();
        } else {
            f10 = d;
            f11 = 1.0f;
            f12 = 2.0f;
        }
        if (this.f32192i0) {
            T1 = org.telegram.messenger.g0.T1(getMeasuredWidth() - (getMeasuredHeight() / f12), getMeasuredWidth() - org.telegram.messenger.g0.L(4.0f), d10) - this.N;
            W1 = getCircleHeight() * d10;
            T12 = ((getMeasuredHeight() - this.O) - org.telegram.messenger.g0.L(4.0f)) - (W1 / f12);
        } else {
            T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.T1(getMeasuredWidth() - (getMeasuredHeight() / f12), getMeasuredWidth() - org.telegram.messenger.g0.L(4.0f), d10) - this.N, getMeasuredWidth() - org.telegram.messenger.g0.L(9.0f), d11);
            T12 = org.telegram.messenger.g0.T1(((getMeasuredHeight() - this.O) - org.telegram.messenger.g0.L(4.0f)) - (getCircleHeight() / f12), getMeasuredHeight() - org.telegram.messenger.g0.L(24.0f), d11);
            W1 = org.telegram.messenger.g0.W1(d11, getCircleHeight(), org.telegram.messenger.g0.L(32.0f)) * d10;
        }
        float f26 = T12;
        float f27 = T1;
        float circleWidth = getCircleWidth();
        if (this.F) {
            f13 = 20.0f;
        } else {
            f13 = 22.0f;
        }
        float T15 = org.telegram.messenger.g0.T1(circleWidth, g6Var.c() + org.telegram.messenger.g0.L(f13), d11);
        float T16 = org.telegram.messenger.g0.T1(T15, W1, this.f32196n) * d10;
        float f28 = T15 - T16;
        float f29 = f27 - (T16 / f12);
        setPivotX(f29);
        setPivotY(f26);
        float T17 = org.telegram.messenger.g0.T1(f11, 0.79f, this.h);
        if (d10 > 0.0f) {
            canvas2.save();
            Path path = this.f32182b0;
            path.rewind();
            f14 = 0.0f;
            float min = Math.min(T16, W1) / f12;
            RectF rectF2 = org.telegram.messenger.g0.P;
            float f30 = W1 / f12;
            float f31 = f26 - f30;
            float f32 = f26 + f30;
            rectF2.set(f27 - T16, f31, f27, f32);
            path.addRoundRect(rectF2, min, min, Path.Direction.CW);
            float centerX = rectF2.centerX();
            float centerY = rectF2.centerY();
            if (this.h > 0.0f) {
                if (this.f32190g0 == null) {
                    f16 = f27;
                    this.f32190g0 = getContext().getResources().getDrawable(2131232691);
                } else {
                    f16 = f27;
                }
                i3 = save;
                this.f32190g0.setColorFilter(paint2.getColor(), PorterDuff.Mode.MULTIPLY);
                cg.r.d(this.f32190g0, centerX, centerY, 17);
                cg.r.b(canvas2, this.f32190g0, this.h);
            } else {
                i3 = save;
                f16 = f27;
            }
            canvas2.scale(T17, T17, centerX, centerY);
            if (this.f32191h0 != null) {
                Rect rect = org.telegram.messenger.g0.Q;
                rectF2.round(rect);
                rect.inset(-org.telegram.messenger.g0.L(7.0f), -org.telegram.messenger.g0.L(7.0f));
                this.f32191h0.setBounds(rect);
                this.f32191h0.draw(canvas2);
            }
            if (!this.F) {
                canvas2.drawPath(path, paint2);
            }
            canvas2.clipPath(path);
            int i15 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i15 > 0) {
                Paint paint3 = this.f32184c0;
                paint3.setColor(-1);
                paint3.setAlpha((int) (f10 * 255.0f));
                float L = org.telegram.messenger.g0.L(8.66f);
                rectF2.set(f29 - L, f26 - L, f29 + L, f26 + L);
                if (this.S) {
                    long currentTimeMillis = System.currentTimeMillis() % 5400;
                    float f33 = ((float) (1520 * currentTimeMillis)) / 5400.0f;
                    float max = Math.max(0.0f, f33 - 20.0f);
                    int i16 = 0;
                    while (i16 < 4) {
                        long j10 = currentTimeMillis;
                        w1.a aVar = this.T;
                        f33 += aVar.getInterpolation(((float) (j10 - (i16 * 1350))) / 667.0f) * 250.0f;
                        max += aVar.getInterpolation(((float) (j10 - (i12 + 667))) / 667.0f) * 250.0f;
                        i16++;
                        currentTimeMillis = j10;
                    }
                    canvas2 = canvas;
                    f19 = f10;
                    i10 = i14;
                    f14 = 0.0f;
                    f15 = d11;
                    i11 = i15;
                    f17 = f26;
                    f20 = f29;
                    paint = paint2;
                    f21 = f32;
                    canvas2.drawArc(org.telegram.messenger.g0.P, max, f33 - max, false, paint3);
                } else {
                    f19 = f10;
                    i10 = i14;
                    f15 = d11;
                    i11 = i15;
                    f17 = f26;
                    f20 = f29;
                    paint = paint2;
                    f21 = f32;
                    canvas2 = canvas;
                    canvas2.drawArc(rectF2, (-90.0f) + (((((float) (System.currentTimeMillis() % 3000)) / 1000.0f) * 120.0f) % 360.0f), this.f32180a0.e(false, this.V) * 360.0f, false, paint3);
                }
                canvas2.save();
                float T18 = org.telegram.messenger.g0.T1(1.0f, 0.6f, f19);
                canvas2.scale(T18, T18, f20, f17);
                invalidate();
            } else {
                f19 = f10;
                i10 = i14;
                f15 = d11;
                i11 = i15;
                f17 = f26;
                f20 = f29;
                paint = paint2;
                f21 = f32;
            }
            if (f15 > f14) {
                if (this.f32192i0) {
                    g6Var.o((f16 - g6Var.d) - org.telegram.messenger.g0.L(11.0f), f31, f16 - org.telegram.messenger.g0.L(11.0f), f21);
                } else if (this.F) {
                    g6Var.o(rectF.left + org.telegram.messenger.g0.L(10.0f), rectF.top, rectF.right, rectF.bottom);
                } else {
                    g6Var.o((getMeasuredWidth() - g6Var.d) - org.telegram.messenger.g0.L(20.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(20.0f), getMeasuredHeight());
                }
                f22 = 1.0f;
                g6Var.B = (int) ((1.0f - f19) * f15 * 255.0f);
                g6Var.draw(canvas2);
            } else {
                f22 = 1.0f;
            }
            this.f32186e.setAlpha((int) ((f22 - f15) * (f22 - f19) * 255.0f));
            if (this.J > 0) {
                this.f32186e.setBounds((int) (f20 - (drawable2.getIntrinsicWidth() / f12)), (int) (f17 - (this.f32186e.getIntrinsicHeight() / f12)), (int) ((this.f32186e.getIntrinsicWidth() / f12) + f20), (int) ((this.f32186e.getIntrinsicHeight() / f12) + f17));
            } else {
                this.f32186e.setBounds(i13, i10, drawable3.getIntrinsicWidth() + i13, drawable3.getIntrinsicHeight() + i10);
            }
            this.f32186e.draw(canvas2);
            if (i11 > 0) {
                canvas2.restore();
            }
            canvas2.restore();
        } else {
            f14 = 0.0f;
            f15 = d11;
            i3 = save;
            f16 = f27;
            f17 = f26;
            paint = paint2;
        }
        g6 g6Var2 = this.f32185d0;
        float i17 = (1.0f - f15) * g6Var2.i();
        if (!this.G) {
            float max2 = Math.max(g6Var2.c() + org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(18.0f));
            if (this.f32192i0) {
                measuredWidth = (f16 - org.telegram.messenger.g0.L(50.0f)) + f28;
                measuredHeight2 = (max2 / f12) + (f17 - (getCircleHeight() / f12));
                f18 = org.telegram.messenger.g0.L(0.66f);
            } else {
                float f34 = max2 / f12;
                measuredWidth = (getMeasuredWidth() - this.N) - f34;
                measuredHeight2 = (getMeasuredHeight() - this.O) - f34;
                f18 = f14;
            }
            float f35 = max2 / f12;
            g6Var2.setBounds((int) (measuredWidth - f35), (int) ((measuredHeight2 - f35) - f18), (int) (measuredWidth + f35), (int) ((measuredHeight2 + f35) - f18));
            if (i17 > f14) {
                float T19 = org.telegram.messenger.g0.T1(1.0f, 0.85f, this.h);
                canvas2.save();
                canvas2.scale(T19, T19, measuredWidth, measuredHeight2);
                if (!this.F) {
                    canvas2.drawCircle(measuredWidth, measuredHeight2, (org.telegram.messenger.g0.L(f12) + f35) * i17 * this.f32187e0, org.telegram.ui.ActionBar.k6.Cm);
                    canvas2.drawCircle(measuredWidth, measuredHeight2, f35 * i17 * this.f32187e0, paint);
                }
                g6Var2.B = (int) (i17 * 255.0f);
                g6Var2.draw(canvas2);
                canvas2.restore();
            }
        }
        if (i17 < 1.0f) {
            int L2 = org.telegram.messenger.g0.L(8.0f);
            float f36 = f15;
            int T110 = (int) org.telegram.messenger.g0.T1(((getMeasuredWidth() - (getCircleWidth() / f12)) - this.N) + org.telegram.messenger.g0.L(12.0f), f16 - org.telegram.messenger.g0.L(f12), f36);
            int T111 = (int) org.telegram.messenger.g0.T1(((getMeasuredHeight() - (getCircleHeight() / f12)) - this.O) + org.telegram.messenger.g0.L(10.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(12.0f), f36);
            int i18 = T110 - L2;
            int i19 = T111 - L2;
            int i20 = T110 + L2;
            int i21 = T111 + L2;
            e5 e5Var = this.f32188f;
            e5Var.setBounds(i18, i19, i20, i21);
            e5Var.f33290w = (int) ((1.0f - i17) * 255.0f);
            e5Var.draw(canvas2);
        }
        if (!this.F) {
            canvas2.restore();
        }
        canvas2.restoreToCount(i3);
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bg.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBlurredBackgroundDrawable(gh.g gVar) {
        this.f32191h0 = gVar;
        gVar.r(org.telegram.messenger.g0.L(22.0f));
        this.f32191h0.q(org.telegram.messenger.g0.L(4.0f));
    }

    public void setCircleSize(int i3) {
        this.J = i3;
        this.K = i3;
    }

    public void setEffect(long j10) {
        org.telegram.messenger.e6 e6Var;
        TLRPC.TL_availableEffect Z0 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).Z0(j10);
        if (Z0 != null) {
            e6Var = org.telegram.messenger.i6.g(Z0.emoticon);
        } else {
            e6Var = null;
        }
        setEmoji(e6Var);
    }

    public void setEmoji(Drawable drawable) {
        this.f32188f.g(drawable, true);
    }

    public void setEphemeralFactor(float f10) {
        if (this.h != f10) {
            this.h = f10;
            invalidate();
        }
    }

    public void setLocked(boolean z10) {
        if (this.G == z10) {
            return;
        }
        this.G = z10;
        invalidate();
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.R.c(z10);
    }

    public void setResourceId(int i3) {
        if (this.f32181b != i3) {
            this.f32181b = i3;
            this.f32183c = getContext().getResources().getDrawable(i3).mutate();
            this.d = getContext().getResources().getDrawable(i3).mutate();
            this.f32186e = getContext().getResources().getDrawable(i3).mutate();
            invalidate();
        }
    }

    public void setSameWidthFactor(float f10) {
        if (this.f32196n != f10) {
            this.f32196n = f10;
            invalidate();
        }
    }

    public void setScrimViewBackgroundColor(int i3) {
        this.L = i3;
        this.M.setColor(i3);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f32185d0 && drawable != this.f32188f && drawable != this.f32201x && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
