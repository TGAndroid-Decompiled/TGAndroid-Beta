package org.telegram.ui.Components.voip;

import a8.b8;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.pc;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.Components.bb0;
public final class x2 extends FrameLayout {
    public final bb0 E;
    public int F;
    public int G;
    public int H;
    public int I;
    public float J;
    public boolean K;
    public final Path L;
    public int M;
    public int N;
    public ValueAnimator O;
    public ValueAnimator P;
    public AnimatorSet Q;
    public final AnimatorSet R;
    public boolean S;
    public volatile boolean T;
    public final l1 U;
    public final boolean V;
    public int W;
    public final Drawable f41314a;
    public final Drawable f41315b;
    public final bb0 f41316c;
    public final bb0 d;
    public final Drawable f41317e;
    public final Drawable f41318f;
    public final bb0 h;
    public final bb0 f41319n;
    public final Drawable f41320r;
    public final Drawable f41321s;
    public final bb0 f41322w;
    public final bb0 f41323x;
    public final bb0 f41324y;

    public x2(Activity activity, boolean z10, l1 l1Var) {
        super(activity);
        Drawable bb0Var;
        Drawable bb0Var2;
        Drawable bb0Var3;
        Drawable bb0Var4;
        Drawable bb0Var5;
        Drawable bb0Var6;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = 0.0f;
        this.K = false;
        this.L = new Path();
        this.M = 0;
        this.N = 0;
        this.S = false;
        this.T = false;
        this.U = l1Var;
        boolean e10 = pc.e(512);
        this.V = e10;
        if (z10) {
            bb0Var = new w2();
        } else {
            bb0Var = new bb0(-4958504, -8304404, -14637865, -12612630, false, 0, true);
        }
        this.f41314a = bb0Var;
        if (z10) {
            bb0Var2 = new w2();
        } else {
            bb0Var2 = new bb0(-12224791, -12879119, -16207709, -15226140, false, 0, true);
        }
        this.f41315b = bb0Var2;
        this.f41316c = new bb0(-16275028, -16270749, -5649306, -10833593, false, 0, true);
        this.d = new bb0(-1545896, -1613425, -2387892, -2198984, false, 0, true);
        if (z10) {
            bb0Var3 = new w2();
        } else {
            bb0Var3 = new bb0(-5818672, -9819171, -15755831, -14124319, false, 0, true);
        }
        this.f41317e = bb0Var3;
        if (z10) {
            bb0Var4 = new w2();
        } else {
            bb0Var4 = new bb0(-13803306, -13866273, -16738923, -16608823, false, 0, true);
        }
        this.f41318f = bb0Var4;
        bb0 bb0Var7 = new bb0(-16741490, -16673972, -7357129, -13525721, false, 0, true);
        this.h = bb0Var7;
        bb0 bb0Var8 = new bb0(-1949911, -1691537, -3705322, -2663914, false, 0, true);
        this.f41319n = bb0Var8;
        if (z10) {
            bb0Var5 = new w2();
        } else {
            bb0Var5 = new bb0(-2726657, -7186179, -13778695, -11034113, false, 0, true);
        }
        this.f41320r = bb0Var5;
        if (z10) {
            bb0Var6 = new w2();
        } else {
            bb0Var6 = new bb0(-11170817, -10507265, -16458548, -14105857, false, 0, true);
        }
        this.f41321s = bb0Var6;
        bb0 bb0Var9 = new bb0(-16723243, -16129415, -3674272, -9578153, false, 0, true);
        this.f41322w = bb0Var9;
        bb0 bb0Var10 = new bb0(-34714, -32091, -85931, -29103, false, 0, true);
        this.f41323x = bb0Var10;
        this.f41324y = new bb0(-16723243, -16129415, -3674272, -9578153, false, 0, true);
        this.E = new bb0(-16741490, -16673972, -7357129, -13525721, false, 0, true);
        bb0Var3.setBounds(0, 0, 80, 80);
        bb0Var4.setBounds(0, 0, 80, 80);
        bb0Var7.setBounds(0, 0, 80, 80);
        bb0Var8.setBounds(0, 0, 80, 80);
        bb0Var5.setBounds(0, 0, 80, 80);
        bb0Var6.setBounds(0, 0, 80, 80);
        bb0Var9.setBounds(0, 0, 80, 80);
        bb0Var10.setBounds(0, 0, 80, 80);
        setWillNotDraw(false);
        setLayerType(2, null);
        AnimatorSet animatorSet = new AnimatorSet();
        this.R = animatorSet;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 360);
        ofInt.addUpdateListener(new ch.w(19, this, l1Var));
        ofInt.setRepeatCount(-1);
        ofInt.setRepeatMode(1);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.playTogether(ofInt);
        animatorSet.setDuration(12000L);
        if (e10) {
            animatorSet.start();
        }
        if (this.W != 1) {
            this.W = 1;
            this.G = 255;
            ValueAnimator ofInt2 = ValueAnimator.ofInt(255, 0, 255);
            this.O = ofInt2;
            ofInt2.addUpdateListener(new v2(this, 3));
            this.O.setRepeatCount(-1);
            this.O.setRepeatMode(1);
            this.O.setInterpolator(new LinearInterpolator());
            this.O.setDuration(12000L);
            if (e10) {
                this.O.start();
            }
        }
    }

    public final void a() {
        if (this.S) {
            this.S = false;
            AnimatorSet animatorSet = this.R;
            if (animatorSet.isPaused()) {
                animatorSet.resume();
            }
            AnimatorSet animatorSet2 = this.Q;
            if (animatorSet2 != null && animatorSet2.isPaused()) {
                this.Q.resume();
            }
        }
    }

    public final void b(int i7, int i10, boolean z10) {
        long j3;
        int i11 = this.W;
        if (i11 != 2 && i11 != 3) {
            this.W = 2;
            ValueAnimator valueAnimator = this.O;
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
                this.O.cancel();
                this.O = null;
            }
            this.M = i7;
            this.N = i10;
            Point point = org.telegram.messenger.g0.f24118q;
            int i12 = point.x - i7;
            int i13 = i12 * i12;
            int i14 = ((point.y + org.telegram.messenger.g0.f24112m) + org.telegram.messenger.g0.f24113n) - i10;
            int i15 = i14 * i14;
            double sqrt = Math.sqrt(i13 + i15);
            int i16 = i7 * i7;
            double sqrt2 = Math.sqrt(i15 + i16);
            int i17 = i10 * i10;
            double max = Math.max(Math.max(Math.max(sqrt, sqrt2), Math.sqrt(i16 + i17)), Math.sqrt(i13 + i17));
            this.K = true;
            this.U.f41021e = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, (float) max);
            ofFloat.addUpdateListener(new v2(this, 1));
            ofFloat.addListener(new y9(this, 20));
            if (z10) {
                j3 = 400;
            } else {
                j3 = 0;
            }
            ofFloat.setDuration(j3);
            ofFloat.start();
        }
    }

    public final void c() {
        if (this.Q != null) {
            return;
        }
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.O.cancel();
            this.O = null;
        }
        this.H = 255;
        this.Q = new AnimatorSet();
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255, 255, 0);
        ofInt.addUpdateListener(new v2(this, 4));
        ofInt.setRepeatCount(-1);
        ofInt.setRepeatMode(1);
        ValueAnimator ofInt2 = ValueAnimator.ofInt(0, 0, 255, 0, 0);
        ofInt2.addUpdateListener(new v2(this, 5));
        ofInt2.setRepeatCount(-1);
        ofInt2.setRepeatMode(1);
        this.Q.playTogether(ofInt2, ofInt);
        this.Q.setInterpolator(new LinearInterpolator());
        this.Q.setDuration(24000L);
        if (this.V) {
            this.Q.start();
        } else {
            this.G = 0;
            this.F = 0;
        }
        invalidate();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.R;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.Q;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.T) {
            return;
        }
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        canvas.save();
        float sqrt = ((float) Math.sqrt((height * width) + (width * width))) / Math.min(height, width);
        canvas.scale(sqrt, sqrt, width, height);
        canvas.rotate(this.U.h, width, height);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        ((Canvas) this.U.f41018a.f342b).drawColor(0, mode);
        ((Canvas) this.U.f41019b.f342b).drawColor(0, mode);
        int i7 = this.H;
        if (i7 != 0 && this.I != 255) {
            this.f41316c.setAlpha(i7);
            this.f41322w.setAlpha(this.H);
            this.h.setAlpha(this.H);
            this.f41316c.draw(canvas);
            this.f41322w.draw((Canvas) this.U.f41018a.f342b);
            this.h.draw((Canvas) this.U.f41019b.f342b);
        }
        int i10 = this.G;
        if (i10 != 0 && this.I != 255) {
            this.f41315b.setAlpha(i10);
            this.f41318f.setAlpha(this.G);
            this.f41321s.setAlpha(this.G);
            this.f41315b.draw(canvas);
            this.f41318f.draw((Canvas) this.U.f41019b.f342b);
            this.f41321s.draw((Canvas) this.U.f41018a.f342b);
        }
        int i11 = this.F;
        if (i11 != 0 && this.I != 255) {
            this.f41314a.setAlpha(i11);
            this.f41317e.setAlpha(this.F);
            this.f41320r.setAlpha(this.F);
            this.f41314a.draw(canvas);
            this.f41317e.draw((Canvas) this.U.f41019b.f342b);
            this.f41320r.draw((Canvas) this.U.f41018a.f342b);
        }
        int i12 = this.I;
        if (i12 != 0) {
            this.d.setAlpha(i12);
            this.f41319n.setAlpha(this.I);
            this.f41323x.setAlpha(this.I);
            this.d.draw(canvas);
            this.f41319n.draw((Canvas) this.U.f41019b.f342b);
            this.f41323x.draw((Canvas) this.U.f41018a.f342b);
        }
        canvas.restore();
        if (this.K) {
            this.L.rewind();
            float f10 = this.J;
            Path.Direction direction = Path.Direction.CW;
            this.L.addCircle(this.M, this.N, f10, direction);
            canvas.clipPath(this.L);
            Objects.requireNonNull(this.U);
            Objects.requireNonNull(this.U);
            canvas.scale(1.12f, 1.12f, width, height);
            this.f41316c.setAlpha(255);
            this.f41316c.draw(canvas);
            this.L.rewind();
            this.L.addCircle(this.M / 4.0f, this.N / 4.0f, this.J / 4.0f, direction);
            ((Canvas) this.U.f41020c.f342b).drawColor(0, mode);
            ((Canvas) this.U.f41020c.f342b).save();
            ((Canvas) this.U.f41020c.f342b).clipPath(this.L);
            this.f41324y.setAlpha(255);
            this.f41324y.draw((Canvas) this.U.f41020c.f342b);
            ((Canvas) this.U.f41020c.f342b).restore();
            ((Canvas) this.U.d.f342b).drawColor(0, mode);
            ((Canvas) this.U.d.f342b).save();
            ((Canvas) this.U.d.f342b).clipPath(this.L);
            this.E.setAlpha(255);
            this.E.draw((Canvas) this.U.d.f342b);
            ((Canvas) this.U.d.f342b).restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.f41316c.setBounds(0, 0, getWidth(), getHeight());
        this.d.setBounds(0, 0, getWidth(), getHeight());
        this.f41315b.setBounds(0, 0, getWidth(), getHeight());
        this.f41314a.setBounds(0, 0, getWidth(), getHeight());
        this.f41324y.setBounds(0, 0, getWidth() / 4, getHeight() / 4);
        this.E.setBounds(0, 0, getWidth() / 4, getHeight() / 4);
        int width = getWidth();
        int height = getHeight();
        l1 l1Var = this.U;
        l1Var.f41022f = width;
        l1Var.f41023g = height;
        int i13 = width / 4;
        int i14 = height / 4;
        l1Var.f41020c = new b8(i13, i14);
        b8 b8Var = new b8(i13, i14);
        l1Var.d = b8Var;
        ((Paint) b8Var.f341a).setAlpha(180);
    }
}
