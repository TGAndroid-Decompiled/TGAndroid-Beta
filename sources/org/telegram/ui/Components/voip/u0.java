package org.telegram.ui.Components.voip;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.y9;
import w7.x5;
public final class u0 extends FrameLayout {
    public final t0 f32361a;
    public final y9 f32362b;
    public AnimatorSet f32363c;
    public boolean d;
    public boolean f32364e;
    public final boolean f32365f;

    public u0(Activity activity) {
        super(activity);
        t0 t0Var = new t0(AndroidUtilities.dp(104.0f), AndroidUtilities.dp(111.0f), AndroidUtilities.dp(12.0f), 8);
        this.f32361a = t0Var;
        t0Var.b(3.0d);
        if (!t0Var.f32324e) {
            invalidate();
        }
        t0Var.f32324e = true;
        y9 y9Var = new y9(activity);
        this.f32362b = y9Var;
        addView(y9Var, x5.e(135, 135, 17));
        setWillNotDraw(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f32363c = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f));
        this.f32363c.setInterpolator(is.f27501g);
        this.f32363c.setDuration(3000L);
        boolean isEnabled = LiteMode.isEnabled(512);
        this.f32365f = isEnabled;
        if (isEnabled) {
            this.f32363c.start();
        }
        setClipChildren(false);
    }

    public final void a() {
        if (this.d) {
            return;
        }
        AnimatorSet animatorSet = this.f32363c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.d = true;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f32363c = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, getScaleX(), 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, getScaleY(), 1.05f, 1.0f));
        this.f32363c.setInterpolator(is.f27501g);
        this.f32363c.setDuration(400L);
        this.f32363c.start();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f32364e != z10) {
            this.f32364e = z10;
            t0 t0Var = this.f32361a;
            if (z10) {
                t0Var.b(3.0d);
            }
            if (t0Var.h != z10) {
                t0Var.h = z10;
                ValueAnimator valueAnimator = t0Var.f32328j;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    t0Var.f32328j.cancel();
                }
                if (z10) {
                    t0Var.f32328j = ValueAnimator.ofFloat(t0Var.f32327i, 0.0f);
                    t0Var.f32329k = (int) (2000.0f / AndroidUtilities.screenRefreshTime);
                } else {
                    t0Var.f32329k = 0;
                    t0Var.f32328j = ValueAnimator.ofFloat(t0Var.f32327i, 1.0f);
                }
                t0Var.f32328j.addUpdateListener(new s0(t0Var, 0));
                if (z11) {
                    t0Var.f32328j.setDuration(150L);
                } else {
                    t0Var.f32328j.setDuration(1000L);
                }
                t0Var.f32328j.start();
                invalidate();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f32365f) {
            t0 t0Var = this.f32361a;
            t0Var.c();
            t0Var.a(canvas, getWidth() / 2, getHeight() / 2, this);
        }
        super.onDraw(canvas);
    }

    public void setAmplitude(double d) {
        if (this.f32364e) {
            return;
        }
        int i10 = (d > 1.5d ? 1 : (d == 1.5d ? 0 : -1));
        t0 t0Var = this.f32361a;
        if (i10 > 0) {
            t0Var.b(d);
        } else {
            t0Var.b(0.0d);
        }
    }

    public void setRoundRadius(int i10) {
        this.f32362b.setRoundRadius(i10);
    }

    public void setShowWaves(boolean z10) {
        t0 t0Var = this.f32361a;
        if (t0Var.f32324e != z10) {
            invalidate();
        }
        t0Var.f32324e = z10;
    }
}
