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
import org.telegram.ui.Components.h31;
import org.telegram.ui.Components.uc0;
public final class d3 extends FrameLayout {
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
    public final r1 T;
    public final boolean U;
    public int V;
    public final Drawable f33763a;
    public final Drawable f33764b;
    public final uc0 f33765c;
    public final uc0 d;
    public final Drawable e;
    public final Drawable f33766f;
    public final uc0 h;
    public final uc0 f33767n;
    public final Drawable f33768r;
    public final Drawable f33769s;
    public final uc0 v;
    public final uc0 f33770w;
    public final uc0 f33771x;
    public final uc0 f33772y;

    public d3(Activity activity, boolean z10, r1 r1Var) {
        super(activity);
        Drawable uc0Var;
        Drawable uc0Var2;
        Drawable uc0Var3;
        Drawable uc0Var4;
        Drawable uc0Var5;
        Drawable uc0Var6;
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
        this.T = r1Var;
        boolean isEnabled = LiteMode.isEnabled(512);
        this.U = isEnabled;
        if (z10) {
            uc0Var = new c3();
        } else {
            uc0Var = new uc0(-4958504, -8304404, -14637865, -12612630, false, 0, true);
        }
        this.f33763a = uc0Var;
        if (z10) {
            uc0Var2 = new c3();
        } else {
            uc0Var2 = new uc0(-12224791, -12879119, -16207709, -15226140, false, 0, true);
        }
        this.f33764b = uc0Var2;
        this.f33765c = new uc0(-16275028, -16270749, -5649306, -10833593, false, 0, true);
        this.d = new uc0(-1545896, -1613425, -2387892, -2198984, false, 0, true);
        if (z10) {
            uc0Var3 = new c3();
        } else {
            uc0Var3 = new uc0(-5818672, -9819171, -15755831, -14124319, false, 0, true);
        }
        this.e = uc0Var3;
        if (z10) {
            uc0Var4 = new c3();
        } else {
            uc0Var4 = new uc0(-13803306, -13866273, -16738923, -16608823, false, 0, true);
        }
        this.f33766f = uc0Var4;
        uc0 uc0Var7 = new uc0(-16741490, -16673972, -7357129, -13525721, false, 0, true);
        this.h = uc0Var7;
        uc0 uc0Var8 = new uc0(-1949911, -1691537, -3705322, -2663914, false, 0, true);
        this.f33767n = uc0Var8;
        if (z10) {
            uc0Var5 = new c3();
        } else {
            uc0Var5 = new uc0(-2726657, -7186179, -13778695, -11034113, false, 0, true);
        }
        this.f33768r = uc0Var5;
        if (z10) {
            uc0Var6 = new c3();
        } else {
            uc0Var6 = new uc0(-11170817, -10507265, -16458548, -14105857, false, 0, true);
        }
        this.f33769s = uc0Var6;
        uc0 uc0Var9 = new uc0(-16723243, -16129415, -3674272, -9578153, false, 0, true);
        this.v = uc0Var9;
        uc0 uc0Var10 = new uc0(-34714, -32091, -85931, -29103, false, 0, true);
        this.f33770w = uc0Var10;
        this.f33771x = new uc0(-16723243, -16129415, -3674272, -9578153, false, 0, true);
        this.f33772y = new uc0(-16741490, -16673972, -7357129, -13525721, false, 0, true);
        uc0Var3.setBounds(0, 0, 80, 80);
        uc0Var4.setBounds(0, 0, 80, 80);
        uc0Var7.setBounds(0, 0, 80, 80);
        uc0Var8.setBounds(0, 0, 80, 80);
        uc0Var5.setBounds(0, 0, 80, 80);
        uc0Var6.setBounds(0, 0, 80, 80);
        uc0Var9.setBounds(0, 0, 80, 80);
        uc0Var10.setBounds(0, 0, 80, 80);
        setWillNotDraw(false);
        setLayerType(2, null);
        AnimatorSet animatorSet = new AnimatorSet();
        this.Q = animatorSet;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 360);
        ofInt.addUpdateListener(new bh.b0(20, this, r1Var));
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
            ofInt2.addUpdateListener(new b3(this, 3));
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
            ofFloat.addUpdateListener(new b3(this, 1));
            ofFloat.addListener(new h31(this, 19));
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
        ofInt.addUpdateListener(new b3(this, 4));
        ofInt.setRepeatCount(-1);
        ofInt.setRepeatMode(1);
        ValueAnimator ofInt2 = ValueAnimator.ofInt(0, 0, 255, 0, 0);
        ofInt2.addUpdateListener(new b3(this, 5));
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
        ((Canvas) this.T.f34043a.f1151b).drawColor(0, mode);
        ((Canvas) this.T.f34044b.f1151b).drawColor(0, mode);
        int i10 = this.G;
        if (i10 != 0 && this.H != 255) {
            this.f33765c.setAlpha(i10);
            this.v.setAlpha(this.G);
            this.h.setAlpha(this.G);
            this.f33765c.draw(canvas);
            this.v.draw((Canvas) this.T.f34043a.f1151b);
            this.h.draw((Canvas) this.T.f34044b.f1151b);
        }
        int i11 = this.F;
        if (i11 != 0 && this.H != 255) {
            this.f33764b.setAlpha(i11);
            this.f33766f.setAlpha(this.F);
            this.f33769s.setAlpha(this.F);
            this.f33764b.draw(canvas);
            this.f33766f.draw((Canvas) this.T.f34044b.f1151b);
            this.f33769s.draw((Canvas) this.T.f34043a.f1151b);
        }
        int i12 = this.E;
        if (i12 != 0 && this.H != 255) {
            this.f33763a.setAlpha(i12);
            this.e.setAlpha(this.E);
            this.f33768r.setAlpha(this.E);
            this.f33763a.draw(canvas);
            this.e.draw((Canvas) this.T.f34044b.f1151b);
            this.f33768r.draw((Canvas) this.T.f34043a.f1151b);
        }
        int i13 = this.H;
        if (i13 != 0) {
            this.d.setAlpha(i13);
            this.f33767n.setAlpha(this.H);
            this.f33770w.setAlpha(this.H);
            this.d.draw(canvas);
            this.f33767n.draw((Canvas) this.T.f34044b.f1151b);
            this.f33770w.draw((Canvas) this.T.f34043a.f1151b);
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
            this.f33765c.setAlpha(255);
            this.f33765c.draw(canvas);
            this.K.rewind();
            this.K.addCircle(this.L / 4.0f, this.M / 4.0f, this.I / 4.0f, direction);
            ((Canvas) this.T.f34045c.f1151b).drawColor(0, mode);
            ((Canvas) this.T.f34045c.f1151b).save();
            ((Canvas) this.T.f34045c.f1151b).clipPath(this.K);
            this.f33771x.setAlpha(255);
            this.f33771x.draw((Canvas) this.T.f34045c.f1151b);
            ((Canvas) this.T.f34045c.f1151b).restore();
            ((Canvas) this.T.d.f1151b).drawColor(0, mode);
            ((Canvas) this.T.d.f1151b).save();
            ((Canvas) this.T.d.f1151b).clipPath(this.K);
            this.f33772y.setAlpha(255);
            this.f33772y.draw((Canvas) this.T.d.f1151b);
            ((Canvas) this.T.d.f1151b).restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f33765c.setBounds(0, 0, getWidth(), getHeight());
        this.d.setBounds(0, 0, getWidth(), getHeight());
        this.f33764b.setBounds(0, 0, getWidth(), getHeight());
        this.f33763a.setBounds(0, 0, getWidth(), getHeight());
        this.f33771x.setBounds(0, 0, getWidth() / 4, getHeight() / 4);
        this.f33772y.setBounds(0, 0, getWidth() / 4, getHeight() / 4);
        int width = getWidth();
        int height = getHeight();
        r1 r1Var = this.T;
        r1Var.f34046f = width;
        r1Var.f34047g = height;
        int i14 = width / 4;
        int i15 = height / 4;
        r1Var.f34045c = new aa.m0(i14, i15);
        aa.m0 m0Var = new aa.m0(i14, i15);
        r1Var.d = m0Var;
        ((Paint) m0Var.f1150a).setAlpha(180);
    }
}
