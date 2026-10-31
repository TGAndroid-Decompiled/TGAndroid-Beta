package org.telegram.ui.Components.voip;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.sc;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import w7.b6;
public final class b0 extends FrameLayout {
    public final a0 f31318a;
    public final g9 f31319b;
    public AnimatorSet f31320c;
    public boolean d;
    public boolean e;
    public final boolean f31321f;

    public b0(Activity activity) {
        super(activity);
        a0 a0Var = new a0(org.telegram.messenger.i0.L(104.0f), org.telegram.messenger.i0.L(111.0f), org.telegram.messenger.i0.L(12.0f), 8);
        this.f31318a = a0Var;
        a0Var.b(3.0d);
        if (!a0Var.e) {
            invalidate();
        }
        a0Var.e = true;
        g9 g9Var = new g9(activity);
        this.f31319b = g9Var;
        addView(g9Var, b6.e(135, 135, 17));
        setWillNotDraw(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f31320c = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f));
        this.f31320c.setInterpolator(gr.f26496g);
        this.f31320c.setDuration(3000L);
        boolean e = sc.e(512);
        this.f31321f = e;
        if (e) {
            this.f31320c.start();
        }
        setClipChildren(false);
    }

    public final void a() {
        if (this.d) {
            return;
        }
        AnimatorSet animatorSet = this.f31320c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.d = true;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f31320c = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, getScaleX(), 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, getScaleY(), 1.05f, 1.0f));
        this.f31320c.setInterpolator(gr.f26496g);
        this.f31320c.setDuration(400L);
        this.f31320c.start();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.e != z10) {
            this.e = z10;
            a0 a0Var = this.f31318a;
            if (z10) {
                a0Var.b(3.0d);
            }
            if (a0Var.h != z10) {
                a0Var.h = z10;
                ValueAnimator valueAnimator = a0Var.f31312j;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    a0Var.f31312j.cancel();
                }
                if (z10) {
                    a0Var.f31312j = ValueAnimator.ofFloat(a0Var.f31311i, 0.0f);
                    a0Var.f31313k = (int) (2000.0f / org.telegram.messenger.i0.f16029t);
                } else {
                    a0Var.f31313k = 0;
                    a0Var.f31312j = ValueAnimator.ofFloat(a0Var.f31311i, 1.0f);
                }
                a0Var.f31312j.addUpdateListener(new bg.k(a0Var, 20));
                if (z11) {
                    a0Var.f31312j.setDuration(150L);
                } else {
                    a0Var.f31312j.setDuration(1000L);
                }
                a0Var.f31312j.start();
                invalidate();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f31321f) {
            a0 a0Var = this.f31318a;
            a0Var.c();
            a0Var.a(canvas, getWidth() / 2, getHeight() / 2, this);
        }
        super.onDraw(canvas);
    }

    public void setAmplitude(double d) {
        if (this.e) {
            return;
        }
        int i10 = (d > 1.5d ? 1 : (d == 1.5d ? 0 : -1));
        a0 a0Var = this.f31318a;
        if (i10 > 0) {
            a0Var.b(d);
        } else {
            a0Var.b(0.0d);
        }
    }

    public void setRoundRadius(int i10) {
        this.f31319b.setRoundRadius(i10);
    }

    public void setShowWaves(boolean z10) {
        a0 a0Var = this.f31318a;
        if (a0Var.e != z10) {
            invalidate();
        }
        a0Var.e = z10;
    }
}
