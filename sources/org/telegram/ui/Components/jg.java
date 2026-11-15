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
public abstract class jg extends View implements l60 {
    public final g6 E;
    public final u5 F;
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
    public final eq[] R;
    public final u5 S;
    public final dc T;
    public boolean U;
    public final x1.a V;
    public boolean W;
    public boolean f35963a;
    public float f35964a0;
    public final u5 f35965b;
    public final u5 f35966b0;
    public final org.telegram.ui.ActionBar.e6 f35967c;
    public final u5 f35968c0;
    public int d;
    public final Path f35969d0;
    public Drawable f35970e;
    public final Paint f35971e0;
    public Drawable f35972f;
    public final g6 f35973f0;
    public float f35974g0;
    public Drawable h;
    public float f35975h0;
    public float f35976i0;
    public float f35977j0;
    public int f35978k0;
    public int f35979l0;
    public boolean m0;
    public final e5 f35980n;
    public final u5 f35981n0;
    public Drawable f35982o0;
    public fh.g f35983p0;
    public boolean f35984q0;
    public float f35985r;
    public int f35986r0;
    public float f35987s;
    public int f35988s0;
    public int f35989t0;
    public ValueAnimator f35990u0;
    public final RectF f35991v0;
    public long f35992w;
    public int f35993x;
    public boolean f35994y;

    public jg(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        er erVar = er.h;
        this.f35965b = new u5(this, 0L, 260L, erVar);
        this.F = new u5(this, 0L, 320L, erVar);
        this.G = new Paint(1);
        this.L = -1;
        this.M = -1;
        this.O = new Paint(1);
        this.R = new eq[1];
        this.S = new u5(this, 0L, 420L, erVar);
        this.T = new dc(this);
        this.V = new x1.a();
        this.f35966b0 = new u5(this, 0L, 420L, erVar);
        this.f35968c0 = new u5(this, 0L, 500L, erVar);
        this.f35969d0 = new Path();
        Paint paint = new Paint(1);
        this.f35971e0 = paint;
        g6 g6Var = new g6(true, true, true);
        this.f35973f0 = g6Var;
        this.f35974g0 = 1.0f;
        this.f35981n0 = new u5(this, 0L, 320L, erVar);
        this.f35991v0 = new RectF();
        this.d = i7;
        this.f35967c = e6Var;
        this.H = z10;
        g6 g6Var2 = new g6(false, false, false);
        this.E = g6Var2;
        g6Var2.w(org.telegram.messenger.g0.L(15.0f));
        g6Var2.x(org.telegram.messenger.g0.o());
        g6Var2.u(-1);
        g6Var2.f34833b = 3;
        g6Var2.setCallback(this);
        g6Var2.N = org.telegram.messenger.g0.f23611q.x;
        this.f35970e = i5.c.g(context, i7);
        this.f35972f = i5.c.g(context, i7);
        this.h = i5.c.g(context, i7);
        this.f35980n = new e5(org.telegram.messenger.g0.L(14.0f), this);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        g6Var.setCallback(this);
        g6Var.u(-1);
        g6Var.w(org.telegram.messenger.g0.L(12.0f));
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.f34833b = 17;
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f35990u0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
        this.f35990u0 = ofFloat;
        ofFloat.addUpdateListener(new c6(this, 8));
        this.f35990u0.addListener(new x5(this, 7));
        this.f35990u0.setDuration(180L);
        this.f35990u0.setInterpolator(new OvershootInterpolator());
        this.f35990u0.start();
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
        RectF rectF = this.f35991v0;
        float L = org.telegram.messenger.g0.L(18.0f) / 2.0f;
        float L2 = (rectF.left + L) - org.telegram.messenger.g0.L(6.0f);
        float L3 = (rectF.top + L) - org.telegram.messenger.g0.L(6.0f);
        canvas.drawCircle(L2, L3, org.telegram.messenger.g0.L(2.0f) + L, org.telegram.ui.ActionBar.j6.Fm);
        canvas.drawCircle(L2, L3, L, this.G);
        if (this.J == null) {
            Drawable mutate = getContext().getResources().getDrawable(2131231976).mutate();
            this.J = mutate;
            int i7 = this.f35986r0;
            this.K = i7;
            mutate.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
        }
        if (this.K != this.f35986r0) {
            Drawable drawable = this.J;
            int i10 = this.f35986r0;
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
        this.f35973f0.t(str, z10, true);
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
        if (this.W == z10 && (!z10 || Math.abs(this.f35964a0 - (-3.0f)) < 0.01f)) {
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
            this.f35968c0.e(true, 0.0f);
        }
        u5 u5Var = this.f35966b0;
        if (z10 && u5Var.f39900c >= 1.0f) {
            j3 = 650;
        } else {
            j3 = 0;
        }
        u5Var.f39902f = j3;
        this.W = z10;
        if (!z10) {
            f10 = 1.0f;
        }
        this.f35964a0 = f10;
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
        return org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Pe, this.f35967c);
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
            float f14 = this.S.f39900c;
            float f15 = this.F.f39900c;
            if (this.f35984q0) {
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
            g6 g6Var = this.f35973f0;
            float i10 = (1.0f - f15) * g6Var.i();
            if (i10 > 0.0f) {
                float max = Math.max(g6Var.c() + org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(18.0f));
                if (this.f35984q0) {
                    f12 = T1 - org.telegram.messenger.g0.L(50.0f);
                    f13 = (max / 2.0f) + (T12 - (getCircleHeight() / 2.0f));
                } else {
                    float f17 = max / 2.0f;
                    float measuredWidth = (getMeasuredWidth() - this.P) - f17;
                    float measuredHeight = (getMeasuredHeight() - this.Q) - f17;
                    f12 = measuredWidth;
                    f13 = measuredHeight;
                }
                canvas.drawCircle(f12, f13, ((max / 2.0f) + org.telegram.messenger.g0.L(2.0f)) * i10 * this.f35974g0, paint);
            }
        }
        draw(canvas);
    }

