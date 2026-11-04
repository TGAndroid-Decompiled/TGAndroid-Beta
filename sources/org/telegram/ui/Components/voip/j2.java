package org.telegram.ui.Components.voip;

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
import ci.uc;
import j$.util.Objects;
import org.telegram.messenger.lc;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.la0;
public final class j2 extends FrameLayout {
    public final la0 E;
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
    public final x0 U;
    public final boolean V;
    public int W;
    public final Drawable f39422a;
    public final Drawable f39423b;
    public final la0 f39424c;
    public final la0 d;
    public final Drawable f39425e;
    public final Drawable f39426f;
    public final la0 h;
    public final la0 f39427n;
    public final Drawable f39428r;
    public final Drawable f39429s;
    public final la0 f39430w;
    public final la0 f39431x;
    public final la0 f39432y;

    public j2(Activity activity, boolean z10, x0 x0Var) {
        super(activity);
        Drawable la0Var;
        Drawable la0Var2;
        Drawable la0Var3;
        Drawable la0Var4;
        Drawable la0Var5;
        Drawable la0Var6;
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
        this.U = x0Var;
        boolean e10 = lc.e(512);
        this.V = e10;
        if (z10) {
            la0Var = new i2();
        } else {
            la0Var = new la0(-4958504, -8304404, -14637865, -12612630, false, 0, true);
        }
        this.f39422a = la0Var;
        if (z10) {
            la0Var2 = new i2();
        } else {
            la0Var2 = new la0(-12224791, -12879119, -16207709, -15226140, false, 0, true);
        }
        this.f39423b = la0Var2;
        this.f39424c = new la0(-16275028, -16270749, -5649306, -10833593, false, 0, true);
        this.d = new la0(-1545896, -1613425, -2387892, -2198984, false, 0, true);
        if (z10) {
            la0Var3 = new i2();
        } else {
            la0Var3 = new la0(-5818672, -9819171, -15755831, -14124319, false, 0, true);
        }
        this.f39425e = la0Var3;
        if (z10) {
            la0Var4 = new i2();
        } else {
            la0Var4 = new la0(-13803306, -13866273, -16738923, -16608823, false, 0, true);
        }
        this.f39426f = la0Var4;
        la0 la0Var7 = new la0(-16741490, -16673972, -7357129, -13525721, false, 0, true);
        this.h = la0Var7;
        la0 la0Var8 = new la0(-1949911, -1691537, -3705322, -2663914, false, 0, true);
        this.f39427n = la0Var8;
        if (z10) {
            la0Var5 = new i2();
        } else {
            la0Var5 = new la0(-2726657, -7186179, -13778695, -11034113, false, 0, true);
        }
        this.f39428r = la0Var5;
        if (z10) {
            la0Var6 = new i2();
        } else {
            la0Var6 = new la0(-11170817, -10507265, -16458548, -14105857, false, 0, true);
        }
        this.f39429s = la0Var6;
        la0 la0Var9 = new la0(-16723243, -16129415, -3674272, -9578153, false, 0, true);
        this.f39430w = la0Var9;
        la0 la0Var10 = new la0(-34714, -32091, -85931, -29103, false, 0, true);
        this.f39431x = la0Var10;
        this.f39432y = new la0(-16723243, -16129415, -3674272, -9578153, false, 0, true);
        this.E = new la0(-16741490, -16673972, -7357129, -13525721, false, 0, true);
        la0Var3.setBounds(0, 0, 80, 80);
        la0Var4.setBounds(0, 0, 80, 80);
        la0Var7.setBounds(0, 0, 80, 80);
        la0Var8.setBounds(0, 0, 80, 80);
        la0Var5.setBounds(0, 0, 80, 80);
        la0Var6.setBounds(0, 0, 80, 80);
        la0Var9.setBounds(0, 0, 80, 80);
        la0Var10.setBounds(0, 0, 80, 80);
        setWillNotDraw(false);
        setLayerType(2, null);
        AnimatorSet animatorSet = new AnimatorSet();
        this.R = animatorSet;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 360);
        ofInt.addUpdateListener(new uc(20, this, x0Var));
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
            ofInt2.addUpdateListener(new h2(this, 3));
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

