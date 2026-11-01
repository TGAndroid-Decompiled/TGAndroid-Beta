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
public abstract class zf extends View implements y60 {
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
    public final dq[] O;
    public final t5 P;
    public final dc Q;
    public boolean R;
    public final u1.a S;
    public boolean T;
    public float U;
    public final t5 V;
    public final t5 W;
    public final org.telegram.ui.ActionBar.p6 f33125a;
    public final Path f33126a0;
    public int f33127b;
    public final Paint f33128b0;
    public Drawable f33129c;
    public final e6 f33130c0;
    public Drawable d;
    public float f33131d0;
    public Drawable e;
    public final t5 f33132e0;
    public final d5 f33133f;
    public Drawable f33134f0;
    public vg.f f33135g0;
    public float h;
    public boolean f33136h0;
    public int f33137i0;
    public int f33138j0;
    public int f33139k0;
    public ValueAnimator f33140l0;
    public final RectF m0;
    public float f33141n;
    public long f33142r;
    public int f33143s;
    public boolean f33144w;
    public final e6 f33145x;
    public final t5 f33146y;

    public zf(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context);
        gr grVar = gr.h;
        this.f33146y = new t5(this, 0L, 320L, grVar);
        this.D = new Paint(1);
        this.I = -1;
        this.J = -1;
        this.L = new Paint(1);
        this.O = new dq[1];
        this.P = new t5(this, 0L, 420L, grVar);
        this.Q = new dc(this);
        this.S = new u1.a();
        this.V = new t5(this, 0L, 420L, grVar);
        this.W = new t5(this, 0L, 500L, grVar);
        this.f33126a0 = new Path();
        Paint paint = new Paint(1);
        this.f33128b0 = paint;
        e6 e6Var = new e6(true, true, true);
        this.f33130c0 = e6Var;
        this.f33131d0 = 1.0f;
        this.f33132e0 = new t5(this, 0L, 320L, grVar);
        this.m0 = new RectF();
        this.f33127b = i10;
        this.f33125a = p6Var;
        this.E = z10;
        e6 e6Var2 = new e6(false, false, false);
        this.f33145x = e6Var2;
        e6Var2.w(org.telegram.messenger.i0.L(15.0f));
        e6Var2.x(org.telegram.messenger.i0.o());
        e6Var2.u(-1);
        e6Var2.f25744b = 3;
        e6Var2.setCallback(this);
        e6Var2.M = org.telegram.messenger.i0.f16172q.x;
        this.f33129c = i0.a.f(context, i10);
        this.d = i0.a.f(context, i10);
        this.e = i0.a.f(context, i10);
        this.f33133f = new d5(org.telegram.messenger.i0.L(14.0f), this);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        e6Var.setCallback(this);
        e6Var.u(-1);
        e6Var.w(org.telegram.messenger.i0.L(12.0f));
        e6Var.x(org.telegram.messenger.i0.o());
        e6Var.f25744b = 17;
    }

    @Override
    public final void a(RectF rectF) {
        float measuredWidth = (getMeasuredWidth() - org.telegram.messenger.i0.L(4.0f)) - this.M;
        float measuredHeight = (getMeasuredHeight() - org.telegram.messenger.i0.L(4.0f)) - this.N;
        rectF.set(measuredWidth - getCircleWidth(), measuredHeight - getCircleHeight(), measuredWidth, measuredHeight);
    }

    @Override
    public final void b(Canvas canvas, float f7) {
        float T1;
        float T12;
        float W1;
        float f10;
        float f11;
        float f12;
        int i10 = this.K;
        if (i10 != 0) {
            Paint paint = this.L;
            paint.setColor(i10);
            paint.setAlpha((int) (Color.alpha(this.K) * f7));
            float f13 = this.P.f30530c;
            float f14 = this.f33146y.f30530c;
            if (this.f33136h0) {
                T1 = org.telegram.messenger.i0.T1(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - org.telegram.messenger.i0.L(4.0f), f13) - this.M;
                W1 = getCircleHeight() * f13;
                T12 = ((getMeasuredHeight() - this.N) - org.telegram.messenger.i0.L(4.0f)) - (W1 / 2.0f);
            } else {
                T1 = org.telegram.messenger.i0.T1(org.telegram.messenger.i0.T1(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - org.telegram.messenger.i0.L(4.0f), f13) - this.M, getMeasuredWidth() - org.telegram.messenger.i0.L(9.0f), f14);
                T12 = org.telegram.messenger.i0.T1(((getMeasuredHeight() - this.N) - org.telegram.messenger.i0.L(4.0f)) - (getCircleHeight() / 2.0f), getMeasuredHeight() - org.telegram.messenger.i0.L(24.0f), f14);
                W1 = org.telegram.messenger.i0.W1(f14, getCircleHeight(), org.telegram.messenger.i0.L(32.0f)) * f13;
            }
            float circleWidth = getCircleWidth();
            if (this.E) {
                f10 = 20.0f;
            } else {
                f10 = 22.0f;
            }
            float T13 = org.telegram.messenger.i0.T1(circleWidth, this.f33145x.c() + org.telegram.messenger.i0.L(f10), f14) * f13;
            if (f13 > 0.0f && T13 > 0.0f && W1 > 0.0f) {
                RectF rectF = org.telegram.messenger.i0.P;
                float f15 = W1 / 2.0f;
                rectF.set(T1 - T13, T12 - f15, T1, f15 + T12);
                rectF.inset(-org.telegram.messenger.i0.L(4.0f), -org.telegram.messenger.i0.L(4.0f));
                float min = (Math.min(T13, W1) / 2.0f) + org.telegram.messenger.i0.L(4.0f);
                canvas.drawRoundRect(rectF, min, min, paint);
            }
            e6 e6Var = this.f33130c0;
            float i11 = (1.0f - f14) * e6Var.i();
            if (i11 > 0.0f) {
                float max = Math.max(e6Var.c() + org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(18.0f));
                if (this.f33136h0) {
                    f11 = T1 - org.telegram.messenger.i0.L(50.0f);
                    f12 = (max / 2.0f) + (T12 - (getCircleHeight() / 2.0f));
                } else {
                    float f16 = max / 2.0f;
                    float measuredWidth = (getMeasuredWidth() - this.M) - f16;
                    float measuredHeight = (getMeasuredHeight() - this.N) - f16;
                    f11 = measuredWidth;
                    f12 = measuredHeight;
                }
                canvas.drawCircle(f11, f12, ((max / 2.0f) + org.telegram.messenger.i0.L(2.0f)) * i11 * this.f33131d0, paint);
            }
        }
        draw(canvas);
    }

    public final void c() {
        ValueAnimator valueAnimator = this.f33140l0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
        this.f33140l0 = ofFloat;
        ofFloat.addUpdateListener(new a6(this, 8));
        this.f33140l0.addListener(new w5(this, 7));
        this.f33140l0.setDuration(180L);
        this.f33140l0.setInterpolator(new OvershootInterpolator());
        this.f33140l0.start();
    }

    public boolean d() {
        return false;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (!this.F) {
            super.draw(canvas);
            return;
        }
        canvas.saveLayerAlpha(-org.telegram.messenger.i0.L(6.0f), -org.telegram.messenger.i0.L(6.0f), getWidth(), getHeight(), 255, 31);
        super.draw(canvas);
        RectF rectF = this.m0;
        float L = org.telegram.messenger.i0.L(18.0f) / 2.0f;
        float L2 = (rectF.left + L) - org.telegram.messenger.i0.L(6.0f);
        float L3 = (rectF.top + L) - org.telegram.messenger.i0.L(6.0f);
        canvas.drawCircle(L2, L3, org.telegram.messenger.i0.L(2.0f) + L, org.telegram.ui.ActionBar.t6.Cm);
        canvas.drawCircle(L2, L3, L, this.D);
        if (this.G == null) {
            Drawable mutate = getContext().getResources().getDrawable(2131231975).mutate();
            this.G = mutate;
            int i10 = this.f33137i0;
            this.H = i10;
            mutate.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        if (this.H != this.f33137i0) {
            Drawable drawable = this.G;
            int i11 = this.f33137i0;
            this.H = i11;
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        }
        this.G.setBounds((int) (L2 - org.telegram.messenger.i0.L(8.0f)), (int) (L3 - org.telegram.messenger.i0.L(8.0f)), (int) (L2 + org.telegram.messenger.i0.L(8.0f)), (int) (L3 + org.telegram.messenger.i0.L(8.0f)));
        this.G.draw(canvas);
        canvas.restore();
    }

    public boolean e() {
        return false;
    }

    public abstract boolean f();

    public final void g(int i10, boolean z10) {
        String str = "";
        if (i10 > 0) {
            str = i0.a.i(i10, "");
        }
        this.f33130c0.t(str, z10, true);
        invalidate();
    }

    public int getCircleHeight() {
        int i10 = this.J;
        if (i10 >= 0) {
            return i10;
        }
        return getMeasuredHeight() - org.telegram.messenger.i0.L(8.0f);
    }

    public int getCircleWidth() {
        int i10 = this.I;
        if (i10 >= 0) {
            return i10;
        }
        return getMeasuredHeight() - org.telegram.messenger.i0.L(8.0f);
    }

    public int getFillColor() {
        return org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Me, this.f33125a);
    }

    public final void h(boolean z10) {
        long j10;
        boolean z11;
        float f7 = -3.0f;
        boolean z12 = false;
        if (this.T == z10 && (!z10 || Math.abs(this.U - (-3.0f)) < 0.01f)) {
            boolean z13 = this.R;
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
        this.R = z12;
        if (!this.T && z10) {
            this.W.e(true, 0.0f);
        }
        t5 t5Var = this.V;
        if (z10 && t5Var.f30530c >= 1.0f) {
            j10 = 650;
        } else {
            j10 = 0;
        }
        t5Var.f30531f = j10;
        this.T = z10;
        if (!z10) {
            f7 = 1.0f;
        }
        this.U = f7;
        invalidate();
    }

    public final void i(int i10, long j10, boolean z10) {
        if (this.f33142r == j10 && this.f33143s == i10) {
            return;
        }
        this.f33142r = j10;
        this.f33143s = i10;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        boolean z11 = false;
        e6 e6Var = this.f33145x;
        if (i11 > 0) {
            e6Var.t(rh.h8.Y0(false, i0.a.k(j10 * Math.max(1, this.f33143s), ',', new StringBuilder("⭐️")), this.O), z10, true);
        } else {
            e6Var.t("", z10, true);
        }
        if (!z10) {
            if (this.f33142r > 0) {
                z11 = true;
            }
            this.f33146y.a(z11);
            return;
        }
        invalidate();
    }

    public boolean j() {
        return this instanceof ih;
    }

    public final void k() {
        int w02;
        boolean z10 = this.E;
        org.telegram.ui.ActionBar.p6 p6Var = this.f33125a;
        if (z10) {
            w02 = -1;
        } else {
            w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Me, p6Var);
        }
        int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Kl, p6Var);
        int w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Qf, p6Var);
        if (w02 != this.f33137i0 || w03 != this.f33138j0 || w04 != this.f33139k0) {
            this.f33137i0 = w02;
            this.f33138j0 = w03;
            this.f33139k0 = w04;
            Drawable drawable = this.f33129c;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            this.d.setColorFilter(new PorterDuffColorFilter(Color.argb(180, Color.red(w03), Color.green(w03), Color.blue(w03)), mode));
            this.e.setColorFilter(new PorterDuffColorFilter(w04, mode));
        }
        boolean z11 = this.E;
        Paint paint = this.D;
        if (z11) {
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Me, p6Var));
        } else if (j()) {
            paint.setColor(getFillColor());
        } else {
            paint.setColor(i0.b.o(-1, 75));
        }
    }

    public final int l() {
        getMeasuredHeight();
        return m();
    }

    public final int m() {
        float f7;
        float f10;
        float f11 = 0.0f;
        if (f()) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        if (this.f33142r > 0) {
            f11 = 1.0f;
        }
        float circleWidth = this.M + getCircleWidth() + this.M;
        int L = org.telegram.messenger.i0.L(18.0f);
        if (this.E) {
            f10 = 20.0f;
        } else {
            f10 = 22.0f;
        }
        return (int) org.telegram.messenger.i0.T1(circleWidth, org.telegram.messenger.i0.L(f10) + L + this.f33145x.d, f11 * f7);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Drawable drawable;
        int z10;
        int measuredHeight;
        boolean z11;
        float f7;
        float f10;
        float f11;
        float T1;
        float T12;
        float W1;
        float f12;
        float f13;
        float f14;
        int i10;
        float f15;
        float f16;
        Paint paint;
        float measuredWidth;
        float measuredHeight2;
        float f17;
        float f18;
        int i11;
        int i12;
        float f19;
        float f20;
        float f21;
        Drawable drawable2;
        int i13;
        int save = canvas.save();
        if (!this.E) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
        }
        k();
        float N = org.telegram.messenger.i0.N(3.0f);
        float N2 = org.telegram.messenger.i0.N(38.0f);
        float N3 = org.telegram.messenger.i0.N(20.0f);
        e6 e6Var = this.f33145x;
        float T13 = org.telegram.messenger.i0.T1(Math.max(N2, e6Var.c() + N3), N2, this.f33141n);
        RectF rectF = this.m0;
        rectF.set((getMeasuredWidth() - T13) - N, (getMeasuredHeight() - N2) - N, getMeasuredWidth() - N, getMeasuredHeight() - N);
        boolean z12 = this.E;
        Paint paint2 = this.D;
        if (z12) {
            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(19.0f), org.telegram.messenger.i0.L(19.0f), paint2);
        }
        if (e()) {
            drawable = this.d;
        } else {
            drawable = this.f33129c;
        }
        Drawable drawable3 = drawable;
        if (this.E) {
            z10 = Math.round((rectF.right - (rectF.height() / 2.0f)) - (drawable3.getIntrinsicWidth() / 2.0f));
            measuredHeight = Math.round(((rectF.height() / 2.0f) + rectF.top) - (drawable3.getIntrinsicHeight() / 2.0f));
        } else {
            z10 = org.telegram.ui.Cells.f1.z(2, getMeasuredWidth() - (getMeasuredHeight() / 2), drawable3);
            measuredHeight = (getMeasuredHeight() - drawable3.getIntrinsicHeight()) / 2;
            if (d()) {
                measuredHeight -= org.telegram.messenger.i0.L(1.0f);
            } else {
                z10 += org.telegram.messenger.i0.L(2.0f);
            }
        }
        int i14 = z10;
        int i15 = measuredHeight;
        float d = this.V.d(this.T);
        float d10 = this.P.d(f());
        if (this.f33142r > 0 && !this.f33144w) {
            z11 = true;
        } else {
            z11 = false;
        }
        float d11 = (1.0f - this.h) * this.f33146y.d(z11);
        float e = this.f33132e0.e(false, 1.0f);
        if (d10 < 1.0f) {
            canvas2.save();
            f11 = 2.0f;
            float f22 = 1.0f - e;
            canvas2.translate((-org.telegram.messenger.i0.L(24.0f)) * f22, org.telegram.messenger.i0.L(24.0f) * f22);
            float T14 = org.telegram.messenger.i0.T1(0.35f, 1.0f, e);
            float f23 = i14;
            f10 = 1.0f;
            float f24 = i15;
            f7 = d;
            canvas2.scale(T14, T14, (drawable3.getIntrinsicWidth() / 2.0f) + f23, (drawable3.getIntrinsicHeight() / 2.0f) + f24);
            canvas2.rotate(60.0f * f22, (drawable3.getIntrinsicWidth() / 2.0f) + f23, (drawable3.getIntrinsicHeight() / 2.0f) + f24);
            drawable3.setBounds(i14, i15, drawable3.getIntrinsicWidth() + i14, drawable3.getIntrinsicHeight() + i15);
            drawable3.setAlpha((int) ((1.0f - d11) * 255.0f));
            drawable3.draw(canvas2);
            canvas2.restore();
        } else {
            f7 = d;
            f10 = 1.0f;
            f11 = 2.0f;
        }
        if (this.f33136h0) {
            T1 = org.telegram.messenger.i0.T1(getMeasuredWidth() - (getMeasuredHeight() / f11), getMeasuredWidth() - org.telegram.messenger.i0.L(4.0f), d10) - this.M;
            W1 = getCircleHeight() * d10;
            T12 = ((getMeasuredHeight() - this.N) - org.telegram.messenger.i0.L(4.0f)) - (W1 / f11);
        } else {
            T1 = org.telegram.messenger.i0.T1(org.telegram.messenger.i0.T1(getMeasuredWidth() - (getMeasuredHeight() / f11), getMeasuredWidth() - org.telegram.messenger.i0.L(4.0f), d10) - this.M, getMeasuredWidth() - org.telegram.messenger.i0.L(9.0f), d11);
            T12 = org.telegram.messenger.i0.T1(((getMeasuredHeight() - this.N) - org.telegram.messenger.i0.L(4.0f)) - (getCircleHeight() / f11), getMeasuredHeight() - org.telegram.messenger.i0.L(24.0f), d11);
            W1 = org.telegram.messenger.i0.W1(d11, getCircleHeight(), org.telegram.messenger.i0.L(32.0f)) * d10;
        }
        float f25 = T12;
        float f26 = T1;
        float circleWidth = getCircleWidth();
        if (this.E) {
            f12 = 20.0f;
        } else {
            f12 = 22.0f;
        }
        float T15 = org.telegram.messenger.i0.T1(circleWidth, e6Var.c() + org.telegram.messenger.i0.L(f12), d11);
        float T16 = org.telegram.messenger.i0.T1(T15, W1, this.f33141n) * d10;
        float f27 = T15 - T16;
        float f28 = f26 - (T16 / f11);
        setPivotX(f28);
        setPivotY(f25);
        float T17 = org.telegram.messenger.i0.T1(f10, 0.79f, this.h);
        if (d10 > 0.0f) {
            canvas2.save();
            Path path = this.f33126a0;
            path.rewind();
            f13 = 0.0f;
            float min = Math.min(T16, W1) / f11;
            RectF rectF2 = org.telegram.messenger.i0.P;
            float f29 = W1 / f11;
            float f30 = f25 - f29;
            float f31 = f25 + f29;
            rectF2.set(f26 - T16, f30, f26, f31);
            path.addRoundRect(rectF2, min, min, Path.Direction.CW);
            float centerX = rectF2.centerX();
            float centerY = rectF2.centerY();
            if (this.h > 0.0f) {
                if (this.f33134f0 == null) {
                    f15 = f26;
                    this.f33134f0 = getContext().getResources().getDrawable(2131232690);
                } else {
                    f15 = f26;
                }
                i10 = save;
                this.f33134f0.setColorFilter(paint2.getColor(), PorterDuff.Mode.MULTIPLY);
                rf.o.d(this.f33134f0, centerX, centerY, 17);
                rf.o.b(canvas2, this.f33134f0, this.h);
            } else {
                i10 = save;
                f15 = f26;
            }
            canvas2.scale(T17, T17, centerX, centerY);
            if (this.f33135g0 != null) {
                Rect rect = org.telegram.messenger.i0.Q;
                rectF2.round(rect);
                rect.inset(-org.telegram.messenger.i0.L(7.0f), -org.telegram.messenger.i0.L(7.0f));
                this.f33135g0.setBounds(rect);
                this.f33135g0.draw(canvas2);
            }
            if (!this.E) {
                canvas2.drawPath(path, paint2);
            }
            canvas2.clipPath(path);
            int i16 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i16 > 0) {
                Paint paint3 = this.f33128b0;
                paint3.setColor(-1);
                paint3.setAlpha((int) (f7 * 255.0f));
                float L = org.telegram.messenger.i0.L(8.66f);
                rectF2.set(f28 - L, f25 - L, f28 + L, f25 + L);
                if (this.R) {
                    long currentTimeMillis = System.currentTimeMillis() % 5400;
                    float f32 = ((float) (1520 * currentTimeMillis)) / 5400.0f;
                    float max = Math.max(0.0f, f32 - 20.0f);
                    int i17 = 0;
                    while (i17 < 4) {
                        long j10 = currentTimeMillis;
                        u1.a aVar = this.S;
                        f32 += aVar.getInterpolation(((float) (j10 - (i17 * 1350))) / 667.0f) * 250.0f;
                        max += aVar.getInterpolation(((float) (j10 - (i13 + 667))) / 667.0f) * 250.0f;
                        i17++;
                        currentTimeMillis = j10;
                    }
                    canvas2 = canvas;
                    f18 = f7;
                    i11 = i15;
                    f13 = 0.0f;
                    f14 = d11;
                    i12 = i16;
                    f16 = f25;
                    f19 = f28;
                    paint = paint2;
                    f20 = f31;
                    canvas2.drawArc(org.telegram.messenger.i0.P, max, f32 - max, false, paint3);
                } else {
                    f18 = f7;
                    i11 = i15;
                    f14 = d11;
                    i12 = i16;
                    f16 = f25;
                    f19 = f28;
                    paint = paint2;
                    f20 = f31;
                    canvas2 = canvas;
                    canvas2.drawArc(rectF2, (-90.0f) + (((((float) (System.currentTimeMillis() % 3000)) / 1000.0f) * 120.0f) % 360.0f), this.W.e(false, this.U) * 360.0f, false, paint3);
                }
                canvas2.save();
                float T18 = org.telegram.messenger.i0.T1(1.0f, 0.6f, f18);
                canvas2.scale(T18, T18, f19, f16);
                invalidate();
            } else {
                f18 = f7;
                i11 = i15;
                f14 = d11;
                i12 = i16;
                f16 = f25;
                f19 = f28;
                paint = paint2;
                f20 = f31;
            }
            if (f14 > f13) {
                if (this.f33136h0) {
                    e6Var.o((f15 - e6Var.d) - org.telegram.messenger.i0.L(11.0f), f30, f15 - org.telegram.messenger.i0.L(11.0f), f20);
                } else if (this.E) {
                    e6Var.o(rectF.left + org.telegram.messenger.i0.L(10.0f), rectF.top, rectF.right, rectF.bottom);
                } else {
                    e6Var.o((getMeasuredWidth() - e6Var.d) - org.telegram.messenger.i0.L(20.0f), getMeasuredHeight() - org.telegram.messenger.i0.L(48.0f), getMeasuredWidth() - org.telegram.messenger.i0.L(20.0f), getMeasuredHeight());
                }
                f21 = 1.0f;
                e6Var.B = (int) ((1.0f - f18) * f14 * 255.0f);
                e6Var.draw(canvas2);
            } else {
                f21 = 1.0f;
            }
            this.e.setAlpha((int) ((f21 - f14) * (f21 - f18) * 255.0f));
            if (this.I > 0) {
                this.e.setBounds((int) (f19 - (drawable2.getIntrinsicWidth() / f11)), (int) (f16 - (this.e.getIntrinsicHeight() / f11)), (int) ((this.e.getIntrinsicWidth() / f11) + f19), (int) ((this.e.getIntrinsicHeight() / f11) + f16));
            } else {
                this.e.setBounds(i14, i11, drawable3.getIntrinsicWidth() + i14, drawable3.getIntrinsicHeight() + i11);
            }
            this.e.draw(canvas2);
            if (i12 > 0) {
                canvas2.restore();
            }
            canvas2.restore();
        } else {
            f13 = 0.0f;
            f14 = d11;
            i10 = save;
            f15 = f26;
            f16 = f25;
            paint = paint2;
        }
        e6 e6Var2 = this.f33130c0;
        float i18 = (1.0f - f14) * e6Var2.i();
        if (!this.F) {
            float max2 = Math.max(e6Var2.c() + org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(18.0f));
            if (this.f33136h0) {
                measuredWidth = (f15 - org.telegram.messenger.i0.L(50.0f)) + f27;
                measuredHeight2 = (max2 / f11) + (f16 - (getCircleHeight() / f11));
                f17 = org.telegram.messenger.i0.L(0.66f);
            } else {
                float f33 = max2 / f11;
                measuredWidth = (getMeasuredWidth() - this.M) - f33;
                measuredHeight2 = (getMeasuredHeight() - this.N) - f33;
                f17 = f13;
            }
            float f34 = max2 / f11;
            e6Var2.setBounds((int) (measuredWidth - f34), (int) ((measuredHeight2 - f34) - f17), (int) (measuredWidth + f34), (int) ((measuredHeight2 + f34) - f17));
            if (i18 > f13) {
                float T19 = org.telegram.messenger.i0.T1(1.0f, 0.85f, this.h);
                canvas2.save();
                canvas2.scale(T19, T19, measuredWidth, measuredHeight2);
                if (!this.E) {
                    canvas2.drawCircle(measuredWidth, measuredHeight2, (org.telegram.messenger.i0.L(f11) + f34) * i18 * this.f33131d0, org.telegram.ui.ActionBar.t6.Cm);
                    canvas2.drawCircle(measuredWidth, measuredHeight2, f34 * i18 * this.f33131d0, paint);
                }
                e6Var2.B = (int) (i18 * 255.0f);
                e6Var2.draw(canvas2);
                canvas2.restore();
            }
        }
        if (i18 < 1.0f) {
            int L2 = org.telegram.messenger.i0.L(8.0f);
            float f35 = f14;
            int T110 = (int) org.telegram.messenger.i0.T1(((getMeasuredWidth() - (getCircleWidth() / f11)) - this.M) + org.telegram.messenger.i0.L(12.0f), f15 - org.telegram.messenger.i0.L(f11), f35);
            int T111 = (int) org.telegram.messenger.i0.T1(((getMeasuredHeight() - (getCircleHeight() / f11)) - this.N) + org.telegram.messenger.i0.L(10.0f), getMeasuredHeight() - org.telegram.messenger.i0.L(12.0f), f35);
            int i19 = T110 - L2;
            int i20 = T111 - L2;
            int i21 = T110 + L2;
            int i22 = T111 + L2;
            d5 d5Var = this.f33133f;
            d5Var.setBounds(i19, i20, i21, i22);
            d5Var.f25376w = (int) ((1.0f - i18) * 255.0f);
            d5Var.draw(canvas2);
        }
        if (!this.E) {
            canvas2.restore();
        }
        canvas2.restoreToCount(i10);
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zf.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBlurredBackgroundDrawable(vg.f fVar) {
        this.f33135g0 = fVar;
        fVar.q(org.telegram.messenger.i0.L(22.0f));
        this.f33135g0.p(org.telegram.messenger.i0.L(4.0f));
    }

    public void setCircleSize(int i10) {
        this.I = i10;
        this.J = i10;
    }

    public void setEffect(long j10) {
        org.telegram.messenger.g6 g6Var;
        TLRPC.TL_availableEffect Y0 = org.telegram.messenger.wp.r1(org.telegram.messenger.e20.f15506s0).Y0(j10);
        if (Y0 != null) {
            g6Var = org.telegram.messenger.k6.g(Y0.emoticon);
        } else {
            g6Var = null;
        }
        setEmoji(g6Var);
    }

    public void setEmoji(Drawable drawable) {
        this.f33133f.g(drawable, true);
    }

    public void setEphemeralFactor(float f7) {
        if (this.h != f7) {
            this.h = f7;
            invalidate();
        }
    }

    public void setLocked(boolean z10) {
        if (this.F == z10) {
            return;
        }
        this.F = z10;
        invalidate();
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.Q.c(z10);
    }

    public void setResourceId(int i10) {
        if (this.f33127b != i10) {
            this.f33127b = i10;
            this.f33129c = getContext().getResources().getDrawable(i10).mutate();
            this.d = getContext().getResources().getDrawable(i10).mutate();
            this.e = getContext().getResources().getDrawable(i10).mutate();
            invalidate();
        }
    }

    public void setSameWidthFactor(float f7) {
        if (this.f33141n != f7) {
            this.f33141n = f7;
            invalidate();
        }
    }

    public void setScrimViewBackgroundColor(int i10) {
        this.K = i10;
        this.L.setColor(i10);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f33130c0 && drawable != this.f33133f && drawable != this.f33145x && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