    public final void i(int i7, long j3, boolean z10) {
        if (this.f35992w == j3 && this.f35993x == i7) {
            return;
        }
        this.f35992w = j3;
        this.f35993x = i7;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        boolean z11 = false;
        g6 g6Var = this.E;
        if (i10 > 0) {
            g6Var.t(di.lb.Y0(false, i5.c.l(j3 * Math.max(1, this.f35993x), ',', new StringBuilder("⭐️")), this.R), z10, true);
        } else {
            g6Var.t("", z10, true);
        }
        if (!z10) {
            if (this.f35992w > 0) {
                z11 = true;
            }
            this.F.a(z11);
            return;
        }
        invalidate();
    }

    public boolean j() {
        return this instanceof sh;
    }

    public final void k() {
        int w02;
        boolean z10 = this.H;
        org.telegram.ui.ActionBar.e6 e6Var = this.f35967c;
        if (z10) {
            w02 = -1;
        } else {
            w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Pe, e6Var);
        }
        int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Nl, e6Var);
        int w04 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Tf, e6Var);
        if (w02 != this.f35986r0 || w03 != this.f35988s0 || w04 != this.f35989t0) {
            this.f35986r0 = w02;
            this.f35988s0 = w03;
            this.f35989t0 = w04;
            Drawable drawable = this.f35970e;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            this.f35972f.setColorFilter(new PorterDuffColorFilter(Color.argb(180, Color.red(w03), Color.green(w03), Color.blue(w03)), mode));
            this.h.setColorFilter(new PorterDuffColorFilter(w04, mode));
        }
        boolean z11 = this.H;
        Paint paint = this.G;
        if (z11) {
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Pe, e6Var));
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
        if (this.f35992w > 0) {
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
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Drawable drawable;
        int A;
        int measuredHeight;
        boolean z10;
        float f10;
        float T1;
        float T12;
        float W1;
        float f11;
        float f12;
        float f13;
        int i7;
        Paint paint;
        float f14;
        float f15;
        float measuredWidth;
        float measuredHeight2;
        float f16;
        float f17;
        int i10;
        float f18;
        int i11;
        float f19;
        float f20;
        Drawable drawable2;
        int i12;
        int save = canvas.save();
        if (!this.H) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
        }
        k();
        float N = org.telegram.messenger.g0.N(3.0f);
        float N2 = org.telegram.messenger.g0.N(38.0f);
        float N3 = org.telegram.messenger.g0.N(20.0f);
        g6 g6Var = this.E;
        float T13 = org.telegram.messenger.g0.T1(Math.max(N2, g6Var.c() + N3), N2, this.f35987s);
        RectF rectF = this.f35991v0;
        rectF.set((getMeasuredWidth() - T13) - N, (getMeasuredHeight() - N2) - N, getMeasuredWidth() - N, getMeasuredHeight() - N);
        boolean z11 = this.H;
        Paint paint2 = this.G;
        if (z11) {
            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(19.0f), paint2);
        }
        if (c()) {
            drawable = this.f35972f;
        } else {
            drawable = this.f35970e;
        }
        Drawable drawable3 = drawable;
        if (this.H) {
            A = Math.round((rectF.right - (rectF.height() / 2.0f)) - (drawable3.getIntrinsicWidth() / 2.0f));
            measuredHeight = Math.round(((rectF.height() / 2.0f) + rectF.top) - (drawable3.getIntrinsicHeight() / 2.0f));
        } else {
            A = org.telegram.ui.Cells.y0.A(2, getMeasuredWidth() - (getMeasuredHeight() / 2), drawable3);
            measuredHeight = (getMeasuredHeight() - drawable3.getIntrinsicHeight()) / 2;
            if (b()) {
                measuredHeight -= org.telegram.messenger.g0.L(1.0f);
            } else {
                A += org.telegram.messenger.g0.L(2.0f);
            }
        }
        int i13 = A;
        int i14 = measuredHeight;
        float d = this.f35966b0.d(this.W);
        float d2 = this.S.d(d());
        if (this.f35992w > 0 && !this.f35994y) {
            z10 = true;
        } else {
            z10 = false;
        }
        float d10 = (1.0f - this.f35985r) * this.F.d(z10);
        float e10 = this.f35981n0.e(false, 1.0f);
        if (d2 < 1.0f) {
            canvas2.save();
            float f21 = 1.0f - e10;
            canvas2.translate((-org.telegram.messenger.g0.L(24.0f)) * f21, org.telegram.messenger.g0.L(24.0f) * f21);
            float T14 = org.telegram.messenger.g0.T1(0.35f, 1.0f, e10);
            float f22 = i13;
            float f23 = i14;
            f10 = d;
            canvas2.scale(T14, T14, (drawable3.getIntrinsicWidth() / 2.0f) + f22, (drawable3.getIntrinsicHeight() / 2.0f) + f23);
            canvas2.rotate(60.0f * f21, (drawable3.getIntrinsicWidth() / 2.0f) + f22, (drawable3.getIntrinsicHeight() / 2.0f) + f23);
            drawable3.setBounds(i13, i14, drawable3.getIntrinsicWidth() + i13, drawable3.getIntrinsicHeight() + i14);
            drawable3.setAlpha((int) (org.telegram.messenger.g0.T1(1.0f, 0.6f, this.f35965b.d(this.f35963a)) * (1.0f - d10) * 255.0f));
            drawable3.draw(canvas2);
            canvas2.restore();
        } else {
            f10 = d;
        }
        if (this.f35984q0) {
            T1 = org.telegram.messenger.g0.T1(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(4.0f), d2) - this.P;
            W1 = getCircleHeight() * d2;
            T12 = ((getMeasuredHeight() - this.Q) - org.telegram.messenger.g0.L(4.0f)) - (W1 / 2.0f);
        } else {
            T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.T1(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(4.0f), d2) - this.P, getMeasuredWidth() - org.telegram.messenger.g0.L(9.0f), d10);
            T12 = org.telegram.messenger.g0.T1(((getMeasuredHeight() - this.Q) - org.telegram.messenger.g0.L(4.0f)) - (getCircleHeight() / 2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(24.0f), d10);
            W1 = org.telegram.messenger.g0.W1(d10, getCircleHeight(), org.telegram.messenger.g0.L(32.0f)) * d2;
        }
        float f24 = T12;
        float f25 = T1;
        float circleWidth = getCircleWidth();
        if (this.H) {
            f11 = 20.0f;
        } else {
            f11 = 22.0f;
        }
        float T15 = org.telegram.messenger.g0.T1(circleWidth, g6Var.c() + org.telegram.messenger.g0.L(f11), d10);
        float T16 = org.telegram.messenger.g0.T1(T15, W1, this.f35987s) * d2;
        float f26 = T15 - T16;
        float f27 = f25 - (T16 / 2.0f);
        setPivotX(f27);
        setPivotY(f24);
        float T17 = org.telegram.messenger.g0.T1(1.0f, 0.79f, this.f35985r);
        if (d2 > 0.0f) {
            canvas2.save();
            Path path = this.f35969d0;
            path.rewind();
            f12 = 0.0f;
            float min = Math.min(T16, W1) / 2.0f;
            RectF rectF2 = org.telegram.messenger.g0.P;
            float f28 = W1;
            float f29 = f25 - T16;
            float f30 = f28 / 2.0f;
            float f31 = f24 - f30;
            i7 = save;
            float f32 = f24 + f30;
            rectF2.set(f29, f31, f25, f32);
            path.addRoundRect(rectF2, min, min, Path.Direction.CW);
            float centerX = rectF2.centerX();
            float centerY = rectF2.centerY();
            f14 = f25;
            if (this.f35985r > 0.0f) {
                if (this.f35982o0 == null) {
                    f13 = d10;
                    this.f35982o0 = getContext().getResources().getDrawable(2131232694);
                } else {
                    f13 = d10;
                }
                f17 = f30;
                this.f35982o0.setColorFilter(paint2.getColor(), PorterDuff.Mode.MULTIPLY);
                bg.s.d(this.f35982o0, centerX, centerY, 17);
                bg.s.b(canvas2, this.f35982o0, this.f35985r);
            } else {
                f13 = d10;
                f17 = f30;
            }
            canvas2.scale(T17, T17, centerX, centerY);
            if (this.f35983p0 != null) {
                Rect rect = org.telegram.messenger.g0.Q;
                rectF2.round(rect);
                rect.inset(-org.telegram.messenger.g0.L(7.0f), -org.telegram.messenger.g0.L(7.0f));
                this.f35983p0.setBounds(rect);
                this.f35983p0.draw(canvas2);
            }
            if (!this.H) {
                canvas2.drawPath(path, paint2);
            }
            canvas2.clipPath(path);
            int i15 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i15 > 0) {
                Paint paint3 = this.f35971e0;
                paint3.setColor(-1);
                paint3.setAlpha((int) (f10 * 255.0f));
                float L = org.telegram.messenger.g0.L(8.66f);
                rectF2.set(f27 - L, f24 - L, f27 + L, f24 + L);
                if (this.U) {
                    long currentTimeMillis = System.currentTimeMillis() % 5400;
                    float f33 = ((float) (1520 * currentTimeMillis)) / 5400.0f;
                    float max = Math.max(0.0f, f33 - 20.0f);
                    int i16 = 0;
                    while (i16 < 4) {
                        long j3 = currentTimeMillis;
                        x1.a aVar = this.V;
                        f33 += aVar.getInterpolation(((float) (j3 - (i16 * 1350))) / 667.0f) * 250.0f;
                        max += aVar.getInterpolation(((float) (j3 - (i12 + 667))) / 667.0f) * 250.0f;
                        i16++;
                        currentTimeMillis = j3;
                    }
                    canvas2 = canvas;
                    i10 = i15;
                    f18 = f10;
                    i11 = i14;
                    f15 = f24;
                    f12 = 0.0f;
                    paint = paint2;
                    f19 = f27;
                    canvas2.drawArc(org.telegram.messenger.g0.P, max, f33 - max, false, paint3);
                } else {
                    i10 = i15;
                    f18 = f10;
                    i11 = i14;
                    f15 = f24;
                    paint = paint2;
                    f19 = f27;
                    canvas2 = canvas;
                    canvas2.drawArc(rectF2, (-90.0f) + (((((float) (System.currentTimeMillis() % 3000)) / 1000.0f) * 120.0f) % 360.0f), this.f35968c0.e(false, this.f35964a0) * 360.0f, false, paint3);
                }
                canvas2.save();
                float T18 = org.telegram.messenger.g0.T1(1.0f, 0.6f, f18);
                canvas2.scale(T18, T18, f19, f15);
                invalidate();
            } else {
                i10 = i15;
                f18 = f10;
                i11 = i14;
                f15 = f24;
                paint = paint2;
                f19 = f27;
            }
            if (f13 > f12) {
                if (this.f35984q0) {
                    g6Var.o((f14 - g6Var.d) - org.telegram.messenger.g0.L(11.0f), f31, f14 - org.telegram.messenger.g0.L(11.0f), f32);
                } else if (this.H) {
                    g6Var.o(rectF.left + org.telegram.messenger.g0.L(10.0f), rectF.top, rectF.right, rectF.bottom);
                } else {
                    g6Var.o((getMeasuredWidth() - g6Var.d) - org.telegram.messenger.g0.L(20.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(20.0f), getMeasuredHeight());
                }
                f20 = 1.0f;
                g6Var.C = (int) ((1.0f - f18) * f13 * 255.0f);
                g6Var.draw(canvas2);
            } else {
                f20 = 1.0f;
            }
            this.h.setAlpha((int) ((f20 - f13) * (f20 - f18) * 255.0f));
            if (this.L > 0) {
                this.h.setBounds((int) (f19 - (drawable2.getIntrinsicWidth() / 2.0f)), (int) (f15 - (this.h.getIntrinsicHeight() / 2.0f)), (int) ((this.h.getIntrinsicWidth() / 2.0f) + f19), (int) ((this.h.getIntrinsicHeight() / 2.0f) + f15));
            } else {
                this.h.setBounds(i13, i11, drawable3.getIntrinsicWidth() + i13, drawable3.getIntrinsicHeight() + i11);
            }
            if (d2 >= 1.0f && f13 <= f12 && f18 <= f12 && T16 > f12) {
                this.f35975h0 = f19;
                this.f35976i0 = f15;
                this.f35977j0 = f17;
                this.f35978k0 = this.h.getBounds().left;
                this.f35979l0 = this.h.getBounds().top;
                this.m0 = true;
            }
            this.h.draw(canvas2);
            if (i10 > 0) {
                canvas2.restore();
            }
            canvas2.restore();
        } else {
            f12 = 0.0f;
            f13 = d10;
            i7 = save;
            paint = paint2;
            f14 = f25;
            f15 = f24;
        }
        g6 g6Var2 = this.f35973f0;
        float i17 = (1.0f - f13) * g6Var2.i();
        if (!this.I) {
            float max2 = Math.max(g6Var2.c() + org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(18.0f));
            if (this.f35984q0) {
                measuredWidth = (f14 - org.telegram.messenger.g0.L(50.0f)) + f26;
                measuredHeight2 = (max2 / 2.0f) + (f15 - (getCircleHeight() / 2.0f));
                f16 = org.telegram.messenger.g0.L(0.66f);
            } else {
                float f34 = max2 / 2.0f;
                measuredWidth = (getMeasuredWidth() - this.P) - f34;
                measuredHeight2 = (getMeasuredHeight() - this.Q) - f34;
                f16 = f12;
            }
            float f35 = max2 / 2.0f;
            g6Var2.setBounds((int) (measuredWidth - f35), (int) ((measuredHeight2 - f35) - f16), (int) (measuredWidth + f35), (int) ((measuredHeight2 + f35) - f16));
            if (i17 > f12) {
                float T19 = org.telegram.messenger.g0.T1(1.0f, 0.85f, this.f35985r);
                canvas2.save();
                canvas2.scale(T19, T19, measuredWidth, measuredHeight2);
                if (!this.H) {
                    canvas2.drawCircle(measuredWidth, measuredHeight2, (org.telegram.messenger.g0.L(2.0f) + f35) * i17 * this.f35974g0, org.telegram.ui.ActionBar.j6.Fm);
                    canvas2.drawCircle(measuredWidth, measuredHeight2, f35 * i17 * this.f35974g0, paint);
                }
                g6Var2.C = (int) (i17 * 255.0f);
                g6Var2.draw(canvas2);
                canvas2.restore();
            }
        }
        if (i17 < 1.0f) {
            int L2 = org.telegram.messenger.g0.L(8.0f);
            float f36 = f13;
            int T110 = (int) org.telegram.messenger.g0.T1(((getMeasuredWidth() - (getCircleWidth() / 2.0f)) - this.P) + org.telegram.messenger.g0.L(12.0f), f14 - org.telegram.messenger.g0.L(2.0f), f36);
            int T111 = (int) org.telegram.messenger.g0.T1(((getMeasuredHeight() - (getCircleHeight() / 2.0f)) - this.Q) + org.telegram.messenger.g0.L(10.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(12.0f), f36);
            int i18 = T110 - L2;
            int i19 = T111 - L2;
            int i20 = T110 + L2;
            int i21 = T111 + L2;
            e5 e5Var = this.f35980n;
            e5Var.setBounds(i18, i19, i20, i21);
            e5Var.f34185w = (int) ((1.0f - i17) * 255.0f);
            e5Var.draw(canvas2);
        }
        if (!this.H) {
            canvas2.restore();
        }
        canvas2.restoreToCount(i7);
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jg.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBlurredBackgroundDrawable(fh.g gVar) {
        this.f35983p0 = gVar;
        gVar.r(org.telegram.messenger.g0.L(22.0f));
        this.f35983p0.q(org.telegram.messenger.g0.L(4.0f));
    }

    public void setCircleSize(int i7) {
        this.L = i7;
        this.M = i7;
    }

    public void setEffect(long j3) {
        org.telegram.messenger.f6 f6Var;
        TLRPC.TL_availableEffect Z0 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24940t0).Z0(j3);
        if (Z0 != null) {
            f6Var = org.telegram.messenger.j6.g(Z0.emoticon);
        } else {
            f6Var = null;
        }
        setEmoji(f6Var);
    }

    public void setEmoji(Drawable drawable) {
        this.f35980n.g(drawable, true);
    }

    public void setEphemeralFactor(float f10) {
        if (this.f35985r != f10) {
            this.f35985r = f10;
            invalidate();
        }
    }

    public void setIconDimmed(boolean z10) {
        if (this.f35963a != z10) {
            this.f35963a = z10;
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
            this.f35970e = getContext().getResources().getDrawable(i7).mutate();
            this.f35972f = getContext().getResources().getDrawable(i7).mutate();
            this.h = getContext().getResources().getDrawable(i7).mutate();
            invalidate();
        }
    }

    public void setSameWidthFactor(float f10) {
        if (this.f35987s != f10) {
            this.f35987s = f10;
            invalidate();
        }
    }

    public void setScrimViewBackgroundColor(int i7) {
        this.N = i7;
        this.O.setColor(i7);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f35973f0 && drawable != this.f35980n && drawable != this.E && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
