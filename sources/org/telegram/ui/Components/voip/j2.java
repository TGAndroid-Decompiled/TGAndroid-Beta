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
import j$.util.Objects;
import org.telegram.messenger.sc;
import org.telegram.ui.Components.jb0;
public final class j2 extends FrameLayout {
    public final jb0 D;
    public int E;
    public int F;
    public int G;
    public int H;
    public float I;
    public boolean J;
    public final Path K;
    public int L;
    public int M;
    public ValueAnimator N;
    public ValueAnimator O;
    public AnimatorSet P;
    public final AnimatorSet Q;
    public boolean R;
    public volatile boolean S;
    public final x0 T;
    public final boolean U;
    public int V;
    public final Drawable f31488a;
    public final Drawable f31489b;
    public final jb0 f31490c;
    public final jb0 d;
    public final Drawable e;
    public final Drawable f31491f;
    public final jb0 h;
    public final jb0 f31492n;
    public final Drawable f31493r;
    public final Drawable f31494s;
    public final jb0 f31495w;
    public final jb0 f31496x;
    public final jb0 f31497y;

    public j2(Activity activity, boolean z10, x0 x0Var) {
        super(activity);
        Drawable jb0Var;
        Drawable jb0Var2;
        Drawable jb0Var3;
        Drawable jb0Var4;
        Drawable jb0Var5;
        Drawable jb0Var6;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0.0f;
        this.J = false;
        this.K = new Path();
        this.L = 0;
        this.M = 0;
        this.R = false;
        this.S = false;
        this.T = x0Var;
        boolean e = sc.e(512);
        this.U = e;
        if (z10) {
            jb0Var = new i2();
        } else {
            jb0Var = new jb0(-4958504, -8304404, -14637865, -12612630, false, 0, true);
        }
        this.f31488a = jb0Var;
        if (z10) {
            jb0Var2 = new i2();
        } else {
            jb0Var2 = new jb0(-12224791, -12879119, -16207709, -15226140, false, 0, true);
        }
        this.f31489b = jb0Var2;
        this.f31490c = new jb0(-16275028, -16270749, -5649306, -10833593, false, 0, true);
        this.d = new jb0(-1545896, -1613425, -2387892, -2198984, false, 0, true);
        if (z10) {
            jb0Var3 = new i2();
        } else {
            jb0Var3 = new jb0(-5818672, -9819171, -15755831, -14124319, false, 0, true);
        }
        this.e = jb0Var3;
        if (z10) {
            jb0Var4 = new i2();
        } else {
            jb0Var4 = new jb0(-13803306, -13866273, -16738923, -16608823, false, 0, true);
        }
        this.f31491f = jb0Var4;
        jb0 jb0Var7 = new jb0(-16741490, -16673972, -7357129, -13525721, false, 0, true);
        this.h = jb0Var7;
        jb0 jb0Var8 = new jb0(-1949911, -1691537, -3705322, -2663914, false, 0, true);
        this.f31492n = jb0Var8;
        if (z10) {
            jb0Var5 = new i2();
        } else {
            jb0Var5 = new jb0(-2726657, -7186179, -13778695, -11034113, false, 0, true);
        }
        this.f31493r = jb0Var5;
        if (z10) {
            jb0Var6 = new i2();
        } else {
            jb0Var6 = new jb0(-11170817, -10507265, -16458548, -14105857, false, 0, true);
        }
        this.f31494s = jb0Var6;
        jb0 jb0Var9 = new jb0(-16723243, -16129415, -3674272, -9578153, false, 0, true);
        this.f31495w = jb0Var9;
        jb0 jb0Var10 = new jb0(-34714, -32091, -85931, -29103, false, 0, true);
        this.f31496x = jb0Var10;
        this.f31497y = new jb0(-16723243, -16129415, -3674272, -9578153, false, 0, true);
        this.D = new jb0(-16741490, -16673972, -7357129, -13525721, false, 0, true);
        jb0Var3.setBounds(0, 0, 80, 80);
        jb0Var4.setBounds(0, 0, 80, 80);
        jb0Var7.setBounds(0, 0, 80, 80);
        jb0Var8.setBounds(0, 0, 80, 80);
        jb0Var5.setBounds(0, 0, 80, 80);
        jb0Var6.setBounds(0, 0, 80, 80);
        jb0Var9.setBounds(0, 0, 80, 80);
        jb0Var10.setBounds(0, 0, 80, 80);
        setWillNotDraw(false);
        setLayerType(2, null);
        AnimatorSet animatorSet = new AnimatorSet();
        this.Q = animatorSet;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 360);
        ofInt.addUpdateListener(new ag.p2(19, this, x0Var));
        ofInt.setRepeatCount(-1);
        ofInt.setRepeatMode(1);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.playTogether(ofInt);
        animatorSet.setDuration(12000L);
        if (e) {
            animatorSet.start();
        }
        if (this.V != 1) {
            this.V = 1;
            this.F = 255;
            ValueAnimator ofInt2 = ValueAnimator.ofInt(255, 0, 255);
            this.N = ofInt2;
            ofInt2.addUpdateListener(new g2(this, 3));
            this.N.setRepeatCount(-1);
            this.N.setRepeatMode(1);
            this.N.setInterpolator(new LinearInterpolator());
            this.N.setDuration(12000L);
            if (e) {
                this.N.start();
            }
        }
    }

    public final void a() {
        if (this.R) {
            this.R = false;
            AnimatorSet animatorSet = this.Q;
            if (animatorSet.isPaused()) {
                animatorSet.resume();
            }
            AnimatorSet animatorSet2 = this.P;
            if (animatorSet2 != null && animatorSet2.isPaused()) {
                this.P.resume();
            }
        }
    }

    public final void b(int i10, int i11, boolean z10) {
        long j10;
        int i12 = this.V;
        if (i12 != 2 && i12 != 3) {
            this.V = 2;
            ValueAnimator valueAnimator = this.N;
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
                this.N.cancel();
                this.N = null;
            }
            this.L = i10;
            this.M = i11;
            Point point = org.telegram.messenger.i0.f16026q;
            int i13 = point.x - i10;
            int i14 = i13 * i13;
            int i15 = ((point.y + org.telegram.messenger.i0.f16020m) + org.telegram.messenger.i0.f16021n) - i11;
            int i16 = i15 * i15;
            double sqrt = Math.sqrt(i14 + i16);
            int i17 = i10 * i10;
            double sqrt2 = Math.sqrt(i16 + i17);
            int i18 = i11 * i11;
            double max = Math.max(Math.max(Math.max(sqrt, sqrt2), Math.sqrt(i17 + i18)), Math.sqrt(i14 + i18));
            this.J = true;
            this.T.e = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, (float) max);
            ofFloat.addUpdateListener(new g2(this, 1));
            ofFloat.addListener(new h2(this, 0));
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
        if (this.P != null) {
            return;
        }
        ValueAnimator valueAnimator = this.N;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.N.cancel();
            this.N = null;
        }
        this.G = 255;
        this.P = new AnimatorSet();
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255, 255, 0);
        ofInt.addUpdateListener(new g2(this, 4));
        ofInt.setRepeatCount(-1);
        ofInt.setRepeatMode(1);
        ValueAnimator ofInt2 = ValueAnimator.ofInt(0, 0, 255, 0, 0);
        ofInt2.addUpdateListener(new g2(this, 5));
        ofInt2.setRepeatCount(-1);
        ofInt2.setRepeatMode(1);
        this.P.playTogether(ofInt2, ofInt);
        this.P.setInterpolator(new LinearInterpolator());
        this.P.setDuration(24000L);
        if (this.U) {
            this.P.start();
        } else {
            this.F = 0;
            this.E = 0;
        }
        invalidate();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.Q;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.P;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        ValueAnimator valueAnimator = this.N;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.S) {
            return;
        }
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        canvas.save();
        float sqrt = ((float) Math.sqrt((height * width) + (width * width))) / Math.min(height, width);
        canvas.scale(sqrt, sqrt, width, height);
        canvas.rotate(this.T.h, width, height);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        ((Canvas) this.T.f31753a.f9348b).drawColor(0, mode);
        ((Canvas) this.T.f31754b.f9348b).drawColor(0, mode);
        int i10 = this.G;
        if (i10 != 0 && this.H != 255) {
            this.f31490c.setAlpha(i10);
            this.f31495w.setAlpha(this.G);
            this.h.setAlpha(this.G);
            this.f31490c.draw(canvas);
            this.f31495w.draw((Canvas) this.T.f31753a.f9348b);
            this.h.draw((Canvas) this.T.f31754b.f9348b);
        }
        int i11 = this.F;
        if (i11 != 0 && this.H != 255) {
            this.f31489b.setAlpha(i11);
            this.f31491f.setAlpha(this.F);
            this.f31494s.setAlpha(this.F);
            this.f31489b.draw(canvas);
            this.f31491f.draw((Canvas) this.T.f31754b.f9348b);
            this.f31494s.draw((Canvas) this.T.f31753a.f9348b);
        }
        int i12 = this.E;
        if (i12 != 0 && this.H != 255) {
            this.f31488a.setAlpha(i12);
            this.e.setAlpha(this.E);
            this.f31493r.setAlpha(this.E);
            this.f31488a.draw(canvas);
            this.e.draw((Canvas) this.T.f31754b.f9348b);
            this.f31493r.draw((Canvas) this.T.f31753a.f9348b);
        }
        int i13 = this.H;
        if (i13 != 0) {
            this.d.setAlpha(i13);
            this.f31492n.setAlpha(this.H);
            this.f31496x.setAlpha(this.H);
            this.d.draw(canvas);
            this.f31492n.draw((Canvas) this.T.f31754b.f9348b);
            this.f31496x.draw((Canvas) this.T.f31753a.f9348b);
        }
        canvas.restore();
        if (this.J) {
            this.K.rewind();
            float f7 = this.I;
            Path.Direction direction = Path.Direction.CW;
            this.K.addCircle(this.L, this.M, f7, direction);
            canvas.clipPath(this.K);
            Objects.requireNonNull(this.T);
            Objects.requireNonNull(this.T);
            canvas.scale(1.12f, 1.12f, width, height);
            this.f31490c.setAlpha(255);
            this.f31490c.draw(canvas);
            this.K.rewind();
            this.K.addCircle(this.L / 4.0f, this.M / 4.0f, this.I / 4.0f, direction);
            ((Canvas) this.T.f31755c.f9348b).drawColor(0, mode);
            ((Canvas) this.T.f31755c.f9348b).save();
            ((Canvas) this.T.f31755c.f9348b).clipPath(this.K);
            this.f31497y.setAlpha(255);
            this.f31497y.draw((Canvas) this.T.f31755c.f9348b);
            ((Canvas) this.T.f31755c.f9348b).restore();
            ((Canvas) this.T.d.f9348b).drawColor(0, mode);
            ((Canvas) this.T.d.f9348b).save();
            ((Canvas) this.T.d.f9348b).clipPath(this.K);
            this.D.setAlpha(255);
            this.D.draw((Canvas) this.T.d.f9348b);
            ((Canvas) this.T.d.f9348b).restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f31490c.setBounds(0, 0, getWidth(), getHeight());
        this.d.setBounds(0, 0, getWidth(), getHeight());
        this.f31489b.setBounds(0, 0, getWidth(), getHeight());
        this.f31488a.setBounds(0, 0, getWidth(), getHeight());
        this.f31497y.setBounds(0, 0, getWidth() / 4, getHeight() / 4);
        this.D.setBounds(0, 0, getWidth() / 4, getHeight() / 4);
        int width = getWidth();
        int height = getHeight();
        x0 x0Var = this.T;
        x0Var.f31756f = width;
        x0Var.f31757g = height;
        int i14 = width / 4;
        int i15 = height / 4;
        x0Var.f31755c = new j2.f(i14, i15);
        j2.f fVar = new j2.f(i14, i15);
        x0Var.d = fVar;
        ((Paint) fVar.f9347a).setAlpha(180);
    }
}
