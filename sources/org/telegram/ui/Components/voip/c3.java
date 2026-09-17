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
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.w81;
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
    public final Drawable f28870a;
    public final Drawable f28871b;
    public final cc0 f28872c;
    public final cc0 d;
    public final Drawable e;
    public final Drawable f28873f;
    public final cc0 h;
    public final cc0 f28874n;
    public final Drawable f28875r;
    public final Drawable f28876s;
    public final cc0 v;
    public final cc0 f28877w;
    public final cc0 f28878x;
    public final cc0 f28879y;

    public c3(Activity activity, boolean z10, q1 q1Var) {
        super(activity);
        Drawable cc0Var;
        Drawable cc0Var2;
        Drawable cc0Var3;
        Drawable cc0Var4;
        Drawable cc0Var5;
        Drawable cc0Var6;
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
            cc0Var = new b3();
        } else {
            cc0Var = new cc0(-4958504, -8304404, -14637865, -12612630, false, 0, true);
        }
        this.f28870a = cc0Var;
        if (z10) {
            cc0Var2 = new b3();
        } else {
            cc0Var2 = new cc0(-12224791, -12879119, -16207709, -15226140, false, 0, true);
        }
        this.f28871b = cc0Var2;
        this.f28872c = new cc0(-16275028, -16270749, -5649306, -10833593, false, 0, true);
        this.d = new cc0(-1545896, -1613425, -2387892, -2198984, false, 0, true);
        if (z10) {
            cc0Var3 = new b3();
        } else {
            cc0Var3 = new cc0(-5818672, -9819171, -15755831, -14124319, false, 0, true);
        }
        this.e = cc0Var3;
        if (z10) {
            cc0Var4 = new b3();
        } else {
            cc0Var4 = new cc0(-13803306, -13866273, -16738923, -16608823, false, 0, true);
        }
        this.f28873f = cc0Var4;
        cc0 cc0Var7 = new cc0(-16741490, -16673972, -7357129, -13525721, false, 0, true);
        this.h = cc0Var7;
        cc0 cc0Var8 = new cc0(-1949911, -1691537, -3705322, -2663914, false, 0, true);
        this.f28874n = cc0Var8;
        if (z10) {
            cc0Var5 = new b3();
        } else {
            cc0Var5 = new cc0(-2726657, -7186179, -13778695, -11034113, false, 0, true);
        }
        this.f28875r = cc0Var5;
        if (z10) {
            cc0Var6 = new b3();
        } else {
            cc0Var6 = new cc0(-11170817, -10507265, -16458548, -14105857, false, 0, true);
        }
        this.f28876s = cc0Var6;
        cc0 cc0Var9 = new cc0(-16723243, -16129415, -3674272, -9578153, false, 0, true);
        this.v = cc0Var9;
        cc0 cc0Var10 = new cc0(-34714, -32091, -85931, -29103, false, 0, true);
        this.f28877w = cc0Var10;
        this.f28878x = new cc0(-16723243, -16129415, -3674272, -9578153, false, 0, true);
        this.f28879y = new cc0(-16741490, -16673972, -7357129, -13525721, false, 0, true);
        cc0Var3.setBounds(0, 0, 80, 80);
        cc0Var4.setBounds(0, 0, 80, 80);
        cc0Var7.setBounds(0, 0, 80, 80);
        cc0Var8.setBounds(0, 0, 80, 80);
        cc0Var5.setBounds(0, 0, 80, 80);
        cc0Var6.setBounds(0, 0, 80, 80);
        cc0Var9.setBounds(0, 0, 80, 80);
        cc0Var10.setBounds(0, 0, 80, 80);
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
            ofFloat.addListener(new w81(this, 11));
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
        ((Canvas) this.T.f29146a.f7337b).drawColor(0, mode);
        ((Canvas) this.T.f29147b.f7337b).drawColor(0, mode);
        int i10 = this.G;
        if (i10 != 0 && this.H != 255) {
            this.f28872c.setAlpha(i10);
            this.v.setAlpha(this.G);
            this.h.setAlpha(this.G);
            this.f28872c.draw(canvas);
            this.v.draw((Canvas) this.T.f29146a.f7337b);
            this.h.draw((Canvas) this.T.f29147b.f7337b);
        }
        int i11 = this.F;
        if (i11 != 0 && this.H != 255) {
            this.f28871b.setAlpha(i11);
            this.f28873f.setAlpha(this.F);
            this.f28876s.setAlpha(this.F);
            this.f28871b.draw(canvas);
            this.f28873f.draw((Canvas) this.T.f29147b.f7337b);
            this.f28876s.draw((Canvas) this.T.f29146a.f7337b);
        }
        int i12 = this.E;
        if (i12 != 0 && this.H != 255) {
            this.f28870a.setAlpha(i12);
            this.e.setAlpha(this.E);
            this.f28875r.setAlpha(this.E);
            this.f28870a.draw(canvas);
            this.e.draw((Canvas) this.T.f29147b.f7337b);
            this.f28875r.draw((Canvas) this.T.f29146a.f7337b);
        }
        int i13 = this.H;
        if (i13 != 0) {
            this.d.setAlpha(i13);
            this.f28874n.setAlpha(this.H);
            this.f28877w.setAlpha(this.H);
            this.d.draw(canvas);
            this.f28874n.draw((Canvas) this.T.f29147b.f7337b);
            this.f28877w.draw((Canvas) this.T.f29146a.f7337b);
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
            this.f28872c.setAlpha(255);
            this.f28872c.draw(canvas);
            this.K.rewind();
            this.K.addCircle(this.L / 4.0f, this.M / 4.0f, this.I / 4.0f, direction);
            ((Canvas) this.T.f29148c.f7337b).drawColor(0, mode);
            ((Canvas) this.T.f29148c.f7337b).save();
            ((Canvas) this.T.f29148c.f7337b).clipPath(this.K);
            this.f28878x.setAlpha(255);
            this.f28878x.draw((Canvas) this.T.f29148c.f7337b);
            ((Canvas) this.T.f29148c.f7337b).restore();
            ((Canvas) this.T.d.f7337b).drawColor(0, mode);
            ((Canvas) this.T.d.f7337b).save();
            ((Canvas) this.T.d.f7337b).clipPath(this.K);
            this.f28879y.setAlpha(255);
            this.f28879y.draw((Canvas) this.T.d.f7337b);
            ((Canvas) this.T.d.f7337b).restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f28872c.setBounds(0, 0, getWidth(), getHeight());
        this.d.setBounds(0, 0, getWidth(), getHeight());
        this.f28871b.setBounds(0, 0, getWidth(), getHeight());
        this.f28870a.setBounds(0, 0, getWidth(), getHeight());
        this.f28878x.setBounds(0, 0, getWidth() / 4, getHeight() / 4);
        this.f28879y.setBounds(0, 0, getWidth() / 4, getHeight() / 4);
        int width = getWidth();
        int height = getHeight();
        q1 q1Var = this.T;
        q1Var.f29149f = width;
        q1Var.f29150g = height;
        int i14 = width / 4;
        int i15 = height / 4;
        q1Var.f29148c = new com.google.firebase.messaging.n(i14, i15);
        com.google.firebase.messaging.n nVar = new com.google.firebase.messaging.n(i14, i15);
        q1Var.d = nVar;
        ((Paint) nVar.f7336a).setAlpha(180);
    }
}
