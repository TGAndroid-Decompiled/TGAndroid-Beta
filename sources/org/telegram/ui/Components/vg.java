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
public abstract class vg extends View implements m70 {
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
    public final nq[] O;
    public final e6 P;
    public final zc Q;
    public boolean R;
    public final u1.a S;
    public boolean T;
    public float U;
    public final e6 V;
    public final e6 W;
    public final org.telegram.ui.ActionBar.f6 f31222a;
    public final Path f31223a0;
    public int f31224b;
    public final Paint f31225b0;
    public Drawable f31226c;
    public final p6 f31227c0;
    public Drawable d;
    public float f31228d0;
    public Drawable f31229e;
    public final e6 f31230e0;
    public final o5 f31231f;
    public Drawable f31232f0;
    public dh.d f31233g0;
    public float h;
    public boolean f31234h0;
    public int f31235i0;
    public ValueAnimator f31236j0;
    public final RectF f31237k0;
    public float f31238n;
    public long f31239r;
    public int f31240s;
    public boolean v;
    public final p6 f31241w;
    public final e6 f31242x;
    public final Paint f31243y;

    public vg(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        pr prVar = pr.h;
        this.f31242x = new e6(this, 0L, 320L, prVar);
        this.f31243y = new Paint(1);
        this.I = -1;
        this.J = -1;
        this.L = new Paint(1);
        this.O = new nq[1];
        this.P = new e6(this, 0L, 420L, prVar);
        this.Q = new zc(this);
        this.S = new u1.a();
        this.V = new e6(this, 0L, 420L, prVar);
        this.W = new e6(this, 0L, 500L, prVar);
        this.f31223a0 = new Path();
        Paint paint = new Paint(1);
        this.f31225b0 = paint;
        p6 p6Var = new p6(true, true, true, false);
        this.f31227c0 = p6Var;
        this.f31228d0 = 1.0f;
        this.f31230e0 = new e6(this, 0L, 320L, prVar);
        this.f31237k0 = new RectF();
        this.f31224b = i10;
        this.f31222a = f6Var;
        this.E = z10;
        p6 p6Var2 = new p6(false, false, false, false);
        this.f31241w = p6Var2;
        p6Var2.t(AndroidUtilities.dp(15.0f));
        p6Var2.u(AndroidUtilities.bold());
        p6Var2.r(-1);
        p6Var2.f29285b = 3;
        p6Var2.setCallback(this);
        p6Var2.G = AndroidUtilities.displaySize.x;
        this.f31226c = context.getResources().getDrawable(i10).mutate();
        this.d = context.getResources().getDrawable(i10).mutate();
        this.f31229e = context.getResources().getDrawable(i10).mutate();
        this.f31231f = new o5(AndroidUtilities.dp(14.0f), this);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        p6Var.setCallback(this);
        p6Var.r(-1);
        p6Var.t(AndroidUtilities.dp(12.0f));
        p6Var.u(AndroidUtilities.bold());
        p6Var.f29285b = 17;
    }

