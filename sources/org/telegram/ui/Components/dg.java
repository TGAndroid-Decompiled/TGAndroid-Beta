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
public abstract class dg extends View implements j60 {
    public final Paint D;
    public boolean E;
    public boolean F;
    public Drawable G;
    public int H;
    public int I;
    public int J;
    public int K;
    public final Paint L;
    public float M;
    public float N;
    public final wp[] O;
    public final w5 P;
    public final ic Q;
    public boolean R;
    public final x1.a S;
    public boolean T;
    public float U;
    public final w5 V;
    public final w5 W;
    public final org.telegram.ui.ActionBar.f6 f32884a;
    public final Path f32885a0;
    public int f32886b;
    public final Paint f32887b0;
    public Drawable f32888c;
    public final i6 f32889c0;
    public Drawable d;
    public float f32890d0;
    public Drawable f32891e;
    public final w5 f32892e0;
    public final g5 f32893f;
    public Drawable f32894f0;
    public fh.g f32895g0;
    public float h;
    public boolean f32896h0;
    public int f32897i0;
    public int f32898j0;
    public int f32899k0;
    public ValueAnimator f32900l0;
    public final RectF m0;
    public float f32901n;
    public long f32902r;
    public int f32903s;
    public boolean f32904w;
    public final i6 f32905x;
    public final w5 f32906y;

    public dg(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context);
        xq xqVar = xq.h;
        this.f32906y = new w5(this, 0L, 320L, xqVar);
        this.D = new Paint(1);
        this.I = -1;
        this.J = -1;
        this.L = new Paint(1);
        this.O = new wp[1];
        this.P = new w5(this, 0L, 420L, xqVar);
        this.Q = new ic(this);
        this.S = new x1.a();
        this.V = new w5(this, 0L, 420L, xqVar);
        this.W = new w5(this, 0L, 500L, xqVar);
        this.f32885a0 = new Path();
        Paint paint = new Paint(1);
        this.f32887b0 = paint;
        i6 i6Var = new i6(true, true, true);
        this.f32889c0 = i6Var;
        this.f32890d0 = 1.0f;
        this.f32892e0 = new w5(this, 0L, 320L, xqVar);
        this.m0 = new RectF();
        this.f32886b = i7;
        this.f32884a = f6Var;
        this.E = z9;
        i6 i6Var2 = new i6(false, false, false);
        this.f32905x = i6Var2;
        i6Var2.w(org.telegram.messenger.g0.L(15.0f));
        i6Var2.x(org.telegram.messenger.g0.o());
        i6Var2.u(-1);
        i6Var2.f34552b = 3;
        i6Var2.setCallback(this);
        i6Var2.M = org.telegram.messenger.g0.f22563q.x;
        this.f32888c = jg.g.h(context, i7);
        this.d = jg.g.h(context, i7);
        this.f32891e = jg.g.h(context, i7);
        this.f32893f = new g5(org.telegram.messenger.g0.L(14.0f), this);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        i6Var.setCallback(this);
        i6Var.u(-1);
        i6Var.w(org.telegram.messenger.g0.L(12.0f));
        i6Var.x(org.telegram.messenger.g0.o());
        i6Var.f34552b = 17;
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f32900l0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
        this.f32900l0 = ofFloat;
        ofFloat.addUpdateListener(new e6(this, 8));
        this.f32900l0.addListener(new z5(this, 7));
        this.f32900l0.setDuration(180L);
        this.f32900l0.setInterpolator(new OvershootInterpolator());
        this.f32900l0.start();
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
        if (!this.F) {
            super.draw(canvas);
            return;
        }
        canvas.saveLayerAlpha(-org.telegram.messenger.g0.L(6.0f), -org.telegram.messenger.g0.L(6.0f), getWidth(), getHeight(), 255, 31);
        super.draw(canvas);
        RectF rectF = this.m0;
        float L = org.telegram.messenger.g0.L(18.0f) / 2.0f;
        float L2 = (rectF.left + L) - org.telegram.messenger.g0.L(6.0f);
        float L3 = (rectF.top + L) - org.telegram.messenger.g0.L(6.0f);
        canvas.drawCircle(L2, L3, org.telegram.messenger.g0.L(2.0f) + L, org.telegram.ui.ActionBar.k6.Cm);
        canvas.drawCircle(L2, L3, L, this.D);
        if (this.G == null) {
            Drawable mutate = getContext().getResources().getDrawable(2131231976).mutate();
            this.G = mutate;
            int i7 = this.f32897i0;
            this.H = i7;
            mutate.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
        }
        if (this.H != this.f32897i0) {
            Drawable drawable = this.G;
            int i10 = this.f32897i0;
            this.H = i10;
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        this.G.setBounds((int) (L2 - org.telegram.messenger.g0.L(8.0f)), (int) (L3 - org.telegram.messenger.g0.L(8.0f)), (int) (L2 + org.telegram.messenger.g0.L(8.0f)), (int) (L3 + org.telegram.messenger.g0.L(8.0f)));
        this.G.draw(canvas);
        canvas.restore();
    }

