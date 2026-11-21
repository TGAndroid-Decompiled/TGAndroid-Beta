package org.telegram.ui.Components.voip;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import c8.ma;
import hi.j3;
import org.telegram.messenger.pc;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.q9;
public final class p0 extends FrameLayout {
    public final o0 f41258a;
    public final q9 f41259b;
    public AnimatorSet f41260c;
    public boolean d;
    public boolean f41261e;
    public final boolean f41262f;

    public p0(Activity activity) {
        super(activity);
        o0 o0Var = new o0(org.telegram.messenger.g0.L(104.0f), org.telegram.messenger.g0.L(111.0f), org.telegram.messenger.g0.L(12.0f), 8);
        this.f41258a = o0Var;
        o0Var.b(3.0d);
        if (!o0Var.f41232e) {
            invalidate();
        }
        o0Var.f41232e = true;
        q9 q9Var = new q9(activity);
        this.f41259b = q9Var;
        addView(q9Var, ma.e(135, 135, 17));
        setWillNotDraw(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f41260c = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f));
        this.f41260c.setInterpolator(nr.f37957g);
        this.f41260c.setDuration(3000L);
        boolean e10 = pc.e(512);
        this.f41262f = e10;
        if (e10) {
            this.f41260c.start();
        }
        setClipChildren(false);
    }

    public final void a() {
        if (this.d) {
            return;
        }
        AnimatorSet animatorSet = this.f41260c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.d = true;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f41260c = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, getScaleX(), 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, getScaleY(), 1.05f, 1.0f));
        this.f41260c.setInterpolator(nr.f37957g);
        this.f41260c.setDuration(400L);
        this.f41260c.start();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f41261e != z10) {
            this.f41261e = z10;
            o0 o0Var = this.f41258a;
            if (z10) {
                o0Var.b(3.0d);
            }
            if (o0Var.h != z10) {
                o0Var.h = z10;
                ValueAnimator valueAnimator = o0Var.f41236j;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    o0Var.f41236j.cancel();
                }
                if (z10) {
                    o0Var.f41236j = ValueAnimator.ofFloat(o0Var.f41235i, 0.0f);
                    o0Var.f41237k = (int) (2000.0f / org.telegram.messenger.g0.f24149t);
                } else {
                    o0Var.f41237k = 0;
                    o0Var.f41236j = ValueAnimator.ofFloat(o0Var.f41235i, 1.0f);
                }
                o0Var.f41236j.addUpdateListener(new j3(o0Var, 17));
                if (z11) {
                    o0Var.f41236j.setDuration(150L);
                } else {
                    o0Var.f41236j.setDuration(1000L);
                }
                o0Var.f41236j.start();
                invalidate();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f41262f) {
            o0 o0Var = this.f41258a;
            o0Var.c();
            o0Var.a(canvas, getWidth() / 2, getHeight() / 2, this);
        }
        super.onDraw(canvas);
    }

    public void setAmplitude(double d) {
        if (this.f41261e) {
            return;
        }
        int i7 = (d > 1.5d ? 1 : (d == 1.5d ? 0 : -1));
        o0 o0Var = this.f41258a;
        if (i7 > 0) {
            o0Var.b(d);
        } else {
            o0Var.b(0.0d);
        }
    }

    public void setRoundRadius(int i7) {
        this.f41259b.setRoundRadius(i7);
    }

    public void setShowWaves(boolean z10) {
        o0 o0Var = this.f41258a;
        if (o0Var.f41232e != z10) {
            invalidate();
        }
        o0Var.f41232e = z10;
    }
}