    @Override
    public final void a(RectF rectF) {
        float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(4.0f)) - this.M;
        float measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(4.0f)) - this.N;
        rectF.set(measuredWidth - getCircleWidth(), measuredHeight - getCircleHeight(), measuredWidth, measuredHeight);
    }

    public final void b() {
        ValueAnimator valueAnimator = this.f31236j0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
        this.f31236j0 = ofFloat;
        ofFloat.addUpdateListener(new l6(this, 8));
        this.f31236j0.addListener(new j6(this, 6));
        this.f31236j0.setDuration(180L);
        this.f31236j0.setInterpolator(new OvershootInterpolator());
        this.f31236j0.start();
    }

    @Override
    public final void c(Canvas canvas, float f7) {
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
            float f13 = this.P.f25565c;
            float f14 = this.f31242x.f25565c;
            if (this.f31234h0) {
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
            float lerp4 = AndroidUtilities.lerp(circleWidth, this.f31241w.d() + AndroidUtilities.dp(f10), f14) * f13;
            if (f13 > 0.0f && lerp4 > 0.0f && lerp3 > 0.0f) {
                RectF rectF = AndroidUtilities.rectTmp;
                float f15 = lerp3 / 2.0f;
                rectF.set(lerp - lerp4, lerp2 - f15, lerp, f15 + lerp2);
                rectF.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
                float min = (Math.min(lerp4, lerp3) / 2.0f) + AndroidUtilities.dp(4.0f);
                canvas.drawRoundRect(rectF, min, min, paint);
            }
            p6 p6Var = this.f31227c0;
            float g10 = (1.0f - f14) * p6Var.g();
            if (g10 > 0.0f) {
                float max = Math.max(p6Var.d() + AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f));
                if (this.f31234h0) {
                    f11 = lerp - AndroidUtilities.dp(50.0f);
                    f12 = (max / 2.0f) + (lerp2 - (getCircleHeight() / 2.0f));
                } else {
                    float f16 = max / 2.0f;
                    float measuredWidth = (getMeasuredWidth() - this.M) - f16;
                    float measuredHeight = (getMeasuredHeight() - this.N) - f16;
                    f11 = measuredWidth;
                    f12 = measuredHeight;
                }
                canvas.drawCircle(f11, f12, ((max / 2.0f) + AndroidUtilities.dp(2.0f)) * g10 * this.f31228d0, paint);
            }
        }
        draw(canvas);
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
        RectF rectF = this.f31237k0;
        float dp = AndroidUtilities.dp(18.0f) / 2.0f;
        float dp2 = (rectF.left + dp) - AndroidUtilities.dp(6.0f);
        float dp3 = (rectF.top + dp) - AndroidUtilities.dp(6.0f);
        canvas.drawCircle(dp2, dp3, AndroidUtilities.dp(2.0f) + dp, org.telegram.ui.ActionBar.j6.Il);
        canvas.drawCircle(dp2, dp3, dp, this.f31243y);
        if (this.G == null) {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
            this.G = mutate;
            int i10 = this.f31235i0;
            this.H = i10;
            mutate.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        if (this.H != this.f31235i0) {
            Drawable drawable = this.G;
            int i11 = this.f31235i0;
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
            str = i2.g.i(i10, "");
        }
        this.f31227c0.q(str, z10, true);
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
        return org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Yd, this.f31222a);
    }

    public final void h(boolean z10) {
        long j3;
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
        e6 e6Var = this.V;
        if (z10 && e6Var.f25565c >= 1.0f) {
            j3 = 650;
        } else {
            j3 = 0;
        }
        e6Var.f25567f = j3;
        this.T = z10;
        if (!z10) {
            f7 = 1.0f;
        }
        this.U = f7;
        invalidate();
    }

    public final void i(int i10, long j3, boolean z10) {
        if (this.f31239r == j3 && this.f31240s == i10) {
            return;
        }
        this.f31239r = j3;
        this.f31240s = i10;
        boolean z11 = false;
        p6 p6Var = this.f31241w;
        if (j3 > 0) {
            p6Var.q(zh.v7.V0(false, i2.g.k(j3 * Math.max(1, this.f31240s), ',', new StringBuilder("⭐️")), this.O), z10, true);
        } else {
            p6Var.q("", z10, true);
        }
        if (!z10) {
            if (this.f31239r > 0) {
                z11 = true;
            }
            this.f31242x.a(z11);
            return;
        }
        invalidate();
    }

    public boolean j() {
        return this instanceof fi;
    }

    public final void k() {
        int v02;
        boolean z10 = this.E;
        org.telegram.ui.ActionBar.f6 f6Var = this.f31222a;
        if (z10) {
            v02 = -1;
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Yd, f6Var);
        }
        if (v02 != this.f31235i0) {
            this.f31235i0 = v02;
            Drawable drawable = this.f31226c;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
            int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Wk, f6Var);
            this.d.setColorFilter(new PorterDuffColorFilter(Color.argb(180, Color.red(v03), Color.green(v03), Color.blue(v03)), mode));
            this.f31229e.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20634bf, f6Var), mode));
        }
        boolean z11 = this.E;
        Paint paint = this.f31243y;
        if (z11) {
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
        float f7;
        float f10;
        float f11 = 0.0f;
        if (f()) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        if (this.f31239r > 0) {
            f11 = 1.0f;
        }
        float circleWidth = this.M + getCircleWidth() + this.M;
        int dp = AndroidUtilities.dp(18.0f);
        if (this.E) {
            f10 = 20.0f;
        } else {
            f10 = 22.0f;
        }
        return (int) AndroidUtilities.lerp(circleWidth, AndroidUtilities.dp(f10) + dp + this.f31241w.d, f11 * f7);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Drawable drawable;
        int w10;
        int measuredHeight;
        boolean z10;
        float f7;
        float f10;
        float lerp;
        float lerp2;
        float lerp3;
        float f11;
        int i10;
        float f12;
        float f13;
        float measuredWidth;
        float measuredHeight2;
        float f14;
        int i11;
        float f15;
        int i12;
        int i13;
        float f16;
        float f17;
        Drawable drawable2;
        int i14;
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
        p6 p6Var = this.f31241w;
        float lerp4 = AndroidUtilities.lerp(Math.max(dpf22, p6Var.d() + dpf23), dpf22, this.f31238n);
        RectF rectF = this.f31237k0;
        rectF.set((getMeasuredWidth() - lerp4) - dpf2, (getMeasuredHeight() - dpf22) - dpf2, getMeasuredWidth() - dpf2, getMeasuredHeight() - dpf2);
        boolean z11 = this.E;
        Paint paint = this.f31243y;
        if (z11) {
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f), paint);
        }
        if (e()) {
            drawable = this.d;
        } else {
            drawable = this.f31226c;
        }
        Drawable drawable3 = drawable;
        if (this.E) {
            w10 = Math.round((rectF.right - (rectF.height() / 2.0f)) - (drawable3.getIntrinsicWidth() / 2.0f));
            measuredHeight = Math.round(((rectF.height() / 2.0f) + rectF.top) - (drawable3.getIntrinsicHeight() / 2.0f));
        } else {
            w10 = org.telegram.messenger.vl.w(2, getMeasuredWidth() - (getMeasuredHeight() / 2), drawable3);
            measuredHeight = (getMeasuredHeight() - drawable3.getIntrinsicHeight()) / 2;
            if (d()) {
                measuredHeight -= AndroidUtilities.dp(1.0f);
            } else {
                w10 += AndroidUtilities.dp(2.0f);
            }
        }
        int i15 = w10;
        int i16 = measuredHeight;
        float e7 = this.V.e(this.T);
        float e10 = this.P.e(f());
        if (this.f31239r > 0 && !this.v) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e11 = this.f31242x.e(z10) * (1.0f - this.h);
        float d = this.f31230e0.d(1.0f, false);
        if (e10 < 1.0f) {
            canvas2.save();
            f10 = 2.0f;
            float f18 = 1.0f - d;
            canvas2.translate((-AndroidUtilities.dp(24.0f)) * f18, AndroidUtilities.dp(24.0f) * f18);
            float lerp5 = AndroidUtilities.lerp(0.35f, 1.0f, d);
            float f19 = i15;
            float f20 = i16;
            f7 = e7;
            canvas2.scale(lerp5, lerp5, (drawable3.getIntrinsicWidth() / 2.0f) + f19, (drawable3.getIntrinsicHeight() / 2.0f) + f20);
            canvas2.rotate(60.0f * f18, (drawable3.getIntrinsicWidth() / 2.0f) + f19, (drawable3.getIntrinsicHeight() / 2.0f) + f20);
            drawable3.setBounds(i15, i16, drawable3.getIntrinsicWidth() + i15, drawable3.getIntrinsicHeight() + i16);
            drawable3.setAlpha((int) ((1.0f - e11) * 255.0f));
            drawable3.draw(canvas2);
            canvas2.restore();
        } else {
            f7 = e7;
            f10 = 2.0f;
        }
        if (this.f31234h0) {
            lerp = AndroidUtilities.lerp(getMeasuredWidth() - (getMeasuredHeight() / f10), getMeasuredWidth() - AndroidUtilities.dp(4.0f), e10) - this.M;
            lerp3 = getCircleHeight() * e10;
            lerp2 = ((getMeasuredHeight() - this.N) - AndroidUtilities.dp(4.0f)) - (lerp3 / f10);
        } else {
            lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(getMeasuredWidth() - (getMeasuredHeight() / f10), getMeasuredWidth() - AndroidUtilities.dp(4.0f), e10) - this.M, getMeasuredWidth() - AndroidUtilities.dp(9.0f), e11);
            lerp2 = AndroidUtilities.lerp(((getMeasuredHeight() - this.N) - AndroidUtilities.dp(4.0f)) - (getCircleHeight() / f10), getMeasuredHeight() - AndroidUtilities.dp(24.0f), e11);
            lerp3 = AndroidUtilities.lerp(getCircleHeight(), AndroidUtilities.dp(32.0f), e11) * e10;
        }
        float f21 = lerp3;
        float f22 = lerp;
        float circleWidth = getCircleWidth();
        if (this.E) {
            f11 = 20.0f;
        } else {
            f11 = 22.0f;
        }
        float lerp6 = AndroidUtilities.lerp(circleWidth, p6Var.d() + AndroidUtilities.dp(f11), e11);
        float lerp7 = AndroidUtilities.lerp(lerp6, f21, this.f31238n) * e10;
        float f23 = lerp6 - lerp7;
        float f24 = f22 - (lerp7 / f10);
        setPivotX(f24);
        setPivotY(lerp2);
        float lerp8 = AndroidUtilities.lerp(1.0f, 0.79f, this.h);
        if (e10 > 0.0f) {
            canvas2.save();
            Path path = this.f31223a0;
            path.rewind();
            f13 = 0.0f;
            float min = Math.min(lerp7, f21) / f10;
            RectF rectF2 = AndroidUtilities.rectTmp;
            float f25 = f21 / f10;
            float f26 = lerp2 - f25;
            i10 = save;
            float f27 = lerp2 + f25;
            rectF2.set(f22 - lerp7, f26, f22, f27);
            path.addRoundRect(rectF2, min, min, Path.Direction.CW);
            float centerX = rectF2.centerX();
            float centerY = rectF2.centerY();
            if (this.h > 0.0f) {
                if (this.f31232f0 == null) {
                    f12 = f22;
                    this.f31232f0 = getContext().getResources().getDrawable(R.drawable.send_outline);
                } else {
                    f12 = f22;
                }
                i11 = i15;
                this.f31232f0.setColorFilter(paint.getColor(), PorterDuff.Mode.MULTIPLY);
                yf.p.d(this.f31232f0, centerX, centerY, 17);
                yf.p.b(canvas2, this.f31232f0, this.h);
            } else {
                f12 = f22;
                i11 = i15;
            }
            canvas2.scale(lerp8, lerp8, centerX, centerY);
            if (this.f31233g0 != null) {
                Rect rect = AndroidUtilities.rectTmp2;
                rectF2.round(rect);
                rect.inset(-AndroidUtilities.dp(7.0f), -AndroidUtilities.dp(7.0f));
                this.f31233g0.setBounds(rect);
                this.f31233g0.draw(canvas2);
            }
            if (!this.E) {
                canvas2.drawPath(path, paint);
            }
            canvas2.clipPath(path);
            int i17 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i17 > 0) {
                Paint paint2 = this.f31225b0;
                paint2.setColor(-1);
                paint2.setAlpha((int) (f7 * 255.0f));
                float dp = AndroidUtilities.dp(8.66f);
                rectF2.set(f24 - dp, lerp2 - dp, f24 + dp, dp + lerp2);
                if (this.R) {
                    long currentTimeMillis = System.currentTimeMillis() % 5400;
                    float f28 = ((float) (1520 * currentTimeMillis)) / 5400.0f;
                    float max = Math.max(0.0f, f28 - 20.0f);
                    int i18 = 0;
                    while (i18 < 4) {
                        long j3 = currentTimeMillis;
                        u1.a aVar = this.S;
                        f28 += aVar.getInterpolation(((float) (j3 - (i18 * 1350))) / 667.0f) * 250.0f;
                        max += aVar.getInterpolation(((float) (j3 - (i14 + 667))) / 667.0f) * 250.0f;
                        i18++;
                        currentTimeMillis = j3;
                    }
                    canvas2 = canvas;
                    f15 = f7;
                    i12 = i16;
                    f13 = 0.0f;
                    i13 = i17;
                    f16 = f24;
                    canvas2.drawArc(AndroidUtilities.rectTmp, max, f28 - max, false, paint2);
                } else {
                    f15 = f7;
                    i12 = i16;
                    i13 = i17;
                    f16 = f24;
                    canvas2 = canvas;
                    canvas2.drawArc(rectF2, (((((float) (System.currentTimeMillis() % 3000)) / 1000.0f) * 120.0f) % 360.0f) - 90.0f, this.W.d(this.U, false) * 360.0f, false, paint2);
                }
                canvas2.save();
                float lerp9 = AndroidUtilities.lerp(1.0f, 0.6f, f15);
                canvas2.scale(lerp9, lerp9, f16, lerp2);
                invalidate();
            } else {
                f15 = f7;
                i12 = i16;
                i13 = i17;
                f16 = f24;
            }
            if (e11 > f13) {
                if (this.f31234h0) {
                    p6Var.l((f12 - p6Var.d) - AndroidUtilities.dp(11.0f), f26, f12 - AndroidUtilities.dp(11.0f), f27);
                } else if (this.E) {
                    p6Var.l(rectF.left + AndroidUtilities.dp(10.0f), rectF.top, rectF.right, rectF.bottom);
                } else {
                    p6Var.l((getMeasuredWidth() - p6Var.d) - AndroidUtilities.dp(20.0f), getMeasuredHeight() - AndroidUtilities.dp(48.0f), getMeasuredWidth() - AndroidUtilities.dp(20.0f), getMeasuredHeight());
                }
                f17 = 1.0f;
                p6Var.f29303w = (int) ((1.0f - f15) * e11 * 255.0f);
                p6Var.draw(canvas2);
            } else {
                f17 = 1.0f;
            }
            this.f31229e.setAlpha((int) ((f17 - e11) * (f17 - f15) * 255.0f));
            if (this.I > 0) {
                this.f31229e.setBounds((int) (f16 - (drawable2.getIntrinsicWidth() / f10)), (int) (lerp2 - (this.f31229e.getIntrinsicHeight() / f10)), (int) ((this.f31229e.getIntrinsicWidth() / f10) + f16), (int) ((this.f31229e.getIntrinsicHeight() / f10) + lerp2));
            } else {
                this.f31229e.setBounds(i11, i12, drawable3.getIntrinsicWidth() + i11, drawable3.getIntrinsicHeight() + i12);
            }
            this.f31229e.draw(canvas2);
            if (i13 > 0) {
                canvas2.restore();
            }
            canvas2.restore();
        } else {
            i10 = save;
            f12 = f22;
            f13 = 0.0f;
        }
        p6 p6Var2 = this.f31227c0;
        float g10 = (1.0f - e11) * p6Var2.g();
        if (!this.F) {
            float max2 = Math.max(p6Var2.d() + AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f));
            if (this.f31234h0) {
                measuredWidth = (f12 - AndroidUtilities.dp(50.0f)) + f23;
                measuredHeight2 = (max2 / f10) + (lerp2 - (getCircleHeight() / f10));
                f14 = AndroidUtilities.dp(0.66f);
            } else {
                float f29 = max2 / f10;
                measuredWidth = (getMeasuredWidth() - this.M) - f29;
                measuredHeight2 = (getMeasuredHeight() - this.N) - f29;
                f14 = 0.0f;
            }
            float f30 = max2 / f10;
            p6Var2.setBounds((int) (measuredWidth - f30), (int) ((measuredHeight2 - f30) - f14), (int) (measuredWidth + f30), (int) ((measuredHeight2 + f30) - f14));
            if (g10 > f13) {
                float lerp10 = AndroidUtilities.lerp(1.0f, 0.85f, this.h);
                canvas2.save();
                canvas2.scale(lerp10, lerp10, measuredWidth, measuredHeight2);
                if (!this.E) {
                    canvas2.drawCircle(measuredWidth, measuredHeight2, (AndroidUtilities.dp(f10) + f30) * g10 * this.f31228d0, org.telegram.ui.ActionBar.j6.Il);
                    canvas2.drawCircle(measuredWidth, measuredHeight2, f30 * g10 * this.f31228d0, paint);
                }
                p6Var2.f29303w = (int) (g10 * 255.0f);
                p6Var2.draw(canvas2);
                canvas2.restore();
            }
        }
        if (g10 < 1.0f) {
            int dp2 = AndroidUtilities.dp(8.0f);
            int lerp11 = (int) AndroidUtilities.lerp(((getMeasuredWidth() - (getCircleWidth() / f10)) - this.M) + AndroidUtilities.dp(12.0f), f12 - AndroidUtilities.dp(f10), e11);
            int lerp12 = (int) AndroidUtilities.lerp(((getMeasuredHeight() - (getCircleHeight() / f10)) - this.N) + AndroidUtilities.dp(10.0f), getMeasuredHeight() - AndroidUtilities.dp(12.0f), e11);
            int i19 = lerp11 - dp2;
            int i20 = lerp12 - dp2;
            int i21 = lerp11 + dp2;
            int i22 = lerp12 + dp2;
            o5 o5Var = this.f31231f;
            o5Var.setBounds(i19, i20, i21, i22);
            o5Var.v = (int) ((1.0f - g10) * 255.0f);
            o5Var.draw(canvas2);
        }
        if (!this.E) {
            canvas2.restore();
        }
        canvas2.restoreToCount(i10);
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vg.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBlurredBackgroundDrawable(dh.d dVar) {
        this.f31233g0 = dVar;
        dVar.p(AndroidUtilities.dp(22.0f));
        this.f31233g0.o(AndroidUtilities.dp(4.0f));
    }

    public void setCircleSize(int i10) {
        this.I = i10;
        this.J = i10;
    }

    public void setEffect(long j3) {
        Emoji.EmojiDrawable emojiDrawable;
        TLRPC.TL_availableEffect effect = MessagesController.getInstance(UserConfig.selectedAccount).getEffect(j3);
        if (effect != null) {
            emojiDrawable = Emoji.getEmojiDrawable(effect.emoticon);
        } else {
            emojiDrawable = null;
        }
        setEmoji(emojiDrawable);
    }

    public void setEmoji(Drawable drawable) {
        this.f31231f.g(drawable, true);
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
        if (this.f31224b != i10) {
            this.f31224b = i10;
            this.f31226c = getContext().getResources().getDrawable(i10).mutate();
            this.d = getContext().getResources().getDrawable(i10).mutate();
            this.f31229e = getContext().getResources().getDrawable(i10).mutate();
            invalidate();
        }
    }

    public void setSameWidthFactor(float f7) {
        if (this.f31238n != f7) {
            this.f31238n = f7;
            invalidate();
        }
    }

    public void setScrimViewBackgroundColor(int i10) {
        this.K = i10;
        this.L.setColor(i10);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f31227c0 && drawable != this.f31231f && drawable != this.f31241w && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