    public final void e(int i7, boolean z9) {
        String str = "";
        if (i7 > 0) {
            str = jg.g.j(i7, "");
        }
        this.f32889c0.t(str, z9, true);
        invalidate();
    }

    public final void f(boolean z9) {
        long j3;
        boolean z10;
        float f10 = -3.0f;
        boolean z11 = false;
        if (this.T == z9 && (!z9 || Math.abs(this.U - (-3.0f)) < 0.01f)) {
            boolean z12 = this.R;
            if (Math.abs(0.0f) < 0.01f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z12 == z10) {
                return;
            }
        }
        if (Math.abs(0.0f) < 0.01f) {
            z11 = true;
        }
        this.R = z11;
        if (!this.T && z9) {
            this.W.e(true, 0.0f);
        }
        w5 w5Var = this.V;
        if (z9 && w5Var.f39805c >= 1.0f) {
            j3 = 650;
        } else {
            j3 = 0;
        }
        w5Var.f39807f = j3;
        this.T = z9;
        if (!z9) {
            f10 = 1.0f;
        }
        this.U = f10;
        invalidate();
    }

    @Override
    public final void g(RectF rectF) {
        float measuredWidth = (getMeasuredWidth() - org.telegram.messenger.g0.L(4.0f)) - this.M;
        float measuredHeight = (getMeasuredHeight() - org.telegram.messenger.g0.L(4.0f)) - this.N;
        rectF.set(measuredWidth - getCircleWidth(), measuredHeight - getCircleHeight(), measuredWidth, measuredHeight);
    }

