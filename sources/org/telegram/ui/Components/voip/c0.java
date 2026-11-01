package org.telegram.ui.Components.voip;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.tc;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import w7.b6;
public final class c0 extends FrameLayout {
    public final b0 f31398a;
    public final g9 f31399b;
    public AnimatorSet f31400c;
    public boolean d;
    public boolean e;
    public final boolean f31401f;

    public c0(Activity activity) {
        super(activity);
        b0 b0Var = new b0(org.telegram.messenger.i0.L(104.0f), org.telegram.messenger.i0.L(111.0f), org.telegram.messenger.i0.L(12.0f), 8);
        this.f31398a = b0Var;
        b0Var.b(3.0d);
        if (!b0Var.e) {
            invalidate();
        }
        b0Var.e = true;
        g9 g9Var = new g9(activity);
        this.f31399b = g9Var;
        addView(g9Var, b6.e(135, 135, 17));
        setWillNotDraw(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f31400c = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f));
        this.f31400c.setInterpolator(gr.f26524g);
        this.f31400c.setDuration(3000L);
        boolean e = tc.e(512);
        this.f31401f = e;
        if (e) {
            this.f31400c.start();
        }
        setClipChildren(false);
    }

    public final void a() {
        if (this.d) {
            return;
        }
        AnimatorSet animatorSet = this.f31400c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.d = true;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f31400c = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, getScaleX(), 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, getScaleY(), 1.05f, 1.0f));
        this.f31400c.setInterpolator(gr.f26524g);
        this.f31400c.setDuration(400L);
        this.f31400c.start();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.e != z10) {
            this.e = z10;
            b0 b0Var = this.f31398a;
            if (z10) {
                b0Var.b(3.0d);
            }
            if (b0Var.h != z10) {
                b0Var.h = z10;
                ValueAnimator valueAnimator = b0Var.f31391j;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    b0Var.f31391j.cancel();
                }
                if (z10) {
                    b0Var.f31391j = ValueAnimator.ofFloat(b0Var.f31390i, 0.0f);
                    b0Var.f31392k = (int) (2000.0f / org.telegram.messenger.i0.f16175t);
                } else {
                    b0Var.f31392k = 0;
                    b0Var.f31391j = ValueAnimator.ofFloat(b0Var.f31390i, 1.0f);
                }
                b0Var.f31391j.addUpdateListener(new bg.k(b0Var, 20));
                if (z11) {
                    b0Var.f31391j.setDuration(150L);
                } else {
                    b0Var.f31391j.setDuration(1000L);
                }
                b0Var.f31391j.start();
                invalidate();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f31401f) {
            b0 b0Var = this.f31398a;
            b0Var.c();
            b0Var.a(canvas, getWidth() / 2, getHeight() / 2, this);
        }
        super.onDraw(canvas);
    }

    public void setAmplitude(double d) {
        if (this.e) {
            return;
        }
        int i10 = (d > 1.5d ? 1 : (d == 1.5d ? 0 : -1));
        b0 b0Var = this.f31398a;
        if (i10 > 0) {
            b0Var.b(d);
        } else {
            b0Var.b(0.0d);
        }
    }

    public void setRoundRadius(int i10) {
        this.f31399b.setRoundRadius(i10);
    }

    public void setShowWaves(boolean z10) {
        b0 b0Var = this.f31398a;
        if (b0Var.e != z10) {
            invalidate();
        }
        b0Var.e = z10;
    }
}
