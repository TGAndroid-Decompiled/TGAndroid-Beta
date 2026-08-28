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
public abstract class lg extends View implements w60 {
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
    public final eq[] K;
    public final y5 L;
    public final pc M;
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
    public final org.telegram.ui.ActionBar.b6 f30431a;
    public final y5 f30432a0;
    public int f30433b;
    public Drawable f30434b0;
    public Drawable f30435c;
    public kg.d f30436c0;
    public Drawable d;
    public boolean f30437d0;
    public Drawable f30438e;
    public int f30439e0;
    public final i5 f30440f;
    public ValueAnimator f30441f0;
    public final RectF f30442g0;
    public float h;
    public float f30443n;
    public long f30444r;
    public int f30445s;
    public boolean v;
    public final i6 f30446w;
    public final y5 f30447x;
    public final Paint f30448y;

    public lg(int i9, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context);
        gr grVar = gr.h;
        this.f30447x = new y5(this, 0L, 320L, grVar);
        this.f30448y = new Paint(1);
        this.E = -1;
        this.F = -1;
        this.H = new Paint(1);
        this.K = new eq[1];
        this.L = new y5(this, 0L, 420L, grVar);
        this.M = new pc(this);
        this.O = new u1.a();
        this.R = new y5(this, 0L, 420L, grVar);
        this.S = new y5(this, 0L, 500L, grVar);
        this.T = new Path();
        Paint paint = new Paint(1);
        this.U = paint;
        i6 i6Var = new i6(true, true, true, false);
        this.V = i6Var;
        this.W = 1.0f;
        this.f30432a0 = new y5(this, 0L, 320L, grVar);
        this.f30442g0 = new RectF();
        this.f30433b = i9;
        this.f30431a = b6Var;
        this.A = z10;
        i6 i6Var2 = new i6(false, false, false, false);
        this.f30446w = i6Var2;
        i6Var2.t(AndroidUtilities.dp(15.0f));
        i6Var2.u(AndroidUtilities.bold());
        i6Var2.r(-1);
        i6Var2.f29333b = 3;
        i6Var2.setCallback(this);
        i6Var2.G = AndroidUtilities.displaySize.x;
        this.f30435c = context.getResources().getDrawable(i9).mutate();
        this.d = context.getResources().getDrawable(i9).mutate();
        this.f30438e = context.getResources().getDrawable(i9).mutate();
        this.f30440f = new i5(AndroidUtilities.dp(14.0f), this);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        i6Var.setCallback(this);
        i6Var.r(-1);
        i6Var.t(AndroidUtilities.dp(12.0f));
        i6Var.u(AndroidUtilities.bold());
        i6Var.f29333b = 17;
    }

    @Override
    public final void a(RectF rectF) {
        float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(4.0f)) - this.I;
        float measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(4.0f)) - this.J;
        rectF.set(measuredWidth - getCircleWidth(), measuredHeight - getCircleHeight(), measuredWidth, measuredHeight);
    }

    @Override
    public final void b(Canvas canvas, float f10) {
        float lerp;
        float lerp2;
        float lerp3;
        float f11;
        float f12;
        float f13;
        int i9 = this.G;
        if (i9 != 0) {
            Paint paint = this.H;
            paint.setColor(i9);
            paint.setAlpha((int) (Color.alpha(this.G) * f10));
            float f14 = this.L.f34854c;
            float f15 = this.f30447x.f34854c;
            if (this.f30437d0) {
                lerp = AndroidUtilities.lerp(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - AndroidUtilities.dp(4.0f), f14) - this.I;
                lerp3 = getCircleHeight() * f14;
                lerp2 = ((getMeasuredHeight() - this.J) - AndroidUtilities.dp(4.0f)) - (lerp3 / 2.0f);
            } else {
                lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - AndroidUtilities.dp(4.0f), f14) - this.I, getMeasuredWidth() - AndroidUtilities.dp(9.0f), f15);
                lerp2 = AndroidUtilities.lerp(((getMeasuredHeight() - this.J) - AndroidUtilities.dp(4.0f)) - (getCircleHeight() / 2.0f), getMeasuredHeight() - AndroidUtilities.dp(24.0f), f15);
                lerp3 = AndroidUtilities.lerp(getCircleHeight(), AndroidUtilities.dp(32.0f), f15) * f14;
            }
            float circleWidth = getCircleWidth();
            if (this.A) {
                f11 = 20.0f;
            } else {
                f11 = 22.0f;
            }
            float lerp4 = AndroidUtilities.lerp(circleWidth, this.f30446w.d() + AndroidUtilities.dp(f11), f15) * f14;
            if (f14 > 0.0f && lerp4 > 0.0f && lerp3 > 0.0f) {
                RectF rectF = AndroidUtilities.rectTmp;
                float f16 = lerp3 / 2.0f;
                rectF.set(lerp - lerp4, lerp2 - f16, lerp, f16 + lerp2);
                rectF.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
                float min = (Math.min(lerp4, lerp3) / 2.0f) + AndroidUtilities.dp(4.0f);
                canvas.drawRoundRect(rectF, min, min, paint);
            }
            i6 i6Var = this.V;
            float g10 = (1.0f - f15) * i6Var.g();
            if (g10 > 0.0f) {
                float max = Math.max(i6Var.d() + AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f));
                if (this.f30437d0) {
                    f12 = lerp - AndroidUtilities.dp(50.0f);
                    f13 = (max / 2.0f) + (lerp2 - (getCircleHeight() / 2.0f));
                } else {
                    float f17 = max / 2.0f;
                    float measuredWidth = (getMeasuredWidth() - this.I) - f17;
                    float measuredHeight = (getMeasuredHeight() - this.J) - f17;
                    f12 = measuredWidth;
                    f13 = measuredHeight;
                }
                canvas.drawCircle(f12, f13, ((max / 2.0f) + AndroidUtilities.dp(2.0f)) * g10 * this.W, paint);
            }
        }
        draw(canvas);
    }

    public final void c() {
        ValueAnimator valueAnimator = this.f30441f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
        this.f30441f0 = ofFloat;
        ofFloat.addUpdateListener(new e6(this, 8));
        this.f30441f0.addListener(new org.telegram.ui.xp(this, 9));
        this.f30441f0.setDuration(180L);
        this.f30441f0.setInterpolator(new OvershootInterpolator());
        this.f30441f0.start();
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
        RectF rectF = this.f30442g0;
        float dp = AndroidUtilities.dp(18.0f) / 2.0f;
        float dp2 = (rectF.left + dp) - AndroidUtilities.dp(6.0f);
        float dp3 = (rectF.top + dp) - AndroidUtilities.dp(6.0f);
        canvas.drawCircle(dp2, dp3, AndroidUtilities.dp(2.0f) + dp, org.telegram.ui.ActionBar.f6.Il);
        canvas.drawCircle(dp2, dp3, dp, this.f30448y);
        if (this.C == null) {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
            this.C = mutate;
            int i9 = this.f30439e0;
            this.D = i9;
            mutate.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN));
        }
        if (this.D != this.f30439e0) {
            Drawable drawable = this.C;
            int i10 = this.f30439e0;
            this.D = i10;
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        this.C.setBounds((int) (dp2 - AndroidUtilities.dp(8.0f)), (int) (dp3 - AndroidUtilities.dp(8.0f)), (int) (dp2 + AndroidUtilities.dp(8.0f)), (int) (dp3 + AndroidUtilities.dp(8.0f)));
        this.C.draw(canvas);
        canvas.restore();
    }

    public boolean e() {
        return false;
    }

    public abstract boolean f();

    public final void g(int i9, boolean z10) {
        String str = "";
        if (i9 > 0) {
            str = j3.r0.l(i9, "");
        }
        this.V.q(str, z10, true);
        invalidate();
    }

    public int getCircleHeight() {
        int i9 = this.F;
        if (i9 >= 0) {
            return i9;
        }
        return getMeasuredHeight() - AndroidUtilities.dp(8.0f);
    }

    public int getCircleWidth() {
        int i9 = this.E;
        if (i9 >= 0) {
            return i9;
        }
        return getMeasuredHeight() - AndroidUtilities.dp(8.0f);
    }

    public int getFillColor() {
        return org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Yd, this.f30431a);
    }

    public final void h(boolean z10) {
        long j10;
        boolean z11;
        float f10 = -3.0f;
        boolean z12 = false;
        if (this.P == z10 && (!z10 || Math.abs(this.Q - (-3.0f)) < 0.01f)) {
            boolean z13 = this.N;
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
        this.N = z12;
        if (!this.P && z10) {
            this.S.d(0.0f, true);
        }
        y5 y5Var = this.R;
        if (z10 && y5Var.f34854c >= 1.0f) {
            j10 = 650;
        } else {
            j10 = 0;
        }
        y5Var.f34856f = j10;
        this.P = z10;
        if (!z10) {
            f10 = 1.0f;
        }
        this.Q = f10;
        invalidate();
    }

    public final void i(int i9, long j10, boolean z10) {
        if (this.f30444r == j10 && this.f30445s == i9) {
            return;
        }
        this.f30444r = j10;
        this.f30445s = i9;
        boolean z11 = false;
        i6 i6Var = this.f30446w;
        if (j10 > 0) {
            i6Var.q(gh.oa.V0(false, j3.r0.n(j10 * Math.max(1, this.f30445s), ',', new StringBuilder("⭐️")), this.K), z10, true);
        } else {
            i6Var.q("", z10, true);
        }
        if (!z10) {
            if (this.f30444r > 0) {
                z11 = true;
            }
            this.f30447x.a(z11);
            return;
        }
        invalidate();
    }

    public boolean j() {
        return this instanceof vh;
    }

    public final void k() {
        int v02;
        boolean z10 = this.A;
        org.telegram.ui.ActionBar.b6 b6Var = this.f30431a;
        if (z10) {
            v02 = -1;
        } else {
            v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Yd, b6Var);
        }
        if (v02 != this.f30439e0) {
            this.f30439e0 = v02;
            Drawable drawable = this.f30435c;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
            int v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Wk, b6Var);
            this.d.setColorFilter(new PorterDuffColorFilter(Color.argb(180, Color.red(v03), Color.green(v03), Color.blue(v03)), mode));
            this.f30438e.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f22973bf, b6Var), mode));
        }
        boolean z11 = this.A;
        Paint paint = this.f30448y;
        if (z11) {
            paint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Yd, b6Var));
        } else if (j()) {
            paint.setColor(getFillColor());
        } else {
            paint.setColor(i0.a.k(-1, 75));
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
        if (f()) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (this.f30444r > 0) {
            f12 = 1.0f;
        }
        float circleWidth = this.I + getCircleWidth() + this.I;
        int dp = AndroidUtilities.dp(18.0f);
        if (this.A) {
            f11 = 20.0f;
        } else {
            f11 = 22.0f;
        }
        return (int) AndroidUtilities.lerp(circleWidth, AndroidUtilities.dp(f11) + dp + this.f30446w.d, f12 * f10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Drawable drawable;
        int x10;
        int measuredHeight;
        boolean z10;
        float f10;
        float f11;
        float lerp;
        float lerp2;
        float lerp3;
        float f12;
        int i9;
        float f13;
        float f14;
        float measuredWidth;
        float measuredHeight2;
        float f15;
        int i10;
        float f16;
        int i11;
        int i12;
        float f17;
        float f18;
        Drawable drawable2;
        int i13;
        int save = canvas.save();
        if (!this.A) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
        }
        k();
        float dpf2 = AndroidUtilities.dpf2(3.0f);
        float dpf22 = AndroidUtilities.dpf2(38.0f);
        float dpf23 = AndroidUtilities.dpf2(20.0f);
        i6 i6Var = this.f30446w;
        float lerp4 = AndroidUtilities.lerp(Math.max(dpf22, i6Var.d() + dpf23), dpf22, this.f30443n);
        RectF rectF = this.f30442g0;
        rectF.set((getMeasuredWidth() - lerp4) - dpf2, (getMeasuredHeight() - dpf22) - dpf2, getMeasuredWidth() - dpf2, getMeasuredHeight() - dpf2);
        boolean z11 = this.A;
        Paint paint = this.f30448y;
        if (z11) {
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f), paint);
        }
        if (e()) {
            drawable = this.d;
        } else {
            drawable = this.f30435c;
        }
        Drawable drawable3 = drawable;
        if (this.A) {
            x10 = Math.round((rectF.right - (rectF.height() / 2.0f)) - (drawable3.getIntrinsicWidth() / 2.0f));
            measuredHeight = Math.round(((rectF.height() / 2.0f) + rectF.top) - (drawable3.getIntrinsicHeight() / 2.0f));
        } else {
            x10 = org.telegram.messenger.ll.x(2, getMeasuredWidth() - (getMeasuredHeight() / 2), drawable3);
            measuredHeight = (getMeasuredHeight() - drawable3.getIntrinsicHeight()) / 2;
            if (d()) {
                measuredHeight -= AndroidUtilities.dp(1.0f);
            } else {
                x10 += AndroidUtilities.dp(2.0f);
            }
        }
        int i14 = x10;
        int i15 = measuredHeight;
        float e10 = this.R.e(this.P);
        float e11 = this.L.e(f());
        if (this.f30444r > 0 && !this.v) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e12 = this.f30447x.e(z10) * (1.0f - this.h);
        float d = this.f30432a0.d(1.0f, false);
        if (e11 < 1.0f) {
            canvas2.save();
            f11 = 2.0f;
            float f19 = 1.0f - d;
            canvas2.translate((-AndroidUtilities.dp(24.0f)) * f19, AndroidUtilities.dp(24.0f) * f19);
            float lerp5 = AndroidUtilities.lerp(0.35f, 1.0f, d);
            float f20 = i14;
            float f21 = i15;
            f10 = e10;
            canvas2.scale(lerp5, lerp5, (drawable3.getIntrinsicWidth() / 2.0f) + f20, (drawable3.getIntrinsicHeight() / 2.0f) + f21);
            canvas2.rotate(60.0f * f19, (drawable3.getIntrinsicWidth() / 2.0f) + f20, (drawable3.getIntrinsicHeight() / 2.0f) + f21);
            drawable3.setBounds(i14, i15, drawable3.getIntrinsicWidth() + i14, drawable3.getIntrinsicHeight() + i15);
            drawable3.setAlpha((int) ((1.0f - e12) * 255.0f));
            drawable3.draw(canvas2);
            canvas2.restore();
        } else {
            f10 = e10;
            f11 = 2.0f;
        }
        if (this.f30437d0) {
            lerp = AndroidUtilities.lerp(getMeasuredWidth() - (getMeasuredHeight() / f11), getMeasuredWidth() - AndroidUtilities.dp(4.0f), e11) - this.I;
            lerp3 = getCircleHeight() * e11;
            lerp2 = ((getMeasuredHeight() - this.J) - AndroidUtilities.dp(4.0f)) - (lerp3 / f11);
        } else {
            lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(getMeasuredWidth() - (getMeasuredHeight() / f11), getMeasuredWidth() - AndroidUtilities.dp(4.0f), e11) - this.I, getMeasuredWidth() - AndroidUtilities.dp(9.0f), e12);
            lerp2 = AndroidUtilities.lerp(((getMeasuredHeight() - this.J) - AndroidUtilities.dp(4.0f)) - (getCircleHeight() / f11), getMeasuredHeight() - AndroidUtilities.dp(24.0f), e12);
            lerp3 = AndroidUtilities.lerp(getCircleHeight(), AndroidUtilities.dp(32.0f), e12) * e11;
        }
        float f22 = lerp3;
        float f23 = lerp;
        float circleWidth = getCircleWidth();
        if (this.A) {
            f12 = 20.0f;
        } else {
            f12 = 22.0f;
        }
        float lerp6 = AndroidUtilities.lerp(circleWidth, i6Var.d() + AndroidUtilities.dp(f12), e12);
        float lerp7 = AndroidUtilities.lerp(lerp6, f22, this.f30443n) * e11;
        float f24 = lerp6 - lerp7;
        float f25 = f23 - (lerp7 / f11);
        setPivotX(f25);
        setPivotY(lerp2);
        float lerp8 = AndroidUtilities.lerp(1.0f, 0.79f, this.h);
        if (e11 > 0.0f) {
            canvas2.save();
            Path path = this.T;
            path.rewind();
            f14 = 0.0f;
            float min = Math.min(lerp7, f22) / f11;
            RectF rectF2 = AndroidUtilities.rectTmp;
            float f26 = f22 / f11;
            float f27 = lerp2 - f26;
            i9 = save;
            float f28 = lerp2 + f26;
            rectF2.set(f23 - lerp7, f27, f23, f28);
            path.addRoundRect(rectF2, min, min, Path.Direction.CW);
            float centerX = rectF2.centerX();
            float centerY = rectF2.centerY();
            if (this.h > 0.0f) {
                if (this.f30434b0 == null) {
                    f13 = f23;
                    this.f30434b0 = getContext().getResources().getDrawable(R.drawable.send_outline);
                } else {
                    f13 = f23;
                }
                i10 = i14;
                this.f30434b0.setColorFilter(paint.getColor(), PorterDuff.Mode.MULTIPLY);
                ff.s.d(this.f30434b0, centerX, centerY, 17);
                ff.s.b(canvas2, this.f30434b0, this.h);
            } else {
                f13 = f23;
                i10 = i14;
            }
            canvas2.scale(lerp8, lerp8, centerX, centerY);
            if (this.f30436c0 != null) {
                Rect rect = AndroidUtilities.rectTmp2;
                rectF2.round(rect);
                rect.inset(-AndroidUtilities.dp(7.0f), -AndroidUtilities.dp(7.0f));
                this.f30436c0.setBounds(rect);
                this.f30436c0.draw(canvas2);
            }
            if (!this.A) {
                canvas2.drawPath(path, paint);
            }
            canvas2.clipPath(path);
            int i16 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i16 > 0) {
                Paint paint2 = this.U;
                paint2.setColor(-1);
                paint2.setAlpha((int) (f10 * 255.0f));
                float dp = AndroidUtilities.dp(8.66f);
                rectF2.set(f25 - dp, lerp2 - dp, f25 + dp, dp + lerp2);
                if (this.N) {
                    long currentTimeMillis = System.currentTimeMillis() % 5400;
                    float f29 = ((float) (1520 * currentTimeMillis)) / 5400.0f;
                    float max = Math.max(0.0f, f29 - 20.0f);
                    int i17 = 0;
                    while (i17 < 4) {
                        long j10 = currentTimeMillis;
                        u1.a aVar = this.O;
                        f29 += aVar.getInterpolation(((float) (j10 - (i17 * 1350))) / 667.0f) * 250.0f;
                        max += aVar.getInterpolation(((float) (j10 - (i13 + 667))) / 667.0f) * 250.0f;
                        i17++;
                        currentTimeMillis = j10;
                    }
                    canvas2 = canvas;
                    f16 = f10;
                    i11 = i15;
                    f14 = 0.0f;
                    i12 = i16;
                    f17 = f25;
                    canvas2.drawArc(AndroidUtilities.rectTmp, max, f29 - max, false, paint2);
                } else {
                    f16 = f10;
                    i11 = i15;
                    i12 = i16;
                    f17 = f25;
                    canvas2 = canvas;
                    canvas2.drawArc(rectF2, (((((float) (System.currentTimeMillis() % 3000)) / 1000.0f) * 120.0f) % 360.0f) - 90.0f, this.S.d(this.Q, false) * 360.0f, false, paint2);
                }
                canvas2.save();
                float lerp9 = AndroidUtilities.lerp(1.0f, 0.6f, f16);
                canvas2.scale(lerp9, lerp9, f17, lerp2);
                invalidate();
            } else {
                f16 = f10;
                i11 = i15;
                i12 = i16;
                f17 = f25;
            }
            if (e12 > f14) {
                if (this.f30437d0) {
                    i6Var.l((f13 - i6Var.d) - AndroidUtilities.dp(11.0f), f27, f13 - AndroidUtilities.dp(11.0f), f28);
                } else if (this.A) {
                    i6Var.l(rectF.left + AndroidUtilities.dp(10.0f), rectF.top, rectF.right, rectF.bottom);
                } else {
                    i6Var.l((getMeasuredWidth() - i6Var.d) - AndroidUtilities.dp(20.0f), getMeasuredHeight() - AndroidUtilities.dp(48.0f), getMeasuredWidth() - AndroidUtilities.dp(20.0f), getMeasuredHeight());
                }
                f18 = 1.0f;
                i6Var.f29351w = (int) ((1.0f - f16) * e12 * 255.0f);
                i6Var.draw(canvas2);
            } else {
                f18 = 1.0f;
            }
            this.f30438e.setAlpha((int) ((f18 - e12) * (f18 - f16) * 255.0f));
            if (this.E > 0) {
                this.f30438e.setBounds((int) (f17 - (drawable2.getIntrinsicWidth() / f11)), (int) (lerp2 - (this.f30438e.getIntrinsicHeight() / f11)), (int) ((this.f30438e.getIntrinsicWidth() / f11) + f17), (int) ((this.f30438e.getIntrinsicHeight() / f11) + lerp2));
            } else {
                this.f30438e.setBounds(i10, i11, drawable3.getIntrinsicWidth() + i10, drawable3.getIntrinsicHeight() + i11);
            }
            this.f30438e.draw(canvas2);
            if (i12 > 0) {
                canvas2.restore();
            }
            canvas2.restore();
        } else {
            i9 = save;
            f13 = f23;
            f14 = 0.0f;
        }
        i6 i6Var2 = this.V;
        float g10 = (1.0f - e12) * i6Var2.g();
        if (!this.B) {
            float max2 = Math.max(i6Var2.d() + AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f));
            if (this.f30437d0) {
                measuredWidth = (f13 - AndroidUtilities.dp(50.0f)) + f24;
                measuredHeight2 = (max2 / f11) + (lerp2 - (getCircleHeight() / f11));
                f15 = AndroidUtilities.dp(0.66f);
            } else {
                float f30 = max2 / f11;
                measuredWidth = (getMeasuredWidth() - this.I) - f30;
                measuredHeight2 = (getMeasuredHeight() - this.J) - f30;
                f15 = 0.0f;
            }
            float f31 = max2 / f11;
            i6Var2.setBounds((int) (measuredWidth - f31), (int) ((measuredHeight2 - f31) - f15), (int) (measuredWidth + f31), (int) ((measuredHeight2 + f31) - f15));
            if (g10 > f14) {
                float lerp10 = AndroidUtilities.lerp(1.0f, 0.85f, this.h);
                canvas2.save();
                canvas2.scale(lerp10, lerp10, measuredWidth, measuredHeight2);
                if (!this.A) {
                    canvas2.drawCircle(measuredWidth, measuredHeight2, (AndroidUtilities.dp(f11) + f31) * g10 * this.W, org.telegram.ui.ActionBar.f6.Il);
                    canvas2.drawCircle(measuredWidth, measuredHeight2, f31 * g10 * this.W, paint);
                }
                i6Var2.f29351w = (int) (g10 * 255.0f);
                i6Var2.draw(canvas2);
                canvas2.restore();
            }
        }
        if (g10 < 1.0f) {
            int dp2 = AndroidUtilities.dp(8.0f);
            int lerp11 = (int) AndroidUtilities.lerp(((getMeasuredWidth() - (getCircleWidth() / f11)) - this.I) + AndroidUtilities.dp(12.0f), f13 - AndroidUtilities.dp(f11), e12);
            int lerp12 = (int) AndroidUtilities.lerp(((getMeasuredHeight() - (getCircleHeight() / f11)) - this.J) + AndroidUtilities.dp(10.0f), getMeasuredHeight() - AndroidUtilities.dp(12.0f), e12);
            int i18 = lerp11 - dp2;
            int i19 = lerp12 - dp2;
            int i20 = lerp11 + dp2;
            int i21 = lerp12 + dp2;
            i5 i5Var = this.f30440f;
            i5Var.setBounds(i18, i19, i20, i21);
            i5Var.v = (int) ((1.0f - g10) * 255.0f);
            i5Var.draw(canvas2);
        }
        if (!this.A) {
            canvas2.restore();
        }
        canvas2.restoreToCount(i9);
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lg.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBlurredBackgroundDrawable(kg.d dVar) {
        this.f30436c0 = dVar;
        dVar.p(AndroidUtilities.dp(22.0f));
        this.f30436c0.o(AndroidUtilities.dp(4.0f));
    }

    public void setCircleSize(int i9) {
        this.E = i9;
        this.F = i9;
    }

    public void setEffect(long j10) {
        Emoji.EmojiDrawable emojiDrawable;
        TLRPC.TL_availableEffect effect = MessagesController.getInstance(UserConfig.selectedAccount).getEffect(j10);
        if (effect != null) {
            emojiDrawable = Emoji.getEmojiDrawable(effect.emoticon);
        } else {
            emojiDrawable = null;
        }
        setEmoji(emojiDrawable);
    }

    public void setEmoji(Drawable drawable) {
        this.f30440f.g(drawable, true);
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

    public void setResourceId(int i9) {
        if (this.f30433b != i9) {
            this.f30433b = i9;
            this.f30435c = getContext().getResources().getDrawable(i9).mutate();
            this.d = getContext().getResources().getDrawable(i9).mutate();
            this.f30438e = getContext().getResources().getDrawable(i9).mutate();
            invalidate();
        }
    }

    public void setSameWidthFactor(float f10) {
        if (this.f30443n != f10) {
            this.f30443n = f10;
            invalidate();
        }
    }

    public void setScrimViewBackgroundColor(int i9) {
        this.G = i9;
        this.H.setColor(i9);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.V && drawable != this.f30440f && drawable != this.f30446w && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
