package org.telegram.ui.Components.voip;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import c8.na;
import hi.j3;
import org.telegram.messenger.qc;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.q9;
public final class p0 extends FrameLayout {
    public final o0 f41221a;
    public final q9 f41222b;
    public AnimatorSet f41223c;
    public boolean d;
    public boolean f41224e;
    public final boolean f41225f;

    public p0(Activity activity) {
        super(activity);
        o0 o0Var = new o0(org.telegram.messenger.g0.L(104.0f), org.telegram.messenger.g0.L(111.0f), org.telegram.messenger.g0.L(12.0f), 8);
        this.f41221a = o0Var;
        o0Var.b(3.0d);
        if (!o0Var.f41195e) {
            invalidate();
        }
        o0Var.f41195e = true;
        q9 q9Var = new q9(activity);
        this.f41222b = q9Var;
        addView(q9Var, na.e(135, 135, 17));
        setWillNotDraw(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f41223c = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f));
        this.f41223c.setInterpolator(nr.f37918g);
        this.f41223c.setDuration(3000L);
        boolean e10 = qc.e(512);
        this.f41225f = e10;
        if (e10) {
            this.f41223c.start();
        }
        setClipChildren(false);
    }

    public final void a() {
        if (this.d) {
            return;
        }
        AnimatorSet animatorSet = this.f41223c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.d = true;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f41223c = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, getScaleX(), 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, getScaleY(), 1.05f, 1.0f));
        this.f41223c.setInterpolator(nr.f37918g);
        this.f41223c.setDuration(400L);
        this.f41223c.start();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f41224e != z10) {
            this.f41224e = z10;
            o0 o0Var = this.f41221a;
            if (z10) {
                o0Var.b(3.0d);
            }
            if (o0Var.h != z10) {
                o0Var.h = z10;
                ValueAnimator valueAnimator = o0Var.f41199j;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    o0Var.f41199j.cancel();
                }
                if (z10) {
                    o0Var.f41199j = ValueAnimator.ofFloat(o0Var.f41198i, 0.0f);
                    o0Var.f41200k = (int) (2000.0f / org.telegram.messenger.g0.f24013t);
                } else {
                    o0Var.f41200k = 0;
                    o0Var.f41199j = ValueAnimator.ofFloat(o0Var.f41198i, 1.0f);
                }
                o0Var.f41199j.addUpdateListener(new j3(o0Var, 17));
                if (z11) {
                    o0Var.f41199j.setDuration(150L);
                } else {
                    o0Var.f41199j.setDuration(1000L);
                }
                o0Var.f41199j.start();
                invalidate();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f41225f) {
            o0 o0Var = this.f41221a;
            o0Var.c();
            o0Var.a(canvas, getWidth() / 2, getHeight() / 2, this);
        }
        super.onDraw(canvas);
    }

    public void setAmplitude(double d) {
        if (this.f41224e) {
            return;
        }
        int i7 = (d > 1.5d ? 1 : (d == 1.5d ? 0 : -1));
        o0 o0Var = this.f41221a;
        if (i7 > 0) {
            o0Var.b(d);
        } else {
            o0Var.b(0.0d);
        }
    }

    public void setRoundRadius(int i7) {
        this.f41222b.setRoundRadius(i7);
    }

    public void setShowWaves(boolean z10) {
        o0 o0Var = this.f41221a;
        if (o0Var.f41195e != z10) {
            invalidate();
        }
        o0Var.f41195e = z10;
    }
}
