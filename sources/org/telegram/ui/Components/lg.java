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
public abstract class lg extends View implements o70 {
    public boolean B;
    public boolean C;
    public Drawable D;
    public int E;
    public int F;
    public int G;
    public int H;
    public final Paint I;
    public float J;
    public float K;
    public final lq[] L;
    public final z5 M;
    public final rc N;
    public boolean O;
    public final u1.a P;
    public boolean Q;
    public float R;
    public final z5 S;
    public final z5 T;
    public final Path U;
    public final Paint V;
    public final j6 W;
    public final org.telegram.ui.ActionBar.f6 f26655a;
    public float f26656a0;
    public int f26657b;
    public final z5 f26658b0;
    public Drawable f26659c;
    public Drawable f26660c0;
    public Drawable d;
    public pg.b f26661d0;
    public Drawable e;
    public boolean f26662e0;
    public final j5 f26663f;
    public int f26664f0;
    public ValueAnimator f26665g0;
    public float h;
    public final RectF f26666h0;
    public float f26667n;
    public long f26668r;
    public int f26669s;
    public boolean v;
    public final j6 f26670w;
    public final z5 f26671x;
    public final Paint f26672y;

    public lg(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        super(context);
        mr mrVar = mr.h;
        this.f26671x = new z5(this, 0L, 320L, mrVar);
        this.f26672y = new Paint(1);
        this.F = -1;
        this.G = -1;
        this.I = new Paint(1);
        this.L = new lq[1];
        this.M = new z5(this, 0L, 420L, mrVar);
        this.N = new rc(this);
        this.P = new u1.a();
        this.S = new z5(this, 0L, 420L, mrVar);
        this.T = new z5(this, 0L, 500L, mrVar);
        this.U = new Path();
        Paint paint = new Paint(1);
        this.V = paint;
        j6 j6Var = new j6(true, true, true, false);
        this.W = j6Var;
        this.f26656a0 = 1.0f;
        this.f26658b0 = new z5(this, 0L, 320L, mrVar);
        this.f26666h0 = new RectF();
        this.f26657b = i10;
        this.f26655a = f6Var;
        this.B = z4;
        j6 j6Var2 = new j6(false, false, false, false);
        this.f26670w = j6Var2;
        j6Var2.t(AndroidUtilities.dp(15.0f));
        j6Var2.u(AndroidUtilities.bold());
        j6Var2.r(-1);
        j6Var2.f25847b = 3;
        j6Var2.setCallback(this);
        j6Var2.G = AndroidUtilities.displaySize.x;
        this.f26659c = context.getResources().getDrawable(i10).mutate();
        this.d = context.getResources().getDrawable(i10).mutate();
        this.e = context.getResources().getDrawable(i10).mutate();
        this.f26663f = new j5(AndroidUtilities.dp(14.0f), this);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        j6Var.setCallback(this);
        j6Var.r(-1);
        j6Var.t(AndroidUtilities.dp(12.0f));
        j6Var.u(AndroidUtilities.bold());
        j6Var.f25847b = 17;
    }

