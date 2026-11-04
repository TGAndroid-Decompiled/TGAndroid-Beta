package org.telegram.ui.Components.voip;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import gi.j3;
import org.telegram.messenger.lc;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.xq;
public final class c0 extends FrameLayout {
    public final b0 f39245a;
    public final k9 f39246b;
    public AnimatorSet f39247c;
    public boolean d;
    public boolean f39248e;
    public final boolean f39249f;

    public c0(Activity activity) {
        super(activity);
        b0 b0Var = new b0(org.telegram.messenger.g0.L(104.0f), org.telegram.messenger.g0.L(111.0f), org.telegram.messenger.g0.L(12.0f), 8);
        this.f39245a = b0Var;
        b0Var.b(3.0d);
        if (!b0Var.f39233e) {
            invalidate();
        }
        b0Var.f39233e = true;
        k9 k9Var = new k9(activity);
        this.f39246b = k9Var;
        addView(k9Var, mf.e(135, 135, 17));
        setWillNotDraw(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f39247c = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f));
        this.f39247c.setInterpolator(xq.f40453g);
        this.f39247c.setDuration(3000L);
        boolean e10 = lc.e(512);
        this.f39249f = e10;
        if (e10) {
            this.f39247c.start();
        }
        setClipChildren(false);
    }

    public final void a() {
        if (this.d) {
            return;
        }
        AnimatorSet animatorSet = this.f39247c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.d = true;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f39247c = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, getScaleX(), 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, getScaleY(), 1.05f, 1.0f));
        this.f39247c.setInterpolator(xq.f40453g);
        this.f39247c.setDuration(400L);
        this.f39247c.start();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f39248e != z10) {
            this.f39248e = z10;
            b0 b0Var = this.f39245a;
            if (z10) {
                b0Var.b(3.0d);
            }
            if (b0Var.h != z10) {
                b0Var.h = z10;
                ValueAnimator valueAnimator = b0Var.f39237j;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    b0Var.f39237j.cancel();
                }
                if (z10) {
                    b0Var.f39237j = ValueAnimator.ofFloat(b0Var.f39236i, 0.0f);
                    b0Var.f39238k = (int) (2000.0f / org.telegram.messenger.g0.f22611t);
                } else {
                    b0Var.f39238k = 0;
                    b0Var.f39237j = ValueAnimator.ofFloat(b0Var.f39236i, 1.0f);
                }
                b0Var.f39237j.addUpdateListener(new j3(b0Var, 17));
                if (z11) {
                    b0Var.f39237j.setDuration(150L);
                } else {
                    b0Var.f39237j.setDuration(1000L);
                }
                b0Var.f39237j.start();
                invalidate();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f39249f) {
            b0 b0Var = this.f39245a;
            b0Var.c();
            b0Var.a(canvas, getWidth() / 2, getHeight() / 2, this);
        }
        super.onDraw(canvas);
    }

    public void setAmplitude(double d) {
        if (this.f39248e) {
            return;
        }
        int i3 = (d > 1.5d ? 1 : (d == 1.5d ? 0 : -1));
        b0 b0Var = this.f39245a;
        if (i3 > 0) {
            b0Var.b(d);
        } else {
            b0Var.b(0.0d);
        }
    }

    public void setRoundRadius(int i3) {
        this.f39246b.setRoundRadius(i3);
    }

    public void setShowWaves(boolean z10) {
        b0 b0Var = this.f39245a;
        if (b0Var.f39233e != z10) {
            invalidate();
        }
        b0Var.f39233e = z10;
    }
}
