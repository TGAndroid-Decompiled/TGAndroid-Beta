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
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.fc0;
public final class d3 extends FrameLayout {
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
    public final o1 Q;
    public final boolean R;
    public int S;
    public final Drawable f32000a;
    public final Drawable f32001b;
    public final fc0 f32002c;
    public final fc0 d;
    public final Drawable f32003e;
    public final Drawable f32004f;
    public final fc0 h;
    public final fc0 f32005n;
    public final Drawable f32006r;
    public final Drawable f32007s;
    public final fc0 v;
    public final fc0 f32008w;
    public final fc0 f32009x;
    public final fc0 f32010y;

    public d3(Activity activity, boolean z4, o1 o1Var) {
        super(activity);
        Drawable fc0Var;
        Drawable fc0Var2;
        Drawable fc0Var3;
        Drawable fc0Var4;
        Drawable fc0Var5;
        Drawable fc0Var6;
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
        this.Q = o1Var;
        boolean isEnabled = LiteMode.isEnabled(512);
        this.R = isEnabled;
        if (z4) {
            fc0Var = new c3();
        } else {
            fc0Var = new fc0(-4958504, -8304404, -14637865, -12612630, false, 0, true);
        }
        this.f32000a = fc0Var;
        if (z4) {
            fc0Var2 = new c3();
        } else {
            fc0Var2 = new fc0(-12224791, -12879119, -16207709, -15226140, false, 0, true);
        }
        this.f32001b = fc0Var2;
        this.f32002c = new fc0(-16275028, -16270749, -5649306, -10833593, false, 0, true);
        this.d = new fc0(-1545896, -1613425, -2387892, -2198984, false, 0, true);
        if (z4) {
            fc0Var3 = new c3();
        } else {
            fc0Var3 = new fc0(-5818672, -9819171, -15755831, -14124319, false, 0, true);
        }
        this.f32003e = fc0Var3;
        if (z4) {
            fc0Var4 = new c3();
        } else {
            fc0Var4 = new fc0(-13803306, -13866273, -16738923, -16608823, false, 0, true);
        }
        this.f32004f = fc0Var4;
        fc0 fc0Var7 = new fc0(-16741490, -16673972, -7357129, -13525721, false, 0, true);
        this.h = fc0Var7;
        fc0 fc0Var8 = new fc0(-1949911, -1691537, -3705322, -2663914, false, 0, true);
        this.f32005n = fc0Var8;
        if (z4) {
            fc0Var5 = new c3();
        } else {
            fc0Var5 = new fc0(-2726657, -7186179, -13778695, -11034113, false, 0, true);
        }
        this.f32006r = fc0Var5;
        if (z4) {
            fc0Var6 = new c3();
        } else {
            fc0Var6 = new fc0(-11170817, -10507265, -16458548, -14105857, false, 0, true);
        }
        this.f32007s = fc0Var6;
        fc0 fc0Var9 = new fc0(-16723243, -16129415, -3674272, -9578153, false, 0, true);
        this.v = fc0Var9;
        fc0 fc0Var10 = new fc0(-34714, -32091, -85931, -29103, false, 0, true);
        this.f32008w = fc0Var10;
        this.f32009x = new fc0(-16723243, -16129415, -3674272, -9578153, false, 0, true);
        this.f32010y = new fc0(-16741490, -16673972, -7357129, -13525721, false, 0, true);
        fc0Var3.setBounds(0, 0, 80, 80);
        fc0Var4.setBounds(0, 0, 80, 80);
        fc0Var7.setBounds(0, 0, 80, 80);
        fc0Var8.setBounds(0, 0, 80, 80);
        fc0Var5.setBounds(0, 0, 80, 80);
        fc0Var6.setBounds(0, 0, 80, 80);
        fc0Var9.setBounds(0, 0, 80, 80);
        fc0Var10.setBounds(0, 0, 80, 80);
        setWillNotDraw(false);
        setLayerType(2, null);
        AnimatorSet animatorSet = new AnimatorSet();
        this.N = animatorSet;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 360);
        ofInt.addUpdateListener(new bg.a(18, this, o1Var));
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
            ofInt2.addUpdateListener(new b3(this, 3));
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
            this.Q.f32235e = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, (float) max);
            ofFloat.addUpdateListener(new b3(this, 1));
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
        ofInt.addUpdateListener(new b3(this, 4));
        ofInt.setRepeatCount(-1);
        ofInt.setRepeatMode(1);
        ValueAnimator ofInt2 = ValueAnimator.ofInt(0, 0, 255, 0, 0);
        ofInt2.addUpdateListener(new b3(this, 5));
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
        ((Canvas) this.Q.f32232a.f156b).drawColor(0, mode);
        ((Canvas) this.Q.f32233b.f156b).drawColor(0, mode);
        int i10 = this.D;
        if (i10 != 0 && this.E != 255) {
            this.f32002c.setAlpha(i10);
            this.v.setAlpha(this.D);
            this.h.setAlpha(this.D);
            this.f32002c.draw(canvas);
            this.v.draw((Canvas) this.Q.f32232a.f156b);
            this.h.draw((Canvas) this.Q.f32233b.f156b);
        }
        int i11 = this.C;
        if (i11 != 0 && this.E != 255) {
            this.f32001b.setAlpha(i11);
            this.f32004f.setAlpha(this.C);
            this.f32007s.setAlpha(this.C);
            this.f32001b.draw(canvas);
            this.f32004f.draw((Canvas) this.Q.f32233b.f156b);
            this.f32007s.draw((Canvas) this.Q.f32232a.f156b);
        }
        int i12 = this.B;
        if (i12 != 0 && this.E != 255) {
            this.f32000a.setAlpha(i12);
            this.f32003e.setAlpha(this.B);
            this.f32006r.setAlpha(this.B);
            this.f32000a.draw(canvas);
            this.f32003e.draw((Canvas) this.Q.f32233b.f156b);
            this.f32006r.draw((Canvas) this.Q.f32232a.f156b);
        }
        int i13 = this.E;
        if (i13 != 0) {
            this.d.setAlpha(i13);
            this.f32005n.setAlpha(this.E);
            this.f32008w.setAlpha(this.E);
            this.d.draw(canvas);
            this.f32005n.draw((Canvas) this.Q.f32233b.f156b);
            this.f32008w.draw((Canvas) this.Q.f32232a.f156b);
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
            this.f32002c.setAlpha(255);
            this.f32002c.draw(canvas);
            this.H.rewind();
            this.H.addCircle(this.I / 4.0f, this.J / 4.0f, this.F / 4.0f, direction);
            ((Canvas) this.Q.f32234c.f156b).drawColor(0, mode);
            ((Canvas) this.Q.f32234c.f156b).save();
            ((Canvas) this.Q.f32234c.f156b).clipPath(this.H);
            this.f32009x.setAlpha(255);
            this.f32009x.draw((Canvas) this.Q.f32234c.f156b);
            ((Canvas) this.Q.f32234c.f156b).restore();
            ((Canvas) this.Q.d.f156b).drawColor(0, mode);
            ((Canvas) this.Q.d.f156b).save();
            ((Canvas) this.Q.d.f156b).clipPath(this.H);
            this.f32010y.setAlpha(255);
            this.f32010y.draw((Canvas) this.Q.d.f156b);
            ((Canvas) this.Q.d.f156b).restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.f32002c.setBounds(0, 0, getWidth(), getHeight());
        this.d.setBounds(0, 0, getWidth(), getHeight());
        this.f32001b.setBounds(0, 0, getWidth(), getHeight());
        this.f32000a.setBounds(0, 0, getWidth(), getHeight());
        this.f32009x.setBounds(0, 0, getWidth() / 4, getHeight() / 4);
        this.f32010y.setBounds(0, 0, getWidth() / 4, getHeight() / 4);
        int width = getWidth();
        int height = getHeight();
        o1 o1Var = this.Q;
        o1Var.f32236f = width;
        o1Var.f32237g = height;
        int i14 = width / 4;
        int i15 = height / 4;
        o1Var.f32234c = new a9.a(i14, i15);
        a9.a aVar = new a9.a(i14, i15);
        o1Var.d = aVar;
        ((Paint) aVar.f155a).setAlpha(180);
    }
}