    public int getCircleHeight() {
        int i7 = this.J;
        if (i7 >= 0) {
            return i7;
        }
        return getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f);
    }

    public int getCircleWidth() {
        int i7 = this.I;
        if (i7 >= 0) {
            return i7;
        }
        return getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f);
    }

    public int getFillColor() {
        return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Me, this.f32884a);
    }

    @Override
    public final void h(Canvas canvas, float f10) {
        float T1;
        float T12;
        float W1;
        float f11;
        float f12;
        float f13;
        int i7 = this.K;
        if (i7 != 0) {
            Paint paint = this.L;
            paint.setColor(i7);
            paint.setAlpha((int) (Color.alpha(this.K) * f10));
            float f14 = this.P.f39805c;
            float f15 = this.f32906y.f39805c;
            if (this.f32896h0) {
                T1 = org.telegram.messenger.g0.T1(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(4.0f), f14) - this.M;
                W1 = getCircleHeight() * f14;
                T12 = ((getMeasuredHeight() - this.N) - org.telegram.messenger.g0.L(4.0f)) - (W1 / 2.0f);
            } else {
                T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.T1(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(4.0f), f14) - this.M, getMeasuredWidth() - org.telegram.messenger.g0.L(9.0f), f15);
                T12 = org.telegram.messenger.g0.T1(((getMeasuredHeight() - this.N) - org.telegram.messenger.g0.L(4.0f)) - (getCircleHeight() / 2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(24.0f), f15);
                W1 = org.telegram.messenger.g0.W1(f15, getCircleHeight(), org.telegram.messenger.g0.L(32.0f)) * f14;
            }
            float circleWidth = getCircleWidth();
            if (this.E) {
                f11 = 20.0f;
            } else {
                f11 = 22.0f;
            }
            float T13 = org.telegram.messenger.g0.T1(circleWidth, this.f32905x.c() + org.telegram.messenger.g0.L(f11), f15) * f14;
            if (f14 > 0.0f && T13 > 0.0f && W1 > 0.0f) {
                RectF rectF = org.telegram.messenger.g0.P;
                float f16 = W1 / 2.0f;
                rectF.set(T1 - T13, T12 - f16, T1, f16 + T12);
                rectF.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
                float min = (Math.min(T13, W1) / 2.0f) + org.telegram.messenger.g0.L(4.0f);
                canvas.drawRoundRect(rectF, min, min, paint);
            }
            i6 i6Var = this.f32889c0;
            float i10 = (1.0f - f15) * i6Var.i();
            if (i10 > 0.0f) {
                float max = Math.max(i6Var.c() + org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(18.0f));
                if (this.f32896h0) {
                    f12 = T1 - org.telegram.messenger.g0.L(50.0f);
                    f13 = (max / 2.0f) + (T12 - (getCircleHeight() / 2.0f));
                } else {
                    float f17 = max / 2.0f;
                    float measuredWidth = (getMeasuredWidth() - this.M) - f17;
                    float measuredHeight = (getMeasuredHeight() - this.N) - f17;
                    f12 = measuredWidth;
                    f13 = measuredHeight;
                }
                canvas.drawCircle(f12, f13, ((max / 2.0f) + org.telegram.messenger.g0.L(2.0f)) * i10 * this.f32890d0, paint);
            }
        }
        draw(canvas);
    }

    public final void i(int i7, long j3, boolean z9) {
        if (this.f32902r == j3 && this.f32903s == i7) {
            return;
        }
        this.f32902r = j3;
        this.f32903s = i7;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        boolean z10 = false;
        i6 i6Var = this.f32905x;
        if (i10 > 0) {
            i6Var.t(bi.dd.Y0(false, jg.g.m(j3 * Math.max(1, this.f32903s), ',', new StringBuilder("⭐️")), this.O), z9, true);
        } else {
            i6Var.t("", z9, true);
        }
        if (!z9) {
            if (this.f32902r > 0) {
                z10 = true;
            }
            this.f32906y.a(z10);
            return;
        }
        invalidate();
    }

    public boolean j() {
        return this instanceof lh;
    }

    public final void k() {
        int w02;
        boolean z9 = this.E;
        org.telegram.ui.ActionBar.f6 f6Var = this.f32884a;
        if (z9) {
            w02 = -1;
        } else {
            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Me, f6Var);
        }
        int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kl, f6Var);
        int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Qf, f6Var);
        if (w02 != this.f32897i0 || w03 != this.f32898j0 || w04 != this.f32899k0) {
            this.f32897i0 = w02;
            this.f32898j0 = w03;
            this.f32899k0 = w04;
            Drawable drawable = this.f32888c;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            this.d.setColorFilter(new PorterDuffColorFilter(Color.argb(180, Color.red(w03), Color.green(w03), Color.blue(w03)), mode));
            this.f32891e.setColorFilter(new PorterDuffColorFilter(w04, mode));
        }
        boolean z10 = this.E;
        Paint paint = this.D;
        if (z10) {
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Me, f6Var));
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
        if (this.f32902r > 0) {
            f12 = 1.0f;
        }
        float circleWidth = this.M + getCircleWidth() + this.M;
        int L = org.telegram.messenger.g0.L(18.0f);
        if (this.E) {
            f11 = 20.0f;
        } else {
            f11 = 22.0f;
        }
        return (int) org.telegram.messenger.g0.T1(circleWidth, org.telegram.messenger.g0.L(f11) + L + this.f32905x.d, f12 * f10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Drawable drawable;
        int z9;
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
        int i7;
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
        if (!this.E) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
        }
        k();
        float N = org.telegram.messenger.g0.N(3.0f);
        float N2 = org.telegram.messenger.g0.N(38.0f);
        float N3 = org.telegram.messenger.g0.N(20.0f);
        i6 i6Var = this.f32905x;
        float T13 = org.telegram.messenger.g0.T1(Math.max(N2, i6Var.c() + N3), N2, this.f32901n);
        RectF rectF = this.m0;
        rectF.set((getMeasuredWidth() - T13) - N, (getMeasuredHeight() - N2) - N, getMeasuredWidth() - N, getMeasuredHeight() - N);
        boolean z11 = this.E;
        Paint paint2 = this.D;
        if (z11) {
            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(19.0f), paint2);
        }
        if (c()) {
            drawable = this.d;
        } else {
            drawable = this.f32888c;
        }
        Drawable drawable3 = drawable;
        if (this.E) {
            z9 = Math.round((rectF.right - (rectF.height() / 2.0f)) - (drawable3.getIntrinsicWidth() / 2.0f));
            measuredHeight = Math.round(((rectF.height() / 2.0f) + rectF.top) - (drawable3.getIntrinsicHeight() / 2.0f));
        } else {
            z9 = org.telegram.ui.Cells.f1.z(2, getMeasuredWidth() - (getMeasuredHeight() / 2), drawable3);
            measuredHeight = (getMeasuredHeight() - drawable3.getIntrinsicHeight()) / 2;
            if (b()) {
                measuredHeight -= org.telegram.messenger.g0.L(1.0f);
            } else {
                z9 += org.telegram.messenger.g0.L(2.0f);
            }
        }
        int i13 = z9;
        int i14 = measuredHeight;
        float d = this.V.d(this.T);
        float d2 = this.P.d(d());
        if (this.f32902r > 0 && !this.f32904w) {
            z10 = true;
        } else {
            z10 = false;
        }
        float d10 = (1.0f - this.h) * this.f32906y.d(z10);
        float e10 = this.f32892e0.e(false, 1.0f);
        if (d2 < 1.0f) {
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
            drawable3.setAlpha((int) ((1.0f - d10) * 255.0f));
            drawable3.draw(canvas2);
            canvas2.restore();
        } else {
            f10 = d;
            f11 = 1.0f;
            f12 = 2.0f;
        }
        if (this.f32896h0) {
            T1 = org.telegram.messenger.g0.T1(getMeasuredWidth() - (getMeasuredHeight() / f12), getMeasuredWidth() - org.telegram.messenger.g0.L(4.0f), d2) - this.M;
            W1 = getCircleHeight() * d2;
            T12 = ((getMeasuredHeight() - this.N) - org.telegram.messenger.g0.L(4.0f)) - (W1 / f12);
        } else {
            T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.T1(getMeasuredWidth() - (getMeasuredHeight() / f12), getMeasuredWidth() - org.telegram.messenger.g0.L(4.0f), d2) - this.M, getMeasuredWidth() - org.telegram.messenger.g0.L(9.0f), d10);
            T12 = org.telegram.messenger.g0.T1(((getMeasuredHeight() - this.N) - org.telegram.messenger.g0.L(4.0f)) - (getCircleHeight() / f12), getMeasuredHeight() - org.telegram.messenger.g0.L(24.0f), d10);
            W1 = org.telegram.messenger.g0.W1(d10, getCircleHeight(), org.telegram.messenger.g0.L(32.0f)) * d2;
        }
        float f26 = T12;
        float f27 = T1;
        float circleWidth = getCircleWidth();
        if (this.E) {
            f13 = 20.0f;
        } else {
            f13 = 22.0f;
        }
        float T15 = org.telegram.messenger.g0.T1(circleWidth, i6Var.c() + org.telegram.messenger.g0.L(f13), d10);
        float T16 = org.telegram.messenger.g0.T1(T15, W1, this.f32901n) * d2;
        float f28 = T15 - T16;
        float f29 = f27 - (T16 / f12);
        setPivotX(f29);
        setPivotY(f26);
        float T17 = org.telegram.messenger.g0.T1(f11, 0.79f, this.h);
        if (d2 > 0.0f) {
            canvas2.save();
            Path path = this.f32885a0;
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
                if (this.f32894f0 == null) {
                    f16 = f27;
                    this.f32894f0 = getContext().getResources().getDrawable(2131232693);
                } else {
                    f16 = f27;
                }
                i7 = save;
                this.f32894f0.setColorFilter(paint2.getColor(), PorterDuff.Mode.MULTIPLY);
                bg.s.d(this.f32894f0, centerX, centerY, 17);
                bg.s.b(canvas2, this.f32894f0, this.h);
            } else {
                i7 = save;
                f16 = f27;
            }
            canvas2.scale(T17, T17, centerX, centerY);
            if (this.f32895g0 != null) {
                Rect rect = org.telegram.messenger.g0.Q;
                rectF2.round(rect);
                rect.inset(-org.telegram.messenger.g0.L(7.0f), -org.telegram.messenger.g0.L(7.0f));
                this.f32895g0.setBounds(rect);
                this.f32895g0.draw(canvas2);
            }
            if (!this.E) {
                canvas2.drawPath(path, paint2);
            }
            canvas2.clipPath(path);
            int i15 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i15 > 0) {
                Paint paint3 = this.f32887b0;
                paint3.setColor(-1);
                paint3.setAlpha((int) (f10 * 255.0f));
                float L = org.telegram.messenger.g0.L(8.66f);
                rectF2.set(f29 - L, f26 - L, f29 + L, f26 + L);
                if (this.R) {
                    long currentTimeMillis = System.currentTimeMillis() % 5400;
                    float f33 = ((float) (1520 * currentTimeMillis)) / 5400.0f;
                    float max = Math.max(0.0f, f33 - 20.0f);
                    int i16 = 0;
                    while (i16 < 4) {
                        long j3 = currentTimeMillis;
                        x1.a aVar = this.S;
                        f33 += aVar.getInterpolation(((float) (j3 - (i16 * 1350))) / 667.0f) * 250.0f;
                        max += aVar.getInterpolation(((float) (j3 - (i12 + 667))) / 667.0f) * 250.0f;
                        i16++;
                        currentTimeMillis = j3;
                    }
                    canvas2 = canvas;
                    f19 = f10;
                    i10 = i14;
                    f14 = 0.0f;
                    f15 = d10;
                    i11 = i15;
                    f17 = f26;
                    f20 = f29;
                    paint = paint2;
                    f21 = f32;
                    canvas2.drawArc(org.telegram.messenger.g0.P, max, f33 - max, false, paint3);
                } else {
                    f19 = f10;
                    i10 = i14;
                    f15 = d10;
                    i11 = i15;
                    f17 = f26;
                    f20 = f29;
                    paint = paint2;
                    f21 = f32;
                    canvas2 = canvas;
                    canvas2.drawArc(rectF2, (-90.0f) + (((((float) (System.currentTimeMillis() % 3000)) / 1000.0f) * 120.0f) % 360.0f), this.W.e(false, this.U) * 360.0f, false, paint3);
                }
                canvas2.save();
                float T18 = org.telegram.messenger.g0.T1(1.0f, 0.6f, f19);
                canvas2.scale(T18, T18, f20, f17);
                invalidate();
            } else {
                f19 = f10;
                i10 = i14;
                f15 = d10;
                i11 = i15;
                f17 = f26;
                f20 = f29;
                paint = paint2;
                f21 = f32;
            }
            if (f15 > f14) {
                if (this.f32896h0) {
                    i6Var.o((f16 - i6Var.d) - org.telegram.messenger.g0.L(11.0f), f31, f16 - org.telegram.messenger.g0.L(11.0f), f21);
                } else if (this.E) {
                    i6Var.o(rectF.left + org.telegram.messenger.g0.L(10.0f), rectF.top, rectF.right, rectF.bottom);
                } else {
                    i6Var.o((getMeasuredWidth() - i6Var.d) - org.telegram.messenger.g0.L(20.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(20.0f), getMeasuredHeight());
                }
                f22 = 1.0f;
                i6Var.B = (int) ((1.0f - f19) * f15 * 255.0f);
                i6Var.draw(canvas2);
            } else {
                f22 = 1.0f;
            }
            this.f32891e.setAlpha((int) ((f22 - f15) * (f22 - f19) * 255.0f));
            if (this.I > 0) {
                this.f32891e.setBounds((int) (f20 - (drawable2.getIntrinsicWidth() / f12)), (int) (f17 - (this.f32891e.getIntrinsicHeight() / f12)), (int) ((this.f32891e.getIntrinsicWidth() / f12) + f20), (int) ((this.f32891e.getIntrinsicHeight() / f12) + f17));
            } else {
                this.f32891e.setBounds(i13, i10, drawable3.getIntrinsicWidth() + i13, drawable3.getIntrinsicHeight() + i10);
            }
            this.f32891e.draw(canvas2);
            if (i11 > 0) {
                canvas2.restore();
            }
            canvas2.restore();
        } else {
            f14 = 0.0f;
            f15 = d10;
            i7 = save;
            f16 = f27;
            f17 = f26;
            paint = paint2;
        }
        i6 i6Var2 = this.f32889c0;
        float i17 = (1.0f - f15) * i6Var2.i();
        if (!this.F) {
            float max2 = Math.max(i6Var2.c() + org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(18.0f));
            if (this.f32896h0) {
                measuredWidth = (f16 - org.telegram.messenger.g0.L(50.0f)) + f28;
                measuredHeight2 = (max2 / f12) + (f17 - (getCircleHeight() / f12));
                f18 = org.telegram.messenger.g0.L(0.66f);
            } else {
                float f34 = max2 / f12;
                measuredWidth = (getMeasuredWidth() - this.M) - f34;
                measuredHeight2 = (getMeasuredHeight() - this.N) - f34;
                f18 = f14;
            }
            float f35 = max2 / f12;
            i6Var2.setBounds((int) (measuredWidth - f35), (int) ((measuredHeight2 - f35) - f18), (int) (measuredWidth + f35), (int) ((measuredHeight2 + f35) - f18));
            if (i17 > f14) {
                float T19 = org.telegram.messenger.g0.T1(1.0f, 0.85f, this.h);
                canvas2.save();
                canvas2.scale(T19, T19, measuredWidth, measuredHeight2);
                if (!this.E) {
                    canvas2.drawCircle(measuredWidth, measuredHeight2, (org.telegram.messenger.g0.L(f12) + f35) * i17 * this.f32890d0, org.telegram.ui.ActionBar.k6.Cm);
                    canvas2.drawCircle(measuredWidth, measuredHeight2, f35 * i17 * this.f32890d0, paint);
                }
                i6Var2.B = (int) (i17 * 255.0f);
                i6Var2.draw(canvas2);
                canvas2.restore();
            }
        }
        if (i17 < 1.0f) {
            int L2 = org.telegram.messenger.g0.L(8.0f);
            float f36 = f15;
            int T110 = (int) org.telegram.messenger.g0.T1(((getMeasuredWidth() - (getCircleWidth() / f12)) - this.M) + org.telegram.messenger.g0.L(12.0f), f16 - org.telegram.messenger.g0.L(f12), f36);
            int T111 = (int) org.telegram.messenger.g0.T1(((getMeasuredHeight() - (getCircleHeight() / f12)) - this.N) + org.telegram.messenger.g0.L(10.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(12.0f), f36);
            int i18 = T110 - L2;
            int i19 = T111 - L2;
            int i20 = T110 + L2;
            int i21 = T111 + L2;
            g5 g5Var = this.f32893f;
            g5Var.setBounds(i18, i19, i20, i21);
            g5Var.f33855w = (int) ((1.0f - i17) * 255.0f);
            g5Var.draw(canvas2);
        }
        if (!this.E) {
            canvas2.restore();
        }
        canvas2.restoreToCount(i7);
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dg.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBlurredBackgroundDrawable(fh.g gVar) {
        this.f32895g0 = gVar;
        gVar.r(org.telegram.messenger.g0.L(22.0f));
        this.f32895g0.q(org.telegram.messenger.g0.L(4.0f));
    }

    public void setCircleSize(int i7) {
        this.I = i7;
        this.J = i7;
    }

    public void setEffect(long j3) {
        org.telegram.messenger.e6 e6Var;
        TLRPC.TL_availableEffect Z0 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).Z0(j3);
        if (Z0 != null) {
            e6Var = org.telegram.messenger.i6.g(Z0.emoticon);
        } else {
            e6Var = null;
        }
        setEmoji(e6Var);
    }

    public void setEmoji(Drawable drawable) {
        this.f32893f.g(drawable, true);
    }

    public void setEphemeralFactor(float f10) {
        if (this.h != f10) {
            this.h = f10;
            invalidate();
        }
    }

    public void setLocked(boolean z9) {
        if (this.F == z9) {
            return;
        }
        this.F = z9;
        invalidate();
    }

    @Override
    public void setPressed(boolean z9) {
        super.setPressed(z9);
        this.Q.c(z9);
    }

    public void setResourceId(int i7) {
        if (this.f32886b != i7) {
            this.f32886b = i7;
            this.f32888c = getContext().getResources().getDrawable(i7).mutate();
            this.d = getContext().getResources().getDrawable(i7).mutate();
            this.f32891e = getContext().getResources().getDrawable(i7).mutate();
            invalidate();
        }
    }

    public void setSameWidthFactor(float f10) {
        if (this.f32901n != f10) {
            this.f32901n = f10;
            invalidate();
        }
    }

    public void setScrimViewBackgroundColor(int i7) {
        this.K = i7;
        this.L.setColor(i7);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f32889c0 && drawable != this.f32893f && drawable != this.f32905x && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