    public final void b(int i3, int i10, boolean z10) {
        long j10;
        int i11 = this.W;
        if (i11 != 2 && i11 != 3) {
            this.W = 2;
            ValueAnimator valueAnimator = this.O;
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
                this.O.cancel();
                this.O = null;
            }
            this.M = i3;
            this.N = i10;
            Point point = org.telegram.messenger.g0.f22608q;
            int i12 = point.x - i3;
            int i13 = i12 * i12;
            int i14 = ((point.y + org.telegram.messenger.g0.f22602m) + org.telegram.messenger.g0.f22603n) - i10;
            int i15 = i14 * i14;
            double sqrt = Math.sqrt(i13 + i15);
            int i16 = i3 * i3;
            double sqrt2 = Math.sqrt(i15 + i16);
            int i17 = i10 * i10;
            double max = Math.max(Math.max(Math.max(sqrt, sqrt2), Math.sqrt(i16 + i17)), Math.sqrt(i13 + i17));
            this.K = true;
            this.U.f39707e = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, (float) max);
            ofFloat.addUpdateListener(new h2(this, 1));
            ofFloat.addListener(new w9(this, 19));
            if (z10) {
                j10 = 400;
            } else {
                j10 = 0;
            }
            ofFloat.setDuration(j10);
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
        ofInt.addUpdateListener(new h2(this, 4));
        ofInt.setRepeatCount(-1);
        ofInt.setRepeatMode(1);
        ValueAnimator ofInt2 = ValueAnimator.ofInt(0, 0, 255, 0, 0);
        ofInt2.addUpdateListener(new h2(this, 5));
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
        ((Canvas) this.U.f39704a.f17690b).drawColor(0, mode);
        ((Canvas) this.U.f39705b.f17690b).drawColor(0, mode);
        int i3 = this.H;
        if (i3 != 0 && this.I != 255) {
            this.f39424c.setAlpha(i3);
            this.f39430w.setAlpha(this.H);
            this.h.setAlpha(this.H);
            this.f39424c.draw(canvas);
            this.f39430w.draw((Canvas) this.U.f39704a.f17690b);
            this.h.draw((Canvas) this.U.f39705b.f17690b);
        }
        int i10 = this.G;
        if (i10 != 0 && this.I != 255) {
            this.f39423b.setAlpha(i10);
            this.f39426f.setAlpha(this.G);
            this.f39429s.setAlpha(this.G);
            this.f39423b.draw(canvas);
            this.f39426f.draw((Canvas) this.U.f39705b.f17690b);
            this.f39429s.draw((Canvas) this.U.f39704a.f17690b);
        }
        int i11 = this.F;
        if (i11 != 0 && this.I != 255) {
            this.f39422a.setAlpha(i11);
            this.f39425e.setAlpha(this.F);
            this.f39428r.setAlpha(this.F);
            this.f39422a.draw(canvas);
            this.f39425e.draw((Canvas) this.U.f39705b.f17690b);
            this.f39428r.draw((Canvas) this.U.f39704a.f17690b);
        }
        int i12 = this.I;
        if (i12 != 0) {
            this.d.setAlpha(i12);
            this.f39427n.setAlpha(this.I);
            this.f39431x.setAlpha(this.I);
            this.d.draw(canvas);
            this.f39427n.draw((Canvas) this.U.f39705b.f17690b);
            this.f39431x.draw((Canvas) this.U.f39704a.f17690b);
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
            this.f39424c.setAlpha(255);
            this.f39424c.draw(canvas);
            this.L.rewind();
            this.L.addCircle(this.M / 4.0f, this.N / 4.0f, this.J / 4.0f, direction);
            ((Canvas) this.U.f39706c.f17690b).drawColor(0, mode);
            ((Canvas) this.U.f39706c.f17690b).save();
            ((Canvas) this.U.f39706c.f17690b).clipPath(this.L);
            this.f39432y.setAlpha(255);
            this.f39432y.draw((Canvas) this.U.f39706c.f17690b);
            ((Canvas) this.U.f39706c.f17690b).restore();
            ((Canvas) this.U.d.f17690b).drawColor(0, mode);
            ((Canvas) this.U.d.f17690b).save();
            ((Canvas) this.U.d.f17690b).clipPath(this.L);
            this.E.setAlpha(255);
            this.E.draw((Canvas) this.U.d.f17690b);
            ((Canvas) this.U.d.f17690b).restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        this.f39424c.setBounds(0, 0, getWidth(), getHeight());
        this.d.setBounds(0, 0, getWidth(), getHeight());
        this.f39423b.setBounds(0, 0, getWidth(), getHeight());
        this.f39422a.setBounds(0, 0, getWidth(), getHeight());
        this.f39432y.setBounds(0, 0, getWidth() / 4, getHeight() / 4);
        this.E.setBounds(0, 0, getWidth() / 4, getHeight() / 4);
        int width = getWidth();
        int height = getHeight();
        x0 x0Var = this.U;
        x0Var.f39708f = width;
        x0Var.f39709g = height;
        int i13 = width / 4;
        int i14 = height / 4;
        x0Var.f39706c = new l2.e(i13, i14);
        l2.e eVar = new l2.e(i13, i14);
        x0Var.d = eVar;
        ((Paint) eVar.f17689a).setAlpha(180);
    }
}
