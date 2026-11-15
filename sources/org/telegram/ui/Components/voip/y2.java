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
import org.telegram.messenger.qc;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.ra0;
public final class y2 extends FrameLayout {
    public final ra0 E;
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
    public final m1 U;
    public final boolean V;
    public int W;
    public final Drawable f41070a;
    public final Drawable f41071b;
    public final ra0 f41072c;
    public final ra0 d;
    public final Drawable f41073e;
    public final Drawable f41074f;
    public final ra0 h;
    public final ra0 f41075n;
    public final Drawable f41076r;
    public final Drawable f41077s;
    public final ra0 f41078w;
    public final ra0 f41079x;
    public final ra0 f41080y;

    public y2(Activity activity, boolean z10, m1 m1Var) {
        super(activity);
        Drawable ra0Var;
        Drawable ra0Var2;
        Drawable ra0Var3;
        Drawable ra0Var4;
        Drawable ra0Var5;
        Drawable ra0Var6;
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
        this.U = m1Var;
        boolean e10 = qc.e(512);
        this.V = e10;
        if (z10) {
            ra0Var = new x2();
        } else {
            ra0Var = new ra0(-4958504, -8304404, -14637865, -12612630, false, 0, true);
        }
        this.f41070a = ra0Var;
        if (z10) {
            ra0Var2 = new x2();
        } else {
            ra0Var2 = new ra0(-12224791, -12879119, -16207709, -15226140, false, 0, true);
        }
        this.f41071b = ra0Var2;
        this.f41072c = new ra0(-16275028, -16270749, -5649306, -10833593, false, 0, true);
        this.d = new ra0(-1545896, -1613425, -2387892, -2198984, false, 0, true);
        if (z10) {
            ra0Var3 = new x2();
        } else {
            ra0Var3 = new ra0(-5818672, -9819171, -15755831, -14124319, false, 0, true);
        }
        this.f41073e = ra0Var3;
        if (z10) {
            ra0Var4 = new x2();
        } else {
            ra0Var4 = new ra0(-13803306, -13866273, -16738923, -16608823, false, 0, true);
        }
        this.f41074f = ra0Var4;
        ra0 ra0Var7 = new ra0(-16741490, -16673972, -7357129, -13525721, false, 0, true);
        this.h = ra0Var7;
        ra0 ra0Var8 = new ra0(-1949911, -1691537, -3705322, -2663914, false, 0, true);
        this.f41075n = ra0Var8;
        if (z10) {
            ra0Var5 = new x2();
        } else {
            ra0Var5 = new ra0(-2726657, -7186179, -13778695, -11034113, false, 0, true);
        }
        this.f41076r = ra0Var5;
        if (z10) {
            ra0Var6 = new x2();
        } else {
            ra0Var6 = new ra0(-11170817, -10507265, -16458548, -14105857, false, 0, true);
        }
        this.f41077s = ra0Var6;
        ra0 ra0Var9 = new ra0(-16723243, -16129415, -3674272, -9578153, false, 0, true);
        this.f41078w = ra0Var9;
        ra0 ra0Var10 = new ra0(-34714, -32091, -85931, -29103, false, 0, true);
        this.f41079x = ra0Var10;
        this.f41080y = new ra0(-16723243, -16129415, -3674272, -9578153, false, 0, true);
        this.E = new ra0(-16741490, -16673972, -7357129, -13525721, false, 0, true);
        ra0Var3.setBounds(0, 0, 80, 80);
        ra0Var4.setBounds(0, 0, 80, 80);
        ra0Var7.setBounds(0, 0, 80, 80);
        ra0Var8.setBounds(0, 0, 80, 80);
        ra0Var5.setBounds(0, 0, 80, 80);
        ra0Var6.setBounds(0, 0, 80, 80);
        ra0Var9.setBounds(0, 0, 80, 80);
        ra0Var10.setBounds(0, 0, 80, 80);
        setWillNotDraw(false);
        setLayerType(2, null);
        AnimatorSet animatorSet = new AnimatorSet();
        this.R = animatorSet;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 360);
        ofInt.addUpdateListener(new ch.v(19, this, m1Var));
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
            ofInt2.addUpdateListener(new w2(this, 3));
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
            Point point = org.telegram.messenger.g0.f23611q;
            int i12 = point.x - i7;
            int i13 = i12 * i12;
            int i14 = ((point.y + org.telegram.messenger.g0.f23605m) + org.telegram.messenger.g0.f23606n) - i10;
            int i15 = i14 * i14;
            double sqrt = Math.sqrt(i13 + i15);
            int i16 = i7 * i7;
            double sqrt2 = Math.sqrt(i15 + i16);
            int i17 = i10 * i10;
            double max = Math.max(Math.max(Math.max(sqrt, sqrt2), Math.sqrt(i16 + i17)), Math.sqrt(i13 + i17));
            this.K = true;
            this.U.f40781e = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, (float) max);
            ofFloat.addUpdateListener(new w2(this, 1));
            ofFloat.addListener(new w9(this, 20));
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
        ofInt.addUpdateListener(new w2(this, 4));
        ofInt.setRepeatCount(-1);
        ofInt.setRepeatMode(1);
        ValueAnimator ofInt2 = ValueAnimator.ofInt(0, 0, 255, 0, 0);
        ofInt2.addUpdateListener(new w2(this, 5));
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
        ((Canvas) this.U.f40778a.f342b).drawColor(0, mode);
        ((Canvas) this.U.f40779b.f342b).drawColor(0, mode);
        int i7 = this.H;
        if (i7 != 0 && this.I != 255) {
            this.f41072c.setAlpha(i7);
            this.f41078w.setAlpha(this.H);
            this.h.setAlpha(this.H);
            this.f41072c.draw(canvas);
            this.f41078w.draw((Canvas) this.U.f40778a.f342b);
            this.h.draw((Canvas) this.U.f40779b.f342b);
        }
        int i10 = this.G;
        if (i10 != 0 && this.I != 255) {
            this.f41071b.setAlpha(i10);
            this.f41074f.setAlpha(this.G);
            this.f41077s.setAlpha(this.G);
            this.f41071b.draw(canvas);
            this.f41074f.draw((Canvas) this.U.f40779b.f342b);
            this.f41077s.draw((Canvas) this.U.f40778a.f342b);
        }
        int i11 = this.F;
        if (i11 != 0 && this.I != 255) {
            this.f41070a.setAlpha(i11);
            this.f41073e.setAlpha(this.F);
            this.f41076r.setAlpha(this.F);
            this.f41070a.draw(canvas);
            this.f41073e.draw((Canvas) this.U.f40779b.f342b);
            this.f41076r.draw((Canvas) this.U.f40778a.f342b);
        }
        int i12 = this.I;
        if (i12 != 0) {
            this.d.setAlpha(i12);
            this.f41075n.setAlpha(this.I);
            this.f41079x.setAlpha(this.I);
            this.d.draw(canvas);
            this.f41075n.draw((Canvas) this.U.f40779b.f342b);
            this.f41079x.draw((Canvas) this.U.f40778a.f342b);
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
            this.f41072c.setAlpha(255);
            this.f41072c.draw(canvas);
            this.L.rewind();
            this.L.addCircle(this.M / 4.0f, this.N / 4.0f, this.J / 4.0f, direction);
            ((Canvas) this.U.f40780c.f342b).drawColor(0, mode);
            ((Canvas) this.U.f40780c.f342b).save();
            ((Canvas) this.U.f40780c.f342b).clipPath(this.L);
            this.f41080y.setAlpha(255);
            this.f41080y.draw((Canvas) this.U.f40780c.f342b);
            ((Canvas) this.U.f40780c.f342b).restore();
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
        this.f41072c.setBounds(0, 0, getWidth(), getHeight());
        this.d.setBounds(0, 0, getWidth(), getHeight());
        this.f41071b.setBounds(0, 0, getWidth(), getHeight());
        this.f41070a.setBounds(0, 0, getWidth(), getHeight());
        this.f41080y.setBounds(0, 0, getWidth() / 4, getHeight() / 4);
        this.E.setBounds(0, 0, getWidth() / 4, getHeight() / 4);
        int width = getWidth();
        int height = getHeight();
        m1 m1Var = this.U;
        m1Var.f40782f = width;
        m1Var.f40783g = height;
        int i13 = width / 4;
        int i14 = height / 4;
        m1Var.f40780c = new b8(i13, i14);
        b8 b8Var = new b8(i13, i14);
        m1Var.d = b8Var;
        ((Paint) b8Var.f341a).setAlpha(180);
    }
}
