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
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.y9;
import w7.w5;
public final class u0 extends FrameLayout {
    public final t0 f31983a;
    public final y9 f31984b;
    public AnimatorSet f31985c;
    public boolean d;
    public boolean f31986e;
    public final boolean f31987f;

    public u0(Activity activity) {
        super(activity);
        t0 t0Var = new t0(AndroidUtilities.dp(104.0f), AndroidUtilities.dp(111.0f), AndroidUtilities.dp(12.0f), 8);
        this.f31983a = t0Var;
        t0Var.b(3.0d);
        if (!t0Var.f31946e) {
            invalidate();
        }
        t0Var.f31946e = true;
        y9 y9Var = new y9(activity);
        this.f31984b = y9Var;
        addView(y9Var, w5.e(135, 135, 17));
        setWillNotDraw(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f31985c = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f));
        this.f31985c.setInterpolator(js.f27635g);
        this.f31985c.setDuration(3000L);
        boolean isEnabled = LiteMode.isEnabled(512);
        this.f31987f = isEnabled;
        if (isEnabled) {
            this.f31985c.start();
        }
        setClipChildren(false);
    }

    public final void a() {
        if (this.d) {
            return;
        }
        AnimatorSet animatorSet = this.f31985c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.d = true;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f31985c = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, getScaleX(), 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, getScaleY(), 1.05f, 1.0f));
        this.f31985c.setInterpolator(js.f27635g);
        this.f31985c.setDuration(400L);
        this.f31985c.start();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f31986e != z10) {
            this.f31986e = z10;
            t0 t0Var = this.f31983a;
            if (z10) {
                t0Var.b(3.0d);
            }
            if (t0Var.h != z10) {
                t0Var.h = z10;
                ValueAnimator valueAnimator = t0Var.f31950j;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    t0Var.f31950j.cancel();
                }
                if (z10) {
                    t0Var.f31950j = ValueAnimator.ofFloat(t0Var.f31949i, 0.0f);
                    t0Var.f31951k = (int) (2000.0f / AndroidUtilities.screenRefreshTime);
                } else {
                    t0Var.f31951k = 0;
                    t0Var.f31950j = ValueAnimator.ofFloat(t0Var.f31949i, 1.0f);
                }
                t0Var.f31950j.addUpdateListener(new s0(t0Var, 0));
                if (z11) {
                    t0Var.f31950j.setDuration(150L);
                } else {
                    t0Var.f31950j.setDuration(1000L);
                }
                t0Var.f31950j.start();
                invalidate();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f31987f) {
            t0 t0Var = this.f31983a;
            t0Var.c();
            t0Var.a(canvas, getWidth() / 2, getHeight() / 2, this);
        }
        super.onDraw(canvas);
    }

    public void setAmplitude(double d) {
        if (this.f31986e) {
            return;
        }
        int i10 = (d > 1.5d ? 1 : (d == 1.5d ? 0 : -1));
        t0 t0Var = this.f31983a;
        if (i10 > 0) {
            t0Var.b(d);
        } else {
            t0Var.b(0.0d);
        }
    }

    public void setRoundRadius(int i10) {
        this.f31984b.setRoundRadius(i10);
    }

    public void setShowWaves(boolean z10) {
        t0 t0Var = this.f31983a;
        if (t0Var.f31946e != z10) {
            invalidate();
        }
        t0Var.f31946e = z10;
    }
}
