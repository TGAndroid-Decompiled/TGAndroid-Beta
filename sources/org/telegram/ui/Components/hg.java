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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

public abstract class hg extends View implements a70 {
    public boolean A;
    public boolean B;
    public Drawable C;
    public int D;
    public int E;
    public int F;
    public int G;
    public final Paint H;
    public float I;
    public float J;
    public final cq[] K;
    public final y5 L;
    public final nc M;
    public boolean N;
    public final u1.a O;
    public boolean P;
    public float Q;
    public final y5 R;
    public final y5 S;
    public final Path T;
    public final Paint U;
    public final i6 V;
    public float W;

    public final org.telegram.ui.ActionBar.c6 f28988a;

    public final y5 f28989a0;

    public int f28990b;

    public Drawable f28991b0;

    public Drawable f28992c;

    public lg.d f28993c0;
    public Drawable d;

    public boolean f28994d0;

    public Drawable f28995e;

    public int f28996e0;

    public final i5 f28997f;

    public ValueAnimator f28998f0;

    public final RectF f28999g0;
    public float h;

    public float f29000n;

    public long f29001r;

    public int f29002s;
    public boolean v;

    public final i6 f29003w;

    public final y5 f29004x;

    public final Paint f29005y;

    public hg(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        er erVar = er.h;
        this.f29004x = new y5(this, 0L, 320L, erVar);
        this.f29005y = new Paint(1);
        this.E = -1;
        this.F = -1;
        this.H = new Paint(1);
        this.K = new cq[1];
        this.L = new y5(this, 0L, 420L, erVar);
        this.M = new nc(this);
        this.O = new u1.a();
        this.R = new y5(this, 0L, 420L, erVar);
        this.S = new y5(this, 0L, 500L, erVar);
        this.T = new Path();
        Paint paint = new Paint(1);
        this.U = paint;
        i6 i6Var = new i6(true, true, true, false);
        this.V = i6Var;
        this.W = 1.0f;
        this.f28989a0 = new y5(this, 0L, 320L, erVar);
        this.f28999g0 = new RectF();
        this.f28990b = i10;
        this.f28988a = c6Var;
        this.A = z10;
        i6 i6Var2 = new i6(false, false, false, false);
        this.f29003w = i6Var2;
        i6Var2.t(AndroidUtilities.dp(15.0f));
        i6Var2.u(AndroidUtilities.bold());
        i6Var2.r(-1);
        i6Var2.f29239b = 3;
        i6Var2.setCallback(this);
        i6Var2.G = AndroidUtilities.displaySize.x;
        this.f28992c = context.getResources().getDrawable(i10).mutate();
        this.d = context.getResources().getDrawable(i10).mutate();
        this.f28995e = context.getResources().getDrawable(i10).mutate();
        this.f28997f = new i5(AndroidUtilities.dp(14.0f), this);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        i6Var.setCallback(this);
        i6Var.r(-1);
        i6Var.t(AndroidUtilities.dp(12.0f));
        i6Var.u(AndroidUtilities.bold());
        i6Var.f29239b = 17;
    }

