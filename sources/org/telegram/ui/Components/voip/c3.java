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
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.f91;
public final class c3 extends FrameLayout {
    public int B;
    public int C;
    public int D;
    public int E;
    public float F;
    public boolean G;
    public final Path H;
    public int I;
    public int J;
    public ValueAnimator K;
    public ValueAnimator L;
    public AnimatorSet M;
    public final AnimatorSet N;
    public boolean O;
    public volatile boolean P;
    public final n1 Q;
    public final boolean R;
    public int S;
    public final Drawable f29555a;
    public final Drawable f29556b;
    public final ec0 f29557c;
    public final ec0 d;
    public final Drawable e;
    public final Drawable f29558f;
    public final ec0 h;
    public final ec0 f29559n;
    public final Drawable f29560r;
    public final Drawable f29561s;
    public final ec0 v;
    public final ec0 f29562w;
    public final ec0 f29563x;
    public final ec0 f29564y;

    public c3(Activity activity, boolean z4, n1 n1Var) {
        super(activity);
        Drawable ec0Var;
        Drawable ec0Var2;
        Drawable ec0Var3;
        Drawable ec0Var4;
        Drawable ec0Var5;
        Drawable ec0Var6;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0.0f;
        this.G = false;
        this.H = new Path();
        this.I = 0;
        this.J = 0;
        this.O = false;
        this.P = false;
        this.Q = n1Var;
        boolean isEnabled = LiteMode.isEnabled(512);
        this.R = isEnabled;
        if (z4) {
            ec0Var = new b3();
        } else {
            ec0Var = new ec0(-4958504, -8304404, -14637865, -12612630, false, 0, true);
        }
        this.f29555a = ec0Var;
        if (z4) {
            ec0Var2 = new b3();
        } else {
            ec0Var2 = new ec0(-12224791, -12879119, -16207709, -15226140, false, 0, true);
        }
        this.f29556b = ec0Var2;
        this.f29557c = new ec0(-16275028, -16270749, -5649306, -10833593, false, 0, true);
        this.d = new ec0(-1545896, -1613425, -2387892, -2198984, false, 0, true);
        if (z4) {
            ec0Var3 = new b3();
        } else {
            ec0Var3 = new ec0(-5818672, -9819171, -15755831, -14124319, false, 0, true);
        }
        this.e = ec0Var3;
        if (z4) {
            ec0Var4 = new b3();
        } else {
            ec0Var4 = new ec0(-13803306, -13866273, -16738923, -16608823, false, 0, true);
        }
        this.f29558f = ec0Var4;
        ec0 ec0Var7 = new ec0(-16741490, -16673972, -7357129, -13525721, false, 0, true);
        this.h = ec0Var7;
        ec0 ec0Var8 = new ec0(-1949911, -1691537, -3705322, -2663914, false, 0, true);
        this.f29559n = ec0Var8;
        if (z4) {
            ec0Var5 = new b3();
        } else {
            ec0Var5 = new ec0(-2726657, -7186179, -13778695, -11034113, false, 0, true);
        }
        this.f29560r = ec0Var5;
        if (z4) {
            ec0Var6 = new b3();
        } else {
            ec0Var6 = new ec0(-11170817, -10507265, -16458548, -14105857, false, 0, true);
        }
        this.f29561s = ec0Var6;
        ec0 ec0Var9 = new ec0(-16723243, -16129415, -3674272, -9578153, false, 0, true);
        this.v = ec0Var9;
        ec0 ec0Var10 = new ec0(-34714, -32091, -85931, -29103, false, 0, true);
        this.f29562w = ec0Var10;
        this.f29563x = new ec0(-16723243, -16129415, -3674272, -9578153, false, 0, true);
        this.f29564y = new ec0(-16741490, -16673972, -7357129, -13525721, false, 0, true);
        ec0Var3.setBounds(0, 0, 80, 80);
        ec0Var4.setBounds(0, 0, 80, 80);
        ec0Var7.setBounds(0, 0, 80, 80);
        ec0Var8.setBounds(0, 0, 80, 80);
        ec0Var5.setBounds(0, 0, 80, 80);
        ec0Var6.setBounds(0, 0, 80, 80);
        ec0Var9.setBounds(0, 0, 80, 80);
        ec0Var10.setBounds(0, 0, 80, 80);
        setWillNotDraw(false);
        setLayerType(2, null);
        AnimatorSet animatorSet = new AnimatorSet();
        this.N = animatorSet;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 360);
        ofInt.addUpdateListener(new ag.a(18, this, n1Var));
        ofInt.setRepeatCount(-1);
        ofInt.setRepeatMode(1);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.playTogether(ofInt);
        animatorSet.setDuration(12000L);
        if (isEnabled) {
            animatorSet.start();
        }
        if (this.S != 1) {
            this.S = 1;
            this.C = 255;
            ValueAnimator ofInt2 = ValueAnimator.ofInt(255, 0, 255);
            this.K = ofInt2;
            ofInt2.addUpdateListener(new a3(this, 3));
            this.K.setRepeatCount(-1);
            this.K.setRepeatMode(1);
            this.K.setInterpolator(new LinearInterpolator());
            this.K.setDuration(12000L);
            if (isEnabled) {
                this.K.start();
            }
        }
    }

    public final void a() {
        if (this.O) {
            this.O = false;
            AnimatorSet animatorSet = this.N;
            if (animatorSet.isPaused()) {
                animatorSet.resume();
            }
            AnimatorSet animatorSet2 = this.M;
            if (animatorSet2 != null && animatorSet2.isPaused()) {
                this.M.resume();
            }
        }
    }

    public final void b(int i10, int i11, boolean z4) {
        long j10;
        int i12 = this.S;
        if (i12 != 2 && i12 != 3) {
            this.S = 2;
            ValueAnimator valueAnimator = this.K;
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
                this.K.cancel();
                this.K = null;
            }
            this.I = i10;
            this.J = i11;
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
            this.G = true;
            this.Q.e = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, (float) max);
            ofFloat.addUpdateListener(new a3(this, 1));
            ofFloat.addListener(new f91(this, 10));
            if (z4) {
                j10 = 400;
            } else {
                j10 = 0;
            }
            ofFloat.setDuration(j10);
            ofFloat.start();
        }
    }

    public final void c() {
        if (this.M != null) {
            return;
        }
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.K.cancel();
            this.K = null;
        }
        this.D = 255;
        this.M = new AnimatorSet();
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255, 255, 0);
        ofInt.addUpdateListener(new a3(this, 4));
        ofInt.setRepeatCount(-1);
        ofInt.setRepeatMode(1);
        ValueAnimator ofInt2 = ValueAnimator.ofInt(0, 0, 255, 0, 0);
        ofInt2.addUpdateListener(new a3(this, 5));
        ofInt2.setRepeatCount(-1);
        ofInt2.setRepeatMode(1);
        this.M.playTogether(ofInt2, ofInt);
        this.M.setInterpolator(new LinearInterpolator());
        this.M.setDuration(24000L);
        if (this.R) {
            this.M.start();
        } else {
            this.C = 0;
            this.B = 0;
        }
        invalidate();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.N;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.M;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.P) {
            return;
        }
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        canvas.save();
        float sqrt = ((float) Math.sqrt((height * width) + (width * width))) / Math.min(height, width);
        canvas.scale(sqrt, sqrt, width, height);
        canvas.rotate(this.Q.h, width, height);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        ((Canvas) this.Q.f29768a.f143b).drawColor(0, mode);
        ((Canvas) this.Q.f29769b.f143b).drawColor(0, mode);
        int i10 = this.D;
        if (i10 != 0 && this.E != 255) {
            this.f29557c.setAlpha(i10);
            this.v.setAlpha(this.D);
            this.h.setAlpha(this.D);
            this.f29557c.draw(canvas);
            this.v.draw((Canvas) this.Q.f29768a.f143b);
            this.h.draw((Canvas) this.Q.f29769b.f143b);
        }
        int i11 = this.C;
        if (i11 != 0 && this.E != 255) {
            this.f29556b.setAlpha(i11);
            this.f29558f.setAlpha(this.C);
            this.f29561s.setAlpha(this.C);
            this.f29556b.draw(canvas);
            this.f29558f.draw((Canvas) this.Q.f29769b.f143b);
            this.f29561s.draw((Canvas) this.Q.f29768a.f143b);
        }
        int i12 = this.B;
        if (i12 != 0 && this.E != 255) {
            this.f29555a.setAlpha(i12);
            this.e.setAlpha(this.B);
            this.f29560r.setAlpha(this.B);
            this.f29555a.draw(canvas);
            this.e.draw((Canvas) this.Q.f29769b.f143b);
            this.f29560r.draw((Canvas) this.Q.f29768a.f143b);
        }
        int i13 = this.E;
        if (i13 != 0) {
            this.d.setAlpha(i13);
            this.f29559n.setAlpha(this.E);
            this.f29562w.setAlpha(this.E);
            this.d.draw(canvas);
            this.f29559n.draw((Canvas) this.Q.f29769b.f143b);
            this.f29562w.draw((Canvas) this.Q.f29768a.f143b);
        }
        canvas.restore();
        if (this.G) {
            this.H.rewind();
            float f10 = this.F;
            Path.Direction direction = Path.Direction.CW;
            this.H.addCircle(this.I, this.J, f10, direction);
            canvas.clipPath(this.H);
            Objects.requireNonNull(this.Q);
            Objects.requireNonNull(this.Q);
            canvas.scale(1.12f, 1.12f, width, height);
            this.f29557c.setAlpha(255);
            this.f29557c.draw(canvas);
            this.H.rewind();
            this.H.addCircle(this.I / 4.0f, this.J / 4.0f, this.F / 4.0f, direction);
            ((Canvas) this.Q.f29770c.f143b).drawColor(0, mode);
            ((Canvas) this.Q.f29770c.f143b).save();
            ((Canvas) this.Q.f29770c.f143b).clipPath(this.H);
            this.f29563x.setAlpha(255);
            this.f29563x.draw((Canvas) this.Q.f29770c.f143b);
            ((Canvas) this.Q.f29770c.f143b).restore();
            ((Canvas) this.Q.d.f143b).drawColor(0, mode);
            ((Canvas) this.Q.d.f143b).save();
            ((Canvas) this.Q.d.f143b).clipPath(this.H);
            this.f29564y.setAlpha(255);
            this.f29564y.draw((Canvas) this.Q.d.f143b);
            ((Canvas) this.Q.d.f143b).restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.f29557c.setBounds(0, 0, getWidth(), getHeight());
        this.d.setBounds(0, 0, getWidth(), getHeight());
        this.f29556b.setBounds(0, 0, getWidth(), getHeight());
        this.f29555a.setBounds(0, 0, getWidth(), getHeight());
        this.f29563x.setBounds(0, 0, getWidth() / 4, getHeight() / 4);
        this.f29564y.setBounds(0, 0, getWidth() / 4, getHeight() / 4);
        int width = getWidth();
        int height = getHeight();
        n1 n1Var = this.Q;
        n1Var.f29771f = width;
        n1Var.f29772g = height;
        int i14 = width / 4;
        int i15 = height / 4;
        n1Var.f29770c = new a9.a(i14, i15);
        a9.a aVar = new a9.a(i14, i15);
        n1Var.d = aVar;
        ((Paint) aVar.f142a).setAlpha(180);
    }
}
