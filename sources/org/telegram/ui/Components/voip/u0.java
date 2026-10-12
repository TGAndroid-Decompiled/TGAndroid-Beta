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
    public final t0 f32031a;
    public final y9 f32032b;
    public AnimatorSet f32033c;
    public boolean d;
    public boolean f32034e;
    public final boolean f32035f;

    public u0(Activity activity) {
        super(activity);
        t0 t0Var = new t0(AndroidUtilities.dp(104.0f), AndroidUtilities.dp(111.0f), AndroidUtilities.dp(12.0f), 8);
        this.f32031a = t0Var;
        t0Var.b(3.0d);
        if (!t0Var.f31969e) {
            invalidate();
        }
        t0Var.f31969e = true;
        y9 y9Var = new y9(activity);
        this.f32032b = y9Var;
        addView(y9Var, w5.e(135, 135, 17));
        setWillNotDraw(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f32033c = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f));
        this.f32033c.setInterpolator(js.f27628g);
        this.f32033c.setDuration(3000L);
        boolean isEnabled = LiteMode.isEnabled(512);
        this.f32035f = isEnabled;
        if (isEnabled) {
            this.f32033c.start();
        }
        setClipChildren(false);
    }

    public final void a() {
        if (this.d) {
            return;
        }
        AnimatorSet animatorSet = this.f32033c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.d = true;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f32033c = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, getScaleX(), 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, getScaleY(), 1.05f, 1.0f));
        this.f32033c.setInterpolator(js.f27628g);
        this.f32033c.setDuration(400L);
        this.f32033c.start();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f32034e != z10) {
            this.f32034e = z10;
            t0 t0Var = this.f32031a;
            if (z10) {
                t0Var.b(3.0d);
            }
            if (t0Var.h != z10) {
                t0Var.h = z10;
                ValueAnimator valueAnimator = t0Var.f31973j;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    t0Var.f31973j.cancel();
                }
                if (z10) {
                    t0Var.f31973j = ValueAnimator.ofFloat(t0Var.f31972i, 0.0f);
                    t0Var.f31974k = (int) (2000.0f / AndroidUtilities.screenRefreshTime);
                } else {
                    t0Var.f31974k = 0;
                    t0Var.f31973j = ValueAnimator.ofFloat(t0Var.f31972i, 1.0f);
                }
                t0Var.f31973j.addUpdateListener(new s0(t0Var, 0));
                if (z11) {
                    t0Var.f31973j.setDuration(150L);
                } else {
                    t0Var.f31973j.setDuration(1000L);
                }
                t0Var.f31973j.start();
                invalidate();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f32035f) {
            t0 t0Var = this.f32031a;
            t0Var.c();
            t0Var.a(canvas, getWidth() / 2, getHeight() / 2, this);
        }
        super.onDraw(canvas);
    }

    public void setAmplitude(double d) {
        if (this.f32034e) {
            return;
        }
        int i10 = (d > 1.5d ? 1 : (d == 1.5d ? 0 : -1));
        t0 t0Var = this.f32031a;
        if (i10 > 0) {
            t0Var.b(d);
        } else {
            t0Var.b(0.0d);
        }
    }

    public void setRoundRadius(int i10) {
        this.f32032b.setRoundRadius(i10);
    }

    public void setShowWaves(boolean z10) {
        t0 t0Var = this.f32031a;
        if (t0Var.f31969e != z10) {
            invalidate();
        }
        t0Var.f31969e = z10;
    }
}
