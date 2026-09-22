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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.nc0;
import org.telegram.ui.Components.t81;
public final class c3 extends FrameLayout {
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
    public final q1 T;
    public final boolean U;
    public int V;
    public final Drawable f29258a;
    public final Drawable f29259b;
    public final nc0 f29260c;
    public final nc0 d;
    public final Drawable e;
    public final Drawable f29261f;
    public final nc0 h;
    public final nc0 f29262n;
    public final Drawable f29263r;
    public final Drawable f29264s;
    public final nc0 v;
    public final nc0 f29265w;
    public final nc0 f29266x;
    public final nc0 f29267y;

    public c3(Activity activity, boolean z10, q1 q1Var) {
        super(activity);
        Drawable nc0Var;
        Drawable nc0Var2;
        Drawable nc0Var3;
        Drawable nc0Var4;
        Drawable nc0Var5;
        Drawable nc0Var6;
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
        this.T = q1Var;
        boolean isEnabled = LiteMode.isEnabled(512);
        this.U = isEnabled;
        if (z10) {
            nc0Var = new b3();
        } else {
            nc0Var = new nc0(-4958504, -8304404, -14637865, -12612630, false, 0, true);
        }
        this.f29258a = nc0Var;
        if (z10) {
            nc0Var2 = new b3();
        } else {
            nc0Var2 = new nc0(-12224791, -12879119, -16207709, -15226140, false, 0, true);
        }
        this.f29259b = nc0Var2;
        this.f29260c = new nc0(-16275028, -16270749, -5649306, -10833593, false, 0, true);
        this.d = new nc0(-1545896, -1613425, -2387892, -2198984, false, 0, true);
        if (z10) {
            nc0Var3 = new b3();
        } else {
            nc0Var3 = new nc0(-5818672, -9819171, -15755831, -14124319, false, 0, true);
        }
        this.e = nc0Var3;
        if (z10) {
            nc0Var4 = new b3();
        } else {
            nc0Var4 = new nc0(-13803306, -13866273, -16738923, -16608823, false, 0, true);
        }
        this.f29261f = nc0Var4;
        nc0 nc0Var7 = new nc0(-16741490, -16673972, -7357129, -13525721, false, 0, true);
        this.h = nc0Var7;
        nc0 nc0Var8 = new nc0(-1949911, -1691537, -3705322, -2663914, false, 0, true);
        this.f29262n = nc0Var8;
        if (z10) {
            nc0Var5 = new b3();
        } else {
            nc0Var5 = new nc0(-2726657, -7186179, -13778695, -11034113, false, 0, true);
        }
        this.f29263r = nc0Var5;
        if (z10) {
            nc0Var6 = new b3();
        } else {
            nc0Var6 = new nc0(-11170817, -10507265, -16458548, -14105857, false, 0, true);
        }
        this.f29264s = nc0Var6;
        nc0 nc0Var9 = new nc0(-16723243, -16129415, -3674272, -9578153, false, 0, true);
        this.v = nc0Var9;
        nc0 nc0Var10 = new nc0(-34714, -32091, -85931, -29103, false, 0, true);
        this.f29265w = nc0Var10;
        this.f29266x = new nc0(-16723243, -16129415, -3674272, -9578153, false, 0, true);
        this.f29267y = new nc0(-16741490, -16673972, -7357129, -13525721, false, 0, true);
        nc0Var3.setBounds(0, 0, 80, 80);
        nc0Var4.setBounds(0, 0, 80, 80);
        nc0Var7.setBounds(0, 0, 80, 80);
        nc0Var8.setBounds(0, 0, 80, 80);
        nc0Var5.setBounds(0, 0, 80, 80);
        nc0Var6.setBounds(0, 0, 80, 80);
        nc0Var9.setBounds(0, 0, 80, 80);
        nc0Var10.setBounds(0, 0, 80, 80);
        setWillNotDraw(false);
        setLayerType(2, null);
        AnimatorSet animatorSet = new AnimatorSet();
        this.Q = animatorSet;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 360);
        ofInt.addUpdateListener(new ai.x(19, this, q1Var));
        ofInt.setRepeatCount(-1);
        ofInt.setRepeatMode(1);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.playTogether(ofInt);
        animatorSet.setDuration(12000L);
        if (isEnabled) {
            animatorSet.start();
        }
        if (this.V != 1) {
            this.V = 1;
            this.F = 255;
            ValueAnimator ofInt2 = ValueAnimator.ofInt(255, 0, 255);
            this.N = ofInt2;
            ofInt2.addUpdateListener(new a3(this, 3));
            this.N.setRepeatCount(-1);
            this.N.setRepeatMode(1);
            this.N.setInterpolator(new LinearInterpolator());
            this.N.setDuration(12000L);
            if (isEnabled) {
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
        long j3;
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
            Point point = AndroidUtilities.displaySize;
            int i13 = point.x - i10;
            int i14 = i13 * i13;
            int i15 = ((point.y + AndroidUtilities.statusBarHeight) + AndroidUtilities.navigationBarHeight) - i11;
            int i16 = i15 * i15;
            double sqrt = Math.sqrt(i14 + i16);
            int i17 = i10 * i10;
            double sqrt2 = Math.sqrt(i16 + i17);
            int i18 = i11 * i11;
            double max = Math.max(Math.max(Math.max(sqrt, sqrt2), Math.sqrt(i17 + i18)), Math.sqrt(i14 + i18));
            this.J = true;
            this.T.e = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, (float) max);
            ofFloat.addUpdateListener(new a3(this, 1));
            ofFloat.addListener(new t81(this, 12));
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
        ofInt.addUpdateListener(new a3(this, 4));
        ofInt.setRepeatCount(-1);
        ofInt.setRepeatMode(1);
        ValueAnimator ofInt2 = ValueAnimator.ofInt(0, 0, 255, 0, 0);
        ofInt2.addUpdateListener(new a3(this, 5));
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
        ((Canvas) this.T.f29534a.f7329b).drawColor(0, mode);
        ((Canvas) this.T.f29535b.f7329b).drawColor(0, mode);
        int i10 = this.G;
        if (i10 != 0 && this.H != 255) {
            this.f29260c.setAlpha(i10);
            this.v.setAlpha(this.G);
            this.h.setAlpha(this.G);
            this.f29260c.draw(canvas);
            this.v.draw((Canvas) this.T.f29534a.f7329b);
            this.h.draw((Canvas) this.T.f29535b.f7329b);
        }
        int i11 = this.F;
        if (i11 != 0 && this.H != 255) {
            this.f29259b.setAlpha(i11);
            this.f29261f.setAlpha(this.F);
            this.f29264s.setAlpha(this.F);
            this.f29259b.draw(canvas);
            this.f29261f.draw((Canvas) this.T.f29535b.f7329b);
            this.f29264s.draw((Canvas) this.T.f29534a.f7329b);
        }
        int i12 = this.E;
        if (i12 != 0 && this.H != 255) {
            this.f29258a.setAlpha(i12);
            this.e.setAlpha(this.E);
            this.f29263r.setAlpha(this.E);
            this.f29258a.draw(canvas);
            this.e.draw((Canvas) this.T.f29535b.f7329b);
            this.f29263r.draw((Canvas) this.T.f29534a.f7329b);
        }
        int i13 = this.H;
        if (i13 != 0) {
            this.d.setAlpha(i13);
            this.f29262n.setAlpha(this.H);
            this.f29265w.setAlpha(this.H);
            this.d.draw(canvas);
            this.f29262n.draw((Canvas) this.T.f29535b.f7329b);
            this.f29265w.draw((Canvas) this.T.f29534a.f7329b);
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
            this.f29260c.setAlpha(255);
            this.f29260c.draw(canvas);
            this.K.rewind();
            this.K.addCircle(this.L / 4.0f, this.M / 4.0f, this.I / 4.0f, direction);
            ((Canvas) this.T.f29536c.f7329b).drawColor(0, mode);
            ((Canvas) this.T.f29536c.f7329b).save();
            ((Canvas) this.T.f29536c.f7329b).clipPath(this.K);
            this.f29266x.setAlpha(255);
            this.f29266x.draw((Canvas) this.T.f29536c.f7329b);
            ((Canvas) this.T.f29536c.f7329b).restore();
            ((Canvas) this.T.d.f7329b).drawColor(0, mode);
            ((Canvas) this.T.d.f7329b).save();
            ((Canvas) this.T.d.f7329b).clipPath(this.K);
            this.f29267y.setAlpha(255);
            this.f29267y.draw((Canvas) this.T.d.f7329b);
            ((Canvas) this.T.d.f7329b).restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f29260c.setBounds(0, 0, getWidth(), getHeight());
        this.d.setBounds(0, 0, getWidth(), getHeight());
        this.f29259b.setBounds(0, 0, getWidth(), getHeight());
        this.f29258a.setBounds(0, 0, getWidth(), getHeight());
        this.f29266x.setBounds(0, 0, getWidth() / 4, getHeight() / 4);
        this.f29267y.setBounds(0, 0, getWidth() / 4, getHeight() / 4);
        int width = getWidth();
        int height = getHeight();
        q1 q1Var = this.T;
        q1Var.f29537f = width;
        q1Var.f29538g = height;
        int i14 = width / 4;
        int i15 = height / 4;
        q1Var.f29536c = new com.google.firebase.messaging.n(i14, i15);
        com.google.firebase.messaging.n nVar = new com.google.firebase.messaging.n(i14, i15);
        q1Var.d = nVar;
        ((Paint) nVar.f7328a).setAlpha(180);
    }
}
