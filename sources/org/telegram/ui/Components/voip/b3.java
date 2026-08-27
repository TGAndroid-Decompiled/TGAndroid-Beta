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
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.nb0;

public final class b3 extends FrameLayout {
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
    public final n1 P;
    public final boolean Q;
    public int R;

    public final Drawable f33498a;

    public final Drawable f33499b;

    public final nb0 f33500c;
    public final nb0 d;

    public final Drawable f33501e;

    public final Drawable f33502f;
    public final nb0 h;

    public final nb0 f33503n;

    public final Drawable f33504r;

    public final Drawable f33505s;
    public final nb0 v;

    public final nb0 f33506w;

    public final nb0 f33507x;

    public final nb0 f33508y;

    public b3(Activity activity, boolean z10, n1 n1Var) {
        super(activity);
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
        this.P = n1Var;
        boolean zIsEnabled = LiteMode.isEnabled(512);
        this.Q = zIsEnabled;
        this.f33498a = z10 ? new a3() : new nb0(-4958504, -8304404, -14637865, -12612630, false, 0, true);
        this.f33499b = z10 ? new a3() : new nb0(-12224791, -12879119, -16207709, -15226140, false, 0, true);
        this.f33500c = new nb0(-16275028, -16270749, -5649306, -10833593, false, 0, true);
        this.d = new nb0(-1545896, -1613425, -2387892, -2198984, false, 0, true);
        Drawable a3Var = z10 ? new a3() : new nb0(-5818672, -9819171, -15755831, -14124319, false, 0, true);
        this.f33501e = a3Var;
        Drawable a3Var2 = z10 ? new a3() : new nb0(-13803306, -13866273, -16738923, -16608823, false, 0, true);
        this.f33502f = a3Var2;
        nb0 nb0Var = new nb0(-16741490, -16673972, -7357129, -13525721, false, 0, true);
        this.h = nb0Var;
        nb0 nb0Var2 = new nb0(-1949911, -1691537, -3705322, -2663914, false, 0, true);
        this.f33503n = nb0Var2;
        Drawable a3Var3 = z10 ? new a3() : new nb0(-2726657, -7186179, -13778695, -11034113, false, 0, true);
        this.f33504r = a3Var3;
        Drawable a3Var4 = z10 ? new a3() : new nb0(-11170817, -10507265, -16458548, -14105857, false, 0, true);
        this.f33505s = a3Var4;
        nb0 nb0Var3 = new nb0(-16723243, -16129415, -3674272, -9578153, false, 0, true);
        this.v = nb0Var3;
        nb0 nb0Var4 = new nb0(-34714, -32091, -85931, -29103, false, 0, true);
        this.f33506w = nb0Var4;
        this.f33507x = new nb0(-16723243, -16129415, -3674272, -9578153, false, 0, true);
        this.f33508y = new nb0(-16741490, -16673972, -7357129, -13525721, false, 0, true);
        a3Var.setBounds(0, 0, 80, 80);
        a3Var2.setBounds(0, 0, 80, 80);
        nb0Var.setBounds(0, 0, 80, 80);
        nb0Var2.setBounds(0, 0, 80, 80);
        a3Var3.setBounds(0, 0, 80, 80);
        a3Var4.setBounds(0, 0, 80, 80);
        nb0Var3.setBounds(0, 0, 80, 80);
        nb0Var4.setBounds(0, 0, 80, 80);
        setWillNotDraw(false);
        setLayerType(2, null);
        AnimatorSet animatorSet = new AnimatorSet();
        this.M = animatorSet;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 360);
        valueAnimatorOfInt.addUpdateListener(new ag.t2(16, this, n1Var));
        valueAnimatorOfInt.setRepeatCount(-1);
        valueAnimatorOfInt.setRepeatMode(1);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.playTogether(valueAnimatorOfInt);
        animatorSet.setDuration(12000L);
        if (zIsEnabled) {
            animatorSet.start();
        }
        if (this.R == 1) {
            return;
        }
        this.R = 1;
        this.B = 255;
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(255, 0, 255);
        this.J = valueAnimatorOfInt2;
        valueAnimatorOfInt2.addUpdateListener(new z2(this, 3));
        this.J.setRepeatCount(-1);
        this.J.setRepeatMode(1);
        this.J.setInterpolator(new LinearInterpolator());
        this.J.setDuration(12000L);
        if (zIsEnabled) {
            this.J.start();
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
            if (animatorSet2 == null || !animatorSet2.isPaused()) {
                return;
            }
            this.L.resume();
        }
    }

    public final void b(int i10, int i11, boolean z10) {
        int i12 = this.R;
        if (i12 == 2 || i12 == 3) {
            return;
        }
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
        int i17 = i10 * i10;
        int i18 = i11 * i11;
        double dMax = Math.max(Math.max(Math.max(Math.sqrt(i14 + i16), Math.sqrt(i16 + i17)), Math.sqrt(i17 + i18)), Math.sqrt(i14 + i18));
        this.F = true;
        this.P.f33739e = true;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, (float) dMax);
        valueAnimatorOfFloat.addUpdateListener(new z2(this, 1));
        valueAnimatorOfFloat.addListener(new f11(this, 19));
        valueAnimatorOfFloat.setDuration(z10 ? 400L : 0L);
        valueAnimatorOfFloat.start();
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
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 255, 255, 255, 0);
        valueAnimatorOfInt.addUpdateListener(new z2(this, 4));
        valueAnimatorOfInt.setRepeatCount(-1);
        valueAnimatorOfInt.setRepeatMode(1);
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(0, 0, 255, 0, 0);
        valueAnimatorOfInt2.addUpdateListener(new z2(this, 5));
        valueAnimatorOfInt2.setRepeatCount(-1);
        valueAnimatorOfInt2.setRepeatMode(1);
        this.L.playTogether(valueAnimatorOfInt2, valueAnimatorOfInt);
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
        float fSqrt = ((float) Math.sqrt((height * width) + (width * width))) / Math.min(height, width);
        canvas.scale(fSqrt, fSqrt, width, height);
        canvas.rotate(this.P.h, width, height);
        Canvas canvas2 = (Canvas) this.P.f33736a.f4603b;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        canvas2.drawColor(0, mode);
        ((Canvas) this.P.f33737b.f4603b).drawColor(0, mode);
        int i10 = this.C;
        if (i10 != 0 && this.D != 255) {
            this.f33500c.setAlpha(i10);
            this.v.setAlpha(this.C);
            this.h.setAlpha(this.C);
            this.f33500c.draw(canvas);
            this.v.draw((Canvas) this.P.f33736a.f4603b);
            this.h.draw((Canvas) this.P.f33737b.f4603b);
        }
        int i11 = this.B;
        if (i11 != 0 && this.D != 255) {
            this.f33499b.setAlpha(i11);
            this.f33502f.setAlpha(this.B);
            this.f33505s.setAlpha(this.B);
            this.f33499b.draw(canvas);
            this.f33502f.draw((Canvas) this.P.f33737b.f4603b);
            this.f33505s.draw((Canvas) this.P.f33736a.f4603b);
        }
        int i12 = this.A;
        if (i12 != 0 && this.D != 255) {
            this.f33498a.setAlpha(i12);
            this.f33501e.setAlpha(this.A);
            this.f33504r.setAlpha(this.A);
            this.f33498a.draw(canvas);
            this.f33501e.draw((Canvas) this.P.f33737b.f4603b);
            this.f33504r.draw((Canvas) this.P.f33736a.f4603b);
        }
        int i13 = this.D;
        if (i13 != 0) {
            this.d.setAlpha(i13);
            this.f33503n.setAlpha(this.D);
            this.f33506w.setAlpha(this.D);
            this.d.draw(canvas);
            this.f33503n.draw((Canvas) this.P.f33737b.f4603b);
            this.f33506w.draw((Canvas) this.P.f33736a.f4603b);
        }
        canvas.restore();
        if (this.F) {
            this.G.rewind();
            Path path = this.G;
            float f10 = this.H;
            float f11 = this.I;
            float f12 = this.E;
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(f10, f11, f12, direction);
            canvas.clipPath(this.G);
            Objects.requireNonNull(this.P);
            Objects.requireNonNull(this.P);
            canvas.scale(1.12f, 1.12f, width, height);
            this.f33500c.setAlpha(255);
            this.f33500c.draw(canvas);
            this.G.rewind();
            this.G.addCircle(this.H / 4.0f, this.I / 4.0f, this.E / 4.0f, direction);
            ((Canvas) this.P.f33738c.f4603b).drawColor(0, mode);
            ((Canvas) this.P.f33738c.f4603b).save();
            ((Canvas) this.P.f33738c.f4603b).clipPath(this.G);
            this.f33507x.setAlpha(255);
            this.f33507x.draw((Canvas) this.P.f33738c.f4603b);
            ((Canvas) this.P.f33738c.f4603b).restore();
            ((Canvas) this.P.d.f4603b).drawColor(0, mode);
            ((Canvas) this.P.d.f4603b).save();
            ((Canvas) this.P.d.f4603b).clipPath(this.G);
            this.f33508y.setAlpha(255);
            this.f33508y.draw((Canvas) this.P.d.f4603b);
            ((Canvas) this.P.d.f4603b).restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f33500c.setBounds(0, 0, getWidth(), getHeight());
        this.d.setBounds(0, 0, getWidth(), getHeight());
        this.f33499b.setBounds(0, 0, getWidth(), getHeight());
        this.f33498a.setBounds(0, 0, getWidth(), getHeight());
        this.f33507x.setBounds(0, 0, getWidth() / 4, getHeight() / 4);
        this.f33508y.setBounds(0, 0, getWidth() / 4, getHeight() / 4);
        int width = getWidth();
        int height = getHeight();
        n1 n1Var = this.P;
        n1Var.f33740f = width;
        n1Var.f33741g = height;
        int i14 = width / 4;
        int i15 = height / 4;
        n1Var.f33738c = new com.google.firebase.messaging.m(i14, i15);
        com.google.firebase.messaging.m mVar = new com.google.firebase.messaging.m(i14, i15);
        n1Var.d = mVar;
        ((Paint) mVar.f4602a).setAlpha(180);
    }
}
