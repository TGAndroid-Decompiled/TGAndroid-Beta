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
public abstract class vg extends View implements k80 {
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
    public final zq[] O;
    public final h6 P;
    public final xc Q;
    public boolean R;
    public final u1.a S;
    public boolean T;
    public float U;
    public final h6 V;
    public final h6 W;
    public final org.telegram.ui.ActionBar.u6 f33716a;
    public final Path f33717a0;
    public int f33718b;
    public final Paint f33719b0;
    public Drawable f33720c;
    public final r6 f33721c0;
    public Drawable d;
    public float f33722d0;
    public Drawable e;
    public final h6 f33723e0;
    public final r5 f33724f;
    public Drawable f33725f0;
    public eh.d f33726g0;
    public float h;
    public boolean f33727h0;
    public int f33728i0;
    public int f33729j0;
    public int f33730k0;
    public ValueAnimator f33731l0;
    public final RectF m0;
    public float f33732n;
    public long f33733r;
    public int f33734s;
    public boolean v;
    public final r6 f33735w;
    public final h6 f33736x;
    public final Paint f33737y;

    public vg(int i10, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context);
        ds dsVar = ds.h;
        this.f33736x = new h6(this, 0L, 320L, dsVar);
        this.f33737y = new Paint(1);
        this.I = -1;
        this.J = -1;
        this.L = new Paint(1);
        this.O = new zq[1];
        this.P = new h6(this, 0L, 420L, dsVar);
        this.Q = new xc(this);
        this.S = new u1.a();
        this.V = new h6(this, 0L, 420L, dsVar);
        this.W = new h6(this, 0L, 500L, dsVar);
        this.f33717a0 = new Path();
        Paint paint = new Paint(1);
        this.f33719b0 = paint;
        r6 r6Var = new r6(true, true, true);
        this.f33721c0 = r6Var;
        this.f33722d0 = 1.0f;
        this.f33723e0 = new h6(this, 0L, 320L, dsVar);
        this.m0 = new RectF();
        this.f33718b = i10;
        this.f33716a = u6Var;
        this.E = z10;
        r6 r6Var2 = new r6(false, false, false);
        this.f33735w = r6Var2;
        r6Var2.w(AndroidUtilities.dp(15.0f));
        r6Var2.x(AndroidUtilities.bold());
        r6Var2.u(-1);
        r6Var2.f32142b = 3;
        r6Var2.setCallback(this);
        r6Var2.M = AndroidUtilities.displaySize.x;
        this.f33720c = context.getResources().getDrawable(i10).mutate();
        this.d = context.getResources().getDrawable(i10).mutate();
        this.e = context.getResources().getDrawable(i10).mutate();
        this.f33724f = new r5(AndroidUtilities.dp(14.0f), this);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        r6Var.setCallback(this);
        r6Var.u(-1);
        r6Var.w(AndroidUtilities.dp(12.0f));
        r6Var.x(AndroidUtilities.bold());
        r6Var.f32142b = 17;
    }

    @Override
    public final void a(RectF rectF) {
        float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(4.0f)) - this.M;
        float measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(4.0f)) - this.N;
        rectF.set(measuredWidth - getCircleWidth(), measuredHeight - getCircleHeight(), measuredWidth, measuredHeight);
    }

    @Override
    public final void b(Canvas canvas, float f7) {
        float lerp;
        float lerp2;
        float lerp3;
        float f10;
        float f11;
        float f12;
        int i10 = this.K;
        if (i10 != 0) {
            Paint paint = this.L;
            paint.setColor(i10);
            paint.setAlpha((int) (Color.alpha(this.K) * f7));
            float f13 = this.P.f28864c;
            float f14 = this.f33736x.f28864c;
            if (this.f33727h0) {
                lerp = AndroidUtilities.lerp(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - AndroidUtilities.dp(4.0f), f13) - this.M;
                lerp3 = getCircleHeight() * f13;
                lerp2 = ((getMeasuredHeight() - this.N) - AndroidUtilities.dp(4.0f)) - (lerp3 / 2.0f);
            } else {
                lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - AndroidUtilities.dp(4.0f), f13) - this.M, getMeasuredWidth() - AndroidUtilities.dp(9.0f), f14);
                lerp2 = AndroidUtilities.lerp(((getMeasuredHeight() - this.N) - AndroidUtilities.dp(4.0f)) - (getCircleHeight() / 2.0f), getMeasuredHeight() - AndroidUtilities.dp(24.0f), f14);
                lerp3 = AndroidUtilities.lerp(getCircleHeight(), AndroidUtilities.dp(32.0f), f14) * f13;
            }
            float circleWidth = getCircleWidth();
            if (this.E) {
                f10 = 20.0f;
            } else {
                f10 = 22.0f;
            }
            float lerp4 = AndroidUtilities.lerp(circleWidth, this.f33735w.c() + AndroidUtilities.dp(f10), f14) * f13;
            if (f13 > 0.0f && lerp4 > 0.0f && lerp3 > 0.0f) {
                RectF rectF = AndroidUtilities.rectTmp;
                float f15 = lerp3 / 2.0f;
                rectF.set(lerp - lerp4, lerp2 - f15, lerp, f15 + lerp2);
                rectF.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
                float min = (Math.min(lerp4, lerp3) / 2.0f) + AndroidUtilities.dp(4.0f);
                canvas.drawRoundRect(rectF, min, min, paint);
            }
            r6 r6Var = this.f33721c0;
            float i11 = (1.0f - f14) * r6Var.i();
            if (i11 > 0.0f) {
                float max = Math.max(r6Var.c() + AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f));
                if (this.f33727h0) {
                    f11 = lerp - AndroidUtilities.dp(50.0f);
                    f12 = (max / 2.0f) + (lerp2 - (getCircleHeight() / 2.0f));
                } else {
                    float f16 = max / 2.0f;
                    float measuredWidth = (getMeasuredWidth() - this.M) - f16;
                    float measuredHeight = (getMeasuredHeight() - this.N) - f16;
                    f11 = measuredWidth;
                    f12 = measuredHeight;
                }
                canvas.drawCircle(f11, f12, ((max / 2.0f) + AndroidUtilities.dp(2.0f)) * i11 * this.f33722d0, paint);
            }
        }
        draw(canvas);
    }

    public final void c() {
        ValueAnimator valueAnimator = this.f33731l0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
        this.f33731l0 = ofFloat;
        ofFloat.addUpdateListener(new n6(this, 9));
        this.f33731l0.addListener(new org.telegram.ui.sp(this, 9));
        this.f33731l0.setDuration(180L);
        this.f33731l0.setInterpolator(new OvershootInterpolator());
        this.f33731l0.start();
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
        canvas.saveLayerAlpha(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(6.0f), getWidth(), getHeight(), 255, 31);
        super.draw(canvas);
        RectF rectF = this.m0;
        float dp = AndroidUtilities.dp(18.0f) / 2.0f;
        float dp2 = (rectF.left + dp) - AndroidUtilities.dp(6.0f);
        float dp3 = (rectF.top + dp) - AndroidUtilities.dp(6.0f);
        canvas.drawCircle(dp2, dp3, AndroidUtilities.dp(2.0f) + dp, org.telegram.ui.ActionBar.y6.Nl);
        canvas.drawCircle(dp2, dp3, dp, this.f33737y);
        if (this.G == null) {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
            this.G = mutate;
            int i10 = this.f33728i0;
            this.H = i10;
            mutate.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        if (this.H != this.f33728i0) {
            Drawable drawable = this.G;
            int i11 = this.f33728i0;
            this.H = i11;
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        }
        this.G.setBounds((int) (dp2 - AndroidUtilities.dp(8.0f)), (int) (dp3 - AndroidUtilities.dp(8.0f)), (int) (dp2 + AndroidUtilities.dp(8.0f)), (int) (dp3 + AndroidUtilities.dp(8.0f)));
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
            str = ic.a.i(i10, "");
        }
        this.f33721c0.t(str, z10, true);
        invalidate();
    }

    public int getCircleHeight() {
        int i10 = this.J;
        if (i10 >= 0) {
            return i10;
        }
        return getMeasuredHeight() - AndroidUtilities.dp(8.0f);
    }

    public int getCircleWidth() {
        int i10 = this.I;
        if (i10 >= 0) {
            return i10;
        }
        return getMeasuredHeight() - AndroidUtilities.dp(8.0f);
    }

    public int getFillColor() {
        return org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Yd, this.f33716a);
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
            this.W.d(0.0f, true);
        }
        h6 h6Var = this.V;
        if (z10 && h6Var.f28864c >= 1.0f) {
            j10 = 650;
        } else {
            j10 = 0;
        }
        h6Var.f28865f = j10;
        this.T = z10;
        if (!z10) {
            f7 = 1.0f;
        }
        this.U = f7;
        invalidate();
    }

    public final void i(int i10, long j10, boolean z10) {
        if (this.f33733r == j10 && this.f33734s == i10) {
            return;
        }
        this.f33733r = j10;
        this.f33734s = i10;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        boolean z11 = false;
        r6 r6Var = this.f33735w;
        if (i11 > 0) {
            r6Var.t(bi.dd.U0(false, org.telegram.messenger.t.i(j10 * Math.max(1, this.f33734s), ',', new StringBuilder("⭐️")), this.O), z10, true);
        } else {
            r6Var.t("", z10, true);
        }
        if (!z10) {
            if (this.f33733r > 0) {
                z11 = true;
            }
            this.f33736x.a(z11);
            return;
        }
        invalidate();
    }

    public boolean j() {
        return this instanceof bi;
    }

    public final void k() {
        int w02;
        boolean z10 = this.E;
        org.telegram.ui.ActionBar.u6 u6Var = this.f33716a;
        if (z10) {
            w02 = -1;
        } else {
            w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Yd, u6Var);
        }
        int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Wk, u6Var);
        int w04 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23327bf, u6Var);
        if (w02 != this.f33728i0 || w03 != this.f33729j0 || w04 != this.f33730k0) {
            this.f33728i0 = w02;
            this.f33729j0 = w03;
            this.f33730k0 = w04;
            Drawable drawable = this.f33720c;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            this.d.setColorFilter(new PorterDuffColorFilter(Color.argb(180, Color.red(w03), Color.green(w03), Color.blue(w03)), mode));
            this.e.setColorFilter(new PorterDuffColorFilter(w04, mode));
        }
        boolean z11 = this.E;
        Paint paint = this.f33737y;
        if (z11) {
            paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Yd, u6Var));
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
        float f7;
        float f10;
        float f11 = 0.0f;
        if (f()) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        if (this.f33733r > 0) {
            f11 = 1.0f;
        }
        float circleWidth = this.M + getCircleWidth() + this.M;
        int dp = AndroidUtilities.dp(18.0f);
        if (this.E) {
            f10 = 20.0f;
        } else {
            f10 = 22.0f;
        }
        return (int) AndroidUtilities.lerp(circleWidth, AndroidUtilities.dp(f10) + dp + this.f33735w.d, f11 * f7);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Drawable drawable;
        int x9;
        int measuredHeight;
        boolean z10;
        float f7;
        float f10;
        float f11;
        float lerp;
        float lerp2;
        float lerp3;
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
        float dpf2 = AndroidUtilities.dpf2(3.0f);
        float dpf22 = AndroidUtilities.dpf2(38.0f);
        float dpf23 = AndroidUtilities.dpf2(20.0f);
        r6 r6Var = this.f33735w;
        float lerp4 = AndroidUtilities.lerp(Math.max(dpf22, r6Var.c() + dpf23), dpf22, this.f33732n);
        RectF rectF = this.m0;
        rectF.set((getMeasuredWidth() - lerp4) - dpf2, (getMeasuredHeight() - dpf22) - dpf2, getMeasuredWidth() - dpf2, getMeasuredHeight() - dpf2);
        boolean z11 = this.E;
        Paint paint2 = this.f33737y;
        if (z11) {
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f), paint2);
        }
        if (e()) {
            drawable = this.d;
        } else {
            drawable = this.f33720c;
        }
        Drawable drawable3 = drawable;
        if (this.E) {
            x9 = Math.round((rectF.right - (rectF.height() / 2.0f)) - (drawable3.getIntrinsicWidth() / 2.0f));
            measuredHeight = Math.round(((rectF.height() / 2.0f) + rectF.top) - (drawable3.getIntrinsicHeight() / 2.0f));
        } else {
            x9 = org.telegram.ui.d3.x(2, getMeasuredWidth() - (getMeasuredHeight() / 2), drawable3);
            measuredHeight = (getMeasuredHeight() - drawable3.getIntrinsicHeight()) / 2;
            if (d()) {
                measuredHeight -= AndroidUtilities.dp(1.0f);
            } else {
                x9 += AndroidUtilities.dp(2.0f);
            }
        }
        int i14 = x9;
        int i15 = measuredHeight;
        float e = this.V.e(this.T);
        float e10 = this.P.e(f());
        if (this.f33733r > 0 && !this.v) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e11 = (1.0f - this.h) * this.f33736x.e(z10);
        float d = this.f33723e0.d(1.0f, false);
        if (e10 < 1.0f) {
            canvas2.save();
            f11 = 2.0f;
            float f22 = 1.0f - d;
            canvas2.translate((-AndroidUtilities.dp(24.0f)) * f22, AndroidUtilities.dp(24.0f) * f22);
            float lerp5 = AndroidUtilities.lerp(0.35f, 1.0f, d);
            float f23 = i14;
            f10 = 1.0f;
            float f24 = i15;
            f7 = e;
            canvas2.scale(lerp5, lerp5, (drawable3.getIntrinsicWidth() / 2.0f) + f23, (drawable3.getIntrinsicHeight() / 2.0f) + f24);
            canvas2.rotate(60.0f * f22, (drawable3.getIntrinsicWidth() / 2.0f) + f23, (drawable3.getIntrinsicHeight() / 2.0f) + f24);
            drawable3.setBounds(i14, i15, drawable3.getIntrinsicWidth() + i14, drawable3.getIntrinsicHeight() + i15);
            drawable3.setAlpha((int) ((1.0f - e11) * 255.0f));
            drawable3.draw(canvas2);
            canvas2.restore();
        } else {
            f7 = e;
            f10 = 1.0f;
            f11 = 2.0f;
        }
        if (this.f33727h0) {
            lerp = AndroidUtilities.lerp(getMeasuredWidth() - (getMeasuredHeight() / f11), getMeasuredWidth() - AndroidUtilities.dp(4.0f), e10) - this.M;
            lerp3 = getCircleHeight() * e10;
            lerp2 = ((getMeasuredHeight() - this.N) - AndroidUtilities.dp(4.0f)) - (lerp3 / f11);
        } else {
            lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(getMeasuredWidth() - (getMeasuredHeight() / f11), getMeasuredWidth() - AndroidUtilities.dp(4.0f), e10) - this.M, getMeasuredWidth() - AndroidUtilities.dp(9.0f), e11);
            lerp2 = AndroidUtilities.lerp(((getMeasuredHeight() - this.N) - AndroidUtilities.dp(4.0f)) - (getCircleHeight() / f11), getMeasuredHeight() - AndroidUtilities.dp(24.0f), e11);
            lerp3 = AndroidUtilities.lerp(getCircleHeight(), AndroidUtilities.dp(32.0f), e11) * e10;
        }
        float f25 = lerp2;
        float f26 = lerp;
        float circleWidth = getCircleWidth();
        if (this.E) {
            f12 = 20.0f;
        } else {
            f12 = 22.0f;
        }
        float lerp6 = AndroidUtilities.lerp(circleWidth, r6Var.c() + AndroidUtilities.dp(f12), e11);
        float lerp7 = AndroidUtilities.lerp(lerp6, lerp3, this.f33732n) * e10;
        float f27 = lerp6 - lerp7;
        float f28 = f26 - (lerp7 / f11);
        setPivotX(f28);
        setPivotY(f25);
        float lerp8 = AndroidUtilities.lerp(f10, 0.79f, this.h);
        if (e10 > 0.0f) {
            canvas2.save();
            Path path = this.f33717a0;
            path.rewind();
            f13 = 0.0f;
            float min = Math.min(lerp7, lerp3) / f11;
            RectF rectF2 = AndroidUtilities.rectTmp;
            float f29 = lerp3 / f11;
            float f30 = f25 - f29;
            float f31 = f25 + f29;
            rectF2.set(f26 - lerp7, f30, f26, f31);
            path.addRoundRect(rectF2, min, min, Path.Direction.CW);
            float centerX = rectF2.centerX();
            float centerY = rectF2.centerY();
            if (this.h > 0.0f) {
                if (this.f33725f0 == null) {
                    f15 = f26;
                    this.f33725f0 = getContext().getResources().getDrawable(R.drawable.send_outline);
                } else {
                    f15 = f26;
                }
                i10 = save;
                this.f33725f0.setColorFilter(paint2.getColor(), PorterDuff.Mode.MULTIPLY);
                ag.v.d(this.f33725f0, centerX, centerY, 17);
                ag.v.b(canvas2, this.f33725f0, this.h);
            } else {
                i10 = save;
                f15 = f26;
            }
            canvas2.scale(lerp8, lerp8, centerX, centerY);
            if (this.f33726g0 != null) {
                Rect rect = AndroidUtilities.rectTmp2;
                rectF2.round(rect);
                rect.inset(-AndroidUtilities.dp(7.0f), -AndroidUtilities.dp(7.0f));
                this.f33726g0.setBounds(rect);
                this.f33726g0.draw(canvas2);
            }
            if (!this.E) {
                canvas2.drawPath(path, paint2);
            }
            canvas2.clipPath(path);
            int i16 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i16 > 0) {
                Paint paint3 = this.f33719b0;
                paint3.setColor(-1);
                paint3.setAlpha((int) (f7 * 255.0f));
                float dp = AndroidUtilities.dp(8.66f);
                rectF2.set(f28 - dp, f25 - dp, f28 + dp, f25 + dp);
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
                    f14 = e11;
                    i12 = i16;
                    f16 = f25;
                    f19 = f28;
                    paint = paint2;
                    f20 = f31;
                    canvas2.drawArc(AndroidUtilities.rectTmp, max, f32 - max, false, paint3);
                } else {
                    f18 = f7;
                    i11 = i15;
                    f14 = e11;
                    i12 = i16;
                    f16 = f25;
                    f19 = f28;
                    paint = paint2;
                    f20 = f31;
                    canvas2 = canvas;
                    canvas2.drawArc(rectF2, (-90.0f) + (((((float) (System.currentTimeMillis() % 3000)) / 1000.0f) * 120.0f) % 360.0f), this.W.d(this.U, false) * 360.0f, false, paint3);
                }
                canvas2.save();
                float lerp9 = AndroidUtilities.lerp(1.0f, 0.6f, f18);
                canvas2.scale(lerp9, lerp9, f19, f16);
                invalidate();
            } else {
                f18 = f7;
                i11 = i15;
                f14 = e11;
                i12 = i16;
                f16 = f25;
                f19 = f28;
                paint = paint2;
                f20 = f31;
            }
            if (f14 > f13) {
                if (this.f33727h0) {
                    r6Var.o((f15 - r6Var.d) - AndroidUtilities.dp(11.0f), f30, f15 - AndroidUtilities.dp(11.0f), f20);
                } else if (this.E) {
                    r6Var.o(rectF.left + AndroidUtilities.dp(10.0f), rectF.top, rectF.right, rectF.bottom);
                } else {
                    r6Var.o((getMeasuredWidth() - r6Var.d) - AndroidUtilities.dp(20.0f), getMeasuredHeight() - AndroidUtilities.dp(48.0f), getMeasuredWidth() - AndroidUtilities.dp(20.0f), getMeasuredHeight());
                }
                f21 = 1.0f;
                r6Var.B = (int) ((1.0f - f18) * f14 * 255.0f);
                r6Var.draw(canvas2);
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
            f14 = e11;
            i10 = save;
            f15 = f26;
            f16 = f25;
            paint = paint2;
        }
        r6 r6Var2 = this.f33721c0;
        float i18 = (1.0f - f14) * r6Var2.i();
        if (!this.F) {
            float max2 = Math.max(r6Var2.c() + AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f));
            if (this.f33727h0) {
                measuredWidth = (f15 - AndroidUtilities.dp(50.0f)) + f27;
                measuredHeight2 = (max2 / f11) + (f16 - (getCircleHeight() / f11));
                f17 = AndroidUtilities.dp(0.66f);
            } else {
                float f33 = max2 / f11;
                measuredWidth = (getMeasuredWidth() - this.M) - f33;
                measuredHeight2 = (getMeasuredHeight() - this.N) - f33;
                f17 = f13;
            }
            float f34 = max2 / f11;
            r6Var2.setBounds((int) (measuredWidth - f34), (int) ((measuredHeight2 - f34) - f17), (int) (measuredWidth + f34), (int) ((measuredHeight2 + f34) - f17));
            if (i18 > f13) {
                float lerp10 = AndroidUtilities.lerp(1.0f, 0.85f, this.h);
                canvas2.save();
                canvas2.scale(lerp10, lerp10, measuredWidth, measuredHeight2);
                if (!this.E) {
                    canvas2.drawCircle(measuredWidth, measuredHeight2, (AndroidUtilities.dp(f11) + f34) * i18 * this.f33722d0, org.telegram.ui.ActionBar.y6.Nl);
                    canvas2.drawCircle(measuredWidth, measuredHeight2, f34 * i18 * this.f33722d0, paint);
                }
                r6Var2.B = (int) (i18 * 255.0f);
                r6Var2.draw(canvas2);
                canvas2.restore();
            }
        }
        if (i18 < 1.0f) {
            int dp2 = AndroidUtilities.dp(8.0f);
            float f35 = f14;
            int lerp11 = (int) AndroidUtilities.lerp(((getMeasuredWidth() - (getCircleWidth() / f11)) - this.M) + AndroidUtilities.dp(12.0f), f15 - AndroidUtilities.dp(f11), f35);
            int lerp12 = (int) AndroidUtilities.lerp(((getMeasuredHeight() - (getCircleHeight() / f11)) - this.N) + AndroidUtilities.dp(10.0f), getMeasuredHeight() - AndroidUtilities.dp(12.0f), f35);
            int i19 = lerp11 - dp2;
            int i20 = lerp12 - dp2;
            int i21 = lerp11 + dp2;
            int i22 = lerp12 + dp2;
            r5 r5Var = this.f33724f;
            r5Var.setBounds(i19, i20, i21, i22);
            r5Var.v = (int) ((1.0f - i18) * 255.0f);
            r5Var.draw(canvas2);
        }
        if (!this.E) {
            canvas2.restore();
        }
        canvas2.restoreToCount(i10);
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vg.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBlurredBackgroundDrawable(eh.d dVar) {
        this.f33726g0 = dVar;
        dVar.x(AndroidUtilities.dp(22.0f));
        this.f33726g0.w(AndroidUtilities.dp(4.0f));
    }

    public void setCircleSize(int i10) {
        this.I = i10;
        this.J = i10;
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
        this.f33724f.g(drawable, true);
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
        if (this.f33718b != i10) {
            this.f33718b = i10;
            this.f33720c = getContext().getResources().getDrawable(i10).mutate();
            this.d = getContext().getResources().getDrawable(i10).mutate();
            this.e = getContext().getResources().getDrawable(i10).mutate();
            invalidate();
        }
    }

    public void setSameWidthFactor(float f7) {
        if (this.f33732n != f7) {
            this.f33732n = f7;
            invalidate();
        }
    }

    public void setScrimViewBackgroundColor(int i10) {
        this.K = i10;
        this.L.setColor(i10);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f33721c0 && drawable != this.f33724f && drawable != this.f33735w && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
