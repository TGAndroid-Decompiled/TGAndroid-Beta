package org.telegram.ui.Components.voip;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import fi.v3;
import org.telegram.messenger.sc;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.xq;
public final class p0 extends FrameLayout {
    public final o0 f39455a;
    public final l9 f39456b;
    public AnimatorSet f39457c;
    public boolean d;
    public boolean f39458e;
    public final boolean f39459f;

    public p0(Activity activity) {
        super(activity);
        o0 o0Var = new o0(org.telegram.messenger.g0.L(104.0f), org.telegram.messenger.g0.L(111.0f), org.telegram.messenger.g0.L(12.0f), 8);
        this.f39455a = o0Var;
        o0Var.b(3.0d);
        if (!o0Var.f39432e) {
            invalidate();
        }
        o0Var.f39432e = true;
        l9 l9Var = new l9(activity);
        this.f39456b = l9Var;
        addView(l9Var, ha.e(135, 135, 17));
        setWillNotDraw(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f39457c = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f));
        this.f39457c.setInterpolator(xq.f40367g);
        this.f39457c.setDuration(3000L);
        boolean e10 = sc.e(512);
        this.f39459f = e10;
        if (e10) {
            this.f39457c.start();
        }
        setClipChildren(false);
    }

    public final void a() {
        if (this.d) {
            return;
        }
        AnimatorSet animatorSet = this.f39457c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.d = true;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f39457c = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, getScaleX(), 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, getScaleY(), 1.05f, 1.0f));
        this.f39457c.setInterpolator(xq.f40367g);
        this.f39457c.setDuration(400L);
        this.f39457c.start();
    }

    public final void b(boolean z9, boolean z10) {
        if (this.f39458e != z9) {
            this.f39458e = z9;
            o0 o0Var = this.f39455a;
            if (z9) {
                o0Var.b(3.0d);
            }
            if (o0Var.h != z9) {
                o0Var.h = z9;
                ValueAnimator valueAnimator = o0Var.f39436j;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    o0Var.f39436j.cancel();
                }
                if (z9) {
                    o0Var.f39436j = ValueAnimator.ofFloat(o0Var.f39435i, 0.0f);
                    o0Var.f39437k = (int) (2000.0f / org.telegram.messenger.g0.f22566t);
                } else {
                    o0Var.f39437k = 0;
                    o0Var.f39436j = ValueAnimator.ofFloat(o0Var.f39435i, 1.0f);
                }
                o0Var.f39436j.addUpdateListener(new v3(o0Var, 17));
                if (z10) {
                    o0Var.f39436j.setDuration(150L);
                } else {
                    o0Var.f39436j.setDuration(1000L);
                }
                o0Var.f39436j.start();
                invalidate();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f39459f) {
            o0 o0Var = this.f39455a;
            o0Var.c();
            o0Var.a(canvas, getWidth() / 2, getHeight() / 2, this);
        }
        super.onDraw(canvas);
    }

    public void setAmplitude(double d) {
        if (this.f39458e) {
            return;
        }
        int i7 = (d > 1.5d ? 1 : (d == 1.5d ? 0 : -1));
        o0 o0Var = this.f39455a;
        if (i7 > 0) {
            o0Var.b(d);
        } else {
            o0Var.b(0.0d);
        }
    }

    public void setRoundRadius(int i7) {
        this.f39456b.setRoundRadius(i7);
    }

    public void setShowWaves(boolean z9) {
        o0 o0Var = this.f39455a;
        if (o0Var.f39432e != z9) {
            invalidate();
        }
        o0Var.f39432e = z9;
    }
}