    @Override
    public final void a(RectF rectF) {
        float circleWidth = getCircleWidth();
        float circleHeight = getCircleHeight();
        float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(4.0f)) - this.I;
        float measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(4.0f)) - this.J;
        rectF.set(measuredWidth - circleWidth, measuredHeight - circleHeight, measuredWidth, measuredHeight);
    }

    public final void b() {
        ValueAnimator valueAnimator = this.f28998f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
        this.f28998f0 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new e6(this, 8));
        this.f28998f0.addListener(new org.telegram.ui.am(this, 11));
        this.f28998f0.setDuration(180L);
        this.f28998f0.setInterpolator(new OvershootInterpolator());
        this.f28998f0.start();
    }

    @Override
    public final void c(Canvas canvas, float f10) {
        float fLerp;
        float fLerp2;
        float fLerp3;
        float fDp;
        float circleHeight;
        int i10 = this.G;
        if (i10 != 0) {
            Paint paint = this.H;
            paint.setColor(i10);
            paint.setAlpha((int) (Color.alpha(this.G) * f10));
            float f11 = this.L.f34812c;
            float f12 = this.f29004x.f34812c;
            if (this.f28994d0) {
                fLerp = AndroidUtilities.lerp(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - AndroidUtilities.dp(4.0f), f11) - this.I;
                fLerp3 = getCircleHeight() * f11;
                fLerp2 = ((getMeasuredHeight() - this.J) - AndroidUtilities.dp(4.0f)) - (fLerp3 / 2.0f);
            } else {
                fLerp = AndroidUtilities.lerp(AndroidUtilities.lerp(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - AndroidUtilities.dp(4.0f), f11) - this.I, getMeasuredWidth() - AndroidUtilities.dp(9.0f), f12);
                fLerp2 = AndroidUtilities.lerp(((getMeasuredHeight() - this.J) - AndroidUtilities.dp(4.0f)) - (getCircleHeight() / 2.0f), getMeasuredHeight() - AndroidUtilities.dp(24.0f), f12);
                fLerp3 = AndroidUtilities.lerp(getCircleHeight(), AndroidUtilities.dp(32.0f), f12) * f11;
            }
            float fLerp4 = AndroidUtilities.lerp(getCircleWidth(), this.f29003w.d() + AndroidUtilities.dp(this.A ? 20.0f : 22.0f), f12) * f11;
            if (f11 > 0.0f && fLerp4 > 0.0f && fLerp3 > 0.0f) {
                RectF rectF = AndroidUtilities.rectTmp;
                float f13 = fLerp3 / 2.0f;
                rectF.set(fLerp - fLerp4, fLerp2 - f13, fLerp, f13 + fLerp2);
                rectF.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
                float fMin = (Math.min(fLerp4, fLerp3) / 2.0f) + AndroidUtilities.dp(4.0f);
                canvas.drawRoundRect(rectF, fMin, fMin, paint);
            }
            i6 i6Var = this.V;
            float fG = (1.0f - f12) * i6Var.g();
            if (fG > 0.0f) {
                float fMax = Math.max(i6Var.d() + AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f));
                if (this.f28994d0) {
                    fDp = fLerp - AndroidUtilities.dp(50.0f);
                    circleHeight = (fMax / 2.0f) + (fLerp2 - (getCircleHeight() / 2.0f));
                } else {
                    float f14 = fMax / 2.0f;
                    float measuredWidth = (getMeasuredWidth() - this.I) - f14;
                    float measuredHeight = (getMeasuredHeight() - this.J) - f14;
                    fDp = measuredWidth;
                    circleHeight = measuredHeight;
                }
                canvas.drawCircle(fDp, circleHeight, ((fMax / 2.0f) + AndroidUtilities.dp(2.0f)) * fG * this.W, paint);
            }
        }
        draw(canvas);
    }

    public boolean d() {
        return false;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (!this.B) {
            super.draw(canvas);
            return;
        }
        canvas.saveLayerAlpha(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(6.0f), getWidth(), getHeight(), 255, 31);
        super.draw(canvas);
        float fDp = AndroidUtilities.dp(18.0f);
        RectF rectF = this.f28999g0;
        float f10 = fDp / 2.0f;
        float fDp2 = (rectF.left + f10) - AndroidUtilities.dp(6.0f);
        float fDp3 = (rectF.top + f10) - AndroidUtilities.dp(6.0f);
        canvas.drawCircle(fDp2, fDp3, AndroidUtilities.dp(2.0f) + f10, org.telegram.ui.ActionBar.g6.Il);
        canvas.drawCircle(fDp2, fDp3, f10, this.f29005y);
        if (this.C == null) {
            Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
            this.C = drawableMutate;
            int i10 = this.f28996e0;
            this.D = i10;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        if (this.D != this.f28996e0) {
            Drawable drawable = this.C;
            int i11 = this.f28996e0;
            this.D = i11;
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        }
        this.C.setBounds((int) (fDp2 - AndroidUtilities.dp(8.0f)), (int) (fDp3 - AndroidUtilities.dp(8.0f)), (int) (fDp2 + AndroidUtilities.dp(8.0f)), (int) (fDp3 + AndroidUtilities.dp(8.0f)));
        this.C.draw(canvas);
        canvas.restore();
    }

    public boolean e() {
        return false;
    }

    public abstract boolean f();

    public final void g(int i10, boolean z10) {
        this.V.q(i10 > 0 ? i0.a.k(i10, "") : "", z10, true);
        invalidate();
    }

    public int getCircleHeight() {
        int i10 = this.F;
        return i10 >= 0 ? i10 : getMeasuredHeight() - AndroidUtilities.dp(8.0f);
    }

    public int getCircleWidth() {
        int i10 = this.E;
        return i10 >= 0 ? i10 : getMeasuredHeight() - AndroidUtilities.dp(8.0f);
    }

    public int getFillColor() {
        return org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Yd, this.f28988a);
    }

    public final void h(boolean z10) {
        if (this.P == z10 && (!z10 || Math.abs(this.Q - (-3.0f)) < 0.01f)) {
            if (this.N == (Math.abs(0.0f) < 0.01f)) {
                return;
            }
        }
        this.N = Math.abs(0.0f) < 0.01f;
        if (!this.P && z10) {
            this.S.d(0.0f, true);
        }
        y5 y5Var = this.R;
        y5Var.f34814f = (!z10 || y5Var.f34812c < 1.0f) ? 0L : 650L;
        this.P = z10;
        this.Q = z10 ? -3.0f : 1.0f;
        invalidate();
    }

    public final void i(int i10, long j10, boolean z10) {
        if (this.f29001r == j10 && this.f29002s == i10) {
            return;
        }
        this.f29001r = j10;
        this.f29002s = i10;
        i6 i6Var = this.f29003w;
        if (j10 > 0) {
            i6Var.q(hh.oa.V0(false, i0.a.m(j10 * ((long) Math.max(1, this.f29002s)), ',', new StringBuilder("⭐️")), this.K), z10, true);
        } else {
            i6Var.q("", z10, true);
        }
        if (z10) {
            invalidate();
        } else {
            this.f29004x.a(this.f29001r > 0);
        }
    }

    public boolean j() {
        return this instanceof rh;
    }

    public final void k() {
        boolean z10 = this.A;
        org.telegram.ui.ActionBar.c6 c6Var = this.f28988a;
        int iV0 = z10 ? -1 : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Yd, c6Var);
        if (iV0 != this.f28996e0) {
            this.f28996e0 = iV0;
            Drawable drawable = this.f28992c;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable.setColorFilter(new PorterDuffColorFilter(iV0, mode));
            int iV1 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Wk, c6Var);
            this.d.setColorFilter(new PorterDuffColorFilter(Color.argb(180, Color.red(iV1), Color.green(iV1), Color.blue(iV1)), mode));
            this.f28995e.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23026bf, c6Var), mode));
        }
        boolean z11 = this.A;
        Paint paint = this.f29005y;
        if (z11) {
            paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Yd, c6Var));
        } else if (j()) {
            paint.setColor(getFillColor());
        } else {
            paint.setColor(i0.b.k(-1, 75));
        }
    }

    public final int l() {
        getMeasuredHeight();
        return m();
    }

    public final int m() {
        return (int) AndroidUtilities.lerp(this.I + getCircleWidth() + this.I, AndroidUtilities.dp(this.A ? 20.0f : 22.0f) + AndroidUtilities.dp(18.0f) + this.f29003w.d, (this.f29001r > 0 ? 1.0f : 0.0f) * (f() ? 1.0f : 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int iV;
        int measuredHeight;
        float f10;
        float fLerp;
        float fLerp2;
        float fLerp3;
        float f11;
        float measuredWidth;
        float measuredHeight2;
        float fDp;
        float f12;
        int iSave = canvas.save();
        if (this.A) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        }
        k();
        float fDpf2 = AndroidUtilities.dpf2(3.0f);
        float fDpf3 = AndroidUtilities.dpf2(38.0f);
        float fDpf4 = AndroidUtilities.dpf2(20.0f);
        i6 i6Var = this.f29003w;
        float measuredWidth2 = (getMeasuredWidth() - AndroidUtilities.lerp(Math.max(fDpf3, i6Var.d() + fDpf4), fDpf3, this.f29000n)) - fDpf2;
        float measuredHeight3 = (getMeasuredHeight() - fDpf3) - fDpf2;
        float measuredWidth3 = getMeasuredWidth() - fDpf2;
        float measuredHeight4 = getMeasuredHeight() - fDpf2;
        RectF rectF = this.f28999g0;
        rectF.set(measuredWidth2, measuredHeight3, measuredWidth3, measuredHeight4);
        boolean z10 = this.A;
        Paint paint = this.f29005y;
        if (z10) {
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f), paint);
        }
        Drawable drawable = e() ? this.d : this.f28992c;
        if (this.A) {
            iV = Math.round((rectF.right - (rectF.height() / 2.0f)) - (drawable.getIntrinsicWidth() / 2.0f));
            measuredHeight = Math.round(((rectF.height() / 2.0f) + rectF.top) - (drawable.getIntrinsicHeight() / 2.0f));
        } else {
            iV = org.telegram.messenger.rl.v(2, getMeasuredWidth() - (getMeasuredHeight() / 2), drawable);
            measuredHeight = (getMeasuredHeight() - drawable.getIntrinsicHeight()) / 2;
            if (d()) {
                measuredHeight -= AndroidUtilities.dp(1.0f);
            } else {
                iV += AndroidUtilities.dp(2.0f);
            }
        }
        int i10 = iV;
        int i11 = measuredHeight;
        float fE = this.R.e(this.P);
        float fE2 = this.L.e(f());
        float fE3 = this.f29004x.e(this.f29001r > 0 && !this.v) * (1.0f - this.h);
        float fD = this.f28989a0.d(1.0f, false);
        if (fE2 < 1.0f) {
            canvas2.save();
            f10 = 2.0f;
            float f13 = 1.0f - fD;
            canvas2.translate((-AndroidUtilities.dp(24.0f)) * f13, AndroidUtilities.dp(24.0f) * f13);
            float fLerp4 = AndroidUtilities.lerp(0.35f, 1.0f, fD);
            float f14 = i10;
            float f15 = i11;
            canvas2.scale(fLerp4, fLerp4, (drawable.getIntrinsicWidth() / 2.0f) + f14, (drawable.getIntrinsicHeight() / 2.0f) + f15);
            canvas2.rotate(60.0f * f13, (drawable.getIntrinsicWidth() / 2.0f) + f14, (drawable.getIntrinsicHeight() / 2.0f) + f15);
            drawable.setBounds(i10, i11, drawable.getIntrinsicWidth() + i10, drawable.getIntrinsicHeight() + i11);
            drawable.setAlpha((int) ((1.0f - fE3) * 255.0f));
            drawable.draw(canvas2);
            canvas2.restore();
        } else {
            f10 = 2.0f;
        }
        if (this.f28994d0) {
            fLerp = AndroidUtilities.lerp(getMeasuredWidth() - (getMeasuredHeight() / f10), getMeasuredWidth() - AndroidUtilities.dp(4.0f), fE2) - this.I;
            fLerp3 = getCircleHeight() * fE2;
            fLerp2 = ((getMeasuredHeight() - this.J) - AndroidUtilities.dp(4.0f)) - (fLerp3 / f10);
        } else {
            fLerp = AndroidUtilities.lerp(AndroidUtilities.lerp(getMeasuredWidth() - (getMeasuredHeight() / f10), getMeasuredWidth() - AndroidUtilities.dp(4.0f), fE2) - this.I, getMeasuredWidth() - AndroidUtilities.dp(9.0f), fE3);
            fLerp2 = AndroidUtilities.lerp(((getMeasuredHeight() - this.J) - AndroidUtilities.dp(4.0f)) - (getCircleHeight() / f10), getMeasuredHeight() - AndroidUtilities.dp(24.0f), fE3);
            fLerp3 = AndroidUtilities.lerp(getCircleHeight(), AndroidUtilities.dp(32.0f), fE3) * fE2;
        }
        float f16 = fLerp3;
        float f17 = fLerp;
        float fLerp5 = AndroidUtilities.lerp(getCircleWidth(), i6Var.d() + AndroidUtilities.dp(this.A ? 20.0f : 22.0f), fE3);
        float fLerp6 = AndroidUtilities.lerp(fLerp5, f16, this.f29000n) * fE2;
        float f18 = fLerp5 - fLerp6;
        float f19 = f17 - (fLerp6 / f10);
        setPivotX(f19);
        setPivotY(fLerp2);
        int i12 = i11;
        float fLerp7 = AndroidUtilities.lerp(1.0f, 0.79f, this.h);
        if (fE2 > 0.0f) {
            canvas2.save();
            Path path = this.T;
            path.rewind();
            f11 = 0.0f;
            float fMin = Math.min(fLerp6, f16) / f10;
            RectF rectF2 = AndroidUtilities.rectTmp;
            float f20 = f16 / f10;
            float f21 = fLerp2 - f20;
            float f22 = fLerp2 + f20;
            rectF2.set(f17 - fLerp6, f21, f17, f22);
            path.addRoundRect(rectF2, fMin, fMin, Path.Direction.CW);
            float fCenterX = rectF2.centerX();
            float fCenterY = rectF2.centerY();
            float f23 = f19;
            if (this.h > 0.0f) {
                if (this.f28991b0 == null) {
                    this.f28991b0 = getContext().getResources().getDrawable(R.drawable.send_outline);
                }
                this.f28991b0.setColorFilter(paint.getColor(), PorterDuff.Mode.MULTIPLY);
                gf.s.d(this.f28991b0, fCenterX, fCenterY, 17);
                gf.s.b(canvas2, this.f28991b0, this.h);
            } else {
                f17 = f17;
            }
            canvas2.scale(fLerp7, fLerp7, fCenterX, fCenterY);
            if (this.f28993c0 != null) {
                Rect rect = AndroidUtilities.rectTmp2;
                rectF2.round(rect);
                rect.inset(-AndroidUtilities.dp(7.0f), -AndroidUtilities.dp(7.0f));
                this.f28993c0.setBounds(rect);
                this.f28993c0.draw(canvas2);
            }
            if (!this.A) {
                canvas2.drawPath(path, paint);
            }
            canvas2.clipPath(path);
            int i13 = (fE > 0.0f ? 1 : (fE == 0.0f ? 0 : -1));
            if (i13 > 0) {
                Paint paint2 = this.U;
                paint2.setColor(-1);
                paint2.setAlpha((int) (fE * 255.0f));
                float fDp2 = AndroidUtilities.dp(8.66f);
                rectF2.set(f23 - fDp2, fLerp2 - fDp2, f23 + fDp2, fDp2 + fLerp2);
                if (this.N) {
                    long jCurrentTimeMillis = System.currentTimeMillis() % 5400;
                    float interpolation = (1520 * jCurrentTimeMillis) / 5400.0f;
                    float fMax = Math.max(0.0f, interpolation - 20.0f);
                    int i14 = 0;
                    while (i14 < 4) {
                        int i15 = i14 * 1350;
                        long j10 = jCurrentTimeMillis;
                        u1.a aVar = this.O;
                        interpolation += aVar.getInterpolation((j10 - ((long) i15)) / 667.0f) * 250.0f;
                        fMax += aVar.getInterpolation((j10 - ((long) (i15 + 667))) / 667.0f) * 250.0f;
                        i14++;
                        jCurrentTimeMillis = j10;
                    }
                    canvas2 = canvas;
                    f11 = 0.0f;
                    canvas2.drawArc(AndroidUtilities.rectTmp, fMax, interpolation - fMax, false, paint2);
                } else {
                    canvas2 = canvas;
                    canvas2.drawArc(rectF2, ((((System.currentTimeMillis() % 3000) / 1000.0f) * 120.0f) % 360.0f) - 90.0f, this.S.d(this.Q, false) * 360.0f, false, paint2);
                }
                canvas2.save();
                float fLerp8 = AndroidUtilities.lerp(1.0f, 0.6f, fE);
                canvas2.scale(fLerp8, fLerp8, f23, fLerp2);
                invalidate();
            } else {
                fE = fE;
                i12 = i12;
                i13 = i13;
                f23 = f23;
            }
            if (fE3 > f11) {
                if (this.f28994d0) {
                    i6Var.l((f17 - i6Var.d) - AndroidUtilities.dp(11.0f), f21, f17 - AndroidUtilities.dp(11.0f), f22);
                } else if (this.A) {
                    i6Var.l(rectF.left + AndroidUtilities.dp(10.0f), rectF.top, rectF.right, rectF.bottom);
                } else {
                    i6Var.l((getMeasuredWidth() - i6Var.d) - AndroidUtilities.dp(20.0f), getMeasuredHeight() - AndroidUtilities.dp(48.0f), getMeasuredWidth() - AndroidUtilities.dp(20.0f), getMeasuredHeight());
                }
                f12 = 1.0f;
                i6Var.f29257w = (int) ((1.0f - fE) * fE3 * 255.0f);
                i6Var.draw(canvas2);
            } else {
                f12 = 1.0f;
            }
            this.f28995e.setAlpha((int) ((f12 - fE3) * (f12 - fE) * 255.0f));
            if (this.E > 0) {
                Drawable drawable2 = this.f28995e;
                drawable2.setBounds((int) (f23 - (drawable2.getIntrinsicWidth() / f10)), (int) (fLerp2 - (this.f28995e.getIntrinsicHeight() / f10)), (int) ((this.f28995e.getIntrinsicWidth() / f10) + f23), (int) ((this.f28995e.getIntrinsicHeight() / f10) + fLerp2));
            } else {
                this.f28995e.setBounds(i10, i12, drawable.getIntrinsicWidth() + i10, drawable.getIntrinsicHeight() + i12);
            }
            this.f28995e.draw(canvas2);
            if (i13 > 0) {
                canvas2.restore();
            }
            canvas2.restore();
        } else {
            f17 = f17;
            f11 = 0.0f;
        }
        i6 i6Var2 = this.V;
        float fG = (1.0f - fE3) * i6Var2.g();
        if (!this.B) {
            float fMax2 = Math.max(i6Var2.d() + AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f));
            if (this.f28994d0) {
                measuredWidth = (f17 - AndroidUtilities.dp(50.0f)) + f18;
                measuredHeight2 = (fMax2 / f10) + (fLerp2 - (getCircleHeight() / f10));
                fDp = AndroidUtilities.dp(0.66f);
            } else {
                float f24 = fMax2 / f10;
                measuredWidth = (getMeasuredWidth() - this.I) - f24;
                measuredHeight2 = (getMeasuredHeight() - this.J) - f24;
                fDp = 0.0f;
            }
            float f25 = fMax2 / f10;
            i6Var2.setBounds((int) (measuredWidth - f25), (int) ((measuredHeight2 - f25) - fDp), (int) (measuredWidth + f25), (int) ((measuredHeight2 + f25) - fDp));
            if (fG > f11) {
                float fLerp9 = AndroidUtilities.lerp(1.0f, 0.85f, this.h);
                canvas2.save();
                canvas2.scale(fLerp9, fLerp9, measuredWidth, measuredHeight2);
                if (!this.A) {
                    canvas2.drawCircle(measuredWidth, measuredHeight2, (AndroidUtilities.dp(f10) + f25) * fG * this.W, org.telegram.ui.ActionBar.g6.Il);
                    canvas2.drawCircle(measuredWidth, measuredHeight2, f25 * fG * this.W, paint);
                }
                i6Var2.f29257w = (int) (fG * 255.0f);
                i6Var2.draw(canvas2);
                canvas2.restore();
            }
        }
        if (fG < 1.0f) {
            int iDp = AndroidUtilities.dp(8.0f);
            int iLerp = (int) AndroidUtilities.lerp(((getMeasuredWidth() - (getCircleWidth() / f10)) - this.I) + AndroidUtilities.dp(12.0f), f17 - AndroidUtilities.dp(f10), fE3);
            int iLerp2 = (int) AndroidUtilities.lerp(((getMeasuredHeight() - (getCircleHeight() / f10)) - this.J) + AndroidUtilities.dp(10.0f), getMeasuredHeight() - AndroidUtilities.dp(12.0f), fE3);
            int i16 = iLerp - iDp;
            int i17 = iLerp2 - iDp;
            int i18 = iLerp + iDp;
            int i19 = iLerp2 + iDp;
            i5 i5Var = this.f28997f;
            i5Var.setBounds(i16, i17, i18, i19);
            i5Var.v = (int) ((1.0f - fG) * 255.0f);
            i5Var.draw(canvas2);
        }
        if (!this.A) {
            canvas2.restore();
        }
        canvas2.restoreToCount(iSave);
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hg.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBlurredBackgroundDrawable(lg.d dVar) {
        this.f28993c0 = dVar;
        dVar.p(AndroidUtilities.dp(22.0f));
        this.f28993c0.o(AndroidUtilities.dp(4.0f));
    }

    public void setCircleSize(int i10) {
        this.E = i10;
        this.F = i10;
    }

    public void setEffect(long j10) {
        TLRPC.TL_availableEffect effect = MessagesController.getInstance(UserConfig.selectedAccount).getEffect(j10);
        setEmoji(effect != null ? Emoji.getEmojiDrawable(effect.emoticon) : null);
    }

    public void setEmoji(Drawable drawable) {
        this.f28997f.g(drawable, true);
    }

    public void setEphemeralFactor(float f10) {
        if (this.h != f10) {
            this.h = f10;
            invalidate();
        }
    }

    public void setLocked(boolean z10) {
        if (this.B == z10) {
            return;
        }
        this.B = z10;
        invalidate();
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.M.c(z10);
    }

    public void setResourceId(int i10) {
        if (this.f28990b != i10) {
            this.f28990b = i10;
            this.f28992c = getContext().getResources().getDrawable(i10).mutate();
            this.d = getContext().getResources().getDrawable(i10).mutate();
            this.f28995e = getContext().getResources().getDrawable(i10).mutate();
            invalidate();
        }
    }

    public void setSameWidthFactor(float f10) {
        if (this.f29000n != f10) {
            this.f29000n = f10;
            invalidate();
        }
    }

    public void setScrimViewBackgroundColor(int i10) {
        this.G = i10;
        this.H.setColor(i10);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.V || drawable == this.f28997f || drawable == this.f29003w || super.verifyDrawable(drawable);
    }
}
