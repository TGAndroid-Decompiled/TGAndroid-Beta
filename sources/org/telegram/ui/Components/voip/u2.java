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
import bi.de;
import j$.util.Objects;
import org.telegram.messenger.sc;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.va;
public final class u2 extends FrameLayout {
    public final qa0 D;
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
    public final i1 T;
    public final boolean U;
    public int V;
    public final Drawable f39566a;
    public final Drawable f39567b;
    public final qa0 f39568c;
    public final qa0 d;
    public final Drawable f39569e;
    public final Drawable f39570f;
    public final qa0 h;
    public final qa0 f39571n;
    public final Drawable f39572r;
    public final Drawable f39573s;
    public final qa0 f39574w;
    public final qa0 f39575x;
    public final qa0 f39576y;

    public u2(Activity activity, boolean z9, i1 i1Var) {
        super(activity);
        Drawable qa0Var;
        Drawable qa0Var2;
        Drawable qa0Var3;
        Drawable qa0Var4;
        Drawable qa0Var5;
        Drawable qa0Var6;
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
        this.T = i1Var;
        boolean e10 = sc.e(512);
        this.U = e10;
        if (z9) {
            qa0Var = new t2();
        } else {
            qa0Var = new qa0(-4958504, -8304404, -14637865, -12612630, false, 0, true);
        }
        this.f39566a = qa0Var;
        if (z9) {
            qa0Var2 = new t2();
        } else {
            qa0Var2 = new qa0(-12224791, -12879119, -16207709, -15226140, false, 0, true);
        }
        this.f39567b = qa0Var2;
        this.f39568c = new qa0(-16275028, -16270749, -5649306, -10833593, false, 0, true);
        this.d = new qa0(-1545896, -1613425, -2387892, -2198984, false, 0, true);
        if (z9) {
            qa0Var3 = new t2();
        } else {
            qa0Var3 = new qa0(-5818672, -9819171, -15755831, -14124319, false, 0, true);
        }
        this.f39569e = qa0Var3;
        if (z9) {
            qa0Var4 = new t2();
        } else {
            qa0Var4 = new qa0(-13803306, -13866273, -16738923, -16608823, false, 0, true);
        }
        this.f39570f = qa0Var4;
        qa0 qa0Var7 = new qa0(-16741490, -16673972, -7357129, -13525721, false, 0, true);
        this.h = qa0Var7;
        qa0 qa0Var8 = new qa0(-1949911, -1691537, -3705322, -2663914, false, 0, true);
        this.f39571n = qa0Var8;
        if (z9) {
            qa0Var5 = new t2();
        } else {
            qa0Var5 = new qa0(-2726657, -7186179, -13778695, -11034113, false, 0, true);
        }
        this.f39572r = qa0Var5;
        if (z9) {
            qa0Var6 = new t2();
        } else {
            qa0Var6 = new qa0(-11170817, -10507265, -16458548, -14105857, false, 0, true);
        }
        this.f39573s = qa0Var6;
        qa0 qa0Var9 = new qa0(-16723243, -16129415, -3674272, -9578153, false, 0, true);
        this.f39574w = qa0Var9;
        qa0 qa0Var10 = new qa0(-34714, -32091, -85931, -29103, false, 0, true);
        this.f39575x = qa0Var10;
        this.f39576y = new qa0(-16723243, -16129415, -3674272, -9578153, false, 0, true);
        this.D = new qa0(-16741490, -16673972, -7357129, -13525721, false, 0, true);
        qa0Var3.setBounds(0, 0, 80, 80);
        qa0Var4.setBounds(0, 0, 80, 80);
        qa0Var7.setBounds(0, 0, 80, 80);
        qa0Var8.setBounds(0, 0, 80, 80);
        qa0Var5.setBounds(0, 0, 80, 80);
        qa0Var6.setBounds(0, 0, 80, 80);
        qa0Var9.setBounds(0, 0, 80, 80);
        qa0Var10.setBounds(0, 0, 80, 80);
        setWillNotDraw(false);
        setLayerType(2, null);
        AnimatorSet animatorSet = new AnimatorSet();
        this.Q = animatorSet;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 360);
        ofInt.addUpdateListener(new de(20, this, i1Var));
        ofInt.setRepeatCount(-1);
        ofInt.setRepeatMode(1);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.playTogether(ofInt);
        animatorSet.setDuration(12000L);
        if (e10) {
            animatorSet.start();
        }
        if (this.V != 1) {
            this.V = 1;
            this.F = 255;
            ValueAnimator ofInt2 = ValueAnimator.ofInt(255, 0, 255);
            this.N = ofInt2;
            ofInt2.addUpdateListener(new s2(this, 3));
            this.N.setRepeatCount(-1);
            this.N.setRepeatMode(1);
            this.N.setInterpolator(new LinearInterpolator());
            this.N.setDuration(12000L);
            if (e10) {
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

    public final void b(int i7, int i10, boolean z9) {
        long j3;
        int i11 = this.V;
        if (i11 != 2 && i11 != 3) {
            this.V = 2;
            ValueAnimator valueAnimator = this.N;
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
                this.N.cancel();
                this.N = null;
            }
            this.L = i7;
            this.M = i10;
            Point point = org.telegram.messenger.g0.f22563q;
            int i12 = point.x - i7;
            int i13 = i12 * i12;
            int i14 = ((point.y + org.telegram.messenger.g0.f22557m) + org.telegram.messenger.g0.f22558n) - i10;
            int i15 = i14 * i14;
            double sqrt = Math.sqrt(i13 + i15);
            int i16 = i7 * i7;
            double sqrt2 = Math.sqrt(i15 + i16);
            int i17 = i10 * i10;
            double max = Math.max(Math.max(Math.max(sqrt, sqrt2), Math.sqrt(i16 + i17)), Math.sqrt(i13 + i17));
            this.J = true;
            this.T.f39258e = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, (float) max);
            ofFloat.addUpdateListener(new s2(this, 1));
            ofFloat.addListener(new va(this, 19));
            if (z9) {
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
        ofInt.addUpdateListener(new s2(this, 4));
        ofInt.setRepeatCount(-1);
        ofInt.setRepeatMode(1);
        ValueAnimator ofInt2 = ValueAnimator.ofInt(0, 0, 255, 0, 0);
        ofInt2.addUpdateListener(new s2(this, 5));
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
        ((Canvas) this.T.f39255a.f336b).drawColor(0, mode);
        ((Canvas) this.T.f39256b.f336b).drawColor(0, mode);
        int i7 = this.G;
        if (i7 != 0 && this.H != 255) {
            this.f39568c.setAlpha(i7);
            this.f39574w.setAlpha(this.G);
            this.h.setAlpha(this.G);
            this.f39568c.draw(canvas);
            this.f39574w.draw((Canvas) this.T.f39255a.f336b);
            this.h.draw((Canvas) this.T.f39256b.f336b);
        }
        int i10 = this.F;
        if (i10 != 0 && this.H != 255) {
            this.f39567b.setAlpha(i10);
            this.f39570f.setAlpha(this.F);
            this.f39573s.setAlpha(this.F);
            this.f39567b.draw(canvas);
            this.f39570f.draw((Canvas) this.T.f39256b.f336b);
            this.f39573s.draw((Canvas) this.T.f39255a.f336b);
        }
        int i11 = this.E;
        if (i11 != 0 && this.H != 255) {
            this.f39566a.setAlpha(i11);
            this.f39569e.setAlpha(this.E);
            this.f39572r.setAlpha(this.E);
            this.f39566a.draw(canvas);
            this.f39569e.draw((Canvas) this.T.f39256b.f336b);
            this.f39572r.draw((Canvas) this.T.f39255a.f336b);
        }
        int i12 = this.H;
        if (i12 != 0) {
            this.d.setAlpha(i12);
            this.f39571n.setAlpha(this.H);
            this.f39575x.setAlpha(this.H);
            this.d.draw(canvas);
            this.f39571n.draw((Canvas) this.T.f39256b.f336b);
            this.f39575x.draw((Canvas) this.T.f39255a.f336b);
        }
        canvas.restore();
        if (this.J) {
            this.K.rewind();
            float f10 = this.I;
            Path.Direction direction = Path.Direction.CW;
            this.K.addCircle(this.L, this.M, f10, direction);
            canvas.clipPath(this.K);
            Objects.requireNonNull(this.T);
            Objects.requireNonNull(this.T);
            canvas.scale(1.12f, 1.12f, width, height);
            this.f39568c.setAlpha(255);
            this.f39568c.draw(canvas);
            this.K.rewind();
            this.K.addCircle(this.L / 4.0f, this.M / 4.0f, this.I / 4.0f, direction);
            ((Canvas) this.T.f39257c.f336b).drawColor(0, mode);
            ((Canvas) this.T.f39257c.f336b).save();
            ((Canvas) this.T.f39257c.f336b).clipPath(this.K);
            this.f39576y.setAlpha(255);
            this.f39576y.draw((Canvas) this.T.f39257c.f336b);
            ((Canvas) this.T.f39257c.f336b).restore();
            ((Canvas) this.T.d.f336b).drawColor(0, mode);
            ((Canvas) this.T.d.f336b).save();
            ((Canvas) this.T.d.f336b).clipPath(this.K);
            this.D.setAlpha(255);
            this.D.draw((Canvas) this.T.d.f336b);
            ((Canvas) this.T.d.f336b).restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.f39568c.setBounds(0, 0, getWidth(), getHeight());
        this.d.setBounds(0, 0, getWidth(), getHeight());
        this.f39567b.setBounds(0, 0, getWidth(), getHeight());
        this.f39566a.setBounds(0, 0, getWidth(), getHeight());
        this.f39576y.setBounds(0, 0, getWidth() / 4, getHeight() / 4);
        this.D.setBounds(0, 0, getWidth() / 4, getHeight() / 4);
        int width = getWidth();
        int height = getHeight();
        i1 i1Var = this.T;
        i1Var.f39259f = width;
        i1Var.f39260g = height;
        int i13 = width / 4;
        int i14 = height / 4;
        i1Var.f39257c = new b8(i13, i14);
        b8 b8Var = new b8(i13, i14);
        i1Var.d = b8Var;
        ((Paint) b8Var.f335a).setAlpha(180);
    }
}
