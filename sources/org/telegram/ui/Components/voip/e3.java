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
import org.telegram.ui.Components.p11;
import org.telegram.ui.Components.yb0;
public final class e3 extends FrameLayout {
    public int A;
    public int B;
    public int C;
    public int D;
    public float E;
    public boolean F;
    public final Path G;
    public int H;
    public int I;
    public ValueAnimator J;
    public ValueAnimator K;
    public AnimatorSet L;
    public final AnimatorSet M;
    public boolean N;
    public volatile boolean O;
    public final o1 P;
    public final boolean Q;
    public int R;
    public final Drawable f33677a;
    public final Drawable f33678b;
    public final yb0 f33679c;
    public final yb0 d;
    public final Drawable f33680e;
    public final Drawable f33681f;
    public final yb0 h;
    public final yb0 f33682n;
    public final Drawable f33683r;
    public final Drawable f33684s;
    public final yb0 v;
    public final yb0 f33685w;
    public final yb0 f33686x;
    public final yb0 f33687y;

    public e3(Activity activity, boolean z10, o1 o1Var) {
        super(activity);
        Drawable yb0Var;
        Drawable yb0Var2;
        Drawable yb0Var3;
        Drawable yb0Var4;
        Drawable yb0Var5;
        Drawable yb0Var6;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0.0f;
        this.F = false;
        this.G = new Path();
        this.H = 0;
        this.I = 0;
        this.N = false;
        this.O = false;
        this.P = o1Var;
        boolean isEnabled = LiteMode.isEnabled(512);
        this.Q = isEnabled;
        if (z10) {
            yb0Var = new d3();
        } else {
            yb0Var = new yb0(-4958504, -8304404, -14637865, -12612630, false, 0, true);
        }
        this.f33677a = yb0Var;
        if (z10) {
            yb0Var2 = new d3();
        } else {
            yb0Var2 = new yb0(-12224791, -12879119, -16207709, -15226140, false, 0, true);
        }
        this.f33678b = yb0Var2;
        this.f33679c = new yb0(-16275028, -16270749, -5649306, -10833593, false, 0, true);
        this.d = new yb0(-1545896, -1613425, -2387892, -2198984, false, 0, true);
        if (z10) {
            yb0Var3 = new d3();
        } else {
            yb0Var3 = new yb0(-5818672, -9819171, -15755831, -14124319, false, 0, true);
        }
        this.f33680e = yb0Var3;
        if (z10) {
            yb0Var4 = new d3();
        } else {
            yb0Var4 = new yb0(-13803306, -13866273, -16738923, -16608823, false, 0, true);
        }
        this.f33681f = yb0Var4;
        yb0 yb0Var7 = new yb0(-16741490, -16673972, -7357129, -13525721, false, 0, true);
        this.h = yb0Var7;
        yb0 yb0Var8 = new yb0(-1949911, -1691537, -3705322, -2663914, false, 0, true);
        this.f33682n = yb0Var8;
        if (z10) {
            yb0Var5 = new d3();
        } else {
            yb0Var5 = new yb0(-2726657, -7186179, -13778695, -11034113, false, 0, true);
        }
        this.f33683r = yb0Var5;
        if (z10) {
            yb0Var6 = new d3();
        } else {
            yb0Var6 = new yb0(-11170817, -10507265, -16458548, -14105857, false, 0, true);
        }
        this.f33684s = yb0Var6;
        yb0 yb0Var9 = new yb0(-16723243, -16129415, -3674272, -9578153, false, 0, true);
        this.v = yb0Var9;
        yb0 yb0Var10 = new yb0(-34714, -32091, -85931, -29103, false, 0, true);
        this.f33685w = yb0Var10;
        this.f33686x = new yb0(-16723243, -16129415, -3674272, -9578153, false, 0, true);
        this.f33687y = new yb0(-16741490, -16673972, -7357129, -13525721, false, 0, true);
        yb0Var3.setBounds(0, 0, 80, 80);
        yb0Var4.setBounds(0, 0, 80, 80);
        yb0Var7.setBounds(0, 0, 80, 80);
        yb0Var8.setBounds(0, 0, 80, 80);
        yb0Var5.setBounds(0, 0, 80, 80);
        yb0Var6.setBounds(0, 0, 80, 80);
        yb0Var9.setBounds(0, 0, 80, 80);
        yb0Var10.setBounds(0, 0, 80, 80);
        setWillNotDraw(false);
        setLayerType(2, null);
        AnimatorSet animatorSet = new AnimatorSet();
        this.M = animatorSet;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 360);
        ofInt.addUpdateListener(new bg.b3(17, this, o1Var));
        ofInt.setRepeatCount(-1);
        ofInt.setRepeatMode(1);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.playTogether(ofInt);
        animatorSet.setDuration(12000L);
        if (isEnabled) {
            animatorSet.start();
        }
        if (this.R != 1) {
            this.R = 1;
            this.B = 255;
            ValueAnimator ofInt2 = ValueAnimator.ofInt(255, 0, 255);
            this.J = ofInt2;
            ofInt2.addUpdateListener(new c3(this, 3));
            this.J.setRepeatCount(-1);
            this.J.setRepeatMode(1);
            this.J.setInterpolator(new LinearInterpolator());
            this.J.setDuration(12000L);
            if (isEnabled) {
                this.J.start();
            }
        }
    }

    public final void a() {
        if (this.N) {
            this.N = false;
            AnimatorSet animatorSet = this.M;
            if (animatorSet.isPaused()) {
                animatorSet.resume();
            }
            AnimatorSet animatorSet2 = this.L;
            if (animatorSet2 != null && animatorSet2.isPaused()) {
                this.L.resume();
            }
        }
    }

    public final void b(int i10, int i11, boolean z10) {
        long j10;
        int i12 = this.R;
        if (i12 != 2 && i12 != 3) {
            this.R = 2;
            ValueAnimator valueAnimator = this.J;
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
                this.J.cancel();
                this.J = null;
            }
            this.H = i10;
            this.I = i11;
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
            this.F = true;
            this.P.f33886e = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, (float) max);
            ofFloat.addUpdateListener(new c3(this, 1));
            ofFloat.addListener(new p11(this, 19));
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
        if (this.L != null) {
            return;
        }
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.J.cancel();
            this.J = null;
        }
        this.C = 255;
        this.L = new AnimatorSet();
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255, 255, 0);
        ofInt.addUpdateListener(new c3(this, 4));
        ofInt.setRepeatCount(-1);
        ofInt.setRepeatMode(1);
        ValueAnimator ofInt2 = ValueAnimator.ofInt(0, 0, 255, 0, 0);
        ofInt2.addUpdateListener(new c3(this, 5));
        ofInt2.setRepeatCount(-1);
        ofInt2.setRepeatMode(1);
        this.L.playTogether(ofInt2, ofInt);
        this.L.setInterpolator(new LinearInterpolator());
        this.L.setDuration(24000L);
        if (this.Q) {
            this.L.start();
        } else {
            this.B = 0;
            this.A = 0;
        }
        invalidate();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.M;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.L;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.O) {
            return;
        }
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        canvas.save();
        float sqrt = ((float) Math.sqrt((height * width) + (width * width))) / Math.min(height, width);
        canvas.scale(sqrt, sqrt, width, height);
        canvas.rotate(this.P.h, width, height);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        ((Canvas) this.P.f33883a.f2118a).drawColor(0, mode);
        ((Canvas) this.P.f33884b.f2118a).drawColor(0, mode);
        int i10 = this.C;
        if (i10 != 0 && this.D != 255) {
            this.f33679c.setAlpha(i10);
            this.v.setAlpha(this.C);
            this.h.setAlpha(this.C);
            this.f33679c.draw(canvas);
            this.v.draw((Canvas) this.P.f33883a.f2118a);
            this.h.draw((Canvas) this.P.f33884b.f2118a);
        }
        int i11 = this.B;
        if (i11 != 0 && this.D != 255) {
            this.f33678b.setAlpha(i11);
            this.f33681f.setAlpha(this.B);
            this.f33684s.setAlpha(this.B);
            this.f33678b.draw(canvas);
            this.f33681f.draw((Canvas) this.P.f33884b.f2118a);
            this.f33684s.draw((Canvas) this.P.f33883a.f2118a);
        }
        int i12 = this.A;
        if (i12 != 0 && this.D != 255) {
            this.f33677a.setAlpha(i12);
            this.f33680e.setAlpha(this.A);
            this.f33683r.setAlpha(this.A);
            this.f33677a.draw(canvas);
            this.f33680e.draw((Canvas) this.P.f33884b.f2118a);
            this.f33683r.draw((Canvas) this.P.f33883a.f2118a);
        }
        int i13 = this.D;
        if (i13 != 0) {
            this.d.setAlpha(i13);
            this.f33682n.setAlpha(this.D);
            this.f33685w.setAlpha(this.D);
            this.d.draw(canvas);
            this.f33682n.draw((Canvas) this.P.f33884b.f2118a);
            this.f33685w.draw((Canvas) this.P.f33883a.f2118a);
        }
        canvas.restore();
        if (this.F) {
            this.G.rewind();
            float f9 = this.E;
            Path.Direction direction = Path.Direction.CW;
            this.G.addCircle(this.H, this.I, f9, direction);
            canvas.clipPath(this.G);
            Objects.requireNonNull(this.P);
            Objects.requireNonNull(this.P);
            canvas.scale(1.12f, 1.12f, width, height);
            this.f33679c.setAlpha(255);
            this.f33679c.draw(canvas);
            this.G.rewind();
            this.G.addCircle(this.H / 4.0f, this.I / 4.0f, this.E / 4.0f, direction);
            ((Canvas) this.P.f33885c.f2118a).drawColor(0, mode);
            ((Canvas) this.P.f33885c.f2118a).save();
            ((Canvas) this.P.f33885c.f2118a).clipPath(this.G);
            this.f33686x.setAlpha(255);
            this.f33686x.draw((Canvas) this.P.f33885c.f2118a);
            ((Canvas) this.P.f33885c.f2118a).restore();
            ((Canvas) this.P.d.f2118a).drawColor(0, mode);
            ((Canvas) this.P.d.f2118a).save();
            ((Canvas) this.P.d.f2118a).clipPath(this.G);
            this.f33687y.setAlpha(255);
            this.f33687y.draw((Canvas) this.P.d.f2118a);
            ((Canvas) this.P.d.f2118a).restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f33679c.setBounds(0, 0, getWidth(), getHeight());
        this.d.setBounds(0, 0, getWidth(), getHeight());
        this.f33678b.setBounds(0, 0, getWidth(), getHeight());
        this.f33677a.setBounds(0, 0, getWidth(), getHeight());
        this.f33686x.setBounds(0, 0, getWidth() / 4, getHeight() / 4);
        this.f33687y.setBounds(0, 0, getWidth() / 4, getHeight() / 4);
        int width = getWidth();
        int height = getHeight();
        o1 o1Var = this.P;
        o1Var.f33887f = width;
        o1Var.f33888g = height;
        int i14 = width / 4;
        int i15 = height / 4;
        o1Var.f33885c = new bg.c2(i14, i15);
        bg.c2 c2Var = new bg.c2(i14, i15);
        o1Var.d = c2Var;
        ((Paint) c2Var.d).setAlpha(180);
    }
}