    @Override
    public final void a(RectF rectF) {
        float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(4.0f)) - this.J;
        float measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(4.0f)) - this.K;
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
        int i10 = this.H;
        if (i10 != 0) {
            Paint paint = this.I;
            paint.setColor(i10);
            paint.setAlpha((int) (Color.alpha(this.H) * f10));
            float f14 = this.M.f31253c;
            float f15 = this.f26671x.f31253c;
            if (this.f26662e0) {
                lerp = AndroidUtilities.lerp(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - AndroidUtilities.dp(4.0f), f14) - this.J;
                lerp3 = getCircleHeight() * f14;
                lerp2 = ((getMeasuredHeight() - this.K) - AndroidUtilities.dp(4.0f)) - (lerp3 / 2.0f);
            } else {
                lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - AndroidUtilities.dp(4.0f), f14) - this.J, getMeasuredWidth() - AndroidUtilities.dp(9.0f), f15);
                lerp2 = AndroidUtilities.lerp(((getMeasuredHeight() - this.K) - AndroidUtilities.dp(4.0f)) - (getCircleHeight() / 2.0f), getMeasuredHeight() - AndroidUtilities.dp(24.0f), f15);
                lerp3 = AndroidUtilities.lerp(getCircleHeight(), AndroidUtilities.dp(32.0f), f15) * f14;
            }
            float circleWidth = getCircleWidth();
            if (this.B) {
                f11 = 20.0f;
            } else {
                f11 = 22.0f;
            }
            float lerp4 = AndroidUtilities.lerp(circleWidth, this.f26670w.d() + AndroidUtilities.dp(f11), f15) * f14;
            if (f14 > 0.0f && lerp4 > 0.0f && lerp3 > 0.0f) {
                RectF rectF = AndroidUtilities.rectTmp;
                float f16 = lerp3 / 2.0f;
                rectF.set(lerp - lerp4, lerp2 - f16, lerp, f16 + lerp2);
                rectF.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
                float min = (Math.min(lerp4, lerp3) / 2.0f) + AndroidUtilities.dp(4.0f);
                canvas.drawRoundRect(rectF, min, min, paint);
            }
            j6 j6Var = this.W;
            float g10 = (1.0f - f15) * j6Var.g();
            if (g10 > 0.0f) {
                float max = Math.max(j6Var.d() + AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f));
                if (this.f26662e0) {
                    f12 = lerp - AndroidUtilities.dp(50.0f);
                    f13 = (max / 2.0f) + (lerp2 - (getCircleHeight() / 2.0f));
                } else {
                    float f17 = max / 2.0f;
                    float measuredWidth = (getMeasuredWidth() - this.J) - f17;
                    float measuredHeight = (getMeasuredHeight() - this.K) - f17;
                    f12 = measuredWidth;
                    f13 = measuredHeight;
                }
                canvas.drawCircle(f12, f13, ((max / 2.0f) + AndroidUtilities.dp(2.0f)) * g10 * this.f26656a0, paint);
            }
        }
        draw(canvas);
    }

    public final void c() {
        ValueAnimator valueAnimator = this.f26665g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
        this.f26665g0 = ofFloat;
        ofFloat.addUpdateListener(new f6(this, 8));
        this.f26665g0.addListener(new a9(this, 2));
        this.f26665g0.setDuration(180L);
        this.f26665g0.setInterpolator(new OvershootInterpolator());
        this.f26665g0.start();
    }

    public boolean d() {
        return false;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (!this.C) {
            super.draw(canvas);
            return;
        }
        canvas.saveLayerAlpha(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(6.0f), getWidth(), getHeight(), 255, 31);
        super.draw(canvas);
        RectF rectF = this.f26666h0;
        float dp = AndroidUtilities.dp(18.0f) / 2.0f;
        float dp2 = (rectF.left + dp) - AndroidUtilities.dp(6.0f);
        float dp3 = (rectF.top + dp) - AndroidUtilities.dp(6.0f);
        canvas.drawCircle(dp2, dp3, AndroidUtilities.dp(2.0f) + dp, org.telegram.ui.ActionBar.j6.Il);
        canvas.drawCircle(dp2, dp3, dp, this.f26672y);
        if (this.D == null) {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
            this.D = mutate;
            int i10 = this.f26664f0;
            this.E = i10;
            mutate.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        if (this.E != this.f26664f0) {
            Drawable drawable = this.D;
            int i11 = this.f26664f0;
            this.E = i11;
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        }
        this.D.setBounds((int) (dp2 - AndroidUtilities.dp(8.0f)), (int) (dp3 - AndroidUtilities.dp(8.0f)), (int) (dp2 + AndroidUtilities.dp(8.0f)), (int) (dp3 + AndroidUtilities.dp(8.0f)));
        this.D.draw(canvas);
        canvas.restore();
    }

    public boolean e() {
        return false;
    }

    public abstract boolean f();

    public final void g(int i10, boolean z4) {
        String str = "";
        if (i10 > 0) {
            str = kf.k0.j(i10, "");
        }
        this.W.q(str, z4, true);
        invalidate();
    }

    public int getCircleHeight() {
        int i10 = this.G;
        if (i10 >= 0) {
            return i10;
        }
        return getMeasuredHeight() - AndroidUtilities.dp(8.0f);
    }

    public int getCircleWidth() {
        int i10 = this.F;
        if (i10 >= 0) {
            return i10;
        }
        return getMeasuredHeight() - AndroidUtilities.dp(8.0f);
    }

    public int getFillColor() {
        return org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Yd, this.f26655a);
    }

    public final void h(boolean z4) {
        long j10;
        boolean z10;
        float f10 = -3.0f;
        boolean z11 = false;
        if (this.Q == z4 && (!z4 || Math.abs(this.R - (-3.0f)) < 0.01f)) {
            boolean z12 = this.O;
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
        this.O = z11;
        if (!this.Q && z4) {
            this.T.d(0.0f, true);
        }
        z5 z5Var = this.S;
        if (z4 && z5Var.f31253c >= 1.0f) {
            j10 = 650;
        } else {
            j10 = 0;
        }
        z5Var.f31254f = j10;
        this.Q = z4;
        if (!z4) {
            f10 = 1.0f;
        }
        this.R = f10;
        invalidate();
    }

    public final void i(int i10, long j10, boolean z4) {
        if (this.f26668r == j10 && this.f26669s == i10) {
            return;
        }
        this.f26668r = j10;
        this.f26669s = i10;
        boolean z10 = false;
        j6 j6Var = this.f26670w;
        if (j10 > 0) {
            j6Var.q(lh.ja.V0(false, kf.k0.l(j10 * Math.max(1, this.f26669s), ',', new StringBuilder("⭐️")), this.L), z4, true);
        } else {
            j6Var.q("", z4, true);
        }
        if (!z4) {
            if (this.f26668r > 0) {
                z10 = true;
            }
            this.f26671x.a(z10);
            return;
        }
        invalidate();
    }

    public boolean j() {
        return this instanceof vh;
    }

    public final void k() {
        int v02;
        boolean z4 = this.B;
        org.telegram.ui.ActionBar.f6 f6Var = this.f26655a;
        if (z4) {
            v02 = -1;
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Yd, f6Var);
        }
        if (v02 != this.f26664f0) {
            this.f26664f0 = v02;
            Drawable drawable = this.f26659c;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
            int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Wk, f6Var);
            this.d.setColorFilter(new PorterDuffColorFilter(Color.argb(180, Color.red(v03), Color.green(v03), Color.blue(v03)), mode));
            this.e.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19854bf, f6Var), mode));
        }
        boolean z10 = this.B;
        Paint paint = this.f26672y;
        if (z10) {
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Yd, f6Var));
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
        if (this.f26668r > 0) {
            f12 = 1.0f;
        }
        float circleWidth = this.J + getCircleWidth() + this.J;
        int dp = AndroidUtilities.dp(18.0f);
        if (this.B) {
            f11 = 20.0f;
        } else {
            f11 = 22.0f;
        }
        return (int) AndroidUtilities.lerp(circleWidth, AndroidUtilities.dp(f11) + dp + this.f26670w.d, f12 * f10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Drawable drawable;
        int u10;
        int measuredHeight;
        boolean z4;
        float f10;
        float f11;
        float lerp;
        float lerp2;
        float lerp3;
        float f12;
        int i10;
        float f13;
        float f14;
        float measuredWidth;
        float measuredHeight2;
        float f15;
        int i11;
        float f16;
        int i12;
        int i13;
        float f17;
        float f18;
        Drawable drawable2;
        int i14;
        int save = canvas.save();
        if (!this.B) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
        }
        k();
        float dpf2 = AndroidUtilities.dpf2(3.0f);
        float dpf22 = AndroidUtilities.dpf2(38.0f);
        float dpf23 = AndroidUtilities.dpf2(20.0f);
        j6 j6Var = this.f26670w;
        float lerp4 = AndroidUtilities.lerp(Math.max(dpf22, j6Var.d() + dpf23), dpf22, this.f26667n);
        RectF rectF = this.f26666h0;
        rectF.set((getMeasuredWidth() - lerp4) - dpf2, (getMeasuredHeight() - dpf22) - dpf2, getMeasuredWidth() - dpf2, getMeasuredHeight() - dpf2);
        boolean z10 = this.B;
        Paint paint = this.f26672y;
        if (z10) {
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f), paint);
        }
        if (e()) {
            drawable = this.d;
        } else {
            drawable = this.f26659c;
        }
        Drawable drawable3 = drawable;
        if (this.B) {
            u10 = Math.round((rectF.right - (rectF.height() / 2.0f)) - (drawable3.getIntrinsicWidth() / 2.0f));
            measuredHeight = Math.round(((rectF.height() / 2.0f) + rectF.top) - (drawable3.getIntrinsicHeight() / 2.0f));
        } else {
            u10 = org.telegram.ui.b.u(2, getMeasuredWidth() - (getMeasuredHeight() / 2), drawable3);
            measuredHeight = (getMeasuredHeight() - drawable3.getIntrinsicHeight()) / 2;
            if (d()) {
                measuredHeight -= AndroidUtilities.dp(1.0f);
            } else {
                u10 += AndroidUtilities.dp(2.0f);
            }
        }
        int i15 = u10;
        int i16 = measuredHeight;
        float e = this.S.e(this.Q);
        float e6 = this.M.e(f());
        if (this.f26668r > 0 && !this.v) {
            z4 = true;
        } else {
            z4 = false;
        }
        float e10 = this.f26671x.e(z4) * (1.0f - this.h);
        float d = this.f26658b0.d(1.0f, false);
        if (e6 < 1.0f) {
            canvas2.save();
            f11 = 2.0f;
            float f19 = 1.0f - d;
            canvas2.translate((-AndroidUtilities.dp(24.0f)) * f19, AndroidUtilities.dp(24.0f) * f19);
            float lerp5 = AndroidUtilities.lerp(0.35f, 1.0f, d);
            float f20 = i15;
            float f21 = i16;
            f10 = e;
            canvas2.scale(lerp5, lerp5, (drawable3.getIntrinsicWidth() / 2.0f) + f20, (drawable3.getIntrinsicHeight() / 2.0f) + f21);
            canvas2.rotate(60.0f * f19, (drawable3.getIntrinsicWidth() / 2.0f) + f20, (drawable3.getIntrinsicHeight() / 2.0f) + f21);
            drawable3.setBounds(i15, i16, drawable3.getIntrinsicWidth() + i15, drawable3.getIntrinsicHeight() + i16);
            drawable3.setAlpha((int) ((1.0f - e10) * 255.0f));
            drawable3.draw(canvas2);
            canvas2.restore();
        } else {
            f10 = e;
            f11 = 2.0f;
        }
        if (this.f26662e0) {
            lerp = AndroidUtilities.lerp(getMeasuredWidth() - (getMeasuredHeight() / f11), getMeasuredWidth() - AndroidUtilities.dp(4.0f), e6) - this.J;
            lerp3 = getCircleHeight() * e6;
            lerp2 = ((getMeasuredHeight() - this.K) - AndroidUtilities.dp(4.0f)) - (lerp3 / f11);
        } else {
            lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(getMeasuredWidth() - (getMeasuredHeight() / f11), getMeasuredWidth() - AndroidUtilities.dp(4.0f), e6) - this.J, getMeasuredWidth() - AndroidUtilities.dp(9.0f), e10);
            lerp2 = AndroidUtilities.lerp(((getMeasuredHeight() - this.K) - AndroidUtilities.dp(4.0f)) - (getCircleHeight() / f11), getMeasuredHeight() - AndroidUtilities.dp(24.0f), e10);
            lerp3 = AndroidUtilities.lerp(getCircleHeight(), AndroidUtilities.dp(32.0f), e10) * e6;
        }
        float f22 = lerp3;
        float f23 = lerp;
        float circleWidth = getCircleWidth();
        if (this.B) {
            f12 = 20.0f;
        } else {
            f12 = 22.0f;
        }
        float lerp6 = AndroidUtilities.lerp(circleWidth, j6Var.d() + AndroidUtilities.dp(f12), e10);
        float lerp7 = AndroidUtilities.lerp(lerp6, f22, this.f26667n) * e6;
        float f24 = lerp6 - lerp7;
        float f25 = f23 - (lerp7 / f11);
        setPivotX(f25);
        setPivotY(lerp2);
        float lerp8 = AndroidUtilities.lerp(1.0f, 0.79f, this.h);
        if (e6 > 0.0f) {
            canvas2.save();
            Path path = this.U;
            path.rewind();
            f14 = 0.0f;
            float min = Math.min(lerp7, f22) / f11;
            RectF rectF2 = AndroidUtilities.rectTmp;
            float f26 = f22 / f11;
            float f27 = lerp2 - f26;
            i10 = save;
            float f28 = lerp2 + f26;
            rectF2.set(f23 - lerp7, f27, f23, f28);
            path.addRoundRect(rectF2, min, min, Path.Direction.CW);
            float centerX = rectF2.centerX();
            float centerY = rectF2.centerY();
            if (this.h > 0.0f) {
                if (this.f26660c0 == null) {
                    f13 = f23;
                    this.f26660c0 = getContext().getResources().getDrawable(R.drawable.send_outline);
                } else {
                    f13 = f23;
                }
                i11 = i15;
                this.f26660c0.setColorFilter(paint.getColor(), PorterDuff.Mode.MULTIPLY);
                kf.r.d(this.f26660c0, centerX, centerY, 17);
                kf.r.b(canvas2, this.f26660c0, this.h);
            } else {
                f13 = f23;
                i11 = i15;
            }
            canvas2.scale(lerp8, lerp8, centerX, centerY);
            if (this.f26661d0 != null) {
                Rect rect = AndroidUtilities.rectTmp2;
                rectF2.round(rect);
                rect.inset(-AndroidUtilities.dp(7.0f), -AndroidUtilities.dp(7.0f));
                this.f26661d0.setBounds(rect);
                this.f26661d0.draw(canvas2);
            }
            if (!this.B) {
                canvas2.drawPath(path, paint);
            }
            canvas2.clipPath(path);
            int i17 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i17 > 0) {
                Paint paint2 = this.V;
                paint2.setColor(-1);
                paint2.setAlpha((int) (f10 * 255.0f));
                float dp = AndroidUtilities.dp(8.66f);
                rectF2.set(f25 - dp, lerp2 - dp, f25 + dp, dp + lerp2);
                if (this.O) {
                    long currentTimeMillis = System.currentTimeMillis() % 5400;
                    float f29 = ((float) (1520 * currentTimeMillis)) / 5400.0f;
                    float max = Math.max(0.0f, f29 - 20.0f);
                    int i18 = 0;
                    while (i18 < 4) {
                        long j10 = currentTimeMillis;
                        u1.a aVar = this.P;
                        f29 += aVar.getInterpolation(((float) (j10 - (i18 * 1350))) / 667.0f) * 250.0f;
                        max += aVar.getInterpolation(((float) (j10 - (i14 + 667))) / 667.0f) * 250.0f;
                        i18++;
                        currentTimeMillis = j10;
                    }
                    canvas2 = canvas;
                    f16 = f10;
                    i12 = i16;
                    f14 = 0.0f;
                    i13 = i17;
                    f17 = f25;
                    canvas2.drawArc(AndroidUtilities.rectTmp, max, f29 - max, false, paint2);
                } else {
                    f16 = f10;
                    i12 = i16;
                    i13 = i17;
                    f17 = f25;
                    canvas2 = canvas;
                    canvas2.drawArc(rectF2, (((((float) (System.currentTimeMillis() % 3000)) / 1000.0f) * 120.0f) % 360.0f) - 90.0f, this.T.d(this.R, false) * 360.0f, false, paint2);
                }
                canvas2.save();
                float lerp9 = AndroidUtilities.lerp(1.0f, 0.6f, f16);
                canvas2.scale(lerp9, lerp9, f17, lerp2);
                invalidate();
            } else {
                f16 = f10;
                i12 = i16;
                i13 = i17;
                f17 = f25;
            }
            if (e10 > f14) {
                if (this.f26662e0) {
                    j6Var.l((f13 - j6Var.d) - AndroidUtilities.dp(11.0f), f27, f13 - AndroidUtilities.dp(11.0f), f28);
                } else if (this.B) {
                    j6Var.l(rectF.left + AndroidUtilities.dp(10.0f), rectF.top, rectF.right, rectF.bottom);
                } else {
                    j6Var.l((getMeasuredWidth() - j6Var.d) - AndroidUtilities.dp(20.0f), getMeasuredHeight() - AndroidUtilities.dp(48.0f), getMeasuredWidth() - AndroidUtilities.dp(20.0f), getMeasuredHeight());
                }
                f18 = 1.0f;
                j6Var.f25864w = (int) ((1.0f - f16) * e10 * 255.0f);
                j6Var.draw(canvas2);
            } else {
                f18 = 1.0f;
            }
            this.e.setAlpha((int) ((f18 - e10) * (f18 - f16) * 255.0f));
            if (this.F > 0) {
                this.e.setBounds((int) (f17 - (drawable2.getIntrinsicWidth() / f11)), (int) (lerp2 - (this.e.getIntrinsicHeight() / f11)), (int) ((this.e.getIntrinsicWidth() / f11) + f17), (int) ((this.e.getIntrinsicHeight() / f11) + lerp2));
            } else {
                this.e.setBounds(i11, i12, drawable3.getIntrinsicWidth() + i11, drawable3.getIntrinsicHeight() + i12);
            }
            this.e.draw(canvas2);
            if (i13 > 0) {
                canvas2.restore();
            }
            canvas2.restore();
        } else {
            i10 = save;
            f13 = f23;
            f14 = 0.0f;
        }
        j6 j6Var2 = this.W;
        float g10 = (1.0f - e10) * j6Var2.g();
        if (!this.C) {
            float max2 = Math.max(j6Var2.d() + AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f));
            if (this.f26662e0) {
                measuredWidth = (f13 - AndroidUtilities.dp(50.0f)) + f24;
                measuredHeight2 = (max2 / f11) + (lerp2 - (getCircleHeight() / f11));
                f15 = AndroidUtilities.dp(0.66f);
            } else {
                float f30 = max2 / f11;
                measuredWidth = (getMeasuredWidth() - this.J) - f30;
                measuredHeight2 = (getMeasuredHeight() - this.K) - f30;
                f15 = 0.0f;
            }
            float f31 = max2 / f11;
            j6Var2.setBounds((int) (measuredWidth - f31), (int) ((measuredHeight2 - f31) - f15), (int) (measuredWidth + f31), (int) ((measuredHeight2 + f31) - f15));
            if (g10 > f14) {
                float lerp10 = AndroidUtilities.lerp(1.0f, 0.85f, this.h);
                canvas2.save();
                canvas2.scale(lerp10, lerp10, measuredWidth, measuredHeight2);
                if (!this.B) {
                    canvas2.drawCircle(measuredWidth, measuredHeight2, (AndroidUtilities.dp(f11) + f31) * g10 * this.f26656a0, org.telegram.ui.ActionBar.j6.Il);
                    canvas2.drawCircle(measuredWidth, measuredHeight2, f31 * g10 * this.f26656a0, paint);
                }
                j6Var2.f25864w = (int) (g10 * 255.0f);
                j6Var2.draw(canvas2);
                canvas2.restore();
            }
        }
        if (g10 < 1.0f) {
            int dp2 = AndroidUtilities.dp(8.0f);
            int lerp11 = (int) AndroidUtilities.lerp(((getMeasuredWidth() - (getCircleWidth() / f11)) - this.J) + AndroidUtilities.dp(12.0f), f13 - AndroidUtilities.dp(f11), e10);
            int lerp12 = (int) AndroidUtilities.lerp(((getMeasuredHeight() - (getCircleHeight() / f11)) - this.K) + AndroidUtilities.dp(10.0f), getMeasuredHeight() - AndroidUtilities.dp(12.0f), e10);
            int i19 = lerp11 - dp2;
            int i20 = lerp12 - dp2;
            int i21 = lerp11 + dp2;
            int i22 = lerp12 + dp2;
            j5 j5Var = this.f26663f;
            j5Var.setBounds(i19, i20, i21, i22);
            j5Var.v = (int) ((1.0f - g10) * 255.0f);
            j5Var.draw(canvas2);
        }
        if (!this.B) {
            canvas2.restore();
        }
        canvas2.restoreToCount(i10);
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lg.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBlurredBackgroundDrawable(pg.b bVar) {
        this.f26661d0 = bVar;
        bVar.p(AndroidUtilities.dp(22.0f));
        this.f26661d0.o(AndroidUtilities.dp(4.0f));
    }

    public void setCircleSize(int i10) {
        this.F = i10;
        this.G = i10;
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
        this.f26663f.g(drawable, true);
    }

    public void setEphemeralFactor(float f10) {
        if (this.h != f10) {
            this.h = f10;
            invalidate();
        }
    }

    public void setLocked(boolean z4) {
        if (this.C == z4) {
            return;
        }
        this.C = z4;
        invalidate();
    }

    @Override
    public void setPressed(boolean z4) {
        super.setPressed(z4);
        this.N.c(z4);
    }

    public void setResourceId(int i10) {
        if (this.f26657b != i10) {
            this.f26657b = i10;
            this.f26659c = getContext().getResources().getDrawable(i10).mutate();
            this.d = getContext().getResources().getDrawable(i10).mutate();
            this.e = getContext().getResources().getDrawable(i10).mutate();
            invalidate();
        }
    }

    public void setSameWidthFactor(float f10) {
        if (this.f26667n != f10) {
            this.f26667n = f10;
            invalidate();
        }
    }

    public void setScrimViewBackgroundColor(int i10) {
        this.H = i10;
        this.I.setColor(i10);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.W && drawable != this.f26663f && drawable != this.f26670w && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
